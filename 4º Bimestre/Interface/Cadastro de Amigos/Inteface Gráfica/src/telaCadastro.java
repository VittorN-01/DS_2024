import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField caixaNome;
	private JTextField caixaApelido;
	private JTextField caixaTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaCadastro frame = new telaCadastro();
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
	public telaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CadastroAmigos = new JLabel("Cadastro de Amigos");
		CadastroAmigos.setForeground(Color.WHITE);
		CadastroAmigos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		CadastroAmigos.setHorizontalAlignment(SwingConstants.CENTER);
		CadastroAmigos.setBounds(102, 11, 231, 30);
		contentPane.add(CadastroAmigos);
		
		JLabel Nome = new JLabel("Nome:");
		Nome.setForeground(Color.LIGHT_GRAY);
		Nome.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		Nome.setBounds(114, 72, 46, 14);
		contentPane.add(Nome);
		
		JLabel Apelido = new JLabel("Apelido:");
		Apelido.setForeground(Color.LIGHT_GRAY);
		Apelido.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		Apelido.setBounds(99, 113, 61, 14);
		contentPane.add(Apelido);
		
		JLabel Telefone = new JLabel("Telefone:");
		Telefone.setForeground(Color.LIGHT_GRAY);
		Telefone.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		Telefone.setBounds(99, 150, 61, 39);
		contentPane.add(Telefone);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Conexao bd = new Conexao();
				bd.conectar();
				
			}
		});
		btnCadastrar.setBounds(35, 227, 113, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal voltar = new Principal();
				voltar.setVisible(true);
				dispose();
				
			}
		});
		btnVoltar.setBounds(284, 227, 89, 23);
		contentPane.add(btnVoltar);
		
		caixaNome = new JTextField();
		caixaNome.setBounds(208, 69, 150, 20);
		contentPane.add(caixaNome);
		caixaNome.setColumns(10);
		
		caixaApelido = new JTextField();
		caixaApelido.setBounds(208, 111, 150, 20);
		contentPane.add(caixaApelido);
		caixaApelido.setColumns(10);
		
		caixaTelefone = new JTextField();
		caixaTelefone.setBounds(208, 160, 150, 20);
		contentPane.add(caixaTelefone);
		caixaTelefone.setColumns(10);
	}
}
