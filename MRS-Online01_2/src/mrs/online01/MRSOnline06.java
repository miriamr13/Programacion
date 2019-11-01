/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrs.online01;

import java.util.*;

/**
 *
 * @author Miriam
 */
public class MRSOnline06 {
    public static List<Integer> numeros (Integer x){
        List<Integer> a= new ArrayList<Integer>();
     for(int y=0;y<10;y++){
        if (x%2==0){
            
             x= x +2;
             a.add(x);
            
          
        }
        else{
            x=x+1;
            a.add(x);
        }
        }
        return a;
    }
}
        