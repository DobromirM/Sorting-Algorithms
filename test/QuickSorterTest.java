import org.junit.jupiter.api.Test;
import sorters.QuickSorter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSorterTest {
  
  @Test
  void testSortRegular() {
    
    // Given
    int[] actual = {25, 21, 1, 5, 7, 9, 11, 2, 13, 11};
    int[] expected = {1, 2, 5, 7, 9, 11, 11, 13, 21, 25};
    QuickSorter quickSorter = new QuickSorter();
    
    // When
    quickSorter.sort(actual);
    
    // Then
    assertArrayEquals(expected, actual);
  }
  
  @Test
  void testSortRegularRandomPivot() {
    
    // Given
    int[] actual = {25, 21, 1, 5, 7, 9, 11, 2, 13, 11};
    int[] expected = {1, 2, 5, 7, 9, 11, 11, 13, 21, 25};
    QuickSorter quickSorter = new QuickSorter(true);
    
    // When
    quickSorter.sort(actual);
    
    // Then
    assertArrayEquals(expected, actual);
  }
}
