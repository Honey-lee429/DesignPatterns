package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;
import br.com.alura.loja.desconto.status.Desconto;

public class MaisDeCinco extends Desconto{
	public MaisDeCinco(Desconto next) {
		super(next);
	}
	

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
			return orcamento.getValor().multiply(new BigDecimal("0.1"));
		
	}



	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		 return orcamento.getQuantidade() > 5;

	}


}
