public class MutableOP{
	public static void main(String args[]){
		String s1 = "ABC";
		System.out.println("HASHCODE of S1 before APPENDING :" +s1.hashCode());
		s1 = s1 + "PQR";
		System.out.println("HASHCODE of S1 after APPENDING :" +s1.hashCode());
		
		StringBuffer sb = new StringBuffer("ABC");
		System.out.println("HASHCODE of SB before APPENDING :" +sb.hashCode());

		sb.append("PQR");
		System.out.println("HASHCODE of SB before APPENDING :" +sb.hashCode());
	}
}