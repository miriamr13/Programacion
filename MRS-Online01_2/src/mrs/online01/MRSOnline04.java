/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrs.online01;
import java.util.ArrayList;
import java.util.List;
/**
 *hola
 * @author Miriam
 */
public class MRSOnline04 {
    
    public static List<Integer> numeros (){
        //Asi se hace una lista en java
        List<Integer> a = new ArrayList<>();
        Integer aux = 1;
        while(aux<=100){
            a.add(aux);
            aux= aux+1;
        }
        
        return a;
        
    }
}
