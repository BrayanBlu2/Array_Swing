package ProyectoNuevo;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EjerciciosSwim1 extends Frame implements ActionListener, WindowListener {
	
  //Para describir que es cada objeto que añadiremos( si es botón, etiqueta etc).
    JButton btnVerificar;
    JLabel lblContrasena, lblNombre, lblResultado;
    JTextField txtNom;
    JPasswordField pswContra;
    
    EjerciciosSwim1() {

    	//Para crear los objetos
        btnVerificar = new JButton("Verificar");
        lblContrasena = new JLabel("Contraseña");
        lblNombre = new JLabel("Nombre");
        pswContra = new JPasswordField("...");
        txtNom = new JTextField("...");
        lblResultado = new JLabel ("Resultado");
        
        
        //Para añadir todos los objetos
        add(lblNombre);
        add(txtNom);
        add(lblContrasena);
        add(pswContra);
        add(btnVerificar);
        add(lblResultado);
        
        
        setLayout(new FlowLayout());

        btnVerificar.addActionListener(this);

        setTitle("Verificar contraseña");

        setSize(400, 400);

        setVisible(true);

        addWindowListener(this);
    }

  

	@Override
    public void actionPerformed(ActionEvent e) {

       //Para guardar en una variable los datos que ocuparemos y ponerlos como String
		String valor = new String (pswContra.getPassword());
		String valor1 = txtNom.getText();
		
		//Para verificar si la contraseña y el nombre cumplen con las condiciones
        if(valor.equalsIgnoreCase("admin1234") && valor1.equals("admin") ) {
		lblResultado.setText("Ok");
        }else
        	lblResultado.setText("El nombre o/y la contraseña es incorrecta");
    }

    public static void main(String[] args) {
        new EjerciciosSwim1();
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // Código para manejar el cierre de la ventana
        dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
