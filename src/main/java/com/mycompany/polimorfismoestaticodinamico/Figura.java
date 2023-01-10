
package com.mycompany.polimorfismoestaticodinamico;

//Creamos la clase figura
   abstract class Figura {
    //propiedades
    protected double area;
    
    public abstract void calcularArea();
    
    //metodo para obtener area
    public double getArea() {
        return area;
    }
}
