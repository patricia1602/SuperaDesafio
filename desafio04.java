import java.util.Scanner;

public class desafio04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número de casos de teste
        int N = Integer.parseInt(scanner.nextLine());

        // Processamento de cada caso de teste
        for (int i = 0; i < N; i++) {
            String linha_impressa = scanner.nextLine();
            String linha_decifrada = desembaralharLinha(linha_impressa);
            System.out.println(linha_decifrada);
        }

        scanner.close();
    }

    private static String desembaralharLinha(String linha) {
        int comprimento = linha.length() / 2;
        String metade_esquerda = linha.substring(0, comprimento);
        String metade_direita = linha.substring(comprimento);

        StringBuilder metade_esquerda_decifrada = new StringBuilder(metade_esquerda).reverse();
        StringBuilder metade_direita_decifrada = new StringBuilder(metade_direita).reverse();

        return metade_esquerda_decifrada.toString() + metade_direita_decifrada.toString();
    }
}

