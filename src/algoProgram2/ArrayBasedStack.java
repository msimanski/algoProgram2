package algoProgram2;

public class ArrayBasedStack
{
	private Integer[] stackArray;
	private int sizeOfStackArray;
	private int locationOfLast;
	
	public ArrayBasedStack() 
	{
		sizeOfStackArray = 5;
		locationOfLast = -1;
		// the default size for this will be 10
		stackArray = new Integer[sizeOfStackArray];
		// initialize array to default value of null
		clearStack();
	}
	
	/**
	 * sets values of entire array to null
	 */
	public void clearStack() 
	{
		for (int i = 0; i < stackArray.length; i++) 
		{
			stackArray[i] = null;
		}
	}
	
	/**
	 * doubles the size of the array as requested by the prompt
	 */
	public void doubleArray() 
	{
		// double the size of the array and initialize a dummy to cover for it
		sizeOfStackArray *= 2;
		Integer[] dummyStackArray = new Integer[sizeOfStackArray];
		// copy the contents of the old array to the new one
		System.arraycopy(stackArray, 0, dummyStackArray, 0, stackArray.length);
		stackArray = dummyStackArray.clone();
	}
	
	/**
	 * check to see is the array is full and double if needed
	 * move everything up by one then add the new unit to the array
	 * @param toBeAdded, the member to be added
	 */
	public void push(Integer toBeAdded) 
	{	
		// increment this, very important
		locationOfLast++;
		
		if (locationOfLast == sizeOfStackArray)
		{
			doubleArray();
		}
		
		stackArray[locationOfLast] = toBeAdded;
		System.out.println("Just pushed member " + toBeAdded + " to the stack.");
	}
	
	/**
	 * get one off the stack and return that one, nullify the old location
	 * @return, the popped member
	 */
	public Integer pop() 
	{
		Integer tempInteger = stackArray[locationOfLast];
		stackArray[locationOfLast] = null;
		locationOfLast--;
		
		return tempInteger;
	}
	
	/**
	 * get one off the stack and return that one
	 * @return, the peeked member
	 */
	public Integer peek() 
	{
		return stackArray[locationOfLast];
	}
}
