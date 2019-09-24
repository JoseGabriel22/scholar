
package scholar;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;


    
   public class Ventana extends JFrame{
       
      
       
       public Ventana(){
       
           JFrame f = new JFrame("hello work");
           this.setSize(400,300);
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           this.setVisible(true);
           Container cp = getContentPane();
           cp.setLayout(new FlowLayout());
           Jlabel etiqueta = new Jlabel("Nombre: ");
           
   
       
       }

   
   

   }