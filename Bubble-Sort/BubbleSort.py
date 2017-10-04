"""
run python BubbleSort.py
"""

def bubbleSort(a):
    for passnum in range(len(a)-1,0,-1):
        for i in range(passnum):
            if a[i]>a[i+1]:
                temp = a[i]
                a[i] = a[i+1]
                a[i+1] = temp

a = [1,22,2,3,44,5,12,3,41]
bubbleSort(a)
print(a)
