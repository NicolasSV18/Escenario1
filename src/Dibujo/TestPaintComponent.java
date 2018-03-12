/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dibujo;
import java.awt.Color;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author Estudiante
 */
public class TestPaintComponent extends JFrame {
    public TestPaintComponent(){
        add(new NewPanel());
    }
   public static void main(String[] args){
TestPaintComponent frame = new TestPaintComponent();
frame.setTitle("TestPaintComponent");
frame.setSize(200, 100);
frame.setLocationRelativeTo(null);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
 
}

class NewPanel extends JPanel{
@Override
protected void paintComponent(Graphics g){
super.paintComponent(g);
Polygon poligono = new Polygon();
int xRef = 50;
int yRef = 0;


poligono.addPoint(xRef, yRef + 20);
poligono.addPoint(xRef + 20, yRef + 20);
poligono.addPoint(xRef - 20, yRef + 10);
g.setColor(Color.BLUE);
g.drawPolygon(poligono);

}
}



