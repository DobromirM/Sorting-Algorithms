package sorters;

public class InsertionSorter extends AbstractSorter {
  
  @Override
  public void sort(int[] array) {
    
    for (int i = 1; i < array.length; i++) {
      
      int current = array[i];
      int j = i;
      
      while (j > 0 && current < array[j - 1]) {
        array[j] = array[j - 1];
        j--;
      }
      
      array[j] = current;
    }
  }
}
