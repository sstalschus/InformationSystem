class selectionSort {
  public static void main(String[] args) {
    
    int numbers[] = {7, 5, 4, 8, 2, 3, 0};
    int bigger, indexBigger;

    // procurando sempre o índice menor e atribuindo as primeiras posições
    for (int i = 0; i < numbers.length - 1; i++) {
        bigger = numbers[i];
        indexBigger = i;
        for (int j = i + 1; j < numbers.length; j++){
            if (numbers[j] > bigger){
                bigger = numbers[j];
                indexBigger = j;
            }
        }
        // array na posição do menor recebe o primeiro
        // em seguida colocamos o menor em primeiro
        numbers[indexBigger] = numbers[i];
        numbers[i] = bigger;
    }

    // print the array
    for(int j = 0; j < numbers.length ; j++){
       System.out.println(numbers[j]);
    }
  }
}