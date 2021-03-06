package pe.edu.sistemas.dao.domain;

// Generated 05/11/2016 12:55:23 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Curso generated by hbm2java
 */
@Entity
@Table(name = "curso")
public class Curso implements java.io.Serializable {

	private int idCurso;
	private String coCurso;
	private String nomCurso;
	private Integer nuCreditos;
	private Set horarioCursos = new HashSet(0);

	public Curso() {
	}

	public Curso(int idCurso) {
		this.idCurso = idCurso;
	}

	public Curso(int idCurso, String coCurso, String nomCurso,
			Integer nuCreditos, Set horarioCursos) {
		this.idCurso = idCurso;
		this.coCurso = coCurso;
		this.nomCurso = nomCurso;
		this.nuCreditos = nuCreditos;
		this.horarioCursos = horarioCursos;
	}

	@Id
	@Column(name = "id_curso", unique = true, nullable = false)
	public int getIdCurso() {
		return this.idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	@Column(name = "co_curso", length = 15)
	public String getCoCurso() {
		return this.coCurso;
	}

	public void setCoCurso(String coCurso) {
		this.coCurso = coCurso;
	}

	@Column(name = "nom_curso", length = 40)
	public String getNomCurso() {
		return this.nomCurso;
	}

	public void setNomCurso(String nomCurso) {
		this.nomCurso = nomCurso;
	}

	@Column(name = "nu_creditos")
	public Integer getNuCreditos() {
		return this.nuCreditos;
	}

	public void setNuCreditos(Integer nuCreditos) {
		this.nuCreditos = nuCreditos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "curso")
	public Set getHorarioCursos() {
		return this.horarioCursos;
	}

	public void setHorarioCursos(Set horarioCursos) {
		this.horarioCursos = horarioCursos;
	}

}
