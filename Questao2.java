import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Digitar número");
        int n = myObj.nextInt();
        int[] array = {1, 5, 3, 4, 2};
        int size = array.length;

        int conta = 0;
        int contador = 0;

        for (int i = 0; i < size; i++) {
            conta = n - array[i];
            if (conta < 0) {
                conta = conta * -1;
            }
            if (conta % 2 == 0) {
                contador = contador + 1;
            }
        }

        System.out.println(contador);
    }
}

            
