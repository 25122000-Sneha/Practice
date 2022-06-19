#include <iostream>
using namespace std;
int main()
{
	int n, arr[20], val, pos;
	cin>>n;
	for(int i=0; i<n; i++)
	{
		cin>>arr[i];
	}
	cin>>val;
	cin>>pos;
	for(int j=n; j>=pos; j--)
	{
		arr[j+1] = arr[j];
	}
	arr[pos] = val;
	for(int i=0; i<n+1; i++)
	{
		cout<<arr[i];
		cout<<" ";
	}
}
