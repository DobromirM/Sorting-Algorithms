package sorters;

import java.util.Random;

public class QuickSorter extends AbstractSorter {
  
  private Boolean useRandomPivot = false;
  private Random random;
  
  public QuickSorter() {
    new QuickSorter(false);
  }
  
  public QuickSorter(Boolean useRandomPivot) {
    this.useRandomPivot = useRandomPivot;
  }
  
  @Override
  public void sort(int[] array) {
    sortPartition(array, 0, array.length - 1);
    System.out.println();
  }
  
  private void sortPartition(int[] partition, int startIndex, int endIndex) {
    
    if (startIndex >= endIndex) {
      return;
    }
    
    if (useRandomPivot) {
      randomisePivot(partition, startIndex, endIndex);
    }
    
    int pivot = partition[startIndex];
    int splitPoint = startIndex + 1;
    
    for (int i = splitPoint; i < endIndex + 1; i++) {
      if (partition[i] < pivot) {
        swap(partition, i, splitPoint);
        splitPoint++;
      }
    }
    
    swap(partition, startIndex, splitPoint - 1);
    
    sortPartition(partition, startIndex, splitPoint - 1);
    sortPartition(partition, splitPoint, endIndex);
  }
  
  private void randomisePivot(int[] partition, int startIndex, int endIndex) {
    if (random == null) {
      random = new Random();
    }
    
    int pivotIndex = random.nextInt(endIndex + 1 - startIndex) + startIndex;
    swap(partition, startIndex, pivotIndex);
  }
}
