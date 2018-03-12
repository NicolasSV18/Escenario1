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

public class Escenario {
    private String nombre;
    private Carro carro;
    private ArrayList<Obstaculos> obstaculos;

    public Escenario(String nombre) {
        this.nombre = nombre;
        this.obstaculos = new ArrayList<>();
    }
public void addObstaculo(Obstaculos obs){
    this.obstaculos.add(obs);
}

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
}

