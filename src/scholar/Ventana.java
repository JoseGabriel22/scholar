
package scholar;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


    
   public class Ventana extends JFrame{
    private Object getContentPane;
       
      
       
       public Ventana(){
       
           JFrame f = new JFrame("---Hola Alien Del Area 51 que se Escapo---");
           f.setSize(400,300);
           f.setLocationRelativeTo(null);
           f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f.setBackground(Color.yellow);
           f.setVisible(true);
           //setLocation(500,100); //EStablecemos posicion de algo
           setBounds(500, 100, 500, 500); //Establecemos la posicion incial
           Container cp = getContentPane();
           cp.setLayout (new FlowLayout());
           JLabel etiqueta = new JLabel ("Nombre: ");
           JTextField texto = new JTextField(35);
           cp.add(etiqueta);
           cp.add(texto);
           
           JLabel etiqueta2 = new JLabel ("Apellido: ");
           JTextField texto2 = new JTextField(35);
           cp.add(etiqueta2);
           cp.add(texto2);
           
           JLabel etiqueta3 = new JLabel ("Fecha de nacimiento: ");
           JTextField texto3 = new JTextField(28);
           cp.add(etiqueta3);
           cp.add(texto3);
           
           JLabel etiqueta4 = new JLabel ("Direccion: ");
           JTextField texto4 = new JTextField(34);
           cp.add(etiqueta4);
           cp.add(texto4);
           
           JLabel etiqueta5 = new JLabel ("Genero: ");
           JTextField texto5 = new JTextField(34);
           cp.add(etiqueta5);
           cp.add(texto5);
           
           JLabel etiqueta6 = new JLabel ("Telefono: ");
           JTextField texto6 = new JTextField(29);
           cp.add(etiqueta6);
           cp.add(texto6);
           
           JLabel etiqueta7 = new JLabel ("Correo electronico: ");
           JTextField texto7 = new JTextField(29);
           cp.add(etiqueta7);
           cp.add(texto7);
           
           JButton boton = new JButton("Guardar");
           JButton boton2 = new JButton("Salir");
           cp.add(boton);
           cp.add(boton2);
          
           
          
       }

  
    }


    

   
   

   