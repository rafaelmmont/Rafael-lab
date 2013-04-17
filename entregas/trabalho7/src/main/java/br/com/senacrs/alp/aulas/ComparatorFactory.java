package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class ComparatorFactory {
	
	private static final ComparatorFactory instancia = new ComparatorFactory();
	
	private ComparatorFactory() {
	}
	
	public Comparator<Integer> criarComparatorParesAntesDeImparesCrescente() {
		
		Comparator<Integer> resultado = null;
		
		resultado = new ComparatorInt();
		
		return resultado;
	}
	
	public Comparator<String> criarComparatorOrdemAlfabeticaReversa() {
		
		Comparator<String> resultado = null;
		
		return resultado = new ComparatorString();
	}
	
	public static ComparatorFactory getInstancia() {
		return instancia;
	}
}