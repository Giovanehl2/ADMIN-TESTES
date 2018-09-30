package br.edu.up.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.dominio.Usuario;
import br.edu.up.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Service
@RestController
@Component
@Api(value = "Api rest para usuário" )
@RequestMapping("/wsu")
public class UsuarioService {

	@Autowired
	UsuarioRepository ur;

	@GetMapping 
	@ApiOperation(value="Retorna uma lista de Usuários")
	@RequestMapping("/listar")
	public @ResponseBody Iterable<Usuario> listaUsuario() 
	{
		Iterable<Usuario> listaUsuario = ur.findAll();
		return listaUsuario;				
	}
		
	@PostMapping
	@ApiOperation(value = "Salva um Usuário")
	@RequestMapping("/cadastrar")
	public void cadastraUsuario(@RequestBody Usuario usuario) 
	{
		ur.save(usuario);
		System.out.println("Usuario cadastrado com sucesso!");
	}
	
	@DeleteMapping
	@ApiOperation(value="Deleta um Usuário")
	@RequestMapping("/deletar/{id}")
	@RestResource(exported=false)
	public Usuario deletaUsuario(@RequestBody Usuario idUsuario) 
	{
		ur.delete(idUsuario);
		System.out.println("Usuário deletado com sucesso!");
		return idUsuario;
	}
	
}
