import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author 44774
 */
public class Modelview extends JFrame{
    
   Modelview() {
   
   
this.setLayout(new FlowLayout()); // flowlayout is used to horizontally arrange buttons in a panel 
this.setSize(320,400); // setting size of the frame: x and y size dimensions
this.add(new JLabel("Outliner")); // text "Outliner" next to button - on the left of button
this.add(new JButton("Add Section")); // name of button - what the button is called "Add Section"
this.setVisible(true); //makes frame visible to be seen and pop up 
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // can be closed with the "cloe" button
   

   }    
}

