package sofka.exercises.exercise3;

/**
 * Este método permite generar un array de n cantidad de
 * números enteros aleatorios, y posteriormente poder ordenar dicho array, bien
 * sea por el método burbuja o por el método quick sort
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.0 26-05-2023
 * @since: 1.0.0
 */
public class SortBy {

    /**
     * Este es el array donde se guardan los n números aleatorios que se generen
     */
    int arrayOfNumbers[];

    /**
     * Esta variable representa la cantidad(n) de números aleatorios que se
     * van a generar, este valor lo define el usuario
     */
    int quantityNumbers;

    /**
     * Este constructor exige la cantidad de números a generar, y
     * automáticamente llama a la función que genera los números aleatorios
     *
     * @param quantityNumbers Es el array donde se guardan los números generados
     * @since: 1.0.0
     */
    public SortBy(int quantityNumbers) {
        this.quantityNumbers = quantityNumbers;
        generateNumbers();
    }

    /**
     * Este método se encarga de generar los números aleatorios y
     * almacenarlos en el array
     *
     * @since: 1.0.0
     */
    private void generateNumbers() {

        arrayOfNumbers = new int[quantityNumbers];

        for (int i = 0; i < quantityNumbers; i++) {
            int randomNumber = (int) (Math.random() * (100 - 1)) + 1;
            arrayOfNumbers[i] = randomNumber;
        }
    }

    /**
     * Este método se encarga de ordenar el array de números enteros, utilizando
     * la filosofía del método burbuja
     *
     * @since: 1.0.0
     */
    public void bubbleSort() {

        int container;

        for (int i = 0; i < (quantityNumbers - 1); i++) {
            for (int j = 0; j < (quantityNumbers - 1); j++) {
                if (arrayOfNumbers[j] > arrayOfNumbers[j + 1]) {
                    container = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[j + 1];
                    arrayOfNumbers[j + 1] = container;
                }
            }
        }
    }

    /**
     * Este método se encarga de ordenar el array de números enteros, utilizando
     * la filosofía del método quick sort
     *
     * @param array Array que se desea ordenar
     * @param left  número de referencia para la primera mitad del array
     * @param right número de referencia para la segunda mitad del array
     * @since: 1.0.0
     */
    public void quickSort(int array[], int left, int right) {

        int pivot = array[left];
        int i = left;
        int j = right;
        int temporary;

        while (i < j) {
            while (array[i] <= pivot && i < j) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i < j) {
                temporary = array[i];
                array[i] = array[j];
                array[j] = temporary;
            }
        }
        array[left] = array[j];
        array[j] = pivot;

        if (left < (j - 1)) {
            quickSort(array, left, j - 1);
        }
        if (j + 1 < right) {
            quickSort(array, j + 1, right);
        }
    }

    /**
     * Este método nos permite obtener el array de números
     *
     * @return Devuelve el array de números
     * @since: 1.0.0
     */
    public int[] getArrayOfNumbers() {
        return arrayOfNumbers;
    }
}
