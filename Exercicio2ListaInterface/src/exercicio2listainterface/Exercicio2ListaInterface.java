package exercicio2listainterface;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2ListaInterface {

    public static void main(String[] args) {
    
    
    Quadrado q1 = new Quadrado(3);
    Circulo c1 = new Circulo(4);
    Triangulo t1 = new Triangulo(2.4);
    Retangulo r1 = new Retangulo(5, 1);
        
    /*
    Caso queira implementar mais funcionalidades, como listar os cômodos, 
    calcular a área total em um método, podemos criar um ArratList com todos os cômodos.
    
    List<AreaCalculavel> comodos = new ArrayList<AreaCalculavel>();
    comodos.add(q1);
    comodos.add(c1);
    comodos.add(t1);
    comodos.add(r1);
    */
    
    System.out.println("Área total da casa: " + (c1.calcularArea()+r1.calcularArea()+
            t1.calcularArea()+q1.calcularArea()));
    }
    
}
