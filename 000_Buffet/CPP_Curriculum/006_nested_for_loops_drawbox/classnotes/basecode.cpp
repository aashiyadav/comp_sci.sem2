// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
//innner loop is x coordinate
//outer loop is y coordinate
for (int y = 1; y < 4; y++){
	for (int x = 1; x < 6; x++){
		gotoxy(x,y + 4);
		cout << "*";
	}
}
	//cout << endl;
}
