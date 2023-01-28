import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        System.out.println("Escriba 3 numeros y a continuacion se le mostrara el resultado ");
        int varA;
        int varB;
        int varC;
        Scanner Keyboard = new Scanner(System.in);
        varA = Keyboard.nextInt();
        varB = Keyboard.nextInt();
        varC = Keyboard.nextInt();
        System.out.print("El resultado es ");
        System.out.println (varA + varB + varC);

        Coche miCoche = new Coche(4);
        System.out.println(miCoche);
    }
}
   
