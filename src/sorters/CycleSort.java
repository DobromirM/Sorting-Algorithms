package sorters;

public class CycleSort extends AbstractSorter {
  
  @Override
  public void sort(int[] array) {
    
    for (int i = 0; i < array.length - 1; i++) {
      
      int currentItem = array[i];
      int destinationPosition = i;
      
      destinationPosition = getDestinationPosition(array, i, currentItem, destinationPosition);
      
      if (destinationPosition != i) {
        
        destinationPosition = checkForDuplicates(array, currentItem, destinationPosition);
        
        int temp = array[destinationPosition];
        array[destinationPosition] = currentItem;
        currentItem = temp;
        
        while (i != destinationPosition) {
          destinationPosition = i;
          
          destinationPosition = getDestinationPosition(array, i, currentItem, destinationPosition);
          
          destinationPosition = checkForDuplicates(array, currentItem, destinationPosition);
          
          temp = array[destinationPosition];
          array[destinationPosition] = currentItem;
          currentItem = temp;
        }
      }
    }
  }
  
  private int getDestinationPosition(int[] array, int i, int currentItem, int destinationPosition) {
    for (int j = i + 1; j < array.length; j++) {
      
      if (array[j] < currentItem) {
        destinationPosition = destinationPosition + 1;
      }
    }
    return destinationPosition;
  }
  
  private int checkForDuplicates(int[] array, int currentItem, int destinationPosition) {
    while (currentItem == array[destinationPosition]) {
      destinationPosition = destinationPosition + 1;
    }
    return destinationPosition;
  }
}

