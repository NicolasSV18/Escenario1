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
public class Chasis {
    private int x;
    private int y;
    private ArrayList <Punto> puntos;

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

    public ArrayList getPuntos() {
        return puntos;
    }

    public void setPuntos(ArrayList puntos) {
        this.puntos = puntos;
    }

    public Chasis(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Chasis() {
        this.puntos = new ArrayList<>();
    }
    public void addPunto(int x, int y){
    
    Punto punto = new Punto(x, y);
    this.puntos.add(punto);
    }
    
}
