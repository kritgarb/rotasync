package fluxotransito.algoritmos;

public class Quicksort extends Ordenacao {
    @Override
    public void ordenar(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private void quicksort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particionar(array, inicio, fim);
            quicksort(array, inicio, pivo - 1);
            quicksort(array, pivo + 1, fim);
        }
    }

    private int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;
                trocar(array, i, j);
            }
        }

        trocar(array, i + 1, fim);
        return i + 1;
    }
}
