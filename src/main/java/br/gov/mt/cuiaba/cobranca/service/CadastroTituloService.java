package br.gov.mt.cuiaba.cobranca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.gov.mt.cuiaba.cobranca.model.Titulo;
import br.gov.mt.cuiaba.cobranca.repository.Titulos;

@Service
public class CadastroTituloService {
	
	@Autowired
	private Titulos titulos;
	
	public void salvar  (Titulo titulo) {
		try { 
			titulos.save(titulo);
		}catch(DataIntegrityViolationException e ) {
			throw new IllegalArgumentException("Formato de data invalido");
		}
	
	}

	public void excluir(Long codigo) {
		titulos.deleteById(codigo);
		
	}
	
}
