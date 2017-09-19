package Enum;

public class EnumWithSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Months month = Months.JUNE;
		switch(month){
		case JANUARY : System.out.println("Thish is January");
		break;
		case FEBRUARY : System.out.println("Thish is February");
		break;
		case MARCH : System.out.println("Thish is March");
		break;
		case APRIL : System.out.println("Thish is April");
		break;
		case MAY : System.out.println("Thish is May");
		break;
		case JUNE : System.out.println("Thish is June");
		break;
		case JULY : System.out.println("Thish is July");
		break;
		case AUGUST : System.out.println("Thish is August");
		break;
		case SEPTEMBER : System.out.println("Thish is September");
		break;
		case OCTOBER : System.out.println("Thish is October");
		break;
		case NOVEMBER : System.out.println("Thish is November");
		break;
		case DECEMBER : System.out.println("Thish is December");
		break;
		default :System.out.println("Invalid Month Name.");
		}

	}

}
