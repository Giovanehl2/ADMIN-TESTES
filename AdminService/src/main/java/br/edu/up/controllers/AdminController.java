package br.edu.up.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.edu.up.dominio.Usuario;
import br.edu.up.dominio.UsuarioPerson;


@Component
public class AdminController {
//	public class AdminController implements CommandLineRunner {
	/*@Autowired
	public UsuarioRepository uRepository;
	private final RestTemplate rest = new RestTemplate();
	private final String srvPessoas = "http://localhost:8081/pessoas";*/
	
//	private static void buscarPessoaPorId() {
//		RestTemplate restTemplate = new RestTemplate();
//		Usuario usuario = restTemplate.getForObject("http://localhost:8081/wsp/pessoas/2", Usuario.class);
//		System.out.println("Id: " + usuario.getIdUsuario());
//		System.out.println("Nome: " + usuario.getNome());
//	}
	
//	private static void buscarPessoaPorEmailESenha() {
//		RestTemplate restTemplate = new RestTemplate();
//		UsuarioPerson usuario = restTemplate.getForObject("http://localhost:8081/wsp/arianevieira98@gmail.com/123", UsuarioPerson.class);
//		
//		System.out.println("Nome:" + usuario.getEmail());
//		System.out.println("Senha:" + usuario.getSenha());
//		System.out.println("Status:" + usuario.getStatus());
//	}

	
/*	public Usuario buscarClientePorId(Long idUsuario) {
		Map<String, Long> params = new HashMap<>();
		params.put("id", idUsuario);
		return rest.getForObject(srvPessoas + "/{id}?projection=usuario", Usuario.class, params);
	}*/

//@Override
//public void run(String... args) throws Exception {
//	// TODO Auto-generated method stub
//	//buscarPessoaPorId();
//	buscarPessoaPorEmailESenha();
//	//buscarClientePorId(null);
//}
}
