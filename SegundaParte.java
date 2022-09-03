public class Main {
    public static void main(String[] args) {
        coche miCoche = new coche();
        miCoche.IncrementarPuertas();
        System.out.println(miCoche.numPuertas);
    }
}

class coche{
    int numPuertas = 2;
    public void IncrementarPuertas(){
        this.numPuertas++;
    }
}
