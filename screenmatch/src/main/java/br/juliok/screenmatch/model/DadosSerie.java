package br.juliok.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

//Json alias apenas lê, na hora de escrever escreve o nome da variavel
//JsonProperty serve tanto para escrita e leitura e utiliza o nome definido nos parenteses

public record DadosSerie(
		@JsonAlias("Title") String titulo,
		@JsonAlias("totalSeason") Integer totalTemporadas,
		@JsonAlias("imdbRating") String avaliacao)	 {
	
	
	

}
