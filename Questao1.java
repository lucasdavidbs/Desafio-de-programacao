public class Questao1 {
    public static void main(String[] args) {

        int[] array = {9, 2, 1, 4, 6};
        int size = array.length;
        int contador = 0;
        int j = 0;
        int val = 0;

        int medi = size / 2;
        while (size != 0) {

            val = array[contador];
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    j = i - 1;
                }
                if (array[contador] != array[i]) {
                    if (array[contador] > array[i]) {
                        array[j] = array[i];
                        array[i] = val;
                        contador = contador + 1;
                    }
                }
            }
            contador = 0;
            size = size - 1;
        }

        System.out.println(array[medi]);
    }

}

