package br.juliok.HelloWorldLogExampleSpring;

import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class HelloWorldLogExampleSpringApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(LogginController.class);
	
	@Autowired
	private LogEmailSender logemail;
	private Environment env;
	
	@Value("${spring.mail.password}")
	private String senha;
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldLogExampleSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Teste HEllo");
		
		logger.info("Olá.. log");
		logger.error("error teste22");
		
		System.out.println(senha);
		
		logemail.sendLogsByEmail();
		
	}

}
