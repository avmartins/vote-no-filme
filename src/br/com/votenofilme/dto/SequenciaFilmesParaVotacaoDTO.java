package br.com.votenofilme.dto;

import br.com.votenofilme.model.Filme;

/**
 * @author Anderson Virginio Martins
 * 
 * Classe Concreta para identificar a sequencia de filmes para a votação
 **/
public class SequenciaFilmesParaVotacaoDTO {

	private Filme filmeOpcao1;
	private Filme filmeOpcao2;
	private String ranking;
	
	public SequenciaFilmesParaVotacaoDTO(Filme filmeOpcao1, Filme filmeOpcao2,String ranking) {
		this.filmeOpcao1 = filmeOpcao1;
		this.filmeOpcao2 = filmeOpcao2;
		this.ranking = ranking;
	}
	
	public Filme getFilmeOpcao1() {
		return filmeOpcao1;
	}
	public void setFilmeOpcao1(Filme filmeOpcao1) {
		this.filmeOpcao1 = filmeOpcao1;
	}
	public Filme getFilmeOpcao2() {
		return filmeOpcao2;
	}
	public void setFilmeOpcao2(Filme filmeOpcao2) {
		this.filmeOpcao2 = filmeOpcao2;
	}

	public String getRanking() {
		return ranking;
	}

	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	
	
}
