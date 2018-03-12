/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesop;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Carro {
   
private int x;
private int y;
private Chasis chasis;
private Rueda[] ruedas;
 

public Carro(){
this.ruedas = new Rueda[2];
}

public void addRuedas(int xr1, int yr1, int xr2, int yr2){
    this.ruedas[0] = new Rueda (xr1, yr1);
    this.ruedas[1] = new Rueda (xr1, yr1);
}
public void addCentroChasis(int x, int y){
this.chasis.setX(x);
this.chasis.setY(y);
}
public void addPuntoChasis(int x, int y){
    this.chasis.addPunto(x, y);

}

    public Carro(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


   


