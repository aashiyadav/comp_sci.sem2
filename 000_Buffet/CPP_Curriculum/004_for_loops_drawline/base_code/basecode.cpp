// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char symbol;
	int len = 0; 
	char draw; 
	
	cout <<"plesde enter the symbol: ";
	cin >> symbol;
	
	cout <<"Please enter line length: ";
	cin >> len;
	
	cout<<"Horizontal or vertical: ";
	cin >> draw;
	
	for(int i = 1; i <= len; i++){
		if(draw == 'v'){
			cout <<symbol<<endl;
		if(draw == 'h'){
			cout << symbol << endl;
		}
		}
		else{
			cout<<symbol;
		}
	}
}
