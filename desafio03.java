import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class desafio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura de entrada
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Chamada do método e impressão do resultado
        int result = valorPares(arr, k);
        System.out.println(result);

        scanner.close();
    }

    public static int valorPares(int[] arr, int k) {
        int valorPares = 0;
        Map<Integer, Integer> numValor = new HashMap<>();

        for (int num : arr) {
            if (numValor.containsKey(num - k)) {
                valorPares += numValor.get(num - k);
            }
            if (numValor.containsKey(num + k)) {
                valorPares += numValor.get(num + k);
            }

            numValor.put(num, numValor.getOrDefault(num, 0) + 1);
        }

        return valorPares;
    }
}