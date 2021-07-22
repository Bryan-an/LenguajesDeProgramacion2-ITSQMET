
package Calculadora;

/**
 * @author Created by: Geovanny Zambrano <z1705@outlook.com>
 * 
 * Date: 22 jul.. 2021
 *
 */
public class Accion {
    
    public String transEnteroIf(double numDouble){
        int numEntero = (int) numDouble;
        double res = numDouble - numEntero;
        if (res == 0) {
            return "" + numEntero;
        }else{
            return "" + numDouble;
        }
    }
    
}
