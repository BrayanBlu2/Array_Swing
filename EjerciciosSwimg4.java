package ProyectoNuevo;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class EjerciciosSwimg4 extends Frame implements ActionListener, WindowListener {
	//Para describir que es cada objeto que añadiremos( si es botón, etiqueta etc).
	JButton btnMostrar;
	JLabel lblEtiqueta1, lblEtiqueta2, lblEtiqueta3, lblFrace;	
	
	
	EjerciciosSwimg4 (){
		setLayout(new GridLayout(1,2));
		
		//Para crear los objetos
		btnMostrar = new JButton("Mostrar");
		lblEtiqueta1 = new JLabel();
		lblEtiqueta2 = new JLabel();
		lblEtiqueta3 = new JLabel();
		lblFrace = new JLabel();
		
		
		  //Para añadir todos los objetos
		add(btnMostrar);
		add(lblEtiqueta1);
		add(lblEtiqueta2);
		add(lblEtiqueta3);
		add(lblFrace);
		
		 addWindowListener(this);
		 
			btnMostrar.addActionListener(this);
			
			 setTitle("Ejercicio combo");

		        setSize(300, 300);

		        setVisible(true);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	//Para que muestre un número aleatorio en cada una de las etiquetas cada vez que precione el botón
		if (e.getSource()== btnMostrar) {
			int valor1= (int)Math.floor(Math.random()* 10 );
			int valor2= (int)Math.floor(Math.random()* 10 );
			int valor3= (int)Math.floor(Math.random()* 10 );
			lblEtiqueta1.setText("Número: "+ valor1);
			lblEtiqueta2.setText("Número: "+ valor2);
			lblEtiqueta3.setText("Número: "+ valor3);
			
	//Para comparar los números que han salido y decir en pantalla si todos son iguales, deferentes o dos son igual
			if (valor1 == valor2 && valor2 == valor3) { 
				lblFrace.setText("Los tres son iguales");
			}else if (valor1 == valor2|| valor1 == valor3 || valor2 == valor3 ) { 
				lblFrace.setText("Al menos dos son iguales");
			}else 
				lblFrace.setText("Los tren valores son distintos");			
		}						
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new EjerciciosSwimg4();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// Código para manejar el cierre de la ventana
		dispose();
        System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
