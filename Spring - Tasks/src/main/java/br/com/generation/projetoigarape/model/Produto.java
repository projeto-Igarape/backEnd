package br.com.generation.projetoigarape.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_produtos")
public class Produto {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     private Long id;
	
     @NotNull(message="A inserção do nome do produto é obrigatória")
     @Size(min=2,max=50,message="O nome do produto deve conter entre 2 e 50 caracteres")
     private String nome;

     @JsonFormat(shape=JsonFormat.Shape.STRING)
     private BigDecimal preco;

     @NotNull(message= "Campo obrigatório.")
     private String foto;

     @ManyToOne
     @JsonIgnoreProperties("produto")
     private Categoria categoria;

     @ManyToOne
     @JsonIgnoreProperties("produto")
     private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
     
}

  
