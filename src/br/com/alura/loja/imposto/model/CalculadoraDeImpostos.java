package br.com.alura.loja.imposto.model;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;
import br.com.alura.loja.imposto.repository.ImpostoRepository;

public class CalculadoraDeImpostos {
	public BigDecimal calcular(Orcamento orcamento, ImpostoRepository imposto) {

		return imposto.calcular(orcamento);
	}
}
