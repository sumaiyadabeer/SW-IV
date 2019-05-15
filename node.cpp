#include<iostream>
//#include<conio>


using namespace std;
class node {
public:
int val;
node *left;
node *right;
};
int getvalue(){
	int value;
	cout<<"enter value of node"<<endl;
	cin>>value;
	return value;
	
	
}
void insert(node *n){
	int ch,value;
		node *nn=new node ();
//	node *nn;
	cout<<"1:letf to "<<n->val<<endl;
	cout<<"2:right to "<<n->val<<endl;	
	cin>>ch;
	if (ch==1){
		if(n->left==NULL){
		nn->val=getvalue();
		cout<<"null is not found"<<endl;
		n->left=nn;
		return;
		}
		

		else{
		}
		insert( n->left);
	}else{
		if(n->right==NULL){
		nn->val=getvalue();
		n->right=nn;
			return;	
		}

		else{
		}
		insert( n->right);
	}
	
}

 void  postorder(node*n) {
		
	 if (n->left != NULL ) postorder(n->left);
	 if (n->right != NULL ) postorder(n->right);
	   cout<<" "<<n->val<<endl;
	  }

int main()
{
	node *root=new node ();
//node *root;
root->val=1;
cout<<root->val<<endl;

insert(root);
insert(root);
insert(root);
insert(root);
insert(root);
//cout<<root->left->val;

postorder(root);

return 0;
}
