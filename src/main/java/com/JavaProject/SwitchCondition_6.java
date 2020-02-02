package com.JavaProject;

public class SwitchCondition_6 {
	public String getMonthNumber(int month) {

		String monthName;

	

		switch (month) {
		case 1:
			monthName = "january";
			break;
		case 2:
			monthName = "february";
			break;
		case 3:
			monthName = "march";
			break;
		case 4:
			monthName = "april";
			break;
		case 5:
			monthName = "may";
			break;
		case 6:
			monthName = "june";
			break;
		case 7:
			monthName = "july";
			break;
		case 8:
			monthName = "august";
			break;
		case 9:
			monthName = "september";
			break;
		case 10:
			monthName = "october";
			break;
		case 11:
			monthName = "november";
			break;
		case 12:
			monthName = "december";
			break;
		default:
			monthName = "this is not a valid months number";
			break;
		}

		return monthName;
	}

	public static void main(String[] args) {
		SwitchCondition_6 mon = new SwitchCondition_6();
		String d = mon.getMonthNumber(1);
		System.out.println(d);
		
	}

}
