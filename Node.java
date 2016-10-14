class Node{
	
	Node next,prev;
	int pageNumber;
 
    public int getPageNumber() {
        return pageNumber;
    }
 
    public void setPageNumber(int data) {
        this.pageNumber = data;
    }
     
    public Node getPrev() {
        return prev;
    }
 
    public void setPrev(Node prev) {
        this.prev = prev;
    }
 
    public Node getNext() {
        return next;
    }
 
    public void setNext(Node next) {
        this.next = next;
    }
     
    public String toString() {
        return pageNumber + "  ";
    }
}