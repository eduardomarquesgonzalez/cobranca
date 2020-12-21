package br.gov.mt.cuiaba.cobranca.model;

public enum StatusTitulo {
	PENDENTE("pendente"),
	RECEBIDO("recebido");
	/*CANCELADO("cancelado");*/

	private String descricao;
	StatusTitulo(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
}
