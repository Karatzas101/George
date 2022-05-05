/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karat
 */
public class trigwno {
   
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

    @Override
    public String toString() {
        return "trigwno{" + "bash=" + bash + ", height=" + height + '}';
    }
    
    public int E(){
        int total = bash * height / 2;
        return total;
    }
}
