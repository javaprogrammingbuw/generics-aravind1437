
public class Main {
	public static void main(String[] args) {
		Node<String> n = new Node<>(new String("A"));
		DCList<String> list = new DCList<>();
		list.add(n);
		list.add(new Node<>(new String("S")));
		list.add(new Node<>(new String("A")));
		list.add(new Node<>(new String("I")));
		System.out.println(list.size());
		System.out.println(list.getFirst().getValue());
		list.getClass();
		list.display();
		System.out.println(list.getLast().getValue());
		list.removeLast();
		list.display();
		list.removeFirst();
		list.display();
		list.removeFirst();
		list.display();
		list.remove(n);
		list.display();
	}
}