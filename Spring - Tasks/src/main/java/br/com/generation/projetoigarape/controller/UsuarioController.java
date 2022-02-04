package br.com.generation.projetoigarape.controller;
<<<<<<< HEAD

import java.util.List;
=======
import java.util.List;

>>>>>>> task8
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.DeleteMapping;
>>>>>>> task8
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import br.com.generation.projetoigarape.model.Usuario;
import br.com.generation.projetoigarape.model.UsuarioLogin;
import br.com.generation.projetoigarape.repository.UsuarioRepository;
import br.com.generation.projetoigarape.service.UsuarioService;
=======
import br.com.generation.projetoigarape.service.UsuarioService;

import br.com.generation.projetoigarape.model.Usuario;
import br.com.generation.projetoigarape.model.UsuarioLogin;
import br.com.generation.projetoigarape.repository.UsuarioRepository;


>>>>>>> task8

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	@Autowired
<<<<<<< HEAD
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping 
	public ResponseEntity<List<Usuario>> getAll() {
		
			return ResponseEntity.ok(usuarioRepository.findAll());
	}
	@GetMapping ("/{id}")
	public ResponseEntity<Usuario>getById(@Valid @PathVariable Long id){
		
		return usuarioRepository.findById(id)
				.map(resposta->ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
=======
	private UsuarioService usuarioService;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/listar")
	public ResponseEntity <List<Usuario>> getAll(){
		
		return ResponseEntity.ok(usuarioRepository.findAll());
		
>>>>>>> task8
	}
	
	@PostMapping("/logar")
	public ResponseEntity<UsuarioLogin> loginUsuario(@RequestBody Optional <UsuarioLogin> usuarioLogin){
		
		return usuarioService.autenticarUsuario(usuarioLogin)
			.map(respostaLogin -> ResponseEntity.status(HttpStatus.OK).body(respostaLogin))
			.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
<<<<<<< HEAD
	public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario usuario){
=======
	public ResponseEntity<Usuario> postUsuario(@Valid @RequestBody Usuario usuario){
>>>>>>> task8
		
		return usuarioService.cadastrarUsuario(usuario)
			.map(respostaCadastrar -> ResponseEntity.status(HttpStatus.CREATED).body(respostaCadastrar))
			.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
	}
	
	@PutMapping("/atualizar")
<<<<<<< HEAD
	public ResponseEntity<Usuario> putUsuario(@RequestBody Usuario usuario) {
		
		return usuarioService.atualizarUsuario(usuario)
				.map(resposta->ResponseEntity.status(HttpStatus.OK).body(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	}

}
=======
	public ResponseEntity<Usuario> putUsuario(@Valid @RequestBody Usuario usuario) {
		return usuarioService.atualizarUsuario(usuario)
			.map(resposta -> ResponseEntity.status(HttpStatus.OK).body(resposta))
			.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deletePostagem(@PathVariable long id) {
		
		return usuarioRepository.findById(id)
			.map(resposta -> {
				usuarioRepository.deleteById(id);
				return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			})
			.orElse(ResponseEntity.notFound().build());
	}

	
	

}
>>>>>>> task8
