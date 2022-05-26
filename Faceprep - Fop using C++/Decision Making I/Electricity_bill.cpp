#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int units, cost;
  float bill = 0.0;
  cin>>units;
  if(units <= 200)
  {
    bill = units*0.5;
  }
  else if(units <= 400)
  {
    bill = units*0.65 + 100;
  }
  else if(units <= 600)
  {
    bill = units*0.80 + 200;
  }
  else if(units > 600)
  {
    bill = units*1.25 + 425;
  }
  
  cout<<"Rs."<<(int)bill;
  
}