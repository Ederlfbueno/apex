package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtValorHora;
	private JTextField txtHoraNormal;
	private JTextField txtHoraExtra100;
	private JTextField txtHoraExtra50;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtValorHora = new JTextField();
		txtValorHora.setBounds(259, 30, 130, 26);
		contentPane.add(txtValorHora);
		txtValorHora.setColumns(10);
		
		txtHoraNormal = new JTextField();
		txtHoraNormal.setColumns(10);
		txtHoraNormal.setBounds(259, 78, 130, 26);
		contentPane.add(txtHoraNormal);
		
		txtHoraExtra100 = new JTextField();
		txtHoraExtra100.setColumns(10);
		txtHoraExtra100.setBounds(259, 171, 130, 26);
		contentPane.add(txtHoraExtra100);
		
		txtHoraExtra50 = new JTextField();
		txtHoraExtra50.setColumns(10);
		txtHoraExtra50.setBounds(259, 123, 130, 26);
		contentPane.add(txtHoraExtra50);
		
		JLabel lblValorHora = new JLabel("Valor Hora");
		lblValorHora.setBounds(71, 36, 107, 16);
		contentPane.add(lblValorHora);
		
		JLabel lblHoraNormal = new JLabel("Horas normais trabalhadas");
		lblHoraNormal.setBounds(71, 84, 177, 16);
		contentPane.add(lblHoraNormal);
		
		JLabel lblValorHora_1_1 = new JLabel("Horas extras 50%");
		lblValorHora_1_1.setBounds(71, 129, 177, 16);
		contentPane.add(lblValorHora_1_1);
		
		JLabel lblValorHora_1_1_1 = new JLabel("Horas Extras 100%");
		lblValorHora_1_1_1.setBounds(71, 177, 176, 16);
		contentPane.add(lblValorHora_1_1_1);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter dados
				int valorHora = Integer.parseInt(txtValorHora.getText());
				int horasNormais = Integer.parseInt(txtHoraNormal.getText());
				int horasExtra50 = Integer.parseInt(txtHoraExtra50.getText());
				int horasExtra100 = Integer.parseInt(txtHoraExtra100.getText());
				
				// Cálculos
				double calculoHoraNormal = valorHora * horasNormais;
				double calculoExtra50    = valorHora * horasExtra50 * 1.5;
				double calculoExtra100   = valorHora * horasExtra100 * 2;
				
				double total = calculoHoraNormal + calculoExtra50 + calculoExtra100;
				
				// Retorno
				JOptionPane.showMessageDialog(null, "R$ " + total);
					   
		
				
				
			}
		});
		btnCalcular.setBounds(175, 220, 117, 29);
		contentPane.add(btnCalcular);
	}
}









