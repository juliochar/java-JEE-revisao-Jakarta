package br.juliok.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.juliok.screenmatch.service.ConsumoAPI;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumoAPI consumoApi = new ConsumoAPI();
		
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		
		System.out.println(json);
		//json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		//System.out.println(json);
		
		
		
		
		
		
		
	}

}
