package com.test.control;

public class Switch1 {

	public static void main(String[] args) {
		
		// by using string variable
		String levelString="Best";
		int level=0;
		switch (3) {
		case 1:{
		System.out.println("Good");
		}
		break;
		case 2:{
			System.out.println("Better");
		}
		break ;
		case 3:  {
			System.out.println("Best");
		}
		break;
		default : {
			System.out.println("Invalid input");
		}
	}
		
	}
}