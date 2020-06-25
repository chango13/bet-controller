<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author chango
 */
public class Sorteo implements Comparable<Sorteo>{
    private String fechaSorteo;
    private List numSorteo;

    public Sorteo() {
        numSorteo = new ArrayList();
    }

    public Sorteo(String fechaSorteo, List numSorteo) {
        this.fechaSorteo = fechaSorteo;
        this.numSorteo = numSorteo;
    }

    public String getFechaSorteo() {
        return fechaSorteo;
    }

    public void setFechaSorteo(String fechaSorteo) {
        this.fechaSorteo = fechaSorteo;
    }

    public List getNumSorteo() {
        return numSorteo;
    }

    public void setNumSorteo(List numSorteo) {
        this.numSorteo = numSorteo;
    }
    

    public void getFechaSorteo(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Sorteo o) {
        for(int p=0;p<o.getNumSorteo().size();p++){
            for(int r=0;r<o.getNumSorteo().size();r++){
            if(Integer.parseInt(String.valueOf(o.getNumSorteo().get(p)))>Integer.parseInt(String.valueOf(o.getNumSorteo().get(r)))){
            return 1;
            }else{
                if(o.getNumSorteo().get(p).equals(o.getNumSorteo().get(r))){
                return 0;
                }else{ return -1;}
            }
          }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author chango
 */
public class Sorteo implements Comparable<Sorteo>{
    private String fechaSorteo;
    private List numSorteo;

    public Sorteo() {
        numSorteo = new ArrayList();
    }

    public Sorteo(String fechaSorteo, List numSorteo) {
        this.fechaSorteo = fechaSorteo;
        this.numSorteo = numSorteo;
    }

    public String getFechaSorteo() {
        return fechaSorteo;
    }

    public void setFechaSorteo(String fechaSorteo) {
        this.fechaSorteo = fechaSorteo;
    }

    public List getNumSorteo() {
        return numSorteo;
    }

    public void setNumSorteo(List numSorteo) {
        this.numSorteo = numSorteo;
    }
    

    public void getFechaSorteo(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Sorteo o) {
        for(int p=0;p<o.getNumSorteo().size();p++){
            for(int r=0;r<o.getNumSorteo().size();r++){
            if(Integer.parseInt(String.valueOf(o.getNumSorteo().get(p)))>Integer.parseInt(String.valueOf(o.getNumSorteo().get(r)))){
            return 1;
            }else{
                if(o.getNumSorteo().get(p).equals(o.getNumSorteo().get(r))){
                return 0;
                }else{ return -1;}
            }
          }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
>>>>>>> 31c9084... upload project
