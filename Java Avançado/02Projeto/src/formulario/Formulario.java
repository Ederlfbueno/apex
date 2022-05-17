package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;

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
		
		JLabel lblNota1 = new JLabel("Primeira nota");
		lblNota1.setBounds(58, 41, 94, 16);
		contentPane.add(lblNota1);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(150, 36, 253, 26);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		JLabel lblNota2 = new JLabel("Segunda nota");
		lblNota2.setBounds(58, 83, 94, 16);
		contentPane.add(lblNota2);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(150, 78, 253, 26);
		contentPane.add(txtNota2);
		
		JLabel lblNota3 = new JLabel("Teceira nota");
		lblNota3.setBounds(58, 121, 94, 16);
		contentPane.add(lblNota3);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(150, 116, 253, 26);
		contentPane.add(txtNota3);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(22, 217, 422, 16);
		contentPane.add(lblResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					double nota1 = Double.parseDouble(txtNota1.getText());
					double nota2 = Double.parseDouble(txtNota2.getText());
					double nota3 = Double.parseDouble(txtNota3.getText());
				
					double media = (nota1+nota2+nota3)/3;
					
					DecimalFormat df = new DecimalFormat("0.##");
					String mediaFormatada = df.format(media);
					
					String situacao = media >= 7 ? "Aprovado(a)" : "Reprovado(a)";
					
					lblResultado.setText(situacao + " com média " + mediaFormatada);
					
				}catch(Exception erro) {
					lblResultado.setText("Falha ao calcular, tente novamente!");
				}
				
			}
		});
		btnCalcular.setBounds(176, 158, 117, 29);
		contentPane.add(btnCalcular);
		
		
	}
}
