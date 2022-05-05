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
public class orthogonioparalilogramo {
     private int bash;
     private int height;

    public int getBash() {
        return bash;
    }

    public void setBash(int bash) {
        this.bash = bash;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
     
     public int embadon(){
         int value = bash * height;
         return value;
     }
    
}
