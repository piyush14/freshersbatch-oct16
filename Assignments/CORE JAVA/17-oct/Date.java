class Date{
	private int date;
	private int month;
	private int year;
	
	public Date(){
		this.date = 17;
		this.month = 10;
		this.year = 2016;
	}
	
	public Date(int date, int month, int year) {
		this.date = date;
		this.month = month;
		this.year = year;
	}
	
	public void setDate(int date, int month, int year){
		this.date = date;
		this.month = month;
		this.year = year;
		
	}
	
	public int getDate(){
		return date;
	} 
	public int getMonth(){
		return month;
	} 
	public int getYear(){
		return year;
	} 
	
	public static void swapDate(Date D1,Date D2){
		int tempDate;
		int tempMonth;
		int tempYear;
		
	/*	tempDate = D1.date;
		D1.date = D2.date;
		D2.date = tempDate;
		
		tempMonth = D1.month;
		D1.month = D2.month;
		D2.month = tempMonth;
		
		tempYear = D1.year;
		D1.year = D2.year;
		D2.year = tempYear;
		
		*/
		 Date temp = D1;
         D1 = D2;
         D2 = temp;
		
		
		System.out.println("AFTER SWAPPING  :");
		System.out.println("D1 values: "+" DATE "+D1.getDate() + " MONTH :"+D1.getMonth() +"YEAR :"+D1.getYear());
		System.out.println("D2 values: "+" DATE "+D2.getDate() + " MONTH :"+D2.getMonth() +"YEAR :"+D2.getYear());
		
	}
	
	public static void main(String args[]){
		
		Date D1 = new Date();
		//D1.setDate();
		Date D2 = new Date(10,10,2010);
		//D1.setDate(10,10,2010);
		
		System.out.println("D1 values: "+"DATE "+D1.getDate() + "MONTH :"+D1.getMonth() +"YEAR :"+D1.getYear());
		System.out.println("D2 values: "+"DATE "+D2.getDate() + "MONTH :"+D2.getMonth() +"YEAR :"+D2.getYear());
		
		Date.swapDate(D1,D2);
		
	}
}