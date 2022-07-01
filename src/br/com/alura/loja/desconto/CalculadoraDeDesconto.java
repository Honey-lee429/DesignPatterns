package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;
import br.com.alura.loja.desconto.status.Desconto;

public class CalculadoraDeDesconto {
	public BigDecimal calcul(Orcamento orcamento) {
		Desconto desconto =new  MaisDeCinco(
				new ValorMaiorQueDuzentos(
						new SemDesconto()));
	
		return desconto.calcular(orcamento);
	}
}
