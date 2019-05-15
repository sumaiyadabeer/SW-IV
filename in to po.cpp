
#include<stdio.h>
#include<conio.h>
#include<string.h>
# define MAX 20
char str[MAX],stack[MAX];
int top=-1;
void push(char c)
{
stack[++top]=c;
}
char pop()
{
return stack[top--];
}/*
void post_in()
{
int i,n;
char a,b,op;
printf("Enter the postfix expression\n");
gets(str);
gets(str);
n=strlen(str);
for(i=0;i<MAX;i++)
stack[i]=NULL;
printf("Infix expression is:\t");
printf("%c",str[0]);
for(i=1;i<n;i++)
{
if(str[i]=='+'||str[i]=='-'||str[i]=='*'||str[i]=='/')
{
b=pop();
//a=pop();
op=str[i];
printf("%c%c",op,b);
}
else
{
push(str[i]);
}
}
printf("%c",str[top--]);
}
void post_pre()
{
int i,n;
printf("Enter the postfix expression\n");
gets(str);
gets(str);
n=strlen(str);
printf("Prefix expression is:\t");
for(i=n-1;i>=0;i--)
printf("%c",str[i]);
}*/
void pre_in()
{
int n,i,j=0;
char a,b,op,rstr[10];
printf("Enter the prefix expression\n");
fflush(stdin);
gets(str);
//gets(str);
printf("string recorded is %s",str);
n=strlen(str);
for(i=0;i<MAX;i++)
stack[i]=NULL;
printf("Infix expression is:\t");
for(i=0;i<n;i++)
{
if(str[i]=='+'||str[i]=='-'||str[i]=='*'||str[i]=='/')
{
push(str[i]);
}
else
{
op=pop();
a=str[i];
rstr[j]=str[i];
rstr[j+1]=op;
j+=2;
printf("%c%c",a,op);
}
}
rstr[j]=str[top-1];
j++;
printf("%c",str[top--]);

printf("\n rstr is %s",rstr);
}
int main()
{
int opt;
//clrscr();
/*while(1)
{
printf("\n........MENU.......");
printf("\n\t1.Postfix to Infix\n\t2.Postfix to Prefix\n\t3.Prefix to Infix\n\t4.Exit\n");
scanf("%d",&opt);
/*switch(opt)
{
case 1:post_in();break;
case 2:post_pre();break;
case 3:pre_in();break;
case 4://exit();
default:printf("Invalid choice");break;
}
}*/
pre_in();
getch();
return 0;
}
