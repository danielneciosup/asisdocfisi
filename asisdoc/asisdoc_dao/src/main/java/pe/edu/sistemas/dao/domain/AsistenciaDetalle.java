package pe.edu.sistemas.dao.domain;

// Generated 05/11/2016 12:55:23 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AsistenciaDetalle generated by hbm2java
 */
@Entity
@Table(name = "asistencia_detalle")
public class AsistenciaDetalle implements java.io.Serializable {

	private int idDetalle;
	private Asistencia asistencia;
	private Character tipoRegistro;
	private Character tipoMarcacion;
	private Date hora;
	private String rutaFoto;

	public AsistenciaDetalle() {
	}

	public AsistenciaDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	public AsistenciaDetalle(int idDetalle, Asistencia asistencia,
			Character tipoRegistro, Character tipoMarcacion, Date hora,
			String rutaFoto) {
		this.idDetalle = idDetalle;
		this.asistencia = asistencia;
		this.tipoRegistro = tipoRegistro;
		this.tipoMarcacion = tipoMarcacion;
		this.hora = hora;
		this.rutaFoto = rutaFoto;
	}

	@Id
	@Column(name = "id_detalle", unique = true, nullable = false)
	public int getIdDetalle() {
		return this.idDetalle;
	}

	public void setIdDetalle(int idDetalle) {
		this.idDetalle = idDetalle;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_asistencia")
	public Asistencia getAsistencia() {
		return this.asistencia;
	}

	public void setAsistencia(Asistencia asistencia) {
		this.asistencia = asistencia;
	}

	@Column(name = "tipo_registro", length = 1)
	public Character getTipoRegistro() {
		return this.tipoRegistro;
	}

	public void setTipoRegistro(Character tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}

	@Column(name = "tipo_marcacion", length = 1)
	public Character getTipoMarcacion() {
		return this.tipoMarcacion;
	}

	public void setTipoMarcacion(Character tipoMarcacion) {
		this.tipoMarcacion = tipoMarcacion;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "hora", length = 15)
	public Date getHora() {
		return this.hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	@Column(name = "ruta_foto", length = 50)
	public String getRutaFoto() {
		return this.rutaFoto;
	}

	public void setRutaFoto(String rutaFoto) {
		this.rutaFoto = rutaFoto;
	}

}