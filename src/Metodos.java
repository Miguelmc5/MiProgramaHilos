import java.util.Scanner;

public class Metodos {

    int numero1=(int)(Math.random()*10);
    int numero2=(int)(Math.random()*10);
    int numero3=(int)(Math.random()*10);
    int numero4=(int)(Math.random()*10);
    int numero5=(int)(Math.random()*10);
    int numero6=(int)(Math.random()*10);
    int numero7=(int)(Math.random()*10);
    int numero8=(int)(Math.random()*10);
    int numero9=(int)(Math.random()*10);

    Scanner dinero;

    public void Pagar(){
        dinero =new Scanner(System.in);
        System.out.println("Ingrese para jugar: ");
        dinero.nextInt();

    }

    public void Generador(){


        System.out.println(numero1+" | "+numero2+" | "+numero3);
        System.out.println(numero4+" | "+numero5+" | "+numero6);
        System.out.println(numero7+" | "+numero8+" | "+numero9);

    }

    public void Comprobar(){

        if (numero1==numero2 && numero2==numero3){
            System.out.println("¡¡¡ YOU ARE THE WINNER !!!");
        }
            if(numero4==numero5 && numero5==numero6){
            System.out.println("¡¡¡ YOU ARE THE WINNER !!!");
        }
            if (numero7==numero8 && numero8==numero9){
            System.out.println("¡¡¡ YOU ARE THE WINNER !!!");
        }
            if (numero1==numero5 && numero5==numero9){
            System.out.println("¡¡¡ YOU ARE THE WINNER !!!");
        }
            if (numero7== numero5 && numero5==numero3){
            System.out.println("¡¡¡ YOU ARE THE WINNER !!!");
        } else
            System.out.println("¡¡¡ YOU ARE A LOOSER !!!");
    }



}

