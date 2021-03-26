
package com.mycompany.project1;

/**
 *
 * @author totaro
 */



import java.util.ArrayList; 
import java.util.List; 
import java.util.Random; 
import java.util.*; 

public class Lottery {

    public static void main(String[] args) {
        
     // Scanner Class 
        Scanner sc = new Scanner(System.in);
        System.out.println("Syötä 7 numeroa (väliltä 1-40):");
        
                 
    ArrayList<Integer> omatnumerot = new ArrayList<Integer>();
    
    
    int t = 0;
while (t < 7) {
   int numero = sc.nextInt();
    omatnumerot.add(numero);
    
    t++;
}

for (int i = 0; i < omatnumerot.size(); i++) {
      System.out.println("Omat numerot: " + omatnumerot.get(i));
    }
    
         
    System.out.println("--------------");
        
    ArrayList<Integer> lottonumerot = new ArrayList<Integer>();
    
     for (int i = 1; i < 41; i++) {
      lottonumerot.add(i);
    }
    
    Collections.shuffle(lottonumerot); 
  
             
     for (int i = 1; i < 8; i++) {
      System.out.println("Lottonumero " + i + " " + lottonumerot.get(i));
    }
     
     
   
     System.out.println("Haettu lottonumero: "+lottonumerot.get(2));
            
     boolean ans = omatnumerot.contains(lottonumerot.get(2)); 
  
        if (ans) 
            System.out.println("Omassa löytyy" + lottonumerot.get(2)); 
        else
            System.out.println("Ei löydy");
     
    
  }
}

