#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float p1, p2, d;
  float total, discount, discountedPrice;
  cin>>p1>>p2>>d;
  total = p1 + p2;
  discount = ((d/100)*p1) + ((d/100)*p2);
  discountedPrice = total - discount;
  cout<<total<<endl<<discountedPrice<<endl<<discount;
  
}