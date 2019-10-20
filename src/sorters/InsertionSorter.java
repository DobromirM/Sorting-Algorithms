package sorters;

public class InsertionSorter extends AbstractSorter {
  
  @Override
  public void sort(int[] array) {
    sortArray(array, 1);
  }
  
  void sortArray(int[] array, int step) {
    for (int i = step; i < array.length; i++) {
      
      int current = array[i];
      int j = i;
      
      while (j >= step && current < array[j - step]) {
        array[j] = array[j - step];
        j = j - step;
      }
      
      array[j] = current;
    }
  }
}
