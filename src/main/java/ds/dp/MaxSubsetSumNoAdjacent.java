package ds.dp;

import java.util.*;

class Program {
  public static int MaxSubsetSumNoAdjacent(int[] array) {
    // Write your code here.
    if (array.length == 0) {
      return 0;
    } else if (array.length == 1) {
      return array[0];
    }
    int[] maxSums = array.clone();
    maxSums[1] = Math.max(array[0], array[1]);
    for(int i = 2; i < array.length; i++) {
      maxSums[i] = Math.max(maxSums[i - 1], maxSums[i - 2] + array[i]);
    }
    return maxSums[array.length - 1];
  }
}
