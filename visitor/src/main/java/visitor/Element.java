package visitor;

public interface Element {
	String accept(Visitor visitor);
}
