
package com.mycompany.polimorfismoestaticodinamico;


public class Circulo extends Figura {
    private double radio;
    
    //constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    //sobreescribimos el metodo anterior y pasamos la formula
    @Override
    public void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }
}
