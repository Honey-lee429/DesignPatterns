package br.com.alura.loja.desconto.status;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public class EmAnalise extends SituacaoDesconto{
	public String calcularValorDesconto(Orcamento orcamento) {
		return "desconto em análise";
	}
	
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}
	
	
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}
}
