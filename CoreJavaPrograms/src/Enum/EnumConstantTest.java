package Enum;

public class EnumConstantTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Months month = Months.APRIL;
		//toString() is overridden of Object class to print constant names in Enum class.   
		System.out.println("Month is : "+month+" and no of days is : " +month.days);

	}

}
