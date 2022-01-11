// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char symbol;
	int len = 0;
	char draw;
	
	cout << "please enter the symbol: ";
	cin >> symbol;
	
	cout << "please enter line length: ";
	cin >> len;
	
	cout << "horizontal, vertical, or diagnal: ";
	cin >> draw;
	
	for(int i = 1; i <= len; i++){
		if(draw == 'v'){
			cout << symbol << endl;
			if(draw == 'h'){
				cout << symbol << endl;
			}
			{
				if(draw == 'd');
				for(int i = 0; i < len + 1; i++){
					gotoxy(3 + i, 5 + i);
					cout << symbol << endl;
				}
			}
		}
	}
	

}
