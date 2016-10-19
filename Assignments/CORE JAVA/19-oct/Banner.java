public class Banner{
	public static void main(String args[]) throws Exception{
			
		StringBuffer sb = new StringBuffer("Welcome to JAVA ");
		StringBuffer temp = sb;
		int len;
		while(true){
			System.out.println(temp);
			char ch = sb.charAt(0);
			len =  sb.length();
			sb.substring(1,len);
			sb.deleteCharAt(0);
			sb.append(ch);			
			Thread.sleep(1000);
		}
	}
}