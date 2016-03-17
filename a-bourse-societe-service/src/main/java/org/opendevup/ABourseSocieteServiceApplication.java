package org.opendevup;

import org.opendevup.entities.Societe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@EnableEurekaClient
@SpringBootApplication
public class ABourseSocieteServiceApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ABourseSocieteServiceApplication.class, args);

		/**
		 * SocieteRepository societeRepository =
		 * ctx.getBean(SocieteRepository.class);
		 * 
		 * Stream.of("A", "B",
		 * "C","E","F","G","E","f").forEach(s->societeRepository.save(new
		 * Societe(s)));
		 * societeRepository.findAll().forEach(s->System.out.println(s.
		 * getNomSociete()));
		 */
	}
}

// Class interne qui perme d'aficher les ID sur les appels des web services

@Configuration
class MyConfig extends RepositoryRestMvcConfiguration {

	@Override
	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Societe.class);
	}

}
