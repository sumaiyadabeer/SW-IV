
#include<cstring>
#include<iostream>

using namespace std;
 void MergeSort(int arr[] ,int n);
 void Merge(int arr1[],int arr2[],int arr[],int s1,int s2,int s3);

int main()
{  int ch;
   cout<<"WHAT DO U WANT"<<endl<<"1:merging"<<endl<<"2:mergesort";
   cin>>ch;
   switch (ch){
   	case 1:
   			int s1,s2;
	cout<<"enter no of element in first arr"<<endl;
	cin>>s1;
		int arr1[s1];
	for(int i=0;i<s1;i++)
	cin>>arr1[i];
    cout<<"enter no of element in second arr"<<endl;
	cin>>s2;
		int arr2[s2];
	for(int i=0;i<s2;i++)
	cin>>arr2[i];


	int arr3[s1+s2];
//	int s3=s1+s2;
	int ch2;
	cout<<"YOU ENTERED SORTED ARRAYS??"<<endl<<"1:yes"<<endl<<"2:no";
	cin>>ch2;
	if(ch2==2){
 	MergeSort(arr1 ,s1);
 	 MergeSort(arr2 ,s2);
  	cout<<"sorted arrays are"<<endl;
	}
	for(int i=0;i<s1;i++)
	cout<<arr1[i]<<" ";
		cout<<endl;
		for(int i=0;i<s2;i++)
	cout<<arr2[i]<<" ";
	cout<<endl;
		cout<<endl;
			cout<<endl;
	 Merge( arr1,arr2, arr3, s1, s2, s1+s2);
	for(int i=0;i<s1+s2;i++)
	cout<<arr3[i]<<endl;

   		break;



	case 2:

			int n;
	cout<<"enter the no of element"<<endl;
	cin>>n;
		int arr[n];
		//cout<<1%2<<endl;
	for(int i=0;i<n;i++)
	cin>>arr[i];
 MergeSort(arr ,n);
 	cout<<endl;
		cout<<endl;
			cout<<endl;

	for(int i=0;i<n;i++)
	cout<<arr[i]<<endl;
	break;
	default:
   	cout<<"please enter valid choise n try again";


   }



return 0;
}

 void MergeSort(int arr[] ,int n)
 {
 	//int n;
 	//n=strlen(arr);
 ///	cout<<n;

 	if(n<2)
 	return;

 	int i=n;


 	int sz1;
 	if(n%2){
 		//odd
 		sz1=n/2+1;

 	}else{
 		//even
 		sz1=n/2;

 	}
 	int s1=sz1;
 	int sz2;
 	if(n%2){
 		sz2=n-n/2-1;

 	}else{
 		sz2=n-n/2;

 	}
 	int s2=sz2;
 	int arr1[sz1];
 //int j=n/2;
sz1--;
 i--;
 	do{
 	//	cout<<"i is first "<<i<<"sz1 is "<<sz1;
 	arr1[sz1]=arr[i];
	  //	cout<<arr1[sz1]<<endl;
 	 i--;
 		sz1--;


 	}while(sz1>=0);

 	int arr2[sz2];
 	sz2--;
 	//cout<<"out of loop"<<endl;
 	do{
 	//		cout<<"i is second"<<i;
 	arr2[sz2]=arr[i];
 //	cout<<arr2[sz2]<<endl;
 		i--;
 		sz2--;

 	}while(sz2>=0);
 	/*cout<<".......1"<<endl;
 	for(int i=0;i<s1;i++)
	cout<<arr1[i]<<endl;
	cout<<".......2"<<endl;
		for(int j=0;j<s2;j++)
	cout<<arr2[j]<<endl;*/
MergeSort(arr1,s1);
 MergeSort(arr2,s2);
Merge(arr1,arr2,arr,s1,s2,n);

 }

  void Merge(int arr1[],int arr2[],int arr[],int s1, int s2, int s3)
{
int apt=0,bpt=0,cpt=0;
int alt,blt,clt;
alt=s1-1;
blt=s2-1;
clt=s3-1;

//cout<<s1<<s2<<s3<<"......"<<endl;
if(s1+s2<s3)
	{
  	cout<<"BOUND INCOMPATIBLE"<<endl;
  	return;
    }

  	for(cpt=0;apt<=alt&&bpt<=blt;cpt++)
  	{
  	 if(arr1[apt]<arr2[bpt]){
  		arr[cpt]=arr1[apt++];
  	//	cout<<"write frm 1 "<<arr[cpt]<<endl;
	  }
  	 else{

  		arr[cpt]=arr2[bpt++];
  	//	cout<<"write frm 2 "<<arr[cpt]<<endl;
		  }
  	}
  	//cout<<"apt is "<<apt<<"bpt is "<<bpt<<"cpt is cpt"<<cpt<<"alt is "<<alt<<"blt is "<<blt<<"clt is "<<clt<<endl;

  	while(apt<=alt){
  	  	arr[cpt++]=arr1[apt++];
  	  //	cout<<apt<<".."<<alt<<endl;
	//		cout<<" write in first arr"<<arr[cpt-1]<<endl;
  	}


  	while(bpt<=blt){
  		arr[cpt++]=arr2[bpt++];
  		//cout<<bpt<<".."<<blt<<endl;
  		//cout<<" write in second arr"<<arr[cpt-1]<<endl;
  	}




  }
