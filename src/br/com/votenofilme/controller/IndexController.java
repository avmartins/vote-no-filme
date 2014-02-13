/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.votenofilme.controller;

import org.apache.log4j.Logger;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.votenofilme.dao.FilmeDao;
import br.com.votenofilme.dao.UsuarioDao;
import br.com.votenofilme.dao.VotoDao;
import br.com.votenofilme.dto.SequenciaFilmesParaVotacaoDTO;
import br.com.votenofilme.model.Filme;
import br.com.votenofilme.model.Usuario;

@Resource
public class IndexController {

	private Result result;
	
	private UsuarioDao usuarioDao;
	private VotoDao votoDao;
	private FilmeDao filmeDao;
	
    private static final Logger LOGGER = Logger.getLogger(IndexController.class.getName());
    
	public IndexController() {
	}
	
    public IndexController(UsuarioDao usuarioDao, VotoDao votoDao, FilmeDao filmeDao, Result result) {
		this.result = result;
		this.usuarioDao = usuarioDao;
		this.votoDao = votoDao;
		this.filmeDao = filmeDao;
	}
	
    /*
	 * Redireciona para a tela principal para comecar a votar nos filmes  
	 */
	@Get
	@Path("/")
	public void index() {
		
		try {
			
			if (votoDao.getSequenciaiteracoes().isEmpty()) {
				populaFilmesIniciais();
				populaSequenciaIteracoes();		
			}
			
			this.votoDao.setIteracoes(0);
			
			Usuario ultimoUsuario = this.usuarioDao.listaUltimoUsuario();
			
			//Inicio da sessão e criação de usuário default
			Long id = new Long(1);
			String nome = "Usuario";
			String email = "email";
			
			if (ultimoUsuario != null) {
				nome = nome + ultimoUsuario.getIdUsuario();
				email = email + ultimoUsuario.getIdUsuario();
				id = ultimoUsuario.getIdUsuario() + 1;
			}
			
			Usuario usuario = new Usuario(id,nome,email);
			
			this.usuarioDao.salva(usuario);
			
			usuario  = this.usuarioDao.listaUltimoUsuario();
			
			result.include("variable", "VRaptor!");
			result.include("filme1", this.votoDao.buscaFilmes(this.votoDao.getIteracoes()).getFilmeOpcao1());
			result.include("filme2", this.votoDao.buscaFilmes(this.votoDao.getIteracoes()).getFilmeOpcao2());
			result.include("iteracao", this.votoDao.getIteracoes());
			
			this.votoDao.setRanking(this.votoDao.buscaFilmes(this.votoDao.getIteracoes()).getRanking());
			
			this.votoDao.incrementaIteracoes();
		}catch (Exception e){
			LOGGER.error(e.getMessage());
		}	
	}
	
	/*
	 * Redireciona para a tela principal contendo o voto anterior e gravando no banco  
	 */
	@Post
	@Path("/")
	public void index(String voto,String idFilme1, String idFilme2) {
		try {
			
			if (this.votoDao.buscaFilmes(this.votoDao.getIteracoes()).getRanking().equals("R")) {
				this.result.redirectTo(RankingController.class).ranking();		
			}
			
			Usuario ultimoUsuario = this.usuarioDao.listaUltimoUsuario();
			
			this.votoDao.cria(new Long(idFilme1), new Long(idFilme2),  ultimoUsuario.getIdUsuario(), new Long(voto));
	
			result.include("filme1", this.votoDao.buscaFilmes(this.votoDao.getIteracoes()).getFilmeOpcao1());
			result.include("filme2", this.votoDao.buscaFilmes(this.votoDao.getIteracoes()).getFilmeOpcao2());
			result.include("iteracao", this.votoDao.getIteracoes());
			
			this.votoDao.incrementaIteracoes();
		
		}catch (Exception e){
			LOGGER.error(e.getMessage());
		}
		
	}
	
