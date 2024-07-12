package place;

public class reversevowels {
	public static String ReverseVowels(String s) {
		String vowels="aeiouAEIOU";
		char[] sArray=s.toCharArray();
		int left=0, right=sArray.length-1;
		while(left<right) {
			while(left<right && vowels.indexOf(sArray[left])==-1) {
				left++;
			}
			while(left<right && vowels.indexOf(sArray[right])==-1){
				right++;
			}
			char temp=sArray[left];
			sArray[left]=sArray[right];
			sArray[right]=temp;
			left++;
			right--;
		}
			return new String(sArray);
}
		public static void main(String[]args) {
			String input="hello";
			String result=ReverseVowels(input);
			System.out.println(result);
	}
}
