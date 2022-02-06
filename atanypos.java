import java.util.*;
class node
{   
    int data;
    node next;
    node(int data)
{
    this.data=data;
}
}

public class atanypos 
{   
    node head;
    public void insertAtBeg(int data)
    {
        node n=new node(data);
        if(head==null)
        {
            head=n;
        }
        else 
        {
            n.next=head;
            head=n;

        }
    }
    public int count()
    {
        node temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
    public void insertAtPos(int data,int pos)
    {
        node n=new node(data);
            if(head==null)
            {
                if(pos!=1)
                {
                    System.out.println("invalid output");
                }
                else
                {
                    head=n;
                }
            }
            else
            {
                if(pos==1)
                {
                    n.next=head;
                    head=n;
                }
                else if(pos>count()+1)
                {
                    System.out.println("invalid output");
                }
                else
                {
                    int c=1;
                    node temp=head;
                    while(temp!=null)
                    {
                        if(pos-1==c)
                        {
                        break;
                        }
                    c++;
                    temp=temp.next;
                }
                n.next=temp.next;
                temp.next=n;
            }
            }
        }

    public void printm()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        
    }
    public static void main(String args[])
    {
        atanypos obj=new atanypos();
        Scanner sc=new Scanner(System.in);
        System.out.println("loop input");
        int num=sc.nextInt();
        System.out.println("postion input");
        int postion=sc.nextInt();
        System.out.println("enter data");
        int extra=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            int number=sc.nextInt();
            obj.insertAtBeg(number);
        }
        obj.insertAtPos(extra, postion);
        obj.printm();
    }
}