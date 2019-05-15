import java.util.*;
class Bound
{
public int lb;
public int ub;
}
class n
{
public static int partitioni(int x[],int lb,int ub)
{
int down,up;
int a,temp;
a=x[lb];                       
up=ub;                              
down=lb;
while(down<up)
{
while(x[down]<=a && down<ub)
down++;
while(x[up]>a)
up--;
if(down<up)
{
temp=x[down];
x[down]=x[up];
x[up]=temp;
}
}
x[lb]=x[up];
x[up]=a;
return up;
}
public static void quicksorti(int x[])
{
int i,j;
Stack <Bound> bounds = new Stack <Bound>();
Bound newbounds=new Bound();
newbounds.lb=0;
newbounds.ub=x.length-1;
bounds.push(newbounds);
while(!bounds.empty())
{
newbounds=(Bound)bounds.pop();
while(newbounds.ub>newbounds.lb)
{
j=partitioni(x,newbounds.lb,newbounds.ub);
if(j-newbounds.lb>newbounds.ub-j)
{
Bound bndl=new Bound();
bndl.ub=j-1;
bndl.lb=newbounds.lb;
bounds.push(bndl);
newbounds.lb=j+1;
}
else
{
Bound bnd2=new Bound();
bnd2.ub=newbounds.ub;
bnd2.lb=j+1;
bounds.push(bnd2);
newbounds.ub=j-1;
}
}
}
}
public static int partitionf(float x[],int lb,int ub)
{
int down,up;
float a,temp;
a=x[lb];
up=ub;
down=lb;
while(down<up)
{
while(x[down]<=a && down<ub)
down++;
while(x[up]>a)
up--;
if(down<up)
{
temp=x[down];
x[down]=x[up];
x[up]=temp;
}
}
x[lb]=x[up];
x[up]=a;
return up;
}
public static void quicksortf(float x[])
{
int i;
int j;
Stack <Bound> bounds = new Stack <Bound>();
Bound newbounds=new Bound();
newbounds.lb=0;
newbounds.ub=x.length-1;
bounds.push(newbounds);
while(!bounds.empty())
{
newbounds=(Bound)bounds.pop();
while(newbounds.ub>newbounds.lb)
{
j=partitionf(x,newbounds.lb,newbounds.ub);
if(j-newbounds.lb>newbounds.ub-j)
{
Bound bndl=new Bound();
bndl.ub=j-1;
bndl.lb=newbounds.lb;
bounds.push(bndl);
newbounds.lb=j+1;
}
else
{
Bound bnd2=new Bound();
bnd2.ub=newbounds.ub;
bnd2.lb=j+1;
bounds.push(bnd2);
newbounds.ub=j-1;
}
}
}
}
public static void main(String[] args)
{ 
int sw;
Scanner Input = new Scanner(System.in);
System.out.println("1.Int");
System.out.println("2.Float");
System.out.println("Enter ur choice");
sw=Input.nextInt();
switch(sw)
{
case 1:
      int n1,i,size;
      System.out.println("enter the no. of elements");
      n1 = Input.nextInt();
      int[] ar=new int[n1];
      System.out.println("enter the elemnts");
      for(i=0;i<n1;i++)
      {
      ar[i]=Input.nextInt();
      }
      System.out.println("values before sorting are:");
      for(i=0;i<n1;i++)
      {
      System.out.println(" "+ar[i]);
      }
      quicksorti(ar);
      System.out.println("values after sorting are:");
      for(i=0;i<n1;i++)
      System.out.println(" "+ar[i]);
      break;

 case 2: 
       int n2,u,size2;
      System.out.println("enter the no. of elements");
      n2 = Input.nextInt();
      float[] arf=new float[n2];
      System.out.println("enter the elemnts");
      for(u=0;u<n2;u++)
      {
      arf[u]=Input.nextFloat();
      }
      System.out.println("values before sorting are:");
      for(u=0;u<n2;u++)
      {
      System.out.println(" "+arf[u]);
      }
      quicksortf(arf);
      System.out.println("values after sorting are:");
      for(u=0;u<n2;u++)
      System.out.println(" "+arf[u]);
      break;
default:
 System.out.println("wrong choice");
}
}
}






  

