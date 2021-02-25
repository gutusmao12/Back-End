package br.com.games.generation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
	@NotNull @Size(min = 3, max = 15)private String console;
	@NotNull @Size(min = 5, max = 30)private String nomeJogo;
	@NotNull private String preçoJogo;
	@ManyToOne @JsonIgnoreProperties("categoria") private Produto produto;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	public String getPreçoJogo() {
		return preçoJogo;
	}
	public void setPreçoJogo(String preçoJogo) {
		this.preçoJogo = preçoJogo;
	}		
}
