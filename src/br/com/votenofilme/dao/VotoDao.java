package br.com.votenofilme.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.com.votenofilme.dto.SequenciaFilmesParaVotacaoDTO;
import br.com.votenofilme.infra.CriadorDeSession;
import br.com.votenofilme.model.Filme;
import br.com.votenofilme.model.Usuario;
import br.com.votenofilme.model.Voto;

/**
 * @author Anderson Virginio Martins
 * 
 * Classe Concreta Dao para as operações com a tabela de votação
 **/
@Component
@SessionScoped
public class VotoDao {	
	
	private final CriadorDeSession criadorDeSession;
	
	private int iteracoes = 0;
	
	private String ranking = "";
	
	private List<SequenciaFilmesParaVotacaoDTO> sequenciaIteracoes = new ArrayList<SequenciaFilmesParaVotacaoDTO>();
	
	private FilmeDao filmeDao;
	
	/** 
	* Obtem a sessão para acesso aos dados. Somente implementações podem ter 
	* acesso a esta propriedade. 
	* 
	* @return getSession(). 
	*/ 
	protected Session getSession() { 
		return criadorDeSession.getInstance(); 
	} 
	
	public VotoDao(CriadorDeSession criadorDeSession,  FilmeDao filmeDao) {
		//this.session = session;
		this.criadorDeSession = criadorDeSession;
		this.filmeDao = filmeDao;
	}

	@SuppressWarnings("unchecked")
	public List<Voto> listaTudo() {
		abre();
		return getSession().createCriteria(Voto.class).list();
	}
	
	public void salva(Voto voto) {
		abre();
		Transaction tx = getSession().beginTransaction();
		getSession().save(voto);
		tx.commit();
	}
	
	public Voto carrega(Long id) {
		abre();
		return (Voto) this.getSession().load(Voto.class, id);
	}
	
	public void atualiza(Voto voto) {
		abre();
		Transaction tx = getSession().beginTransaction();
		this.getSession().update(voto);
		tx.commit();
	}
	
	public void remove(Voto voto) {
		abre();
		Transaction tx = getSession().beginTransaction();
		this.getSession().delete(voto);
		tx.commit();
	}
	
	/**
	 * Agrupa todos os filmes e sua quantidade de votos
	 * 
	 * @return mapa com o filme e seu respectivo voto
	 */
	public Map<String, Long> listaTodosVotos() {
		abre();
		Criteria criteria = getSession()
				.createCriteria(Voto.class)
				.setProjection(Projections.projectionList()
				.add(Projections.alias(Projections.rowCount(), "rowCount"))
				.add(Projections.alias( Projections.groupProperty("selecionado"), "selecionado" )))
				.addOrder(Order.desc("rowCount"));
		
		Map<String, Long> result = new LinkedHashMap<String, Long>();

		List<?> list = criteria.list();

		for (Object object : list) {
			Object[] array = (Object[]) object;
			Long quantidade = (Long) array[0];
			
			Long idFilmeSelecionado = (Long) array[1];
			Filme filme = filmeDao.carrega(idFilmeSelecionado); 
			
			result.put(filme.getTitulo(), quantidade);
		}

		return result;
	}

	/**
	 * Votos do Usuário
	 * 
	 * @return mapa com o filme e seu respectivo voto
	 */
	public Map<String, Long> listaVotosPorUsuario(Usuario usuario) {
		abre();
		
    Criteria criteria = getSession()
        .createCriteria(Voto.class)
        .setProjection(Projections.projectionList()
        .add(Projections.alias(Projections.rowCount(), "rowCount"))
        .add(Projections.alias( Projections.groupProperty("selecionado"), "selecionado" )))
        .addOrder(Order.desc("rowCount"));
    
    Map<String, Long> result = new LinkedHashMap<String, Long>();

		criteria.add(Restrictions.eq("idUsuario", usuario.getIdUsuario()));
		
		List<?> list = criteria.list();

		for (Object object : list) {
			Object[] array = (Object[]) object;
			Long quantidade = (Long) array[0];
			Long idFilmeSelecionado = (Long) array[1];
			Filme filme = filmeDao.carrega(idFilmeSelecionado); 
			result.put(filme.getTitulo(), quantidade);
		}		
		
		return result;
	}

	public int getIteracoes() {
		return iteracoes;
	}

	public void setIteracoes(int iteracoes) {
		this.iteracoes = iteracoes;
	}
	
	public void incrementaIteracoes() {
		iteracoes++;
		if (iteracoes >= 11) {
			iteracoes = 10;
		}	
		
		if (iteracoes <= 0) {
			iteracoes = 0;
		}
	}
	
	public List<SequenciaFilmesParaVotacaoDTO> getSequenciaiteracoes() {
		return sequenciaIteracoes;
	}
	
	public SequenciaFilmesParaVotacaoDTO buscaFilmes(int index) {
		return sequenciaIteracoes.get(index);
	}
	
	public Voto listaUltimoVoto() {
		abre();
		return (Voto)getSession().createCriteria(Voto.class)
		.addOrder(Order.desc("idVoto"))		
	    .setMaxResults(1)
	    .uniqueResult();
	}
	
	public Voto cria(Long idFilme1, Long idFilme2, Long ultimoUsuario, Long idFSelecionado) {
		
		Voto uVoto = listaUltimoVoto();
		
		Long id = new Long(0);
		if (uVoto != null) {
			id = uVoto.getIdVoto();
		}
		id++;
		
		Voto v = new Voto(id,idFilme1, idFilme2, ultimoUsuario, idFSelecionado);
		
		salva(v);
		
		return v;
	}
	
	private void abre() {
		if (!getSession().isOpen()) {
			criadorDeSession.abre();
		}
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	
}