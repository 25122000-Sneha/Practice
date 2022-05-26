#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char c;
  cin>>c;
  if(isalpha(c))
  {
    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
  	{
    	cout<<"Vowel";
  	}
    else
    {
      	cout<<"Consonant";
    }
  }
  else
  {
    cout<<"Not an alphabet";
  }
    
  
}