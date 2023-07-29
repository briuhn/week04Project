package week04Project;

public class Week04Project {

	public static void main(String[] args) {
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93}; // created an array
		int subtractArr = ages[ages.length-1] - ages[0]; //took the last number in the array and subtracted from the first num
		System.out.println(subtractArr); // printed out the sum
		
		int newAges[] = {3, 9, 23, 64, 2, 8, 28, 93 , 100}; // new array with 1 more number
		int newSubAges = newAges[newAges.length-1] - newAges[0]; // used the same equation i had in the first part to show it works
		System.out.println(newSubAges);
		
		double sum = 0; // created new variables to be able to get sum
		double average = 0;
		for (int i : ages) { // for loop having i in ages
			sum += i; // sum = sum + i;
			average = sum / ages.length; // have total sum divided by however many there is in ages.
		}
		
		System.out.println(average);
		
		
		System.out.println("--------");
		
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; // created a new array of String.
		double sumNames = 0; // new variables to create an average
		double averageNames = 0; 
		for (String name : names) { // for loop to go through each name in names arr
			sumNames += name.length(); //sumNames + however many there is in name inside the loop.
			averageNames = sumNames / name.length(); // took the total of sumNames and divide by however much there is in name
		}
		System.out.println(averageNames);
		
		for (String name : names) { // for loop having to go through each name in names arr
			System.out.print(name.concat(" ")); //each name that it went through i used the .concat method to put the words together just had to add the space in between
		}
		System.out.println("");
		System.out.println("----Question 4----");
		int last = names.length-1; //.length is used to pinpoint specific places in the array.
		String lastInArray = names[last]; // code to find the last name in the array.
		System.out.println(lastInArray);
		//it would be the name of the array and then .length - 1 for int.
		
		
		
		System.out.println(names[0]);
		//whenever you type the name array immediately follows [0] since 0 is always the first position.
		
		System.out.println("----Question 5----");
		int nameLengths[] = new int[names.length]; //line to have the previous array be put in the new array.
		for (int i = 0; i < names.length; i++) { // for loop initiated i as 0, i is less than names.length, increment by 1
			nameLengths[i] = names[i].length();// calculate and store the length of each name the names arr into the nameLength arr
		}
		for(int length : nameLengths) { // enhanced for loop to iterate through the nameLengths arr
			System.out.print(length + " "); //used to insert a space in between the numbers
		}
		
		
		
		System.out.println("");
		System.out.println("----Question 6-----");
		
		int sumQ6 = 0; //initiated a new variable just called it sumQuestion6
		for (int length : nameLengths) { //same for loop as before to iterate through the nameLengths arr
			sumQ6 += length; // add the length of each name to calculate the total sum of name lengths
		}
		System.out.println(sumQ6);
		
		System.out.println("----Question 7-----");
		String word = "Hello"; // initiated both variables needed for this code
		int numTimes = 4;
		System.out.println(repeatedWord(word, numTimes));
		
		
		System.out.println("----Question 8----");
		String firstName = "Lebron"; //initiated both first and last names
		String lastName = "James";
		System.out.println(names(firstName,lastName)); // calling the method to be printed out
		
		
		
		System.out.println("----Question 9----");
		int arr[] = {10,25,8,30}; // new array
		System.out.println(isGreaterThan100(arr)); // calling method and also including which array i want to use
		
		System.out.println("----Question 10----");
		double arr2[] = {20.5, 30.6, 33, 21.4,85}; // made new array
		System.out.println(averageOfAll(arr2)); // calling method and also including which array i want to use
		
		System.out.println("----Question 11----");
		double arr3[] = {12.6, 19.2, 65, 22, 10}; // one more array, if i wanted to use another array i can make one right below this one
		System.out.println(twoArraysOfDouble(arr2, arr3)); // i used the same array as previous question just for times sake 
		
		System.out.println("----Question 12----");
		boolean isHotOutside = true; // in this case i put isHotOutside as true
		double moneyInPocket = 11.5; // using 11.5 to be over 10.5
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket)); // calling method and which variables i am using
		
		System.out.println("----Question 13----");
		System.out.println(numberToWords(8)); // calling out the method and i chose the number eight
		
		
	}
	
// question 7
	public static String repeatedWord(String word, int numTimes) {//method is taking a string and also an int but is returning the string
		String repeatedWord = ""; //placeholder string
		for (int i = 0; i < numTimes; i++) { //we are looping the 'numTimes' to repeat however much we are told
			repeatedWord += word; //adding the word to the 'repeatedWord' string during each iteration
		}
		return repeatedWord; //return our final string
	}
	
	// question 8
	public static String names(String firstName, String lastName) { // we are taking in two strings firstName and lastName
		String fullName = firstName + " " + lastName; // adding a new string fullName to concat the two inital Strings we got.
		return fullName; //returning the fullname to print out in main method.
	}
	
	// question 9
	public static boolean isGreaterThan100(int arr[]) { //since we are returning something that is true it has to be a boolean.
		int sum = 0; // initating a new variable
		for (int num : arr) { //going through each number in my arr array
			sum += num; //calculating the total sum
		}
		return sum > 100; // returning true if the sum is greater than 100, otherwise its false
	}
	
	//question 10
	public static double averageOfAll(double arr2[]) { // method is going to have to be double
		double sum = 0; // initiate
		for(double num : arr2) { // going through each number in the array i created
			sum += num; // calculating the total sum
		}
		return sum / arr2.length; //return the average by dividing the total length of arr2
	}
	
	//question 11
	public static boolean twoArraysOfDouble(double arr2[], double arr3[]) {
		
		double sum2 = 0; //used the same for loop in this question as the previous just made it into a new variable to hold the number since its a new method
		for(double num : arr2) {
			sum2 += num;
		}
		
		double sum3 = 0; //did the same for loop for the new array to find the average of that array
		for(double num : arr3) {
			sum3 += num;
		}
		
		double average2 = sum2 / arr2.length; //dividing each total sum by their own array length
		double average3 = sum3 / arr3.length;
		
		return average2 > average3; // returning true if the first array average is greater than the second array
	}
	
	//question 12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { // the method name is called willBuyDrink while its taking in a
		// boolean if its hot outside and how much money is in pocket
		return isHotOutside && moneyInPocket > 10.5; // returning both isHotOutside and moneyInPocket is more than 10.5
	}
	
	
	//question 13
	public static String numberToWords(int number) { //i chose to do is having an input of an int and having it write out the word version of that number
		String translate = "";
		if (number == 1){
			translate = "One";
		}else if (number == 2) {
			translate = "Two";
		}else if (number == 3) {
			translate = "Three";
		}else if (number == 4) {
			translate = "Four";
		}else if (number == 5) {
			translate = "Five";
		}else if (number == 6) {
			translate = "Six";
		}else if (number == 7) {
			translate = "Seven";
		}else if (number == 8) {
			translate = "Eight";
		}else if (number == 9) {
			translate = "Nine";
		}else {
			System.out.println("That number is not recogizable just yet!"); // if the number is outside what i have it will write this
		}
		return translate; //return whichever number is chosen
	}
	

}