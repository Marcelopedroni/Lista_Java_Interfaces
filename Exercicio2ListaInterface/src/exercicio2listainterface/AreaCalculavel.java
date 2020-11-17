package exercicio2listainterface;

public interface AreaCalculavel {
    
    default double calcularArea(){
        return 0;
    }
}
