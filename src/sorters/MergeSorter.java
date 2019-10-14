package sorters;

public class MergeSorter extends AbstractSorter {
  
  public void sort(int[] array) {
    
    if (array.length > 1) {
      split(array, 0, array.length - 1);
    }
  }
  
  private void split(int[] array, int left, int right) {
    
    if (left < right) {
      
      int middle = (left + right) / 2;
      
      split(array, left, middle);
      split(array, middle + 1, right);
      
      int leftSize = middle - left + 1;
      int rightSize = right - middle;
      
      int[] leftArray = new int[leftSize];
      int[] rightArray = new int[rightSize];
      
      System.arraycopy(array, left, leftArray, 0, leftSize);
      System.arraycopy(array, middle + 1, rightArray, 0, rightSize);
      
      merge(array, leftArray, rightArray, left);
    }
  }
  
  private void merge(int[] array, int[] leftArray, int[] rightArray, int originalIndex) {
    
    int leftSize = leftArray.length;
    int rightSize = rightArray.length;
    
    int leftIndex = 0;
    int rightIndex = 0;
    
    while (leftIndex < leftSize && rightIndex < rightSize) {
      
      if (leftArray[leftIndex] < rightArray[rightIndex]) {
        
        array[originalIndex] = leftArray[leftIndex];
        leftIndex++;
      }
      else {
        array[originalIndex] = rightArray[rightIndex];
        rightIndex++;
      }
      
      originalIndex++;
    }
    
    while (leftIndex < leftSize) {
      
      array[originalIndex] = leftArray[leftIndex];
      leftIndex++;
      originalIndex++;
    }
    
    while (rightIndex < rightSize) {
      array[originalIndex] = rightArray[rightIndex];
      rightIndex++;
      originalIndex++;
    }
  }
}
