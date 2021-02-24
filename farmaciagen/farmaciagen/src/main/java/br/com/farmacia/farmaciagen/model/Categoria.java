package br.com.farmacia.farmaciagen.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
	@NotNull private String remedio;
	@NotNull private String higienePessoal;
	@NotNull private String vitaminas;
	@ManyToOne @JsonIgnoreProperties("categoria") private Produto produto;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRemedio() {
		return remedio;
	}
	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}
	public String getHigienePessoal() {
		return higienePessoal;
	}
	public void setHigienePessoal(String higienePessoal) {
		this.higienePessoal = higienePessoal;
	}
	public String getVitaminas() {
		return vitaminas;
	}
	public void setVitaminas(String vitaminas) {
		this.vitaminas = vitaminas;
	}
}
