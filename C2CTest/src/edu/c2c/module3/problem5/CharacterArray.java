package edu.c2c.module3.problem5;


/*
 * 
 * display each original character, determine and display whether the character is a digit or a letter
 * redisplay the character according to the directions below
 * 
 * @author Min Zhou
 * 
*/
public class CharacterArray {

    public static void main(String [] args){
    	
    	//Store the giving message
        StringBuilder giveMessage= new StringBuilder("6901 Sudley Road Manassas VA");
        
        System.out.println("Display original charactor: ");
        //loop the stringBuilder for each character
        for (int i = 0;i<giveMessage.length();i++){
        	//output each character
            System.out.print(giveMessage.charAt(i));
            
            //check if the character is a digit
            if(Character.isDigit(giveMessage.charAt(i))){
            	//replace digit to *
            	giveMessage.replace(i, i+1, "*");
            } 
            //check if the character is UpperCase
            else if(Character.isUpperCase(giveMessage.charAt(i))){
            	//replace upperCase character to lowerCase
            	giveMessage.setCharAt(i,Character.toLowerCase(giveMessage.charAt(i)));
            }
            //check if the character is LowerCase
            else if(Character.isLowerCase(giveMessage.charAt(i))){
            	//replace lowerCase character to upperCase
            	giveMessage.setCharAt(i,Character.toUpperCase(giveMessage.charAt(i)));
            }
        }
        System.out.println();
        System.out.println("Redisplay the charater:  " + giveMessage);
    }
}
