package sorters;

public class BubbleSorter extends AbstractSorter {
  
  @Override
  public void sort(int[] array) {
    
    boolean hasChanged;
    int loopCount = 0;
    do {
      
      hasChanged = false;
      
      for (int i = 0; i < array.length - loopCount - 1; i++) {
        
        if (array[i] > array[i + 1]) {
          swap(array, i, i + 1);
          hasChanged = true;
        }
      }
      loopCount++;
      
    } while (hasChanged);
  }
}
