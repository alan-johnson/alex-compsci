def f(mas):
    n = len(mas)
    p = n - 1
  
    while p > 0:
        m = 0
        for i in range(p):
            if mas[i] > mas[m]:
                m = i
        z = mas[m]
        mas[m] = mas[p]
        mas[p] = z
  
        p = p - 1
        
    for i in range(n):
        print(mas[i], end=" ")

def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr

# Example usage:
# arr = [64, 34, 25, 12, 22, 11, 90]
# sorted_arr = bubble_sort(arr)
# print("Sorted array is:", sorted_arr)

my_list1 = [3,4,2,1,8]
my_list2 = [1,2,3,4,5]
my_list3 = [5,4,3,2,1]
f(my_list1)