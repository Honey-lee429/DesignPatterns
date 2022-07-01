package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.imposto.model.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.model.Icms;
import br.com.alura.loja.imposto.model.Iss;

public class TestesCalculos {
	public static void main(String[] args) {
		CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
		Orcamento orcamentoImp = new Orcamento(new BigDecimal("100"), 5);
		System.out.println("Imposto de R$ " + calculadora.calcular(orcamentoImp, new Icms()));
		System.out.println("Imposto de R$ " + calculadora.calcular(orcamentoImp, new Iss()));
		
		CalculadoraDeDesconto calc = new CalculadoraDeDesconto();
		Orcamento orcamentoDesc = new Orcamento(new BigDecimal(201), 1);
		Orcamento orcamentoDesc1 = new Orcamento(new BigDecimal(200), 6);
		
		System.out.println("Desconto de R$ " +calc.calcul(orcamentoDesc));
		System.out.println("Desconto de R$ " +calc.calcul(orcamentoDesc1));
		
	}
}
