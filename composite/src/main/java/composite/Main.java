package composite;

import java.util.ArrayList;

import composite.tree.Element;
import composite.tree.Leaf;
import composite.tree.Node;

public class Main {

	static public void main(String[] args) {
		
		var root = new Node();
		var rootChildren = new ArrayList<Element>();
		var childNode = new Node();
		var childChildren = new ArrayList<Element>();
		
		childChildren.add(new Leaf());
		childChildren.add(new Leaf());
		childNode.setChildren(childChildren);
		
		rootChildren.add(new Leaf());
		rootChildren.add(childNode);
		
		root.setChildren(rootChildren);
		
		root.printCounter();
		
		root.inc();
		root.inc();
		root.inc();
		
		System.out.println();
		
		root.printCounter();
		
		
		
		
		
		

	}

}
