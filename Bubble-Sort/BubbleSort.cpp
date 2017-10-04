#include <vector> 
#include <algorithm>
#include <iostream>
using namespace std;
template <typename T>
void bubblesort(vector<T> &a)
{
	for (size_t i = 0; i < a.size(); i++)
	{
		for (size_t j = 1; j < a.size(); j++)
		{
			if (a[j] < a[j - 1])
				swap(a[j], a[j - 1]);
		}
	}
}
int main()
{
	vector<int> a{56, -6, 89, 111, 255, -8888888, 1};
	cout << "Before sorting\n";
	for(auto x:a)
		cout << x << ' ';
	cout << endl;
	bubblesort(a);
	cout << "After sorting\n";
	for(auto x:a)
		cout << x << ' ';
	cout << endl;
	return 0;
}