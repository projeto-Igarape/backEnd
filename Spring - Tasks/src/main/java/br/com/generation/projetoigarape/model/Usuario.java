package br.com.generation.projetoigarape.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;


@Entity
@Table(name="tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
		
	@NotNull(message="A inserção do nome é obrigatória")
	private String nome;

	@Schema(example = "email@email.com.br")
	@NotNull(message="A inserção do email é obrigatória")
	private String email;

	@NotNull(message="A inserção da senha é obrigatória")
	@Size(min=8, message="O nome do produto deve conter entre 2 e 50 caracteres")

	@Size(min=8,message="O nome do produto deve conter entre 2 e 50 caracteres")
	private String senha;
	
	@OneToMany(mappedBy="usuario", cascade=CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Produto> produto;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}


