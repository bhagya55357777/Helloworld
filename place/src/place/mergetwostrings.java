package place;

public class mergetwostrings {

	public String mergealternatively(String word1,String word2) {
		int m=word1.length();
		int n=word2.length();
		StringBuilder result=new StringBuilder();
		int i=0,j=0;
		System.out.println("enter the first string:+word1");
		System.out.println("enter the second string:+word2");
		while(i<m ||j<n) {
			if(i<m) {
				result.append(word1.charAt(i++));
			}
			if(j<n) {
				result.append(word2.charAt(j++));
			}
			
				
			
		}
		return result.toString();
		

	}

}
