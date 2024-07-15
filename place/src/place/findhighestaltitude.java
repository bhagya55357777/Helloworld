package place;

public class findhighestaltitude {
	public static void main(String []args) {
		int [] altitudes= {4500, 6000, 3000, 7200, 5400, 8848};
		int highest= highestaltitude(altitudes);
		System.out.println("the highest altitude is"+highest+"in meters");
	}
	public static int highestaltitude(int[]altitudes) {
		int highest=Integer.MIN_VALUE;
		for(int altitude:altitudes) {
			if(altitude>highest) {
				highest=altitude;
			}
		}
		return highest;
	}

}
