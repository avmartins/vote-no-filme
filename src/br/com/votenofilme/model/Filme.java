package br.com.votenofilme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.common.base.Objects;

/**
 * @author Anderson Virginio Martins
 * 
 * Classe Concreta para definir a tabela de filmes
 **/
@Entity
@Table(name = "Filme")
public class Filme {
	@Id
	@Column(name = "idFilme")
	private Long idFilme;
	
	@Column(name = "Titulo")
	private String titulo;

	@Column(name = "Sinopse")
	private String sinopse;

	@Column(name = "IMAGE_PATH")
	private String imagePath;

	Filme() {
	}

	public Filme(String titulo, String sinopse, String imagePath) {
		this.titulo = titulo;
		this.sinopse = sinopse;
		this.imagePath = imagePath;
	}

	public Long getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(Long idFilme) {
		this.idFilme = idFilme;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Filme other = (Filme) obj;
		return Objects.equal(this.titulo, other.titulo)
				&& Objects.equal(this.sinopse, other.sinopse);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.titulo, this.sinopse);
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("title", this.titulo)
				.add("synopsis", this.sinopse).toString();
	}

}