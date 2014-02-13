package br.com.votenofilme.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.com.votenofilme.infra.CriadorDeSession;
import br.com.votenofilme.model.Filme;

/**
 * @author Anderson Virginio Martins
 * 
 * Classe Concreta Dao para as operações com a tabela de filme
 **/

@Component
@SessionScoped
public class FilmeDao {	
	
	private CriadorDeSession criadorDeSession;
	
	private final List<Filme> filmes = new ArrayList<Filme>();
	
	public FilmeDao(CriadorDeSession criadorDeSession) {
		this.criadorDeSession = criadorDeSession;
	}
	
	/** 
	* Obtem a sessão para acesso aos dados. Somente implementações podem ter 
	* acesso a esta propriedade. 
	* 
	* @return getSession(). 
	*/ 
	protected Session getSession() { 
		return criadorDeSession.getInstance(); 
	} 

	@SuppressWarnings("unchecked")
	public List<Filme> listaTudo() {
		abre();
		return getSession().createCriteria(Filme.class).list();
	}
	
	public Filme salva(Filme filme) {
		abre();
		Transaction tx = getSession().beginTransaction();
		getSession().save(filme);
		tx.commit();
		return filme;
	}
	
	public Filme carrega(Long id) {
		abre();
		Filme f = (Filme) getSession().load(Filme.class, id); 
		return f;
	}
	
	public void atualiza(Filme filme) {
		abre();
		Transaction tx = getSession().beginTransaction();
		getSession().update(filme);
		tx.commit();
	}
	
	public void remove(Filme filme) {
		abre();
		Transaction tx = getSession().beginTransaction();
		getSession().delete(filme);
		tx.commit();
	}
	
	
	public Filme listaUltimoFime() {
		abre();
		return (Filme)getSession().createCriteria(Filme.class)
		.addOrder(Order.desc("idFilme"))		
	    .setMaxResults(1)
	    .uniqueResult();
	}	

	public List<Filme> getFilmes() {
		return filmes;
	}
	
	public Filme cria(Filme filme) {
		
		Filme uFilme = listaUltimoFime();
		
		Long id = new Long(0);
		if (uFilme != null) {
			id = uFilme.getIdFilme();
		}
		id++;
		filme.setIdFilme(id);	
		
		salva(filme);
		
		return filme;
	}
	
	private void abre() {
		if (!getSession().isOpen()) {
			criadorDeSession.abre();
		}
	}
	

}

