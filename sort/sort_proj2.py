def f(mas):
    # set n = length of the passed in list
    n = len(mas)
    # set p = to length of list - 1
    p = n - 1
    # iterate until p is less than or equal to 0
    while p > 0:
        m = 0
        # create a list of numbers starting at 0 and incremening to p - 1
        # i.e. if p = 5, create a list with the value [0,1,2,3,4]
        # Then, iterate over the list
        for i in range(p):
            # look at the list items at position i and positiono m. If the
            # first is greater than the second, then set the variable m = the value of i
            if mas[i] > mas[m]:
                m = i
            # store what is at list item m into a variable, z
            z = mas[m]
            # set list item m to the value of list item p
            mas[m] = mas[p]
            # set list item p to the value in z
            mas[p] = z

        # decrement p by 1
        p = p - 1
    # output the resulting list
    for i in range(n):
        print(mas[i])

def f2(mas):
    n = len(mas)
    p = n - 1
    while p > 0:
        m = 0
        for i in range(p):
            if mas[i] > mas[m]:
                m = i
        mas[m], mas[p] = mas[p], mas[m]
        p -= 1
    for i in range(n):
        print(mas[i])

my_list = [3,4,2,1,8]
# my_list = [1,2,3,4,5]
# my_list = [5,4,3,2,1]
f(my_list)