    
  public class DCList<H> {
	
	private Node <H> head;
		
  public boolean isEmpty() {
     if(head == null) { 
     return true;
     }
     return false;
  }
  //Intendation!
  public void display() {
		//This does not work properly, because you print the memory reference as a String. What you want is the actual value as a String.
	 for(Node <H> i=head; i!= null; i=i.getNextNode()) {
	 System.out.print(i.toString());
	 }
		
  }
  
  public void add(int position, Node<H> value) {

	  if(value != null && position<size() && position >=0) {
	  if(position==0) {
      value.setNextNode(head);
      head.setPrevious(value);
      head = value;
      } 
      Node<H> oldNode = get(position);
      oldNode.getPreviousNode().setNextNode(value);
      value.setPrevious(oldNode.getPreviousNode());
      oldNode.setPrevious(value);
      value.setNextNode(oldNode);
      value.position= position;
      for(Node<H> i =value.getNextNode(); i!=null; i=i.getNextNode()) {
      i.position ++;
      }
      }
  }
  public void add(Node<H> value) {
    
	  int position = size();
	  if(head != null) {
      Node<H> last = get(size()-1);
      last.setNextNode(value);
      value.setPrevious(last);
      }else {
      head = value;
      }
      value.position=position;
      }
  public void remove(Node<H> value) {
      
	  if(value != null && value.position>=0 && value.position<size()-1  ) {
      value.getNextNode().setPrevious(value.getPreviousNode());
      value.getPreviousNode().setNextNode(value.getNextNode());
      }
	  }
  public void removeFirst() {
      
	  if(head != null) {
      if(size()>=2) {
      head = head.getNextNode();
      head.setPrevious(null);
      }else if(size() == 1) {
      clear();
      }else {
      System.out.println("Empty List");
      }
      }
  }
  public void removeLast() {
      
	  if(size()>=2) {
      Node<H> c =get(size()-2);
      c.setNextNode(null);
      }else if(size()==1) {
      clear();
      }else{
    	  System.out.println("Empty List");
      }
  }
  public void clear() {
      
	  head = null;
	  }
  public Node<H> getFirst(){
      
	  return head;
	  }
  public Node<H> getLast(){
      
	  return get(size()-1);
	  }
  public Node<H> get(int position){
      
	  Node<H> i = head;
      for( i=head; i!=null; i=i.getNextNode()) {
      if(i.position == position) {
      break;
      }
   }
      return i;
}
  public int find(H value) {
      
	  for( Node<H> i=head; i!=null; i=i.getNextNode()) {
      if(i.getValue()==value) {
      return i.position;
   	  }
      }
      return -1;
      }
  public boolean contains(H value) {
      
	  for(Node<H> i=head; i!=null; i=i.getNextNode()) {
      if(i.getValue()==value) {
      return true;
      }
      }
	  return false;
	  }
  public int size() {
      int x=0;
      for(Node<H> i=head; i!=null; i=i.getNextNode()) {
      x++;
      }
      return x;		
   }
}
