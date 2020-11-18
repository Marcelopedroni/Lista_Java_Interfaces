package exercicio4listainterface;

public interface AreaCalculavel {
    
    default double calcularArea(){
        return 0;
    }
}
