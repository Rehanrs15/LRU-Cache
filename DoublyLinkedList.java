public class DoublyLinkedList{
	
	Node head,tail;
	int CurrentSize;
	public final int size;
	public DoublyLinkedList(int size){
		head = null;
		tail = null;
		this.size = size;
		CurrentSize = 0;
	}

	public Node addPageToHead(int pageNumber){
		Node page = new Node();
		page.pageNumber = pageNumber;
		page.next = null;
		page.prev = null;
		
		//add page to head of the list
		/*
			*check if list of null -> no pages present in the list

			*if already pages present in the list
				head->prev = page
				page->next = head
				head = page
		*/

		if (head == null){	//if list is empty
			head = page;
			tail = page;
			CurrentSize = 1;
			return page;
		}
		else if (CurrentSize < size) {	//if currentlist sise is less tha SIZE, add page to head of the list
			head.prev = page;
			page.next = head;
			head = page;
			CurrentSize++;
			return page;
		}
		else{

			/* 
				if list is not empty
					* delete the last node
					* add page to head of the node
			*/

			tail = tail.prev;
			tail.next = null;
			head.prev = page;
			page.next = head;
			head = page;
			return page;
		}

	}

	public void movePageTOHead(Node page){
		/*
			* check page is null
			* check page is head node
			* if any of the is true then return
		*/
		if (page == null || page == head) {
			return;
		}

		if (page == tail) {
			tail = tail.prev;
			tail.next = null;
		}


		/*
			* remove page from ites initial position
		*/
		Node pageprev = page.prev;
		Node pagenext = page.next;
		pageprev.next = pagenext;

		if (pagenext != null) {
			pagenext.prev = pageprev;
		}

		/*
			* add page to head of the list
		*/
		page.prev = null;
		page.next = head;
		head.prev = page;
		head = page;

	}



	public void printList() {
        if(head == null) {
            return;
        }
        Node tmp = head;
        while(tmp != null) {
            System.out.print(tmp);
            tmp = tmp.getNext();
        }
    }
 

	public Node getTail() {
	        return tail;
	}

	public int getCurrSize() {
        return CurrentSize;
    }
 
    public void setCurrSize(int currSize) {
        this.CurrentSize = currSize;
    }
 
    public Node getHead() {
        return head;
    }
 
    public void setHead(Node head) {
        this.head = head;
    }
 
    public int getSize() {
        return size;
    } 

}