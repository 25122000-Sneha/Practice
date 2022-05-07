#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a, b, c;
  cin>>a>>b>>c;
  int profit = b*a - (c*a + 100);
  cout<<profit;
}