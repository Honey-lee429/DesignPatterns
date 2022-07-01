package br.com.alura.loja.imposto.model;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;
import br.com.alura.loja.imposto.repository.ImpostoRepository;

public class Iss implements ImpostoRepository {
	public BigDecimal calcular (Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.1"));
	}
}
