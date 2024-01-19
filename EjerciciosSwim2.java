package ProyectoNuevo;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EjerciciosSwim2 extends Frame implements ActionListener, WindowListener {
	
	//Para describir que es cada objeto que añadiremos
	JComboBox cboAnimales;
	String animales []=  {"Gato", "Perro", "Caballo"};
	ImageIcon imgGato, imgPerro, imgCaballo;
	JLabel lblimagen;
	
	EjerciciosSwim2(){
		setLayout(new GridLayout(2,1));
		
		
		//Para crear los objetos
		
		imgGato = new ImageIcon ("e:\\imagenes\\gato.jpg");
		imgPerro = new ImageIcon ("e:\\imagenes\\perro.jpg");
		imgCaballo = new ImageIcon ("e:\\imagenes\\caballo1.jpg");
		lblimagen = new JLabel();
		 cboAnimales = new JComboBox(animales);
		 
	        cboAnimales.addActionListener(this);
		
		//Para subir las cosas
	        
		add(cboAnimales);
		add(lblimagen);
		
		 setTitle("Ejercicio combo");

	        setSize(400, 400);

	        setVisible(true);

	        addWindowListener(this);
	       
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

	@Override
	public void actionPerformed(ActionEvent e) {
		//Para mostrar un mensaje que diga lo que has seleccionado
		
		JOptionPane.showMessageDialog(this, "Seleccionado: " + cboAnimales.getSelectedItem());
		//Para que ponga una imagen segun lo que has seleccionado
		if (cboAnimales.getSelectedItem()== "Gato") {
			lblimagen.setIcon(imgGato);
			
		}else if (cboAnimales.getSelectedItem()== "Perro") {
			lblimagen.setIcon(imgPerro);
			
		 }else if (cboAnimales.getSelectedItem()== "Caballo")
			lblimagen.setIcon(imgCaballo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new EjerciciosSwim2();
	}

}
