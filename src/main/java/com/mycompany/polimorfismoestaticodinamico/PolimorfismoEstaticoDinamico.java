
package com.mycompany.polimorfismoestaticodinamico;

import java.util.ArrayList;
import java.util.List;


public class PolimorfismoEstaticoDinamico {

    public static void main(String[] args) {
        // Ejemplo de polimorfismo estático
        Figura figura1 = new Circulo(5);
        Figura figura2 = new Triangulo(10, 5);
        Figura figura3 = new Rectangulo(20, 15);
        
        //recibimos los datos en un arreglo
        List<Figura> figuras = new ArrayList<>();
        // añadimos en cada caso...
        figuras.add(figura1);
        figuras.add(figura2);
        figuras.add(figura3);
        //recorremos con un foreach
        for (Figura f : figuras) {
            f.calcularArea();
            //el metodo esta sobreescrito en cada caso en donde se requiera calcular el area
            System.out.println("Area de la figura: " + f.getArea());
        }
        
         // Ejemplo de polimorfismo dinámico
        Object objeto1 = new String("Hola mundo");
        Object objeto2 = new Circulo(3);
        Object objeto3 = new Triangulo(7, 4);
        List<Object> objetos = new ArrayList<>();
        objetos.add(objeto1);
        objetos.add(objeto2);
        objetos.add(objeto3);
        //recorremos y aplicamos un condicional donde nos dice el tipo de objeto dado el caso o calcula el area
        for (Object o : objetos) {
            if (o instanceof Figura) {
                ((Figura) o).calcularArea();
                System.out.println("Area de la figura: " + ((Figura) o).getArea());
            } else {
                System.out.println("El objeto es un: " + o.getClass().getSimpleName());
            }
        }
        
    }
}
