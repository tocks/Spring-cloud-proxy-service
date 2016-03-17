package org.opendevup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ABourseConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ABourseConfigServiceApplication.class, args);
	}
}
