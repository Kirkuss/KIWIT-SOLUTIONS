package es.esi.cr.iso.gestionmesas.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public abstract class AbstractEntity implements Serializable, Comparable<AbstractEntity> {

	private static final long serialVersionUID = -1728118424063172773L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	protected Long identificator;

	@Column(name = "fecha")
	protected Timestamp fecha;

	@Version
	protected Long version;

	public Long getId() {
		return identificator;
	}
	
	public void setId(Long id) {
		this.identificator = id;
	}

	public Timestamp getFecha() {
		return new Timestamp(fecha.getTime());
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = new Timestamp(fecha.getTime());
	}

	@Override
	public String toString() {
		return "AbstractEntity [id=" + identificator + ", fecha=" + fecha + ", version=" + version + "]";
	}

	@Override
	public int compareTo(AbstractEntity o) {
		int value;
		
		if (o == null || o.getId() == null) {
			value = 1;
		} else if (getId() == null) {
			value = -1;
		}else {
			value = getId().compareTo(o.getId());
		}
		
		return value;
	}

}
