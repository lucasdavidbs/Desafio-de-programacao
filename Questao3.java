import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Digitar texto");
        String s = myObj.nextLine();
        String val = s;
        String noespc = val.replaceAll("\\s+", "");
        int tamanho = noespc.length();

        double raiz = Math.sqrt(tamanho);
        raiz = Math.round(raiz);
        int val3 = (int) raiz;
        String raizs = Integer.toString(val3);

        String resultado = "";
        String text = "";
        text = "(?<=\\\\G.{" + raizs + "})\"";

        String[] strings = noespc.split("(?<=\\G.{" + raizs + "})");

        if ((raiz * raiz) > tamanho) {
            int cont = 0;
            while (raiz > 0) {
                for (int i = 0; i < strings.length; i++) {
                    if (strings[i].length() >= cont + 1) {
                        resultado = resultado + strings[i].substring(cont, cont + 1);
                    }
                }
                resultado = resultado + " ";
                raiz = raiz - 1;
                cont = cont + 1;
            }
        }
        System.out.println(resultado);
    }


}

