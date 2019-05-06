import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWorld extends JFrame implements ActionListener{
	private JLabel mensaje;
	private JButton boton;
	private JTextField caja,caja2,caja3;
	
	public HelloWorld() {
		super();
		configurarVentana();
		crearComponentes();
	}
	
	private void configurarVentana(){
		this.setTitle("Calculadora");
		this.setSize(350,300);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void crearComponentes() {
		mensaje = new JLabel();
		mensaje.setText("1er. dato...");
		mensaje.setBounds(105, 10, 100, 30);
		this.add(mensaje);
		caja = new JTextField();
		caja.setBounds(105, 35, 100, 30);
		this.add(caja);
		mensaje = new JLabel();
		mensaje.setText("2do. dato...");
		mensaje.setBounds(105, 57, 100, 30);
		this.add(mensaje);
		caja2 = new JTextField();
		caja2.setBounds(105, 80, 100, 30);
		this.add(caja2);
		mensaje = new JLabel();
		mensaje.setText("Ingrese el num. de la operacion deseada");
		mensaje.setBounds(46, 105, 250, 30);
		this.add(mensaje);
		mensaje.setForeground(Color.BLUE);
		mensaje = new JLabel();
		mensaje.setText("1-Suma  2-Resta  3-Multiplicacion 4-Division");
		mensaje.setBounds(35, 120, 500, 30);
		this.add(mensaje);
		mensaje.setForeground(Color.BLUE);
		caja3 = new JTextField();
		caja3.setBounds(105, 150, 100, 30);
		this.add(caja3);
		boton = new JButton();
		boton.setText("Clickeame");
		boton.setBounds(105, 185, 100, 30);
		boton.addActionListener(this);
		this.add(boton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String dato = caja.getText();
		String dato2 = caja2.getText();
		String operacion = caja3.getText();
		JOptionPane.showMessageDialog(this, "El resultado es "+operaciones(dato,dato2,operacion));
	}
	
	public String operaciones(String dato, String dato2, String operacion) {
		String cadena = "...error";
		double num1 = Double.parseDouble(dato);
		double num2 = Double.parseDouble(dato2);
		switch(operacion) {
		case "1":
			cadena = String.valueOf(num1+num2);
		break;
		case "2":
			cadena = String.valueOf(num1-num2);
		break;
		case "3":
			cadena = String.valueOf(num1*num2);
		break;
		case "4":
			if(num2!=0) {
				cadena = String.valueOf(num1/num2);
			}
		break;
		default:
		}
		return cadena;
	}
	
	public static void main(String[] args) {
		HelloWorld ventana = new HelloWorld();
		ventana.setVisible(true);	
	}
}