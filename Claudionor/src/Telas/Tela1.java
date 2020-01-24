package Telas;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import principal.Code;

public class Tela1 extends JFrame{

	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	
	HashMap<String, JLabel> labels = new HashMap();
	JLabel label = new JLabel();
	JLabel textoSetEntrada = new JLabel(); 
	public Tela1(){
		//iniciando as variáveis
		
		
		
		// iniciando a tela
		frame.setVisible(true);
		frame.setSize(600, 600);
		frame.setTitle("Propriedade do Claudionor");
		frame.add(panel1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		labels.put("label1", label);
		labels.put("label2", textoSetEntrada);
		
		panel1.setLayout(new GridLayout());
		panel1.add(label);
		panel1.add(textoSetEntrada);
	}
	
	public void setMensagem(String mensagem, String label) {
		((JLabel) labels.get(label)).setText(mensagem);
	}
	
}
