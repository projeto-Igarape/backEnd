package br.com.generation.projetoigarape.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="tb_categoria")
public class Categoria {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
	
@NotNull(message="A inserção do nome do produto é obrigatória")
@Size(min=2,max=50,message="O nome do produto deve conter entre 2 e 50 caracteres")
private String descricao;

@NotNull(message="A inserção da seção, na qual, o produto esta vincula é obrigatória")
@Size(min=2,max=50,message="A seção deve conter entre 2 e 50 caracteres")
private String secao;

public Long getId() {
	return id;
} 

public void setId(Long id) {
	this.id = id;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public String getSecao() {
	return secao;
}

public void setSecao(String secao) {
	this.secao = secao;
	}
}
