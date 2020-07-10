/********************************************
Given nodes of linked list - 10 20 4 30
node to be deleted- 20
head pointer is not given , so on removing 20, linked list would be- 10 4 30

****************************************/
/*
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/

// This function should delete node from linked list. The function
// may assume that node exists in linked list and is not last node
// node: reference to the node which is to be deleted
class GfG
{
    void deleteNode(Node node)
    {
    Node previous=node;
    while(node.next!=null)  // 1 2 3 4 5   1 2 4 4 5  1 2 4 5 5 
    {
        node.data=node.next.data;
        previous=node;
        node=node.next;
    }
    previous.next=null;
    
    
    }
}

