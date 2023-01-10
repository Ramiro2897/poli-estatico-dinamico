
package com.mycompany.polimorfismoestaticodinamico;


public class Triangulo extends Figura {
    //atributos
    private double base;
    private double altura;
    
    //constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //sobreescribimos metodo con la formula para calcular area en este caso
    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
    }
}
