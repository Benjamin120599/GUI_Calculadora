import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

class Calculadora extends JFrame implements ActionListener {
	
	JButton boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, botonIgual, botonMasMenos,
	botonS, botonR, botonM, botonD, botonP, botonRC, botonPC, botonPunto, botonCE, botonC, botonBorrar, botonFracc;
	JTextField pantalla1, pantalla2;
	Font font1 = new Font("Calibri (titulo)", Font.PLAIN, 16);
	Font font2 = new Font("Calibri", Font.BOLD, 24);
	Font font3 = new Font("Arial", Font.PLAIN, 14);
	Font font4 = new Font("Calibri", Font.BOLD, 50);
	int numero; 
	double n1, n2, res;
	
	public Calculadora() {
		
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(241, 232, 230));
		setSize(344, 527);
		setLocationRelativeTo(null);
		setTitle("CALCULADORA.");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		// Componentes 
		JLabel label1 = new JLabel("Estándar.");
			label1.setBounds(25, 10, 150, 50);
			label1.setFont(font2);
		add(label1);
		
		pantalla1 = new JTextField();
			pantalla1.setFont(font4);
			pantalla1.setBackground(new Color(241, 232, 230));
			pantalla1.setBorder(null);
			pantalla1.setHorizontalAlignment(JTextField.RIGHT);
			pantalla1.setBounds(0, 100, 335, 70);
			pantalla1.setText("0");
			pantalla1.addActionListener(this);
		add(pantalla1);
		
		pantalla2 = new JTextField();
			pantalla2.setFont(font3);
			pantalla2.setBackground(new Color(241, 232, 230));
			pantalla2.setBorder(null);
			pantalla2.setHorizontalAlignment(JTextField.RIGHT);
			pantalla2.setBounds(0, 60, 335, 40);
			pantalla2.setEnabled(false);
			pantalla2.addActionListener(this);
		add(pantalla2);
		
		botonP = new JButton("%");
		botones(botonP, 0, 190, 83, 50);
		
		botonRC = new JButton("\u221A");
		botones(botonRC, 84, 190, 83, 50);
		
		botonPC = new JButton("x\u00B2");
		botones(botonPC, 168, 190, 83, 50);
		
		botonFracc = new JButton("1/x");
		botones(botonFracc, 252, 190, 83, 50);
		
		
		botonCE = new JButton("CE");
		botones(botonCE, 0, 241, 83, 50);
		
		botonC = new JButton("C");
		botones(botonC, 84, 241, 83, 50);
		
		botonBorrar = new JButton("\u2421");
		botones(botonBorrar, 168, 241, 83, 50);
		
