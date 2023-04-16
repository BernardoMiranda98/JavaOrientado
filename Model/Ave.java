
package Model;

import javax.swing.JOptionPane;


public class Ave implements Animal {

    public Ave() {
    }
    
    
    
    
    @Override
    public String ambientedoanimal(String passaro) {
        return  passaro + Animal.terrestre;
    
    }

    @Override
    public String paísdoanimal(String País ) {
        return País + Animal.país; 
    }
    
}
