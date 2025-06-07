package classcode;
import java.util.Arrays;
import stdlib.StdOut;

/*
Directions:

Do not change or add any of the method definitions, 
class definitions, fields, etc.

Part 1
Complete the MyMergeSort class below
You can use the code from pg. 271 and pg. 273 from 
  the text as a reference  
You can also use any other online reference 

Part 2
Add print statement(s) to reproduce the following prints
when you run this file:

a = [5, 3, 7, 2, 4, 1, 6]

merge(a, 0, 0, 1):
  [3, 5, 7, 2, 4, 1, 6]

merge(a, 2, 2, 3):
  [3, 5, 2, 7, 4, 1, 6]

merge(a, 0, 1, 3):
  [2, 3, 5, 7, 4, 1, 6]

merge(a, 4, 4, 5):
  [2, 3, 5, 7, 1, 4, 6]

merge(a, 4, 5, 6):
  [2, 3, 5, 7, 1, 4, 6]

merge(a, 0, 3, 6):
  [1, 2, 3, 4, 5, 6, 7]

a = [g, f, e, d, c, b, a]

merge(a, 0, 0, 1):
  [f, g, e, d, c, b, a]

merge(a, 2, 2, 3):
  [f, g, d, e, c, b, a]

merge(a, 0, 1, 3):
  [d, e, f, g, c, b, a]

merge(a, 4, 4, 5):
  [d, e, f, g, b, c, a]

merge(a, 4, 5, 6):
  [d, e, f, g, a, b, c]

merge(a, 0, 3, 6):
  [a, b, c, d, e, f, g]

... All tests pass, but check the prints with those in Part 2
*/


// DO NOT CHANGE THIS CLASS DEFINTION
public class MyMergeSort<T extends Comparable<T>> {
  
  // DO NOT CHANGE OR ADD FIELDS OR METHODS
  private T[] aux; 
  public MyMergeSort() {}
   
  @SuppressWarnings("unchecked")
  public void sort(T[] a) {
    aux = (T[]) new Comparable[a.length];  // DO NOT CHANGE THIS LINE
    // TODO: complete  
  }
  
  private boolean less(T v, T w) {
    // TODO: replace the line below
    return false;
  }
  
  private void sortHelper(T[] a, int lo, int hi) {
    // TODO: complete
  }
  
  private void merge(T[] a, int lo, int mid, int hi) {
    // TODO: complete
  }
  
  // DO NOT CHANGE
  public static void main(String[] args) {
    
    MyMergeSort<Integer> intSort = new MyMergeSort<>();
    Integer[] iarr = new Integer[] {5, 3, 7, 2, 4, 1, 6}; 
    intSort.sort(iarr);
    my_assert(Arrays.equals(iarr, new Integer[] {1, 2, 3, 4, 5, 6, 7}));
    
    MyMergeSort<Character> charSort = new MyMergeSort<>(); 
    Character[] carr = new Character[] {'g', 'f', 'e', 'd', 'c', 'b', 'a'};
    charSort.sort(carr);
    my_assert(Arrays.equals(carr, new Character[] {'a', 'b', 'c', 'd', 'e', 'f', 'g'}));
    
    StdOut.println("... All tests pass, but check the prints with those in Part 2");
  }
  
  // DO NOT CHANGE
  public static void my_assert(boolean expr) {
    if (expr) {
      return;
    }
    else {
      throw new AssertionError("\ntest failed ...");
    } 
  }

}