package sorters;

public class ShellSorter extends AbstractSorter {
  
  @Override
  public void sort(int[] array) {
    
    InsertionSorter insertionSorter = new InsertionSorter();
    int step = array.length / 2;
    
    for (; step > 0; step = step / 2) {
      
      insertionSorter.sortArray(array, step);
    }
  }
}
