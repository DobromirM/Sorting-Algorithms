package sorters;

abstract class AbstractSorter {
  
  public abstract void sort(int[] array);
  
  void swap(int[] array, int from, int to) {
    int temp = array[from];
    array[from] = array[to];
    array[to] = temp;
  }
}
