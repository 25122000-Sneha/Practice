#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float a1, b1, a2, b2, a3, b3;
  float centroid_a, centroid_b;
  cin>>a1>>b1>>a2>>b2>>a3>>b3;
  centroid_a = (a1 + a2 + a3)/3;
  centroid_b = (b1 + b2 + b3)/3;
  cout<<centroid_a<<endl<<centroid_b;
}