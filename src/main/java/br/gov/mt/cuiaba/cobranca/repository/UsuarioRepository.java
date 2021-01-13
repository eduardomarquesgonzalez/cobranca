package br.gov.mt.cuiaba.cobranca.repository;

import org.springframework.data.repository.CrudRepository;

import br.gov.mt.cuiaba.cobranca.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{
	
	Usuario findByLogin(String login);
	

}
