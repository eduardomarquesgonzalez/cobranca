package br.gov.mt.cuiaba.cobranca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import br.gov.mt.cuiaba.cobranca.model.StatusTitulo;
import br.gov.mt.cuiaba.cobranca.model.Titulo;
import br.gov.mt.cuiaba.cobranca.repository.Titulos;
import br.gov.mt.cuiaba.cobranca.repository.filter.TituloFilter;

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
	
	public String receber(Long codigo) {
		Titulo titulo = titulos.getOne(codigo); //recupera o titulo pelo codigo
		titulo.setStatus(StatusTitulo.RECEBIDO); // altera o status para recebido
		titulos.save(titulo); //salva o titulo
		
		return StatusTitulo.RECEBIDO.getDescricao();
	}


	public List<Titulo> filtrar(TituloFilter filtro) {
		String descricao = filtro.getDescricao() == null ? "" : filtro.getDescricao();
		return titulos.findByDescricaoContaining(descricao);
	}
	
}

