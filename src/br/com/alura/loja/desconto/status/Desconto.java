package br.com.alura.loja.desconto.status;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public abstract class Desconto {
	
	protected Desconto next;
	
	public Desconto(Desconto next) {
		this.next = next;
	}
	
	public BigDecimal calcular(Orcamento orcamento) {
		 if(deveAplicar(orcamento)) {
			return efetuarCalculo(orcamento);
		}
		 return next.calcular(orcamento);
	}
	
	protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
	protected abstract boolean deveAplicar(Orcamento orcamento);
}
