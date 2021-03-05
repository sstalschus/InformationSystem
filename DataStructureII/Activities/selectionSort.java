class selectionSort {
  public static void main(String[] args) {
    
    int numbers[] = {7, 5, 4, 8, 2, 3, 0};
    int smaller, indexSmaller;
    for (int i = 0; i < numbers.length - 1; i++) {
        smaller = numbers[i];
        indexSmaller = i;
        for (int j = i + 1; j < numbers.length; j++){
            if (numbers[j] < smaller){
                smaller = numbers[j];
                indexSmaller = j;
            }
        }
        numbers[indexSmaller] = numbers[i];
        numbers[i] = smaller;
    }
    // print the array
    for(int j = 0; j < numbers.length ; j++){
       System.out.println(numbers[j]);
    }
  }
}
