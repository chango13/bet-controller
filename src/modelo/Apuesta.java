<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author chango
 */
public class Apuesta{
    private String nombre;
    private List numeros;

    public Apuesta(){
        numeros = new ArrayList();
    }

    public Apuesta(String nombre, List numeros) {
        this.nombre = nombre;
        this.numeros = numeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getNumeros() {
        return numeros;
    }

    public void setNumeros(List numeros) {
        this.numeros = numeros;
    }

    public Apuesta coincidencias(Apuesta unaApuesta, List unaLista){
        Apuesta ap= new Apuesta();
        List num= new ArrayList();
        for(int i=0;i<unaApuesta.getNumeros().size();i++){
            for(int j=0;j<unaLista.size();j++){
                if(unaApuesta.getNumeros().get(i).equals(unaLista.get(j))){
                    ap.setNombre(unaApuesta.getNombre());
                    num.add(unaLista.get(j));
                    }
                   }
                  }
                  ap.setNumeros(num);
                  return ap;
                 }
    public void orden(List<Apuesta> unaLista){
        for(int i=0;i<unaLista.size()-1;i++){
            for(int j=i+1;j<unaLista.size();j++){
               if(unaLista.get(i).getNumeros().size()<unaLista.get(j).getNumeros().size()){
                   Apuesta aux= unaLista.get(i);
                   unaLista.set(i, unaLista.get(j));
                   unaLista.set(i+1, aux);
               }
            }
          }
    }
   
}


=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author chango
 */
public class Apuesta{
    private String nombre;
    private List numeros;

    public Apuesta(){
        numeros = new ArrayList();
    }

    public Apuesta(String nombre, List numeros) {
        this.nombre = nombre;
        this.numeros = numeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List getNumeros() {
        return numeros;
    }

    public void setNumeros(List numeros) {
        this.numeros = numeros;
    }

    public Apuesta coincidencias(Apuesta unaApuesta, List unaLista){
        Apuesta ap= new Apuesta();
        List num= new ArrayList();
        for(int i=0;i<unaApuesta.getNumeros().size();i++){
            for(int j=0;j<unaLista.size();j++){
                if(unaApuesta.getNumeros().get(i).equals(unaLista.get(j))){
                    ap.setNombre(unaApuesta.getNombre());
                    num.add(unaLista.get(j));
                    }
                   }
                  }
                  ap.setNumeros(num);
                  return ap;
                 }
    public void orden(List<Apuesta> unaLista){
        for(int i=0;i<unaLista.size()-1;i++){
            for(int j=i+1;j<unaLista.size();j++){
               if(unaLista.get(i).getNumeros().size()<unaLista.get(j).getNumeros().size()){
                   Apuesta aux= unaLista.get(i);
                   unaLista.set(i, unaLista.get(j));
                   unaLista.set(i+1, aux);
               }
            }
          }
    }
   
}


>>>>>>> 31c9084... upload project
