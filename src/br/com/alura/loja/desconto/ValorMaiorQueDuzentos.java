package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;
import br.com.alura.loja.desconto.status.Desconto;

public class ValorMaiorQueDuzentos extends Desconto {
	public ValorMaiorQueDuzentos(Desconto next) {
		super(next);
	}

	@Override
	public BigDecimal efetuarCalculo(Orcamento orcamento) {
			return orcamento.getValor().multiply(new BigDecimal("0.10"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return orcamento.getValor().compareTo(new BigDecimal("200")) > 0;
	}


}
