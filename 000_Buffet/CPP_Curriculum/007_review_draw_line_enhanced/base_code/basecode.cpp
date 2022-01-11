// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int length = 5;
int x = 10, y = 10;
char symbol = '@';




cout<<"please enter line length: ";
cin>>length; 
cout <<"please enter a symbol: ";
cin>>symbol;
cout <<"please enter a X coordinate: ";
cin>>x;
cout <<"please enter a Y coordinate: ";
cin>>y;



for(int i = 0; i < x; i++)
{
for(int j = 0; j < y; j++)
{
cout<<"  ";
}
cout<<endl;
for(int k = 0; k < length; k++)
{
cout<<symbol;
}
cout<<endl;
}

}
