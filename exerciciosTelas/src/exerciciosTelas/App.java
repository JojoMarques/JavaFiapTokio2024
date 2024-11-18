package exerciciosTelas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class App {

	private JFrame frame; // instância da propria janela
	private JTextField txtInsiraSeuNome;
	private JButton btnLimpar;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnSair;
	private JPasswordField passwordField;
	/*
	 * frame (janela) - paineis (ficam dentro do frame) - outros componentes (dentro
	 * dos paineis)
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 153, 102));
		frame.setBounds(100, 100, 450, 300); // tamanho
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(21, 11, 80, 14);
		frame.getContentPane().add(lblNome);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(21, 63, 92, 14);
		frame.getContentPane().add(lblSenha);

		txtInsiraSeuNome = new JTextField();
		txtInsiraSeuNome.setBounds(21, 32, 392, 20);
		frame.getContentPane().add(txtInsiraSeuNome);
		txtInsiraSeuNome.setColumns(10);

		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setForeground(new Color(0, 153, 102));
		btnEnviar.setBackground(new Color(240, 240, 240));
		btnEnviar.setBounds(52, 132, 89, 23);
		frame.getContentPane().add(btnEnviar);

		btnLimpar = new JButton("Limpar");
		btnLimpar.setForeground(new Color(51, 153, 102));
		btnEnviar.setBackground(new Color(240, 240, 240));
		btnLimpar.setBounds(175, 132, 89, 23);
		frame.getContentPane().add(btnLimpar);

		btnSair = new JButton("Sair");
		btnSair.setBounds(293, 132, 89, 23);
		btnSair.setForeground(new Color(0, 153, 102));
		btnSair.setBackground(new Color(240, 240, 240));
		frame.getContentPane().add(btnSair);

		passwordField = new JPasswordField();
		passwordField.setBounds(21, 88, 392, 20);
		frame.getContentPane().add(passwordField);

		// botão enviar
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nome = txtInsiraSeuNome.getText();
				String senha = passwordField.getText();

				JOptionPane.showMessageDialog(null, "nome: " + nome + "\nsenha: " + senha);
			}
		});

		// botão limpar
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtInsiraSeuNome.setText("");
				passwordField.setText("");
			}
		});

		// botão sair
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
