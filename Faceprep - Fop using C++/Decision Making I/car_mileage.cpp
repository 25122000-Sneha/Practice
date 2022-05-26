#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int petrol, dist_to_travel;
  cin>>mileage>>petrol>>dist_to_travel;
  float dist = mileage*petrol;
  if(dist_to_travel <= dist)
  {
    cout<<"Can reach";
  }
  else
  {
    cout<<"Cannot reach";
  }
}