package br.com.votenofilme.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.common.base.Objects;

/**
 * @author Anderson Virginio Martins
 * 
 * Classe Concreta para definir a tabela de de voto
 **/
@Entity
@Table(name = "Voto")
public class Voto {

	@Id
	@Column(name = "idVoto")
	private Long idVoto;

	@Column(name = "idFilme1")
	private Long idFilme1;

	@Column(name = "idFilme2")
	private Long idFilme2;

	@Column(name = "idUsuario")
	private Long idUsuario;

	@Column(name = "selecionado")
	private Long selecionado;

	Voto() {}

	public Voto(Long idVoto,Long idFilme1, Long idFilme2, Long idUsuario, Long selecionado) {
		this.idVoto = idVoto;
		this.idFilme1 = idFilme1;
		this.idFilme2 = idFilme2;
		this.idUsuario = idUsuario;
		this.selecionado = selecionado;
	}

	public Long getIdVoto() {
		return idVoto;
	}

	public void setIdVoto(Long idVoto) {
		this.idVoto = idVoto;
	}


	public Long getIdFilme1() {
		return idFilme1;
	}

	public void setIdFilme1(Long idFilme1) {
		this.idFilme1 = idFilme1;
	}

	public Long getIdFilme2() {
		return idFilme2;
	}

	public void setIdFilme2(Long idFilme2) {
		this.idFilme2 = idFilme2;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getSelecionado() {
		return selecionado;
	}

	public void setSelecionado(Long selecionado) {
		this.selecionado = selecionado;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Voto other = (Voto) obj;
		return Objects.equal(this.idVoto, other.idVoto)
				&& Objects.equal(this.idFilme1, other.idFilme1)
				&& Objects.equal(this.idFilme2, other.idFilme2)
				&& Objects.equal(this.idUsuario, other.idUsuario);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this.idVoto, this.idFilme1, this.idFilme2,this.idUsuario);
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("id", this.idVoto)
				.add("left", this.idFilme1)
				.add("right", this.idFilme2)
				.add("userProfile", this.idUsuario).toString();
	}

}
