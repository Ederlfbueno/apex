package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtValor;

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
		
		txtValor = new JTextField();
		txtValor.setBounds(143, 32, 130, 26);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Informe o período");
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.addItem("4");
		comboBox.addItem("5");
		comboBox.addItem("6");
		comboBox.setBounds(143, 73, 130, 27);
		contentPane.add(comboBox);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Obter dados
				double valor = Double.parseDouble(txtValor.getText());
				int parcelas = Integer.parseInt(comboBox.getSelectedItem().toString());
				
				// Estrutura
				String estrutura = "Investimento\n";
				
				// Laço
				for(int indice = 1; indice <= parcelas; indice++) {
					
					valor += valor * 0.0036;
					
					DecimalFormat df = new DecimalFormat("0.##");
					String valorFormatado = df.format(valor);
					
					
					estrutura += indice+"º mês - R$ " + valorFormatado + "\n";
				}
				
				// Exibir a estrutura
				JOptionPane.showMessageDialog(null, estrutura);
				
			}
		});
		btnCalcular.setBounds(156, 112, 117, 29);
		contentPane.add(btnCalcular);
	}
}
