/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        int f=0;
      Stack<Integer> abc = new Stack<Integer>();
      Node temp=head;
      while(temp!=null)
      {
         abc.push(temp.data); 
         temp=temp.next;
      }
      temp=head;
      while(temp!=null)
      {
          if(temp.data!=abc.pop())
          {f=1;
          break;}
          temp=temp.next;
      }
      if(f==0)
      return true;
      else
      return false;
    }    
}

