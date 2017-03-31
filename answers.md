1. Write a static method named flip that simulates a flip of a weighted coin by returning either
"heads" or "tails" each time it is called. The coin is twice as likely to turn up heads as tails.
Thus, flip should return "heads" about twice as often as it returns "tails."

public static string flip() {
  if (Math.random() > 0.33) {
    return "head";
  }
  else {
    return "tails";
  }
}

2. Write a static method named arePermutations that, given two int arrays of the same length
but with no duplicate elements, returns true if one array is a permutation of the other (i.e., the
arrays differ only in how their contents are arranged). Otherwise, it should return false.

public static boolean arePermutations(int[] a, int[] b){
    for(int i = 0; i < a.length; i++){
        boolean test1 = false;
        for(int k = 0; k < b.length; k++){
            if(a[i] == b[k]){
                test1 = true;
            }
        }
        if(test1){
            return true;
        }

    }
    return false;
}

3. Suppose that the initial contents of the values array in Shuffler.java are {1, 2, 3,
4}. For what sequence of random integers would the efficient selection shuffle change values to
contain {4, 3, 2, 1}?

1, 2, 2, 2