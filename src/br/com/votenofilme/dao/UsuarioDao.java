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
import br.com.votenofilme.model.Usuario;

/**
 * @author Anderson Virginio Martins
 * 
 * Classe Concreta Dao para as operações com a tabela de usuário
 **/

@Component
@SessionScoped
public class UsuarioDao {	
	
	private final CriadorDeSession criadorDeSession;
	
	private final List<Filme> filmes = new ArrayList<Filme>();
	
	public UsuarioDao(CriadorDeSession criadorDeSession) {
		//this.session = session;
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
	public List<Usuario> listaTudo() {
		return getSession().createCriteria(Usuario.class).list();
	}
	
	public Usuario listaUltimoUsuario() {
		abre();
		return (Usuario)getSession().createCriteria(Usuario.class)
		.addOrder(Order.desc("idUsuario"))		
	    .setMaxResults(1)
	    .uniqueResult();
	}		    
	
	public void salva(Usuario usuario) {
		abre();
		Transaction tx = getSession().beginTransaction();
		getSession().save(usuario);
		tx.commit();
	}
	
	public Usuario carrega(Long id) {
		abre();
		return (Usuario) getSession().load(Usuario.class, id);
	}
	
	public void atualiza(Usuario usuario) {
		abre();
		Transaction tx = getSession().beginTransaction();
		getSession().update(usuario);
		tx.commit();
	}
	
	public void remove(Usuario usuario) {
		abre();
		Transaction tx = getSession().beginTransaction();
		getSession().delete(usuario);
		tx.commit();
	}
	
	private void abre() {
		
		if (getSession() != null && !getSession().isOpen()) {
			criadorDeSession.abre();
		}
	}

}

