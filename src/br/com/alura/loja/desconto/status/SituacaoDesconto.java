package br.com.alura.loja.desconto.status;

import java.math.BigDecimal;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.Orcamento;

public abstract class SituacaoDesconto {
	
	public BigDecimal calcularValorDescontoExtra(Orcamento orcameto) {
		return BigDecimal.ZERO;
	}

	public void aprovar (Orcamento orcamento) {
		throw new DomainException("Orcamento nao pode ser aprovado");
	}
	
	public void reprovar (Orcamento orcamento) {
		throw new DomainException("Orcamento nao pode ser aprovado");
	}
	
	public void finalizar (Orcamento orcamento) {
		throw new DomainException("Orcamento nao pode ser finalizado");
	}
}
