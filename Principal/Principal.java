
package Principal;

import Model.Ave;
import Model.Cachorro;

public class Principal {

    
    public static void main(String[] args) {
        String passaro = "é um ";
        String País = "Mora no ";
        String C = " Eh o cachorro";
        String CC = " Eh onde vive";
        
        Ave passaro1 = new Ave();
        
        passaro = passaro1.ambientedoanimal(passaro);
        System.out.println(passaro);
    
        País = passaro1.paísdoanimal(País);
        System.out.println(País);
        
        Cachorro cachorro1 = new Cachorro ();
        
        C = cachorro1.ambientedoanimal(C);
        System.out.println(C); 
        
        CC = cachorro1.paísdoanimal(CC);
        System.out.println(CC);
        
        
      
        
        
    }
    
    
}