	/*
	 * Popula of 5 filmes que irão participar da votação  
	 */
	private void populaFilmesIniciais() {
		
		Filme filme1 = new Filme("Batman", "Batman", "img/batman.jpg");
		Filme filme2 = new Filme("Avatar", "Avatar", "img/avatar.jpg");
		Filme filme3 = new Filme("Pacific Rin", "Pacific Rin", "img/pacific.jpg");
		Filme filme4 = new Filme("Quarteto", "Quarteto", "img/quarteto.jpg");
		Filme filme5 = new Filme("Vingadores", "Vingadores", "img/vingadores.jpg");
		
		filme1 = filmeDao.cria(filme1);
		filme2 = filmeDao.cria(filme2);
		filme3 = filmeDao.cria(filme3);
		filme4 = filmeDao.cria(filme4);
		filme5 = filmeDao.cria(filme5);
		
		filmeDao.getFilmes().add(filme1);
		filmeDao.getFilmes().add(filme2);
		filmeDao.getFilmes().add(filme3);
		filmeDao.getFilmes().add(filme4);
		filmeDao.getFilmes().add(filme5);
		
    }

	/*
	 * Popula a sequencia de filmes que aparecerão para votação  
	 */
	private void populaSequenciaIteracoes() {
		
		//Sequencia de 10 filmes em ordem para serem votados
		
		SequenciaFilmesParaVotacaoDTO s0 = new SequenciaFilmesParaVotacaoDTO(filmeDao.getFilmes().get(0),filmeDao.getFilmes().get(1),"");
		SequenciaFilmesParaVotacaoDTO s1 = new SequenciaFilmesParaVotacaoDTO(filmeDao.getFilmes().get(0),filmeDao.getFilmes().get(2),"");
		SequenciaFilmesParaVotacaoDTO s2 = new SequenciaFilmesParaVotacaoDTO(filmeDao.getFilmes().get(0),filmeDao.getFilmes().get(3),"");
		SequenciaFilmesParaVotacaoDTO s3 = new SequenciaFilmesParaVotacaoDTO(filmeDao.getFilmes().get(0),filmeDao.getFilmes().get(4),"");
		SequenciaFilmesParaVotacaoDTO s4 = new SequenciaFilmesParaVotacaoDTO(filmeDao.getFilmes().get(1),filmeDao.getFilmes().get(2),"");
		SequenciaFilmesParaVotacaoDTO s5 = new SequenciaFilmesParaVotacaoDTO(filmeDao.getFilmes().get(1),filmeDao.getFilmes().get(3),"");
		SequenciaFilmesParaVotacaoDTO s6 = new SequenciaFilmesParaVotacaoDTO(filmeDao.getFilmes().get(1),filmeDao.getFilmes().get(4),"");
		SequenciaFilmesParaVotacaoDTO s7 = new SequenciaFilmesParaVotacaoDTO(filmeDao.getFilmes().get(2),filmeDao.getFilmes().get(3),"");
		SequenciaFilmesParaVotacaoDTO s8 = new SequenciaFilmesParaVotacaoDTO(filmeDao.getFilmes().get(2),filmeDao.getFilmes().get(4),"");
		SequenciaFilmesParaVotacaoDTO s9 = new SequenciaFilmesParaVotacaoDTO(filmeDao.getFilmes().get(3),filmeDao.getFilmes().get(4),"");
		SequenciaFilmesParaVotacaoDTO s10 = new SequenciaFilmesParaVotacaoDTO(filmeDao.getFilmes().get(3),filmeDao.getFilmes().get(4),"R");
		
		votoDao.getSequenciaiteracoes().add(s0);
		votoDao.getSequenciaiteracoes().add(s1);
		votoDao.getSequenciaiteracoes().add(s2);
		votoDao.getSequenciaiteracoes().add(s3);
		votoDao.getSequenciaiteracoes().add(s4);
		votoDao.getSequenciaiteracoes().add(s5);
		votoDao.getSequenciaiteracoes().add(s6);
		votoDao.getSequenciaiteracoes().add(s7);
		votoDao.getSequenciaiteracoes().add(s8);
		votoDao.getSequenciaiteracoes().add(s9);
		votoDao.getSequenciaiteracoes().add(s10);
		
    }
	
}
