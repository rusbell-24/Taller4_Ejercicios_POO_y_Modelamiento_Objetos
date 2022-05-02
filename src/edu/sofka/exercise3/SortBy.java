package edu.sofka.exercise3;

public class SortBy {

    int arrayOfNumbers[];
    int quantityNumbers;

    public SortBy(int quantityNumbers) {
        this.quantityNumbers = quantityNumbers;
        generateNumbers();
    }

    private void generateNumbers(){
        arrayOfNumbers= new int[quantityNumbers];
        for (int i = 0; i < quantityNumbers; i++){
            int randomNumber = (int) (Math.random()*(100-1)) + 1;
            arrayOfNumbers[i] = randomNumber;
        }
    }

    public void bubbleSort(){
        int container;
        for (int i = 0; i < (quantityNumbers-1); i++){
            for (int j = 0; j < (quantityNumbers-1); j++){
                if (arrayOfNumbers[j] > arrayOfNumbers[j+1]){
                    container = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[j+1];
                    arrayOfNumbers[j+1]= container;
                }
            }
        }
    }

    public void quickSort(int array[], int left, int right){
        int pivot = array[left];
        int i = left;
        int j = right;
        int temporary;

        while (i < j){
            while (array[i] <= pivot && i < j){
                i++;
            }
            while (array[j] > pivot){
                j--;
            }
            if (i < j){
                temporary =  array[i];
                array[i] = array[j];
                array[j] = temporary;
            }
        }
        array[left] =array[j];
        array[j] = pivot;

        if (left < (j-1)){
            quickSort(array, left,j-1);
        }
        if (j+1 < right){
            quickSort(array, j+1, right);
        }
    }

    public int[] getArrayOfNumbers() {
        return arrayOfNumbers;
    }
}
