/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author karat
 */
public class Square {
     private int pleyra;

    public int getPleyra() {
        return pleyra;
    }

    public void setPleyra(int pleyra) {
        this.pleyra = pleyra;
    }

    @Override
    public String toString() {
        return "Square{" + "pleyra=" + pleyra + '}';
    }
     
    public int getArea(){
        return pleyra * pleyra;
    } 
}
