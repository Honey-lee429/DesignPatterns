package br.com.alura.loja.imposto.repository;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public interface ImpostoRepository {
	
	 BigDecimal calcular (Orcamento orcamento);
}
