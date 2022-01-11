// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x=0;
	int y=0;
	char operation;
	int next = 1;
	
	while(next != 0)
	{
		cout<<"please enter the first number X: ";
		cin >> x;
		cout<<"please enter the second number Y: ";
		cin >> y;
		cout<<"please enter the operation: ";
		cin >> operation;
		
		if (operation == '+'){
			cout << "X + Y = "<<(x+y) << endl;
		}
		else if(operation == '-'){
			cout << "X - Y = "<<(x-y) << endl;
		}
		else if(operation == '*'){
			cout << "X * Y = "<<(x*y) << endl;
	}
		else if(operation == '/'){
			cout << "X / Y = "<<(x/y) << endl;
		}
		cout << "Would you like to continue?  Please enter 1: Yes or 0: No ->";
		cin >> next;

}
}
