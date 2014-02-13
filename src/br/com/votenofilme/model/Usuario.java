package br.com.votenofilme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.common.base.Objects;

/**
 * @author Anderson Virginio Martins
 * 
 * Classe Concreta para definir a tabela de usuario
 **/
@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
	@Column(name = "idUsuario")
	private Long idUsuario;

	@Column(name = "nome")
	private String nome;

	@Column(name = "email")
	private String email;

	public Usuario() {}

	public Usuario(Long id, String nome, String email) {
		this.idUsuario = id;
		this.nome = nome;
		this.email = email;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Usuario other = (Usuario) obj;
		return Objects.equal(this.nome, other.nome)
				&& Objects.equal(this.email, other.email);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.nome, this.email);
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("nome", this.nome)
				.add("emai", this.email).toString();
	}

}