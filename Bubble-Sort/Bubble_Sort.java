// run javac BubbleSort.java to Compile.
// run java BubbleSort to run Program.
import java.util.Scanner;
/**
Bubble sort algorithm
*/
public class BubbleSort
{
private int[] intData;
/**
Constructor
@param inOutArray the array to be sorted
*/
public BubbleSort(int[] inOutArray)
{
intData = inOutArray;
}
/**
Sorts the attribute inData
*/
public void sort()
{
for (int i = intData.length - 1; i > 0; i--)
{
placeMax(i);
}
}
/**
Bubble the largest value
@param end location where unprocessed array ends
*/
private void placeMax(int end)
{
for (int i = 0; i < end; i++)
if (intData[i] > intData[i+1])
swap(i, i+1);
}
/**
interchange values between two locations of the array
@param first one of the location to be interchanged
@param second the other location to be interchanged
*/
private void swap(int first, int second)
{
int temp = intData[first];
intData[first] = intData[second];
intData[second] = temp;
}
}
