
package Model;


public class Cachorro implements Animal {

    public Cachorro() {
    }

    @Override
    public String ambientedoanimal(String C) {
     return Animal.terrestre + C;
    }

    @Override
    public String paísdoanimal(String CC) {
       return Animal.país + CC;
    }
    
}