		botonD = new JButton("\u00F7");
		botones(botonD, 252, 241, 83, 50);
		botonD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(pantalla1.getText());
				res = n1/n1;
				pantalla2.setText(res+"");
				pantalla1.setText("\u00F7");
				numero = 4;				
			}
		});
		
		boton7 = new JButton("7");
		numeros(boton7, 0, 292, 83, 50);
		
		boton8 = new JButton("8");
		numeros(boton8, 84, 292, 83, 50);
		
		boton9 = new JButton("9");
		numeros(boton9, 168, 292, 83, 50);
		
		botonM = new JButton("x");
		botones(botonM, 252, 292, 83, 50);
		botonM.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(pantalla1.getText());
				res = res*n1;
				pantalla2.setText(res+"");
				pantalla1.setText("x");
				numero = 3;				
			}
		});
		
		
		boton4 = new JButton("4");
		numeros(boton4, 0, 343, 83, 50);
		
		boton5 = new JButton("5");
		numeros(boton5, 84, 343, 83, 50);
		
		boton6 = new JButton("6");
		numeros(boton6, 168, 343, 83, 50);
		
		botonR = new JButton("-");
		botones(botonR, 252, 343, 83, 50);
		botonR.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(pantalla1.getText());
				res = res-n1;
				pantalla1.setText("-");
				pantalla2.setText(res+"");
				numero = 2;				
			}
		});
		
		
		boton1 = new JButton("1");
		numeros(boton1, 0, 394, 83, 50);
		
		boton2 = new JButton("2");
		numeros(boton2, 84, 394, 83, 50);
		
		boton3 = new JButton("3");
		numeros(boton3, 168, 394, 83, 50);
		
		botonS = new JButton("+");
		botones(botonS, 252, 394, 83, 50);
		botonS.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				n1 = Double.parseDouble(pantalla1.getText());
				res = res+n1;
				pantalla1.setText("+");
				pantalla2.setText(res+"");
				numero = 1;
			}
		});
		
		
		botonMasMenos = new JButton("\u00B1");
		botones(botonMasMenos, 0, 445, 83, 50);
		
		boton0 = new JButton("0");
		numeros(boton0, 84, 445, 83, 50);
		
		botonPunto = new JButton(".");
		botones(botonPunto, 168, 445, 83, 50);
		
		botonIgual = new JButton("=");
		botones(botonIgual, 252, 445, 83, 50);
		botonIgual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				n2 = Double.parseDouble(pantalla1.getText());
				if(numero == 1) {
					res = res+n2;
				} else if(numero == 2) {
					res = res-n2;
				} else if(numero == 3) {
					res = res*n2;
					n2 = 0;
				} else if(numero == 4) {
					res = res/n2;
					n1 = 0;
					n2 = 0;
				}
				
				pantalla1.setText(res+"");
				pantalla2.setText("");
			}
		});
	
	}
	
	public void botones(JButton boton, int x, int y, int w, int h) {
		boton.setBackground(new Color(253, 243, 241));
		boton.setBorder(null);
		boton.setBounds(x, y, w, h);
		boton.setFont(font1);
		boton.addActionListener(this);
		add(boton);
	}
	
	public void numeros(JButton boton, int x, int y, int w, int h) {
		boton.setBackground(new Color(254, 254, 254));
		boton.setBorder(null);
		boton.setBounds(x, y, w, h);
		boton.setFont(font2);
		boton.addActionListener(this);
		add(boton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cad = "";
		//pantalla1.setText("");
		cad = cad + pantalla1.getText();
		
		if(e.getSource().equals(boton0)) {
			if(pantalla1.getText().equals("0") ) {
				pantalla1.setText("0");
			} else {
				pantalla1.setText(cad+"0");
			}
			
		} else if(e.getSource().equals(boton1)) {
			if(pantalla1.getText().equals("0")) {
				pantalla1.setText("1");
			} else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
				cad = "";
				pantalla1.setText(cad+"1");
			} else {
				pantalla1.setText(cad+"1");
			}
		} else if(e.getSource().equals(boton2)) {
			if(pantalla1.getText().equals("0")) {
				pantalla1.setText("2");
			} else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
				cad = "";
				pantalla1.setText(cad+"2");
			} else {
				pantalla1.setText(cad+"2");
			}
		} else if(e.getSource().equals(boton3)) {
			if(pantalla1.getText().equals("0")) {
				pantalla1.setText("3");
			} else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
				cad = "";
				pantalla1.setText(cad+"3");
			} else {
				pantalla1.setText(cad+"3");
			}
		} else if(e.getSource().equals(boton4)) {
			if(pantalla1.getText().equals("0")) {
				pantalla1.setText("4");
			} else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
				cad = "";
				pantalla1.setText(cad+"4");
			} else {
				pantalla1.setText(cad+"4");
			}
		} else if(e.getSource().equals(boton5)) {
			if(pantalla1.getText().equals("0")) {
				pantalla1.setText("5");
			} else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
				cad = "";
				pantalla1.setText(cad+"5");
			} else {
				pantalla1.setText(cad+"5");
			}
		} else if(e.getSource().equals(boton6)) {
			if(pantalla1.getText().equals("0")) {
				pantalla1.setText("6");
			} else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
				cad = "";
				pantalla1.setText(cad+"6");
			} else {
				pantalla1.setText(cad+"6");
			}
		} else if(e.getSource().equals(boton7)) {
			if(pantalla1.getText().equals("0")) {
				pantalla1.setText("7");
			} else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
				cad = "";
				pantalla1.setText(cad+"7");
			} else {
				pantalla1.setText(cad+"7");
			}
		} else if(e.getSource().equals(boton8)) {
			if(pantalla1.getText().equals("0")) {
				pantalla1.setText("8");
			} else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
				cad = "";
				pantalla1.setText(cad+"8");
			} else {
				pantalla1.setText(cad+"8");
			}
		} else if(e.getSource().equals(boton9)) {
			if(pantalla1.getText().equals("0")) {
				pantalla1.setText("9");
			} else if(pantalla1.getText().equals("+") || pantalla1.getText().equals("-") || pantalla1.getText().equals("x") || pantalla1.getText().equals("\u00F7")) {
				cad = "";
				pantalla1.setText(cad+"9");
			} else {
				pantalla1.setText(cad+"9");
			}
		} else if(e.getSource().equals(botonC)) {
			pantalla1.setText("0");
			pantalla2.setText("");
			res = 0.0;
		} else if(e.getSource().equals(botonCE)) {
			pantalla1.setText("0");
			pantalla2.setText("");
			res = 0.0;
		} else if(e.getSource().equals(botonPunto)) {
			int cont=0;
			for(int i=0; i < pantalla1.getText().length(); i++) {
				if(pantalla1.getText().substring(i, i+1).equals(".")) {
					cont++;
				}
			}
			
			if(cont==0) {
				pantalla1.setText(cad+".");
			}	
		}	
	}
}


public class EventoCalculadora {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Calculadora();				
			}
		});
		
	}

}
