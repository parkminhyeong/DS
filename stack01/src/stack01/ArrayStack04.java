package stack01;

public class ArrayStack04 {

}
public E pop() {
	if (isEmpty()) throw new EmptyStackException();
	E item = s[top];
	s[top--] = null;
	if (size() > 0 && size()==s.length/4)
		resize(s.length/2);
	return item;
}
}