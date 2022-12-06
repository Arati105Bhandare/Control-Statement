package com.test.control;

public class NestedSwitch {
	
	public static void main(String[] args) {
		int allSweets=4;
		int iceCream=3;
		char MalaiBarfi= 'M';   
		char CustuardApple='C';
		switch (allSweets)  {
		case 1 :{
			System.out.println("Amul Kulfi");
		}
		break;
		case 2:
			
		switch (iceCream)  {  
		case 1 : {
		System.out.println("Chocklate");
		}
		break;
		case 2:  {
			System.out.println("Strwaberry");
		}
		break;
		case 3:  {
			System.out.println("Custuard Apple");
		}
		break;
		default: {  System.out.println("Not eat ice cream");
		}
		}
		case 3: { 
			System.out.println("Gulab Jamun");
		}
		break;
	
		case 4: {
			System.out.println("Anjeer Barfi");
		}
        break;
        default : {System.out.println("Dont like Sweets");

        }

		}
		}
	}