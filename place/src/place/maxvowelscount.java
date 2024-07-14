package place;

public class maxvowelscount {
public static int maxvowels(String s,int k) {
	String vowels="aeiou";
	int maxvowels=0;
	int currentvowels=0;
	
	for(int i=0;i<k;i++) {
		if(vowels.indexOf(s.charAt(i))!=-1) {
			currentvowels++;
		}
	}
	maxvowels=currentvowels;
		for(int i=k;i<s.length();i++) {
			if(vowels.indexOf(s.charAt(i-k))!=-1) {
				currentvowels--;
			
		
	}
			if(vowels.indexOf(s.charAt(i))!=-1) {
					currentvowels++;
				}
			maxvowels=Math.max(maxvowels,currentvowels);
	
}
		return maxvowels;
}
public static void main(String[] args) {
    String s = "abciiidef";
    int k = 3;
    System.out.println("Maximum number of vowels in a substring of length " + k + ": " + maxvowels(s, k)); // Output: 3
}
}
