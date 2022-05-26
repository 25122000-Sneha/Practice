#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num, sum = 0;
  cin>>num;
  while(num!=0)
  {
    int digit = num%10;
    sum += digit;
    num = num/10;
  }
  cout<<"Alice must go in path-"<<sum;
}