package br.com.generation.projetoigarape.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="tb_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
		
	@NotNull(message="A inserção do nome é obrigatória")
	@Size(min=2,max=50,message="O nome do produto deve conter entre 2 e 50 caracteres")
	private String nome;

	@NotNull(message="A inserção do email é obrigatória")
	@Size(min=2,max=50,message="O nome do produto deve conter entre 2 e 50 caracteres")
	private String email;

	@NotNull(message="A inserção da senha é obrigatória")
	@Size(min=2,max=50,message="O nome do produto deve conter entre 2 e 50 caracteres")
	private String senha;

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

	
}