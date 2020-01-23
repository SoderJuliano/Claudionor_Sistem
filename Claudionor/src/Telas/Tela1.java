package Telas;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import principal.Code;

public class Tela1 extends JFrame{

	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	Code entrada;
	JLabel label = new JLabel();
	public Tela1(){
		//iniciando as variáveis
		this.entrada = new Code();
		
		
		
		// iniciando a tela
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.setTitle("Propriedade do Claudionor");
		frame.add(panel1);
		panel1.add(label);
	}
	
	public void setMensagem(String mensagem) {
		label.setText(mensagem);
		for(int i=0;i<99999; i++) {
			System.out.println(".");
			System.out.println(" .");
			System.out.println("  .");
			System.out.println("   .");
		}
	}
	
}
