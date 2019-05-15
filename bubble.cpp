#include <iostream>
#include<conio.h>


using namespace std;


template <typename T1 >void b_sort(T1 u [] , int k);
int main()
{
int i[20];	
float f [20 ];
string s [20];
int x,c,size,counter=-1;
char F='y';
c=4;
while(c>3)
{
	
cout<<"enter choice"<<endl<<"1:integer"<<endl<<"2:float"<<endl<<"3:string"<<endl;
cin>>c;

switch(c)
{
case 1:

cout<<"enter no of element"<<endl;
cin>>size;
for(counter=0;counter<size;counter++)
{
	cout<<"enter element"<<endl;
	cin>>i[counter];
}
	b_sort(i ,size); 
	
	cout<<endl<<endl<<endl;
for(counter=0;counter<size;counter++)
{
	cout<<i[counter]<<endl;	
}

break;
case 2:
cout<<"enter no of element"<<endl;
cin>>size;
for(counter=0;counter<size;counter++)
{
	cout<<"enter element"<<endl;
	cin>>f[counter];
}
	b_sort(f ,size); 
for(counter=0;counter<size;counter++)
{
	cout<<f[counter]<<endl;	
}

break;
case 3:
cout<<"enter no of element"<<endl;
cin>>size;
for(counter=0;counter<size;counter++)
{
	cout<<"enter element"<<endl;
	cin>>s[counter];
}
	b_sort(s ,size); 
for(counter=0;counter<size;counter++)
{
	cout<<s[counter]<<endl;	
}
break;
default:	
	cout<<"please enter proper choice"<<endl;
	

}	
}
getch();
return 0;	
}


template <typename T1 >void b_sort(T1 u [] , int k)
{
	int x,y;
for (  x = 0 ; x <k - 1 ; x ++ )
{
for ( y =k - 1 ;x <y ;y --)
if ( u [y]<u [y-1]) // checks successive numbers
{
T1 p ;
p = u [y]; //assigns to temprary variable
u [y]= u [y-1]; // exchange of elements
u [y-1]= p ;	
	
}
}
}


