package HomeworkChapter20;

import java.util.HashMap;
import java.util.Map;

public class Homework2 {
		   public static void main(String[] args) 
		   {
		      // create arrays of Integer, Double and Character
		      Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8};
		      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		      Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

		      System.out.print("Array integerArray contains:\n");
		      printArray(integerArray); // pass an Integer array 
		      System.out.printf("\nArray doubleArray contains:\n");
		      printArray(doubleArray); // pass a Double array
		      System.out.printf("\nArray characterArray contains:\n");
		      printArray(characterArray); // pass a Character array
		   } 

		   // generic method printArray
		   public static <T> void printArray(T[] inputArray) {
		      // display array elements
		      for (T element : inputArray)
		         System.out.printf("%s ", element);

		      System.out.println();
		   }
		   
		   public static void printArray(Integer[] inputArray) {
			   
			   Map <Integer, String> intStr = new HashMap <Integer, String>(); 
			   intStr.put(1, "one"); intStr.put(2, "two"); intStr.put(3, "three"); intStr.put(4, "four"); intStr.put(5, "five");
			   intStr.put(6, "six"); intStr.put(7, "seven"); intStr.put(8, "eight"); intStr.put(9, "nine"); intStr.put(10, "ten");
				 
			   for (int element : inputArray) {
				   System.out.printf("%s ",intStr.get(element));
				   if (element % 4 == 0)
					   System.out.println();
			   }
		   }
		   
		}

//20.6 (Overloading a Generic Method with a Nongeneric Method)) Overload generic method
//printArray of Fig. 20.3 with a nongeneric version that specifically prints an array of Strings in neat,
//tabular format, as shown in the sample output that follows:
//
//Array stringArray contains:
//one two three four
//five six seven eight