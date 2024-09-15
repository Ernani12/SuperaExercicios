import java.util.ArrayList;
import java.util.List;

public class Snail {

    public static List<Integer> caracol(int[][] matriz) {
        List<Integer> resultado = new ArrayList<>();

        // Verifica se a matriz é vazia ou nula
        if (matriz == null || matriz.length == 0) {
            return resultado;
        }

        int n = matriz.length;
        int cima = 0, baixo = n - 1, esquerda = 0, direita = n - 1;

        // Percorrer a matriz em espiral
        while (cima <= baixo && esquerda <= direita) {
            // Percorrer da esquerda para a direita na linha superior
            for (int i = esquerda; i <= direita; i++) {
                resultado.add(matriz[cima][i]);
            }
            cima++;

            // Percorrer de cima para baixo na coluna direita
            for (int i = cima; i <= baixo; i++) {
                resultado.add(matriz[i][direita]);
            }
            direita--;

            // Percorrer da direita para a esquerda na linha inferior, se ainda houver linhas
            if (cima <= baixo) {
                for (int i = direita; i >= esquerda; i--) {
                    resultado.add(matriz[baixo][i]);
                }
                baixo--;
            }

            // Percorrer de baixo para cima na coluna esquerda, se ainda houver colunas
            if (esquerda <= direita) {
                for (int i = baixo; i >= cima; i--) {
                    resultado.add(matriz[i][esquerda]);
                }
                esquerda++;
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        // Exemplo 1
        int[][] matriz1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Exemplo 2
        int[][] matriz2 = {
            {1, 2, 3},
            {4, 10, 12},
            {6, 7, 33}
        };

        List<Integer> resultado1 = caracol(matriz1);
        List<Integer> resultado2 = caracol(matriz2);

        System.out.println(resultado1); // Esperado: [1, 2, 3, 6, 9, 8, 7, 4, 5]
        System.out.println(resultado2); // Esperado: [1, 2, 3, 12, 33, 7, 6, 4, 10]
    }
}
