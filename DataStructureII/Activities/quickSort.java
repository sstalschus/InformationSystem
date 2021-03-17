package quicksort;

import java.util.Arrays;

public class QuickSort {
  public static void main(String[] args) {
    int numbers[] = {7, 5, 4, 8, 2, 3, 0};
      
    quickSort(numbers, 0, numbers.length-1);
      
    System.out.println(Arrays.toString(numbers));
  }

  private static void quickSort(int[] numbers, int left, int right) {
    if(left < right){
        int separators = separator(numbers, left, right);
        quickSort(numbers, left, separators-1);
        quickSort(numbers, separators+1, right);
    }
  }

  private static int separator(int[] numbers, int left, int right) {
      
    int i = left + 1;
    int j = right;
    int pivo = numbers[left];
    
    while (i <= j){
      if(numbers[i] <= pivo)i++;
      else if(numbers[j] > pivo)j--;
      else if(i <= j){
        trade(numbers,i,j);
        i++;
        j--;}
    }
    trade(numbers, left, j);
    return j;

  }

  private static void trade(int[] numbers, int i, int j) {

    int aux = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = aux;

  }
}