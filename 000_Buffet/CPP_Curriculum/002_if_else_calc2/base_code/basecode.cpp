// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout << "please enter a number: "<< endl;
	int x = 0;
	cin >> x;
	cout << "enter a character: " << endl;
	char op;
	cin >> op;
	cout << "please enter another number: " << endl;
	int y = 0;
	cin >> y;
	
	if (op == '+'){
		cout << x + y << endl;
		
	}
	
	else if (op == '-'){
		cout << x - y << endl;
		
	}

	else if (op == '/'){
		cout << x / y << endl;
		
	}
	
	else if (op == '*'){
		cout << x * y << endl;
		
	}
}
