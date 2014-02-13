package br.com.votenofilme.infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

/**
 * @author Anderson Virginio Martins
 * 
 * Classe Concreta factory para definir sessão
 **/

@SuppressWarnings("deprecation")
@Component
@ApplicationScoped
public class CriadorDeSessionFactory implements ComponentFactory<SessionFactory> {
	
	private SessionFactory factory;
	
	public CriadorDeSessionFactory() {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		factory = configuration.buildSessionFactory();
	}

	@PostConstruct
	public void abre() {
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		this.factory = configuration.buildSessionFactory();;
	}
	public SessionFactory getInstance() {
		return factory;
	}
	
	@PreDestroy
	public void fecha() {
		this.factory.close();
	}
}