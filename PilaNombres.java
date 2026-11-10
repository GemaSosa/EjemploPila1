package EjemploPila1;

public class PilaNombres {
    final int MAX=10;
    String[] pila;
    int tope;
    public PilaNombres(){
        pila = new String[MAX];
        tope=-1;
    }
    
    private boolean pilaVacia(){
        return (tope==-1);
    }
    
    private boolean pilaLlena(){
        return ( tope== (MAX-1));
    }
    
    public String pone(String dato){
        if(pilaLlena())
            return "Pila llena";
        else{
            tope++;
            pila[tope]=dato;
            return "Elemento insertado en la pila"; 
        }                       
    }   
    
    public String quita(){
        String dato;
        if(pilaVacia()){
            return "Subdesbordamiento - Pila Vacia";
        }
        else{
            dato = pila[tope];
            tope--;
            return dato;
        }
    }
    public String mostrar() {
        if (pilaVacia()) {
            return "La pila está vacía";
        } else {
            String resultado = "Elementos de la pila:\n";

            for (int i = tope; i >= 0; i--) {
                resultado += pila[i] + "\n";
            }

            return resultado;
        }
    }
}

