package edu.c2c.module1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 
 * begin 
 *   import scanner from java.util.
 *   declare constant for dollar to cent
 *   declare variable, check if the transaction needs to end
 *   declare the balance after a transaction
 *   while loop the transaction
 *   
 * declare billsValue variable that enter bill by user
 * declare coinsValue variable that enter coin by user
 * declare totalValue variable for store the total money that user input

 * check if user input 0, if yes the transaction will be ended.
 * if (totalValue == 0) {
 * 	isEnd = true;
 * 	break;
 * }

 * declare variable for checking if covered
		    check if the input totalValue covered all the items, if not disable the item(s)
		    for loop the the productMap to find if there is product not covered by user input money
 * for (int i = 1; i <= productsMap.values().size(); i++)
 * 	if (productsMap.get(i) > totalValue)
 * 		isCovered = false;
 * }

 * user has different options, if it's covered or not
 * 
 * declare product number option by user
 * check if user input 0, if yes the transaction will be ended.
 * if (productNumber == 0) {
 * 	isEnd = true;
 * 	balance = totalValue;
 * 	break;
 * }
 * option for user if input confirm or cancel
 * if user input cancel stop the transaction
 * 
 * Get the productValue = productsMap.get(productNumber);

 * calculate the balance = totalValue - productValue;
 * 
 *   print out the changes return
 * end  
 * 
 */
public class Mod1_Problem2 {

	private static Map<Integer, Integer> productsInMachine() {
		Map<Integer, Integer> productMap = new HashMap<>();
		productMap.put(1, 200);
		productMap.put(2, 350);
		productMap.put(3, 400);
		productMap.put(4, 500);
		productMap.put(5, 750);
	
		return productMap;

	}

	public static void main(String[] args) {

		//instance scanner
		Scanner in = new Scanner(System.in);
		// cover dollar to cent
		final int CENT_PER_DOLLAR = 100;
		Map<Integer, Integer> productsMap = productsInMachine();
		// declare variable, check if the transaction needs to end
		boolean isEnd = false;
		
		// declare variable for product cost
		Integer productValue = 0;
		// declare the balance after a transaction
		int balance = 0;
		// loop the transaction
		while (!isEnd) {
			
			//change line
			System.out.println("");
			
			System.out.println("Enter bills value (1,5) dollar ");
			// input bill by user
			int billsValue = in.nextInt();

			System.out.println("Enter coins value (25,10,5,1) cent ");
			// input coin by user
			int coinsValue = in.nextInt();

			// total input by user
			int totalValue = billsValue * CENT_PER_DOLLAR + coinsValue;

			// check if user input 0, if yes the transaction will be ended.
			if (totalValue == 0) {
				isEnd = true;
				break;
			}

			// declare variable for checking if covered
			boolean isCovered = true;

			// check if the input totalValue covered all the items, if not disable the item(s)
			for (int i = 1; i <= productsMap.values().size(); i++) {
				if (productsMap.get(i) > totalValue)
					isCovered = false;
			}

			// user has different options, if it's covered or not
			if (!isCovered)
				System.out.println("Enter available Product Number (product(s) not covered is/are not available) ");
			else
				System.out.println("Enter Product Number (1-5) ");

			// input product number by user
			int productNumber = in.nextInt();
			// check if user input 0, if yes the transaction will be ended.
			if (productNumber == 0) {
				isEnd = true;
				balance = totalValue;
				break;
			}

			// option for user
			System.out.println("Confirm or Cancel");
			// input confirm or cancel by user
			String isCancleInput = in.next();
			if (isCancleInput.equals("Cancel")) {
				balance = totalValue;
				break;
			}
			// get the product price
			productValue = productsMap.get(productNumber);

			balance = totalValue - productValue;
			System.out.println("Your balance is (cent): " + balance);

		}
		
		System.out.println("Here is your changes (cent) ->>> " + balance);
		
		// close the input stream
		in.close();

	}

}
