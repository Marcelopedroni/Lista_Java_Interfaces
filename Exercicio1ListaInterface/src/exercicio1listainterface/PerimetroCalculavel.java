package exercicio1listainterface;

public interface PerimetroCalculavel {
    
   
    default double calcularPerimetro(){
        return 0;
    } 
}
