package br.com.alura.loja.desconto.status;

import java.math.BigDecimal;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.Orcamento;

public class Aprovado extends SituacaoDesconto{
	
	
	@Override
	public void finalizar(Orcamento orcamento) {
		 orcamento.setSituacao(new Finalizado());
	}
}
