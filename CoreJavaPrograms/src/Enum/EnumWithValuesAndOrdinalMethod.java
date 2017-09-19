package Enum;

public class EnumWithValuesAndOrdinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Months[] mon =Months.values();
		for(Months  month : mon){
			System.out.println((month.ordinal()+1) +"   "+month+"    "+month.days);
			month.info();
		}

	}

}
