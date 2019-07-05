package pe.edu.unsch.entities;
// Generated 28/06/2019 07:38:29 PM by Hibernate Tools 5.2.10.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SemestreId generated by hbm2java
 */
@Embeddable
public class SemestreId implements java.io.Serializable {

	private int idSemestre;
	private int docenteIdDocente;

	public SemestreId() {
	}

	public SemestreId(int idSemestre, int docenteIdDocente) {
		this.idSemestre = idSemestre;
		this.docenteIdDocente = docenteIdDocente;
	}

	@Column(name = "idSemestre", nullable = false)
	public int getIdSemestre() {
		return this.idSemestre;
	}

	public void setIdSemestre(int idSemestre) {
		this.idSemestre = idSemestre;
	}

	@Column(name = "Docente_idDocente", nullable = false)
	public int getDocenteIdDocente() {
		return this.docenteIdDocente;
	}

	public void setDocenteIdDocente(int docenteIdDocente) {
		this.docenteIdDocente = docenteIdDocente;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof SemestreId))
			return false;
		SemestreId castOther = (SemestreId) other;

		return (this.getIdSemestre() == castOther.getIdSemestre())
				&& (this.getDocenteIdDocente() == castOther.getDocenteIdDocente());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIdSemestre();
		result = 37 * result + this.getDocenteIdDocente();
		return result;
	}

}