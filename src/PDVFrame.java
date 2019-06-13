package portfolio;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class PDVFrame extends JFrame {
	private JTextField txtVT;
	private JTextField txtDesc;
	private JTextField txtVP;
	private JTextField txtTroco;
	private JTextField txtTotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PDVFrame frame = new PDVFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	
	public PDVFrame() {
		setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		
		txtVT = new JTextField();
		txtVT.setBounds(87, 27, 96, 20);
		getContentPane().add(txtVT);
		txtVT.setColumns(10);
		
		JLabel lblValorTotal = new JLabel("Valor Total:");
		lblValorTotal.setBounds(10, 30, 67, 14);
		getContentPane().add(lblValorTotal);
		
		txtDesc = new JTextField();
		txtDesc.setBounds(87, 58, 96, 20);
		getContentPane().add(txtDesc);
		txtDesc.setColumns(10);
		
		JLabel lblDesconto = new JLabel("Desconto %:");
		lblDesconto.setBounds(10, 61, 67, 14);
		getContentPane().add(lblDesconto);
		
		JLabel lblTotalComDesconto = new JLabel("Total com Desconto:");
		lblTotalComDesconto.setBounds(10, 151, 130, 14);
		getContentPane().add(lblTotalComDesconto);
		
		txtVP = new JTextField();
		txtVP.setBounds(87, 89, 96, 20);
		getContentPane().add(txtVP);
		txtVP.setColumns(10);
		
		JLabel lblValorPago = new JLabel("Valor Pago:");
		lblValorPago.setBounds(10, 95, 67, 14);
		getContentPane().add(lblValorPago);
		
		txtTroco = new JTextField();
		txtTroco.setBounds(144, 176, 96, 20);
		getContentPane().add(txtTroco);
		txtTroco.setColumns(10);
		
		JLabel lblTroco = new JLabel("Troco:");
		lblTroco.setBounds(10, 179, 63, 14);
		getContentPane().add(lblTroco);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(144, 145, 96, 20);
		getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JLabel lblStatus = new JLabel("");
		lblStatus.setBounds(348, 30, 48, 14);
		getContentPane().add(lblStatus);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBounds(222, 41, 96, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calcular();		
			}
		});
		getContentPane().add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();
			}
		});
		btnLimpar.setBounds(222, 88, 96, 23);
		getContentPane().add(btnLimpar);
	}
	

	/* horario() */
	private void horario(AbstractButton lblStatus) {
		Date Data = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
			lblStatus.setText(formatador.format(Data));
	}// FIM horario()
	
	/* calcular() */
	private void calcular() {
		double VT,Desc,VP,Total,Troco;
		DecimalFormat numero = new DecimalFormat("0.00");
			VT = Double.parseDouble(txtVT.getText().replace(",", "."));
			Desc = Double.parseDouble(txtDesc.getText().replace(",", "."));
			VP = Double.parseDouble(txtVP.getText().replace(",", "."));
			
			Total = VT - (Desc / 100 * (VT));
		txtTotal.setText("R$ " + Total);
		
			Troco = VP - Total;
		txtTroco.setText("R$" + Troco);
		
	}// FIM Calcular()
	
	/* limpar() */
	private void limpar() {
		txtVT.setText(null);
		txtDesc.setText(null);
		txtVP.setText(null);
		txtTotal.setText(null);
		txtTroco.setText(null);
		
	}// FIM limpar()
}
	



