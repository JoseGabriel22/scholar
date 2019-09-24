
package scholar;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


    
   public class Ventana extends JFrame{
    private Object getContentPane;
       
      
       
       public Ventana(){
       
           JFrame f = new JFrame("---Hola Alien Del Area 51 que se Escapo---");
           f.setSize(400,300);
           f.setLocationRelativeTo(null);
           f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           f.setVisible(true);
           Container cp = getContentPane();
           GridLayout gl = new GridLayout(4,3);
           gl.setHgap(5); gl.setVgap(5);
           cp.setLayout(new FlowLayout());
           Jlabel etiqueta = new Jlabel("Nombre: ");
           JTexField texto = new JTexField(20);
           JButton boton = new JButton("Saludar");
           cp.add( etiqueta );
           cp.add( texto );
           cp.add(boton);
   
       
       }


    }

   
   

   