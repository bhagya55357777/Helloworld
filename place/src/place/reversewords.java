package place;

public class reversewords {
	public static String ReverseWords(String s) {
		s=s.trim();
		String[] words=s.split("\\s+");
		StringBuilder reversed=new StringBuilder();
		for (int i=words.length-1;i>=0;i--) {
			reversed.append(words[i]);
			if(i!=0){
				
				reversed.append(" ");
			}
		}
		return reversed.toString();
		
		
	}

	
	public static void main(String[] args) {
		String input = "  the sky is blue  ";
		String result = ReverseWords(input);
		System.out.println(result);
}




}