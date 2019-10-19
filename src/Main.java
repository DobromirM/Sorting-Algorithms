import sorters.BubbleSorter;
import sorters.InsertionSorter;
import sorters.MergeSorter;

public class Main {
  
  public static void main(String[] args) {
    
    int[] original = {25, 21, 1, 5, 7, 9, 11, 2, 13, 11};
    
    int[] forSorting = new int[10];
    
    // Deepcopy the original
    System.arraycopy(original, 0, forSorting, 0, 10);
  
    // Sort the copy
    MergeSorter mergeSorter = new MergeSorter();
    mergeSorter.sort(forSorting);
  
    // Deepcopy the original
    System.arraycopy(original, 0, forSorting, 0, 10);
    
    // Sort the copy
    BubbleSorter bubbleSorter = new BubbleSorter();
    bubbleSorter.sort(forSorting);
  
    // Deepcopy the original
    System.arraycopy(original, 0, forSorting, 0, 10);
  
    // Sort the copy
    InsertionSorter insertionSorter = new InsertionSorter();
    insertionSorter.sort(forSorting);
  }
}
