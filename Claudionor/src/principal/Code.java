package principal;

import java.util.HashMap;
import java.util.Set;

public class Code {

	private double valorEntrada;
	private double valorSaida;
	private HashMap<String, Double> valorCaixa = new HashMap();	
	
	public String setValorEntrada(Double valorEntrada, String data) {
		this.valorEntrada = valorEntrada;
		if(valorCaixa.containsKey(data)) {
			double var = valorCaixa.get(data);
			var+=this.valorEntrada;
			valorCaixa.put(data, var);
		}else {
			valorCaixa.put(data, this.valorEntrada);
		}
		return "Adicionado R$ "+this.valorEntrada;
	}
	public double getValorTotal(String data) {
		double valor = 0;
		Set<String> chaves = valorCaixa.keySet();
		for (String chave : chaves)
		{
			if(chave != null)
				valor+=valorCaixa.get(chave);
		}
		return valor;
	}
	public String setSaida(double valorSaida, String data) {
		this.valorSaida = valorSaida;
		if(valorCaixa.containsKey(data)) {
			double var = valorCaixa.get(data);
			var-=this.valorSaida;
			valorCaixa.put(data, var);
		}else {
			valorCaixa.put(data, this.valorSaida);
		}
		return "Gasto R$ "+this.valorSaida;
	}
	public double getGastosMes(String mes) {
		double valor=0;
		Set<String> chaves = valorCaixa.keySet(); 
		for(String chave: chaves) {
			if(chave!=null) {
				String[] c = chave.split("/");
				if(c[1].equals(mes)) {
					valor+=valorCaixa.get(chave);
				}{
				}
			}
		}
		return valor;
	}
}
