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

import br.edu.up.dominio.Acao;
import br.edu.up.repository.AcaoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Service
@RestController
@Component
@Api(value = "Api rest para ação" )
@RequestMapping("/wsa")
public class AcaoService {

	//injetar dependencia
	@Autowired
	AcaoRepository ar;
	
	@GetMapping 
	@ApiOperation(value="Retorna uma lista de Ações")
	@RequestMapping("/listar")
	public @ResponseBody Iterable<Acao> listaAcoes() 
	{
		Iterable<Acao> listaAcoes = ar.findAll();
		return listaAcoes;				
	}
	
	@PostMapping
	@ApiOperation(value = "Salva uma Ação")
	@RequestMapping("/cadastrar")
	public void cadastraAcao(@RequestBody Acao acao) 
	{
		ar.save(acao);
		System.out.println("Ação cadastrada com sucesso!");
	}
	
	@DeleteMapping
	@ApiOperation(value="Deleta uma Ação")
	@RequestMapping("/deletar/{id}")
	@RestResource(exported=false)
	public Acao deletaAcao(@RequestBody Acao idAcao) 
	{
		ar.delete(idAcao);
		System.out.println("Ação deletada com sucesso!");
		return idAcao;
	}
	
}
