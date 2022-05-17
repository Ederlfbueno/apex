package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;

public class MediaView extends JFrame {
	
	private JTextField numero1 = new JTextField(10);
	private JLabel media = new JLabel("Medias");
	private JTextField numero2 = new JTextField(10);
	private JTextField numero3 = new JTextField(10);
	private JTextField numero4 = new JTextField(10);
	private JTextField resultado = new JTextField(10);
	private JButton botaoCalcular = new JButton("Calcular");
	
	public MediaView() {
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		calcPanel.add(media);
		calcPanel.add(numero1);
		calcPanel.add(numero2);
		calcPanel.add(numero3);
		calcPanel.add(numero4);
		calcPanel.add(botaoCalcular);
		calcPanel.add(resultado);
		getContentPane().add(calcPanel);
	}
	
	public double getNUmero1() {
		return Double.parseDouble(numero1.getText());
	}
	
	public double getNUmero2() {
		return Double.parseDouble(numero2.getText());
	}
	public double getNUmero3() {
		return Double.parseDouble(numero3.getText());
	}
	public double getNUmero4() {
		return Double.parseDouble(numero4.getText());
	}
	
	public double getResultado() {
		return Double.parseDouble(resultado.getText());
	}
		
	public void setResultado(double media) {
		resultado.setText(Double.toString(media));
	}

	public void MediaListener(ActionListener eventoBotaoCalcular) {
		botaoCalcular.addActionListener(eventoBotaoCalcular);
	}

	public void displayErrorMessage(String mensagemErro) { 
		JOptionPane.showMessageDialog(this, mensagemErro);
	}

}
