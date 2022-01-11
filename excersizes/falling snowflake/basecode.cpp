// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
for (int y = 1; y < 4; y++){
		gotoxy(3,y + 4);
		cout << "*" << endl;
		sleep(1);
		gotoxy(3,y+4);
		cout<<" " << endl;
}

}
