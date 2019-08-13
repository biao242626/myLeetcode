#include<iostream>
using namespace std;
int main()
{
	int data[10];
	int from[10];
	int to[10];
	int top=0;
	for(int i=0;i<10;i++)
	{
		from[i]=top;
		to[top]=i;
		data[i]=0;
		top++;
	}
	for(int i=0;i<10;i++)
	{
		cout<<"data["<<i<<"]:"<<data[i]<<" from["<<
		i<<"]:"<<from[i]<<" to["<<i<<"]:"<<to[i]<<" top="
		<<top<<endl;
	}
	return 0;x
}