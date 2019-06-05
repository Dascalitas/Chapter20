package HomeworkChapter20;

public class Homework1 {

	public static void main(String[] args) throws InvalidSubscriptException {
		// create arrays of Integer, Double and Character
		Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
		Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

		System.out.print("Array integerArray contains:\n");
		printArray(integerArray); // pass an Integer array
		System.out.printf("%nArray doubleArray contains:\n");
		printArray(doubleArray); // pass a Double array
		System.out.printf("%nArray characterArray contains:\n");
		printArray(characterArray); // pass a Character array
		
		System.out.print("\nArray integerArray with substring contains:\n");
		printArray(integerArray, 1, 4); // pass an Integer array
		System.out.printf("\nArray doubleArray with substring contains:\n");
		printArray(doubleArray, 1 , 5); // pass a Double array
		System.out.printf("\nArray characterArray with substring contains:\n");
		printArray(characterArray, 1, 4); // pass a Character array
	}

	// generic method printArray
	public static <T> void printArray(T[] inputArray) {
		// display array elements
		for (T element : inputArray)
			System.out.printf("%s ", element);

		System.out.println();
	}
	
	public static <T> void printArray(T[]inputArray, int lowSubscript, int hightSubscript) throws InvalidSubscriptException {
		// display array elements
		if (lowSubscript < 0)
			throw new InvalidSubscriptException("Incorrect low substring");
		
		if (hightSubscript > inputArray.length)
			throw new InvalidSubscriptException("Incorrect hight substring");
		
			for (int i = lowSubscript; i <= hightSubscript; i++) {
				System.out.printf("%s ", inputArray[i]);
			}
		
		
	}
}

//20.5 (Overloaded Generic Method printArray) Overload generic method printArray of
//Fig. 20.3 so that it takes two additional integer arguments, lowSubscript and highSubscript. A call
//to this method prints only the designated portion of the array. Validate lowSubscript and highSubscript.
//If either is out of range, the overloaded printArray method should throw an InvalidSubscriptException; 
//otherwise, printArray should return the number of elements printed. Then modify main to exercise both 
//versions of printArray on arrays integerArray, doubleArray and characterArray.
//Test all capabilities of both versions of printArray.