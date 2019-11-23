
public class Anagram {

	public static void main(String[] args) {
		anagram("melon", "lemon"); //will print 0	
		anagram("tom", "brady"); //will print 8
		anagram("kemba", "walker"); //will print 5
	}
	
	//given two strings, this will print out how many letters need to be added to either string
	//so that they will be anagrams of each other
	public static void anagram(String A, String B) { 
		
		if(A.equals(B)){
		   System.out.println("0");
	       return;
		}
		
		String str1 = A+B; //concatenates the strings
		String str = str1.toLowerCase(); //makes the string all lowercase
	
        char[] stringArr = new char[str.length()]; //creates an array of characters

		for (int i = 0; i < str.length(); i++) { //fills the array with each character from the string
            stringArr[i] = str.charAt(i); 
        }

		int oddCount = 0;
        for (int i = 0; i < stringArr.length; i++) { //nested for loop counts if there is an odd number of a character in the array
            int count = 0; 
            for (int j = 0; j < stringArr.length; j++) { 
                if (stringArr[i] == stringArr[j]) 
                    count++; 
            } 
            if (count % 2 != 0) {
                oddCount++; 	
            }
        } 
        System.out.println(oddCount);      
	}
}
