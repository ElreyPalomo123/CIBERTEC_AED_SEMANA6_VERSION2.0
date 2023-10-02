package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import semana_05.ArregloSueldos;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_5_2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JButton btnListar;
	private JButton btnReportar;
	private JButton btnGenerar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_5_2 frame = new Problema_5_2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_5_2() {
		setTitle("Problema_5_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(71, 11, 89, 23);
		contentPane.add(btnListar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(171, 11, 89, 23);
		contentPane.add(btnReportar);
		
		btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(this);
		btnGenerar.setBounds(271, 11, 89, 23);
		contentPane.add(btnGenerar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 44, 414, 406);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	
	ArregloSueldos as = new ArregloSueldos();
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGenerar) {
			actionPerformedBtnGenerar(arg0);
		}
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		txtS.setText("");
		for (int i = 0; i < as.tamanio(); i++) {
			imprimir("n{" + i + "] : " + as.Obtener(i));
		}
	}
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		imprimir();
		imprimir("Cantidad de sueldos :" + as.tamanio());
		imprimir("Sueldo Promedio :" + as.sueldoPromedio());
		imprimir("Sueldo Mayor :" + as.sueldoMayor());
		imprimir("Sueldo Menor :" + as.sueldoMenor());
		imprimir("Cantidad de sueldos mayores al promedio :" + as.cantMayoresSueldoPromedio());
		imprimir("Cantidad de sueldos menores al promedio :" + as.cantMenoresSueldoPromedio());
		imprimir("Posicion del segundo sueldo mayor a 850 :" + as.posSegundoSueldoMayorAlMinimo());
		imprimir("Posicion del ultimo suelddo menor a 850 :" + as.posUltimoSueldoMenorAlMinimo());
	}
	protected void actionPerformedBtnGenerar(ActionEvent arg0) {
		as.generarSueldos();
		imprimir();
		imprimir("Los sueldos han sido actualizados: Pulsa [Listar]");
	}
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	
}