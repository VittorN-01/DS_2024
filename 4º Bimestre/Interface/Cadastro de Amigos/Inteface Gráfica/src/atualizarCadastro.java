import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class atualizarCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textApelido;
	private JTextField textTelefone;
	private JTextField textID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					atualizarCadastro frame = new atualizarCadastro();
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
	public atualizarCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 664, 552);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel atualizarAmigos = new JLabel("Atualizar Amigos");
		atualizarAmigos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		atualizarAmigos.setHorizontalAlignment(SwingConstants.CENTER);
		atualizarAmigos.setForeground(Color.WHITE);
		atualizarAmigos.setBounds(201, 23, 231, 30);
		contentPane.add(atualizarAmigos);
		
		JLabel lblID = new JLabel("Id:");
		lblID.setForeground(Color.LIGHT_GRAY);
		lblID.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblID.setBounds(209, 117, 46, 14);
		contentPane.add(lblID);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.LIGHT_GRAY);
		lblNome.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNome.setBounds(209, 167, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblApelido = new JLabel("Apelido:");
		lblApelido.setForeground(Color.LIGHT_GRAY);
		lblApelido.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblApelido.setBounds(209, 218, 60, 18);
		contentPane.add(lblApelido);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setForeground(Color.LIGHT_GRAY);
		lblTelefone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTelefone.setBounds(209, 274, 79, 14);
		contentPane.add(lblTelefone);
		
		textNome = new JTextField();
		textNome.setBounds(282, 165, 150, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		textApelido = new JTextField();
		textApelido.setColumns(10);
		textApelido.setBounds(282, 218, 150, 20);
		contentPane.add(textApelido);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(282, 272, 150, 20);
		contentPane.add(textTelefone);
		
		textID = new JTextField();
		textID.setToolTipText("");
		textID.setColumns(10);
		textID.setBounds(282, 115, 150, 20);
		contentPane.add(textID);
		
		JButton btnAtualiza = new JButton("Atualizar");
		btnAtualiza.setBounds(84, 423, 89, 23);
		contentPane.add(btnAtualiza);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal voltar = new Principal();
				voltar.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(451, 423, 89, 23);
		contentPane.add(btnVoltar);
	}
}
