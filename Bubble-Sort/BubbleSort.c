#include <stdio.h>
void bubblesort(int *a, int len)
{
	for (int i = 0; i < len; i++)
	{
		for (int j = 1; j < len; j++)
		{
			if (a[j] < a[j - 1])
			{
				int t = a[j];
				a[j] = a[j - 1];
				a[j - 1] = t;
			}
		}
	}
}
int a[] = {56, -6, 89, 111, 255, -8888888, 1};
int main()
{
	printf("Before sorting\n");
	for (int i = 0; i < 7; i++)
		printf("%d ", a[i]);
	printf("\n");
	bubblesort(a, 7);
	printf("After sorting\n");
	for (int i = 0; i < 7; i++)
		printf("%d ", a[i]);
	printf("\n");
	return 0;
}