package place;

public class stringcompression {
	public static String compress(String str) {
		if( str==null || str.length()==0) {
			return str;
		}
		StringBuilder compressed=new StringBuilder();
		int countConsecutive=0;
		for(int i=0;i<str.length();i++) {
			countConsecutive++;
			if (i+1>=str.length()||str.charAt(i)!=str.charAt(i+1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive=0;
			}
			
				
		}
		return compressed.length()<str.length()? compressed.toString():str;
	}
	public static void main(String[] args) {
        String input1 = "aabcccccaaa";
        String input2 = "abc";
        String input3 = "aa";
        
        System.out.println(compress(input1)); // Output: a2b1c5a3
        System.out.println(compress(input2)); // Output: abc
        System.out.println(compress(input3));

}
}
