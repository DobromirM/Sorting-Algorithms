import org.junit.jupiter.api.Test;
import sorters.BubbleSorter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSorterTest {
  @Test
  void testSortRegular() {
    
    // Given
    int[] actual = {25, 21, 1, 5, 7, 9, 11, 2, 13, 11};
    int[] expected = {1, 2, 5, 7, 9, 11, 11, 13, 21, 25};
    BubbleSorter bubbleSorter = new BubbleSorter();
    
    // When
    bubbleSorter.sort(actual);
    
    // Then
    assertArrayEquals(expected, actual);
  }
}
