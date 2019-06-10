
package proyecto02;

import java.util.ArrayList;

/**
 *
 * @author Newshore
 */
public class Cola<E> extends ArrayList {

    public void Encolar(Cliente cliente){
        this.add(cliente);
    }
    public void Desencolar(){
        if(!this.isEmpty())
        this.remove(0);
    }
    
}
