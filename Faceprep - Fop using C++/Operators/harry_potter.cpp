#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
	int code, sum;
  	cin>>code;
 	int lastDigit = code%10;
  	int firstDigit = code/1000;
  	sum = firstDigit + lastDigit;
  	cout<<sum;
  	
}