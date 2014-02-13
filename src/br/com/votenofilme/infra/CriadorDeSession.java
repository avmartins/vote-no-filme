package br.com.votenofilme.infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

/**
 * @author Anderson Virginio Martins
 * 
 * Classe Concreta para definir sessão
 **/
@Component
public class CriadorDeSession implements ComponentFactory<Session> {
	
	
	private final SessionFactory factory;
	private Session session;
	
	public CriadorDeSession(SessionFactory factory) {
		this.factory = factory;
	}

	@PostConstruct
	public void abre() {
		this.session = factory.openSession();
	}

	public Session getInstance() {
		return this.session;
	}

	@PreDestroy
	public void fecha() {
		this.session.close();
	}

}
