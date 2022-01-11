// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// snowflakes
	for (int y = 1; y < 4; y++){
		gotoxy(10,y + 4);
		cout << "*	*	*	*	*	*	*	*" << endl;
		sleep(1);
		gotoxy(10,y+4);
		cout<<"                                                              " << endl;
}
gotoxy(3,2);
cout << "MERRY CHRISTMAS !!!" << endl;
string wish;
cout <<"who would you like to wish "<< endl;
cin >> wish;
gotoxy(5,5);
cout << "dear "+wish+", happy holidays and merry christmas!! i hope you enjoy your time to spend with your friends and family." << endl;
int length = 5;
int x = 10, y = 10;
char symbol = '@';



gotoxy(1,7);
cout<<"please enter line length for a gift box: ";
cin>>length; 
cout <<"please enter a symbol: ";
cin>>symbol;
cout <<"please enter the amount of colums: ";
cin>>x;
cout <<"please enter the amount of rows: ";
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
	gotoxy(30,10);
	cout << "$$$$$$$$$$$$$$$$$$$$$$$$" <<endl;
	gotoxy(30,9);
	cout << "  $$$$$$$$$$$$$$$$$$$$ " <<endl;
	gotoxy(30,8);
	cout << "    $$$$$$$$$$$$$$$$ " <<endl;
	gotoxy(30,7);
	cout << "      $$$$$$$$$$$$$ " << endl;
	gotoxy(30,6);
	cout << "       $$$$$$$$$$$  "<< endl;
	gotoxy(30,5);
	cout << "        $$$$$$$$$  " << endl;
	gotoxy(30,4);
	cout << "          $$$$$" << endl;
	gotoxy(30,3);
	cout << "           $$$" << endl;
	gotoxy(30,2);
	cout << "            $" << endl;
	
}
