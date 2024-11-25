package fluxotransito.algoritmos;

import fluxotransito.interfaces.Ordenavel;

public abstract class Ordenacao implements Ordenavel {
    @Override
    public abstract void ordenar(int[] array);

    protected void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
