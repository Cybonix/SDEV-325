/**
 * A simple flow control example program.
 * 
 * @author: Mark Orimoloye
 */
 
#include <iostream>
#include <string>
using namespace std;

int main()
{
    string name;
	cout << "Hello, and you are? ";
	cin >> name;
	
	if (name == "Mark")
	{
	    cout << "Hello " + name + " welcome to your class.";
	}
	else if (name == "Matthew")
	{
	    cout << " Hello Professor " + name + " Brown~!";
	}
	else 
	{
	    cout << " Hello " + name + ", are you in the right class?";
	}
}