package principal;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import Telas.Tela1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tela1 tela = new Tela1();
		
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		//System.out.println("Data e Hora atual: "+c.get(Calendar.YEAR));
		Code e= new Code();
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
	     
	    tela.setMensagem(e.setValorEntrada(2000.00, f.format(data)), "label1");
	    tela.setMensagem(e.setSaida(300, f.format(data)), "label1");
	    
	    tela.setMensagem("Total de fundos R$ "+e.getValorTotal("19/01/20"), "label1");
	    
	   // c.set(Calendar.MONTH, Calendar.MARCH);
	   // Date data2 = c.getTime();
	    
	    e.setValorEntrada(600.0, f.format(data));
	    
	    tela.setMensagem("Total de fundos no mês de Janeiro é R$ "+e.getGastosMes("01"), "label2");
	    
	}

}
