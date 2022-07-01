package br.com.alura.loja.desconto.status;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public class Reprovado extends SituacaoDesconto{
	public void finalizar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}
}
