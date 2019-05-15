#include <iostream>
#include <cstring>
#include <stack>
#include<conio.h>


using namespace std;
int Max=20;
stack < char > s;
char str[30],stack[30];
int top=-1;


int getWeight( char ch) {
switch (ch) {
case '/' :
case '*' : return 2 ;
case '+' :
case '-' : return 1 ;
case '^' :return 3 ;
default : return 0;
}
}

void pre_in()
{
int n,i,j=0,k=0,l=0;
int weight,w=4;
char a,b,op,rstr[30];


cout<<"Enter the prefix expression\n"<<endl;
fflush(stdin);
cin>>str;
cout<<str<<endl;
n=strlen(str);
rstr[j]='(';
cout<<"Infix expression is:\t"<<endl;
for(i=0;i<n;i++)
{
//if(str[i]=='+'||str[i]=='-'||str[i]=='*'||str[i]=='/')
if(getWeight(str[i]))
{
s.push(str[i]);
}
else
{if(!s.empty())
op=s.top();
weight=getWeight(op);

s.pop();
/*if(l!=0){
	rstr[j]='(';
	j++;
}*/
a=str[i];
//cout<<"w is "<<w<<"wgt is "<<weight<<endl;
if(l!=0)
{
	rstr[j]='(';
	j++;
}
rstr[j]=str[i];
if(w<=weight)
{
	rstr[j+1]=')';
	j++;
	l=1;
}



rstr[j+1]=op;
j+=2;
w=weight;
cout<<a<<op;
}
}
rstr[j]=str[top];



rstr[j-1]='\0';

cout<<endl<<"infix expression is "<<"("<<rstr<<")"<<endl;

}
int main()
{


pre_in();
getch();
return 0;
}
