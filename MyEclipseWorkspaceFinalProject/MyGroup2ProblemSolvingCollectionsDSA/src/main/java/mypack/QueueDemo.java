package mypack;

import java.util.*;

public class QueueDemo { // FIFO
	public static void main(String[] args) {

//		List<Integer> al = new ArrayList<Integer>();
//		
//		List<Integer> ll = new LinkedList<Integer>();
		
		
		Queue<Integer> qu = new PriorityQueue<Integer>();

		qu.add(10);
		qu.offer(20);
		qu.add(30);
		qu.add(40);
		qu.add(50);

		for (int item : qu) {
			System.out.print( item + " ");
		}
		
		System.out.println();
		
		System.out.println(qu.size());
		
		System.out.println(qu.remove());
		
		System.out.println(qu.size());
		
		System.out.println(qu.peek());
		
		System.out.println(qu.size());
		
	}
}

//what one DS can be used to represent every other DS? //arrays, arraylist, linkedlist, maps, stacks, queue, tree, graph
