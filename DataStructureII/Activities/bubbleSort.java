class bubbleSort {
  public static void main(String[] args) {
    
    int numbers[] = {7, 5, 4, 8, 2, 3, 0};
    int bigger, indexBigger, flag = 0;

    while(flag == 0) {
      indexBigger = 0;
      for (int i = 0; i < numbers.length; i++) {
        if(i +2 <= numbers.length && (numbers[i] > numbers[i+1])) {
          bigger = numbers[i];
          numbers[i] = numbers[i+1];
          numbers[i+1] = bigger;
          indexBigger ++;
        }
        if(i == numbers.length -1 && indexBigger == 0 ) {
          flag = 1;
        }
      }
    }
    for(int j = 0; j < numbers.length ; j++){
      System.out.println(numbers[j]);
    }
  }
}