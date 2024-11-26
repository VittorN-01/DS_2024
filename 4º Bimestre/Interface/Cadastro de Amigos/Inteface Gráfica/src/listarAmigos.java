

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class listarAmigos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					listarAmigos frame = new listarAmigos();
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
	public listarAmigos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel CadastroAmigos = new JLabel("Listar Amigos");
		CadastroAmigos.setHorizontalAlignment(SwingConstants.CENTER);
		CadastroAmigos.setForeground(Color.WHITE);
		CadastroAmigos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		CadastroAmigos.setBounds(101, 11, 231, 30);
		contentPane.add(CadastroAmigos);
		
		JButton btnAtualiza = new JButton("Atualizar");
		btnAtualiza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				atualizarCadastro atualizar = new atualizarCadastro();
				atualizar.setVisible(true);
				dispose();
			}
		});
		btnAtualiza.setBounds(31, 214, 89, 23);
		contentPane.add(btnAtualiza);
		
		JButton btnDelete = new JButton("Deletar");
		btnDelete.setForeground(Color.RED);
		btnDelete.setBounds(311, 214, 89, 23);
		contentPane.add(btnDelete);
		
		JButton btnVoltar = new JButton("<");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Principal voltar = new Principal();
				voltar.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(0, 0, 51, 41);
		contentPane.add(btnVoltar);
	}
}
