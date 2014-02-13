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

import java.util.Iterator;
import java.util.Map;

import org.apache.log4j.Logger;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.votenofilme.dao.UsuarioDao;
import br.com.votenofilme.dao.VotoDao;
import br.com.votenofilme.model.Usuario;

@Resource
public class RankingController {

	private final Result result;
	
	private UsuarioDao usuarioDao;
	private VotoDao votoDao;
	
	 private static final Logger LOGGER = Logger.getLogger(RankingController.class.getName());
	
    public RankingController(UsuarioDao usuarioDao, VotoDao votoDao, Result result) {
		this.result = result;
		this.usuarioDao = usuarioDao;
		this.votoDao = votoDao;
	}

	
	/*
	 * Redireciona para a tela ranking.jsp para captar os dados do usuario  
	 */
	@Get
	@Path("/ranking")
	public void ranking() {
	}
	
	/*
	 * Redireciona para a tela de resultado do ranking   
	 */
	@Post
	@Path("/ranking/resultado")
	public void index(String voto,String idFilme1, String idFilme2, String nome, String email) {
		result.include("variable", "VRaptor!");
		
		try {
			
			//Grava Dados do usuario
			Usuario ultimoUsuario = this.usuarioDao.listaUltimoUsuario();
			
			ultimoUsuario.setNome(nome);
			ultimoUsuario.setEmail(email);
			
			this.usuarioDao.atualiza(ultimoUsuario);
	
			//Mostra Ranking dos Votos
			Map<String, Long> listaVotosPorUsuario = this.votoDao.listaVotosPorUsuario(ultimoUsuario);
			Map<String, Long> listaTodosVotos = this.votoDao.listaTodosVotos();
			
			Iterator iterator = listaVotosPorUsuario.entrySet().iterator();
			
			StringBuffer sb = new StringBuffer();
			//sb.append("<table>");
			int i = 0;
			while (iterator.hasNext()) {
				if (i==0) {
					sb.append("<tr>");
					i=1;
				} else {
					sb.append("<tr class='pure-table-odd'>");
					i=0;
				}
				 
				Map.Entry mapEntry = (Map.Entry) iterator.next();
				sb.append("<td width='40%'>");
				sb.append(mapEntry.getKey());
				sb.append("</td>");
				sb.append("<td width='40%'>");
				sb.append(mapEntry.getValue());
				sb.append("</td>");
				sb.append("</tr>");
			}
			//sb.append("</table>");
			
			result.include("listaVotosPorUsuario", sb.toString());
			
			iterator = listaTodosVotos.entrySet().iterator();
			
			sb = new StringBuffer();
			//sb.append("<table>");
			while (iterator.hasNext()) {
				if (i==0) {
					sb.append("<tr>");
					i=1;
				} else {
					sb.append("<tr class='pure-table-odd'>");
					i=0;
				}
				Map.Entry mapEntry = (Map.Entry) iterator.next();
				sb.append("<td width='40%'>");
				sb.append(mapEntry.getKey());
				sb.append("</td>");
				sb.append("<td width='40%'>");
				sb.append(mapEntry.getValue());
				sb.append("</td>");
				sb.append("</tr>");
			}
			//sb.append("</table>");
			
			result.include("listaTodosVotos", sb.toString());	
		}catch (Exception e){
			LOGGER.error(e.getMessage());
		}
		
			
		
	}
	
}
