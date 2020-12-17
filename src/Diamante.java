public class Diamante extends Thread{

    Metodos diamante = new Metodos();

    public Diamante ( Metodos diamante){
        this.diamante=diamante;
    }

    public Diamante() {
        
    }

    public void run() {
        diamante.Pagar();
    }
}