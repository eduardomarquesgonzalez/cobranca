package br.gov.mt.cuiaba.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.mt.cuiaba.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long>{
	
}
