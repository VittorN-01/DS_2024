import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Font;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Listar = new JButton("Listar");
		Listar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				listarAmigos lista = new listarAmigos();
				lista.setVisible(true);
				dispose();
				
				
			}
		});
		Listar.setForeground(Color.BLACK);
		Listar.setBackground(Color.WHITE);
		Listar.setBounds(246, 162, 103, 54);
		contentPane.add(Listar);
		
		JButton Cadastrar = new JButton("Cadastrar");
		Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				telaCadastro cadastro = new telaCadastro();
				cadastro.setVisible(true);
				dispose();
				
			}
		});
		Cadastrar.setForeground(Color.BLACK);
		Cadastrar.setBackground(Color.WHITE);
		Cadastrar.setBounds(73, 162, 103, 54);
		contentPane.add(Cadastrar);
		
		JLabel projetoAmigos = new JLabel("Projeto Amigos");
		projetoAmigos.setForeground(Color.WHITE);
		projetoAmigos.setHorizontalAlignment(SwingConstants.CENTER);
		projetoAmigos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		projetoAmigos.setBounds(132, 44, 170, 72);
		contentPane.add(projetoAmigos);
	}
}
