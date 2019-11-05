package algoProgram2;

public class Main
{

	public static void main(String[] args)
	{
		ArrayBasedStack foo = new ArrayBasedStack();
		foo.push(2);
		foo.push(4);
		foo.push(5);
		foo.push(6);
		foo.push(8);
		foo.push(10);
		foo.push(12);
		System.out.println(foo.peek());
		System.out.println(foo.pop());
		System.out.println(foo.peek());
		System.out.println(foo.pop());
		System.out.println(foo.peek());
		System.out.println(foo.pop());
		System.out.println(foo.peek());
		System.out.println(foo.pop());
		System.out.println(foo.peek());
		System.out.println(foo.pop());
		System.out.println(foo.peek());
		System.out.println(foo.pop());
		System.out.println(foo.peek());
		System.out.println(foo.pop());
	}

}
