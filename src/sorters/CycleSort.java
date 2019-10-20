package sorters;

public class CycleSort extends AbstractSorter {
  
  @Override
  public void sort(int[] array) {
    
    for (int i = 0; i < array.length - 1; i++) {
      
      int currentItem = array[i];
      int destinationPosition = i;
      
      for (int j = i + 1; j < array.length; j++) {
        
        if (array[j] < currentItem) {
          destinationPosition = destinationPosition + 1;
        }
      }
      
      if (destinationPosition == i) {
      }
      else {
        
        while (currentItem == array[destinationPosition]) {
          destinationPosition = destinationPosition + 1;
        }
        
        int temp = array[destinationPosition];
        array[destinationPosition] = currentItem;
        currentItem = temp;
        
        while (i != destinationPosition) {
          destinationPosition = i;
          
          for (int j = i + 1; j < array.length; j++) {
            
            if (array[j] < currentItem) {
              destinationPosition = destinationPosition + 1;
            }
          }
          
          while (currentItem == array[destinationPosition]) {
            destinationPosition = destinationPosition + 1;
          }
          
          temp = array[destinationPosition];
          array[destinationPosition] = currentItem;
          currentItem = temp;
        }
      }
    }
  }
}

