package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.status.EmAnalise;
import br.com.alura.loja.desconto.status.SituacaoDesconto;

public class Orcamento {
	private BigDecimal valor;
	private int quantidade;
	private SituacaoDesconto situacao;
	
	public Orcamento(BigDecimal valor, int quantidade) {
		this.valor = valor;
		this.quantidade = quantidade;
		this.situacao = new EmAnalise();
	}
	
	public void aplicarDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}
	
	public void aprovar() {
		this.situacao.aprovar(this);
	}
	
	public void reprovar() {
		this.situacao.reprovar(this);
	}
	
	public void finalizar() {
		this.situacao.finalizar(this);
	}
	
	public BigDecimal getValor() {
		return valor;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public SituacaoDesconto getSituacao() {
		return situacao;
	}
	
	public void setSituacao(SituacaoDesconto situacao) {
		this.situacao = situacao;
	}
}