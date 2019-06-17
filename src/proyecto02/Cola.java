
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
    public void EncolaM(Medicamentos medicamentos){
        this.add(medicamentos);
    }
    public void DesencolarM(){
        if(!this.isEmpty())
        this.remove(0);
    }
}
