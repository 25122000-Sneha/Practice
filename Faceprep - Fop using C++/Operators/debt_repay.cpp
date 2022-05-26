using namespace std;
int main()
{
  //Type your code here.
  int p, r, t;
  float si, amt, discount, total;
  cin>>p>>r>>t;
  
  si = (p*r*t)/100.0;
  amt = p + si;
  discount = (2.0/100.0)*si;
  total = amt - discount;
  cout<<fixed<<setprecision(2);
  std::cout<<si<<endl<<amt<<endl<<discount<<endl<<total;
}