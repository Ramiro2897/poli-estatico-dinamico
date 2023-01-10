
package com.mycompany.polimorfismoestaticodinamico;


public class Rectangulo extends Figura{
    //atributos o propiedades
    private double base;
    private double altura;
    
    //constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //sobreescribimos metodo para calcular area en este caso
    @Override
    public void calcularArea() {
        area = base * altura;
    }
}
