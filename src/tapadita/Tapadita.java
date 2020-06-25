<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapadita;

import java.util.ArrayList;
import java.util.List;
import modelo.Apuesta;

/**
 *
 * @author chango
 */
public class Tapadita {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int unNum= 0;
        List<Apuesta> listaApuesta = new ArrayList<Apuesta>();
        List nume = new ArrayList();
        Apuesta apu=new Apuesta();
        apu.setNombre("chango");
        for(int j=0; j<5;j++){
            nume.clear();
        for(int n=0;n<10;n++){
            nume.add(n);
            
         }
         apu.setNumeros(nume);
         listaApuesta.add(apu);
    }
    for(int i=0; i<listaApuesta.size(); i++){
    unNum=Integer.parseInt(String.valueOf(apu.getNumeros().get(i)));
    System.out.println(unNum);
    System.out.println(listaApuesta.get(i).getNombre());
    System.out.println(listaApuesta.get(i).getNumeros());
    }
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapadita;

import java.util.ArrayList;
import java.util.List;
import modelo.Apuesta;

/**
 *
 * @author chango
 */
public class Tapadita {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int unNum= 0;
        List<Apuesta> listaApuesta = new ArrayList<Apuesta>();
        List nume = new ArrayList();
        Apuesta apu=new Apuesta();
        apu.setNombre("chango");
        for(int j=0; j<5;j++){
            nume.clear();
        for(int n=0;n<10;n++){
            nume.add(n);
            
         }
         apu.setNumeros(nume);
         listaApuesta.add(apu);
    }
    for(int i=0; i<listaApuesta.size(); i++){
    unNum=Integer.parseInt(String.valueOf(apu.getNumeros().get(i)));
    System.out.println(unNum);
    System.out.println(listaApuesta.get(i).getNombre());
    System.out.println(listaApuesta.get(i).getNumeros());
    }
    }
    
}
>>>>>>> 31c9084... upload project
