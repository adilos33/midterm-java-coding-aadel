package datastructure;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

		public class QueueExample {
			public static void main(String[] args) {
				// Create a Queue using LinkedList
				Queue<String> queue = new LinkedList<>();

				// Demonstrate Queue operations
				System.out.println("Queue operations:");

				// Add elements to the Queue
				queue.add("Element 1");
				queue.add("Element 2");
				queue.add("Element 3");

				String peekedElement = queue.peek();
				System.out.println("Peeked element: " + peekedElement);

				String removedElement = queue.remove();
				System.out.println("Removed element: " + removedElement);

				String polledElement = queue.poll();
				System.out.println("Polled element: " + polledElement);

				System.out.println("\nRetrieving elements using For Each loop:");
				for (String element : queue) {
					System.out.println(element);
				}

				queue.add("Element 4");
				queue.add("Element 5");

				System.out.println("\nRetrieving elements using while loop with Iterator:");
				Iterator<String> iterator = queue.iterator();
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}
			}






