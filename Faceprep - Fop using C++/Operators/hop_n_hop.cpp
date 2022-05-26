#include<iostream>
#include <math.h>
using namespace std;
int main()
{
  //Type your code here.
  	int x, y;
	cin>>x;
  	cin>>y;
  	int distance = (int) sqrt(pow(x-3, 2) + pow(y-4, 2));
  	int hops = distance / 1;
  	cout<<hops;
}