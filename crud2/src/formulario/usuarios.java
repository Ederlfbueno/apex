package formulario;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import conexao.conexao;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class usuarios extends JFrame {
	private JTextField Tcodigo;
	private JTextField Tname;
	private JTable tUsuarios;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					usuarios frame = new usuarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public usuarios() throws SQLException {
		
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lcodigo = new JLabel("C\u00F3digo:");
		lcodigo.setBounds(67, 30, 39, 14);
		getContentPane().add(lcodigo);
		
		Tcodigo = new JTextField();
		Tcodigo.setEditable(false);
		Tcodigo.setBounds(107, 27, 263, 20);
		getContentPane().add(Tcodigo);
		Tcodigo.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(67, 58, 39, 14);
		getContentPane().add(lblNome);
		
		Tname = new JTextField();
		Tname.setColumns(10);
		Tname.setBounds(107, 55, 263, 20);
		getContentPane().add(Tname);
		
		JButton bCadastrar = new JButton("Cadastrar");
		bCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = Tname.getText(); 
				
				try {
					
					conexao conexao = new conexao();
					String sql = "INSERT INTO usuarios (nomeUsuario) VALUES (?)";
					
					PreparedStatement pstmt = conexao.conectar().prepareStatement(sql);
					pstmt.setString(1, nome);
					
					pstmt.execute();
					
				   JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
					
				} catch (Exception ex ) {
				   JOptionPane.showMessageDialog(null, "falha no cadastro");
				}
				
				
				Tname.setText("");
				tUsuarios.setModel(listarDados());
			}
		});
		bCadastrar.setBounds(25, 94, 89, 23);
		getContentPane().add(bCadastrar);
		
		JButton bAlterar = new JButton("Alterar");
		bAlterar.setEnabled(false);
		bAlterar.setBounds(124, 94, 89, 23);
		getContentPane().add(bAlterar);
		
		JButton bCancelar = new JButton("Cancela");
		bCancelar.setEnabled(false);
		bCancelar.setBounds(322, 94, 89, 23);
		getContentPane().add(bCancelar);
		
		JButton bExcluir = new JButton("Excluir");
		bExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int codigoUsuario = Integer.parseInt(Tcodigo.getText());
				
				try {
					
					conexao conexao = new conexao(); 
					
					String sql = "DELETE FROM usuarios WHERE idUsuario = ? ";
					
					PreparedStatement pstmt = conexao.conectar().prepareStatement(sql);
					pstmt.setInt(1, codigoUsuario);
										
					pstmt.execute();
					
					bCadastrar.setEnabled(true);
					bAlterar.setEnabled(false);
					bExcluir.setEnabled(false);
					bCancelar.setEnabled(true);

					Tcodigo.setText("");
					Tname.setText("");
					tUsuarios.setModel(listarDados());
					
				} catch (Exception ex) { 
					JOptionPane.showMessageDialog(null, "Falha na exclusão" + ex.getMessage());
				}
				
				tUsuarios.setModel(listarDados());

			}
		});
		
		bExcluir.setEnabled(false);
		bExcluir.setBounds(223, 94, 89, 23);
		getContentPane().add(bExcluir);
		
		bAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int codigoUsuario = Integer.parseInt(Tcodigo.getText());
				String nomeUsuario = Tname.getText();
				
				try {
					
					conexao conexao = new conexao(); 
					
					String sql = "UPDATE usuarios "
							+ "      SET nomeUsuario = ? "
							+ "    WHERE idUsuario = ?";
					
					PreparedStatement pstmt = conexao.conectar().prepareStatement(sql);
					pstmt.setString(1, nomeUsuario);
					pstmt.setInt(2, codigoUsuario);
					
					pstmt.execute();
					
					Tcodigo.setText("");
					Tname.setText("");
					
					bCadastrar.setEnabled(true);
					bAlterar.setEnabled(false);
					bExcluir.setEnabled(false);
					bCancelar.setEnabled(false);
					
				} catch (Exception ex) { 
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
				tUsuarios.setModel(listarDados());

			}
		});
		
		bCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tcodigo.setText("");
				Tname.setText("");

				bCadastrar.setEnabled(true);
				bAlterar.setEnabled(false);
				bExcluir.setEnabled(false);
				bCancelar.setEnabled(false);
			}
		});

		JScrollPane spUsuarios = new JScrollPane();
		spUsuarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				bCadastrar.setEnabled(false);
				
				bAlterar.setEnabled(true);
				bExcluir.setEnabled(true);
				bCancelar.setEnabled(true);
				
				int linhaSelecionada = tUsuarios.getSelectedRow();
				
				Tcodigo.setText(tUsuarios.getValueAt(linhaSelecionada, 0).toString());
				Tname.setText(tUsuarios.getValueAt(linhaSelecionada, 1).toString());
				
			}
		});
		
		spUsuarios.setBounds(25, 128, 386, 122);
		getContentPane().add(spUsuarios);
		
		tUsuarios = new JTable();
		tUsuarios.setColumnSelectionAllowed(true);
		tUsuarios.setCellSelectionEnabled(true);
		
		tUsuarios.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
			@Override
		    public void valueChanged(ListSelectionEvent event) {

				bCadastrar.setEnabled(false);
				
				bAlterar.setEnabled(true);
				bExcluir.setEnabled(true);
				bCancelar.setEnabled(true);
				
				int linhaSelecionada = tUsuarios.getSelectedRow();
				
				Tcodigo.setText(tUsuarios.getValueAt(linhaSelecionada, 0).toString());
				Tname.setText(tUsuarios.getValueAt(linhaSelecionada, 1).toString());
		    }
	    });
		
		spUsuarios.setViewportView(tUsuarios);
		tUsuarios.setModel(listarDados());
	}

	private static DefaultTableModel listarDados() {
		DefaultTableModel dados = new DefaultTableModel(); 
		
		dados.addColumn("Código");
		dados.addColumn("Nome");
		
		try {
			conexao conexao = new conexao(); 
			
			String sql = "SELECT * FROM usuarios";
			
			Statement stmt = conexao.conectar().createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				dados.addRow(new Object[] { rs.getInt(1), rs.getString(2)});
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Falha na busca de usuarios " + e);
		}
		return dados; 
	}
	
}
