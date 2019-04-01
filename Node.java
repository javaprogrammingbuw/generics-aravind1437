
public class Node<K>{
	
	private Node<K> PreviousNode, NextNode;
	public int  position;
	private K value;
	
	public Node(K value) {
		this.value= value;
	}
	
	public String toString(K value) {
		return this.value.toString();
	}
	
	public void setNextNode(Node<K> NextNode) {
		this.NextNode= NextNode;
	}
	
	public void setPrevious(Node<K> PreviousNode) {
		this.PreviousNode=PreviousNode;
	}
	
	public Node<K> getNextNode(){
		return NextNode;
	}
	
	public Node<K> getPreviousNode(){
		return PreviousNode;
	}
	
	public K getValue() {
		return value;
	}
}