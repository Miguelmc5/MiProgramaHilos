public class Main {

    public static void main(String[] args) throws InterruptedException {

        Diamante pagar = new Diamante();
        Cereza generar = new Cereza();
        Sandia comprobar = new Sandia();

        pagar.start();
        pagar.join();

        generar.start();
        generar.join();

        comprobar.start();
        comprobar.join();


    }
}