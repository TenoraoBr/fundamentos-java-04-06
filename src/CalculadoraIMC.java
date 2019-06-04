import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class CalculadoraIMC extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;
	private JTextField txtImc;
	private JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraIMC frame = new CalculadoraIMC();
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
	public CalculadoraIMC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 463, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(43, 21, 48, 14);
		contentPane.add(lblPeso);

		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(43, 58, 48, 14);
		contentPane.add(lblAltura);

		txtPeso = new JTextField();
		txtPeso.setBounds(90, 18, 96, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setBounds(90, 55, 96, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JButton btnCalcular = new JButton("");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();
			}
		});
		btnCalcular.setIcon(new ImageIcon(CalculadoraIMC.class.getResource("/icones/imc.png")));
		btnCalcular.setBounds(219, 38, 77, 65);
		contentPane.add(btnCalcular);

		JButton btnLimpar = new JButton("");
		btnLimpar.setIcon(new ImageIcon(CalculadoraIMC.class.getResource("/icones/limpar.png")));
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(320, 38, 61, 65);
		contentPane.add(btnLimpar);

		JLabel lblImc = new JLabel("IMC");
		lblImc.setBounds(43, 103, 48, 14);
		contentPane.add(lblImc);

		lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(CalculadoraIMC.class.getResource("/icones/tabela_imc.jpg")));
		lblStatus.setBounds(10, 156, 414, 191);
		contentPane.add(lblStatus);

		txtImc = new JTextField();
		txtImc.setBounds(35, 125, 96, 20);
		contentPane.add(txtImc);
		txtImc.setColumns(10);
	}

	// Método para calcular o IMC
	private void calcular() {
		DecimalFormat formatador = new DecimalFormat("0.00");
		double peso, altura, imc;
		peso = Double.parseDouble(txtPeso.getText().replace(",", "."));
		altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
		imc = peso / (altura * altura);
		txtImc.setText(formatador.format(imc));
		if (imc < 18.5) {		
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/tabela_imc_abaixo.jpg")));	
			
		} else if (imc >= 18.5 && imc < 25) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/tabela_imc_normal.jpg")));	
			
		}else if(imc >= 25&& imc <30) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/tabela_imc_acima.jpg")));	
			
			}else{lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/tabela_imc_obeso.jpg")));	
			}
		}
				
	//Limpar os campos
	private void limpar() {
		txtPeso.setText(null);
		txtAltura.setText(null);
		txtImc.setText(null);
		lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/tabela_imc.jpg")));	
		
		
	}
}
