package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import conexao.conexao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class clientes extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtIdade;
	private JTextField txtCPF;
	private JTable tClientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					clientes frame = new clientes();
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
	public clientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo:");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(10, 36, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setBounds(10, 61, 60, 14);
		contentPane.add(lblSobrenome);
		
		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(10, 86, 46, 14);
		contentPane.add(lblIdade);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(10, 109, 46, 14);
		contentPane.add(lblCpf);
		
		txtCodigo = new JTextField();
		txtCodigo.setEditable(false);
		txtCodigo.setBounds(78, 8, 230, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		txtNome.setBounds(78, 33, 230, 20);
		contentPane.add(txtNome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(78, 58, 230, 20);
		contentPane.add(txtSobrenome);
		
		txtIdade = new JTextField();
		txtIdade.setColumns(10);
		txtIdade.setBounds(78, 83, 230, 20);
		contentPane.add(txtIdade);
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		txtCPF.setBounds(78, 106, 230, 20);
		contentPane.add(txtCPF);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 148, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(140, 148, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.setBounds(268, 148, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancela");
		btnCancelar.setEnabled(false);
		btnCancelar.setBounds(392, 148, 89, 23);
		contentPane.add(btnCancelar);
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrarCliente();
			}
		});

		
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCadastrar.setEnabled(false);
				btnCancelar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnAlterar.setEnabled(true);
				
				atualizarCliente(); 

				btnCadastrar.setEnabled(true);
				btnCancelar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnAlterar.setEnabled(false);
				
			}
		});
		
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCadastrar.setEnabled(false);
				btnCancelar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnAlterar.setEnabled(true);

				deletarCliente();
				
				btnCadastrar.setEnabled(true);
				btnCancelar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnAlterar.setEnabled(false);

			}
			
		});

		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();

				btnCadastrar.setEnabled(true);
				btnCancelar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnAlterar.setEnabled(false);

			}
		});

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 182, 471, 131);
		contentPane.add(scrollPane);
		
		tClientes = new JTable();
		tClientes.setColumnSelectionAllowed(true);
		tClientes.setCellSelectionEnabled(true);
		
		tClientes.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
			@Override
		    public void valueChanged(ListSelectionEvent event) {

				btnCadastrar.setEnabled(false);
				
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnCancelar.setEnabled(true);
				
				int linhaSelecionada = tClientes.getSelectedRow();
				
				txtCodigo.setText(tClientes.getValueAt(linhaSelecionada, 0).toString());
				txtNome.setText(tClientes.getValueAt(linhaSelecionada, 1).toString());
				txtIdade.setText(tClientes.getValueAt(linhaSelecionada, 2).toString());
				txtSobrenome.setText(tClientes.getValueAt(linhaSelecionada, 3).toString());
				txtCPF.setText(tClientes.getValueAt(linhaSelecionada, 4).toString());
		    }
	    });
		
		scrollPane.setViewportView(tClientes);
		tClientes.setModel(listarDados());
	}

	private static DefaultTableModel listarDados() {
		DefaultTableModel dados = new DefaultTableModel(); 
		dados.fireTableDataChanged();


		dados.addColumn("Código");
		dados.addColumn("Nome");
		dados.addColumn("Idade");
		dados.addColumn("Sobrenome");
		dados.addColumn("CPF");
		
		try {
			conexao conexao = new conexao(); 
			
			String sql = "SELECT * FROM clientes";
			
			Statement stmt = conexao.conectar().createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				dados.addRow(new Object[] { rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)});
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Falha na busca de usuarios " + e);
		}
		return dados; 
	}
	
	private void cadastrarCliente() {
		
		conexao conexao = new conexao();
		String nome = txtNome.getText();
		String sobrenome = txtSobrenome.getText();
		String cpf = txtCPF.getText(); 
		int idade = Integer.parseInt(txtIdade.getText());
		
		try { 
			String sql = "INSERT INTO clientes (nome, sobrenome, cpf, idade) VALUES (?,?,?,?) "; 
			
			PreparedStatement psmt = conexao.conectar().prepareCall(sql);
			psmt.setString(1, nome);
			psmt.setString(2, sobrenome);
			psmt.setString(3, cpf);
			psmt.setInt(4, idade);
			
			psmt.execute();
			limparCampos();
			
			tClientes.setModel(listarDados());
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	private void atualizarCliente() {
		
		conexao conexao = new conexao();
		
		int id = Integer.parseInt(txtCodigo.getText());
		String nome = txtNome.getText();
		String sobrenome = txtSobrenome.getText();
		String cpf = txtCPF.getText(); 
		int idade = Integer.parseInt(txtIdade.getText());
		
		try { 
			String sql = "UPDATE clientes "
					+ "      set nome = ? "
					+ "       , sobrenome = ? "
					+ "		  , cpf = ? "
					+ "  	  , idade = ? "
					+ "   WHERE id = ? "; 
			
			PreparedStatement psmt = conexao.conectar().prepareCall(sql);
			psmt.setString(1, nome);
			psmt.setString(2, sobrenome);
			psmt.setString(3, cpf);
			psmt.setInt(4, idade);
			psmt.setInt(5, id);
			
			
			psmt.execute();

			limparCampos(); 
			
			
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		tClientes.setModel(listarDados());
	}
	
	private void limparCampos() {
		txtCodigo.setText("");
		txtNome.setText("");
		txtSobrenome.setText("");
		txtCPF.setText("");
		txtIdade.setText("");
	}

	private void deletarCliente() {
		conexao conexao = new conexao();
		
		int id = Integer.parseInt(txtCodigo.getText());
		
		try { 
			String sql = "Delete from clientes where id =  ? "; 
			
			PreparedStatement psmt = conexao.conectar().prepareCall(sql);
			psmt.setInt(1, id);
			
			
			psmt.execute();
			tClientes.setModel(listarDados());

			limparCampos();
			
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}		
	}

}
