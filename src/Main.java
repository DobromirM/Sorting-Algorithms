import sorters.MergeSorter;

public class Main {
  
  public static void main(String[] args) {
    
    int[] numbers = {25, 21, 1, 5, 7, 9, 11, 2, 13, 11};
    MergeSorter mergeSorter = new MergeSorter();
    mergeSorter.sort(numbers);
    
    for (int number : numbers) {
      System.out.println(number);
    }
  }
}
