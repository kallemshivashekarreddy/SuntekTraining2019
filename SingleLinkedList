#include<stdio.h>
#include<stdlib.h>
struct Node
{
    int data;
    struct Node *next;
    
};
struct Node *newnode,*head;
void insert(int position,int data);
void delete(int position);
void create(int d);
int position;
void display();
void main()
{
   int key,position;
   
    int cc;
     
     while(1)
     {
         printf("1.create 2.insert 3.delete 4.display 5.exit\n");
         scanf("%d",&cc);
     switch(cc)
     {
         
         case 1: printf("Enter element to create\n");
         scanf("%d",&key);
         create(key);
         
         break;
         case 2:printf("Enter element to insert at position\n");
          scanf("%d%d",&position,&key);
          insert(position,key);
         
         break;
          case 3:printf("Enter position to delete\n");
          scanf("%d",&position);
          delete(position);
         break;
         case 4:display();
         break;
          case 5:exit(0);
         break;
         
         default:printf("%d is invalid\n",cc);
         break;
         
     }
     }
}
void create(int d)
{
    
     newnode=(struct Node*)malloc(sizeof(struct Node));
    if(newnode!=NULL)
    {
        newnode->next=NULL;
        newnode->data=d;
        struct Node *temp;
        
       if(head==NULL)
       {
          
           head=newnode;
            printf("element created %d\n",d);
           
       }
       else
       {
          temp=head; 
          while(temp->next!=NULL)
          {
              temp=temp->next;
              
          }
          temp->next=newnode;
          printf("element create %d\n",d);
       }
        
        
        
    }
}

void delete(int pos)
{
     struct Node *temp;
     temp=head;
    for(int i=1;i<pos-1&&temp->next!=NULL;i++)
          {
            

              temp=temp->next;
          }
          if(temp->next!=NULL)
              temp->next  =temp->next->next;
              else
              printf("OUT OF RANGE DELETION\n");
              
}

void insert(int pos,int d)
{
    
    newnode=(struct Node*)malloc(sizeof(struct Node));
    if(newnode!=NULL)
    {
        newnode->next=NULL;
        newnode->data=d;
        struct Node *temp;
        
       if(pos==0&&head==NULL)
       {
           
          
          head=newnode;
            printf("element inserted at first %d\n",d);
       }
       else
       {
          temp=head; 
        for(int i=1;i<pos-1&&temp->next!=NULL;i++)
          {
              temp=temp->next;
              
          }
          
          newnode->next=temp->next;
          temp->next=newnode;
          printf("element inserted %d\n",d);
       }
}
}

void display()
{
    struct Node *temp;
    temp=head;
    while(temp->next!=NULL)
    {
        printf("\n element %d\n",temp->data);
        temp=temp->next;
    }
     printf("\n element %d\n",temp->data);
    
    
}


