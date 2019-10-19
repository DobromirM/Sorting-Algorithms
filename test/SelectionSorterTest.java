import org.junit.jupiter.api.Test;
import sorters.SelectionSorter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SelectionSorterTest {
  
  @Test
  void testSortRegular() {
    
    // Given
    int[] actual = {25, 21, 1, 5, 7, 9, 11, 2, 13, 11};
    int[] expected = {1, 2, 5, 7, 9, 11, 11, 13, 21, 25};
    SelectionSorter selectionSorter = new SelectionSorter();
    
    // When
    selectionSorter.sort(actual);
    
    // Then
    assertArrayEquals(expected, actual);
  }
}
