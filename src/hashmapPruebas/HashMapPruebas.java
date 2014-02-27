/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapPruebas;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author A7
 */
public class HashMapPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> lista = new HashMap<String, Integer>();
        lista.put("1", 100);
        lista.put("2", 200);
        lista.put("3", 300);
        lista.put("4", 400);
        
        Integer num = lista.get("3");
        
        HashMap<String, String> pantallaMovil = new HashMap<String, String>();
        for (Iterator<Integer> it = lista.values().iterator(); it.hasNext();) {
            Integer numInt = it.next();
            System.out.println("Número" + numInt);
        }
        for (Iterator<String> it = lista.keySet().iterator(); it.hasNext();) {
            String cadenaClave = it.next();
            System.out.println("Clave" + cadenaClave);
        }
        
    }
}
