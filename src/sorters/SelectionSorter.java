package sorters;

public class SelectionSorter extends AbstractSorter {
  
  @Override
  public void sort(int[] array) {
    
    for (int i = 0; i < array.length - 1; i++) {
      int min = array[i];
      int min_index = i;
      
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < min) {
          min = array[j];
          min_index = j;
        }
      }
      
      swap(array, i, min_index);
    }
  }
}
