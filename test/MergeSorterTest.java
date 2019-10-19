import org.junit.jupiter.api.Test;
import sorters.MergeSorter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSorterTest {
  
  @Test
  void testSortRegular() {
    
    // Given
    int[] actual = {25, 21, 1, 5, 7, 9, 11, 2, 13, 11};
    int[] expected = {1, 2, 5, 7, 9, 11, 11, 13, 21, 25};
    MergeSorter mergeSorter = new MergeSorter();
    
    // When
    mergeSorter.sort(actual);
    
    // Then
    assertArrayEquals(expected, actual);
  }
}
