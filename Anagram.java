
public class Anagram {

	public static void main(String[] args) {
		anagram("melon", "lemon");	
		anagram("tom", "brady");
		anagram("kemba", "walker");
	}
	
	//given two strings, this will print out how many letters need to be added to either string
	//so that they will be anagrams of each other
	public static void anagram(String A, String B) { 
		
		if(A.equals(B)) {
			System.out.println("0");
			return;
		}
		
		String str1 = A+B;
		String str = str1.toLowerCase();
	
        char[] stringArr = new char[str.length()];

		for (int i = 0; i < str.length(); i++) { 
            stringArr[i] = str.charAt(i); 
 
        }

		int oddCount = 0;
        for (int i = 0; i < stringArr.length; i++) { 
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
