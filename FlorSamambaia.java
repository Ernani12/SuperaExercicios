

import java.util.Scanner;

public class FlorSamambaia {
    public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2) {
        // Calcula a distância entre os centros dos dois círculos
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        // Verifica se o círculo do caçador cobre o círculo da flor
        if (distancia + r2 <= r1) {
            return "RICO";
        } else {
            return "MORTO";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Recebendo os valores de entrada
        System.out.println("Digite o valor de R1:");
        int r1 = scanner.nextInt();
        
        System.out.println("Digite o valor de X1:");
        int x1 = scanner.nextInt();
        
        System.out.println("Digite o valor de Y1:");
        int y1 = scanner.nextInt();
        
        System.out.println("Digite o valor de R2:");
        int r2 = scanner.nextInt();
        
        System.out.println("Digite o valor de X2:");
        int x2 = scanner.nextInt();
        
        System.out.println("Digite o valor de Y2:");
        int y2 = scanner.nextInt();
        
        // Chamando a função tentativaDesenhar e imprimindo o resultado
        String resultado = tentativaDesenhar(r1, x1, y1, r2, x2, y2);
        System.out.println(resultado);
        
        scanner.close();
    }
}
