#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int friends, teams;
  cin>>friends>>teams;
  cout<<"The number of friends in each team is "<<friends/teams<<" and left out is "<<friends%teams;
}