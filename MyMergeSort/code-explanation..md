# Class Overview
The class `MyMergeSort<T extends Comparable<T>>` is designed to perform merge sort on an array of elements of type T, where T must implement the Comparable interface. This ensures that objects can be compared with each other.

# Fields and Constructor
private T[] aux; → This auxiliary array is used for merging.

public MyMergeSort() → A constructor that initializes an instance but does not set any fields.

# Key Methods
sort(T[] a) → This is the main sorting method.

It initializes the auxiliary array aux with the same length as a.

The actual sorting logic should be implemented in this method (currently missing).

less(T v, T w) → This method should compare two elements.

Right now, it always returns false, meaning the comparison logic needs to be implemented.

Ideally, it should return v.compareTo(w) < 0.

sortHelper(T[] a, int lo, int hi) → The recursive merge sort function.

This should divide the array into two halves and recursively sort them.

Then, it should call merge() to combine the sorted halves.

merge(T[] a, int lo, int mid, int hi) → The merging function.

This merges two sorted subarrays into a single sorted array.

This is the core operation of merge sort.

# Main Method (Testing)
It creates an instance of MyMergeSort<Integer> and MyMergeSort<Character>.

It sorts Integer and Character arrays.

It asserts whether the sorting was successful.

StdOut.println() displays a confirmation if the sorting is correct.

# What Needs to be Completed?
Implement less() so it correctly compares two elements.

Implement sortHelper() to recursively divide and sort the array.

Implement merge() so it correctly merges sorted subarrays.

Modify sort() to call sortHelper().

Once you fill in these missing pieces, you'll have a working generic merge sort implementation.