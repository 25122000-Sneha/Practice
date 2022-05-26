#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int wt, adults, children, total_wt;
  cin>>wt>>adults>>children;
  total_wt = (adults*75 + children*30);
  if(total_wt<=wt)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will sink";
  }
}