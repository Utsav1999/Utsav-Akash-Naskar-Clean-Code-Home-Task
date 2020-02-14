package com.EPAMPEP.maven.EstimateCost;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    }
    
    static
    {
    	App.costCalculation();
    }
    
    static void costCalculation()
    {
    	Scanner sc = new Scanner(System.in);
    	while(true)
    	{
    		double totalCost=0, squareFeet;
    		System.out.append("\n\nPress 1 to use Standard Materials\nPress 2 to use Above Standard Materials\nPress 3 to use High Standard Materials\nPress 4 to use High Standard Material and need Fully Automated Home\nPress 5 to Exit\n");
    		System.out.append("\nEnter your choice: ");
    		int choice = sc.nextInt();
    		switch(choice)
    		{
    			case 1: System.out.append("\nHow many square feet do you want? : ");
        				squareFeet = sc.nextDouble();
    					System.out.append("\nPer Square Feet cost: 1200INR");
    					totalCost=squareFeet*1200;
    					System.out.append("\nThe Total Cost is: "+totalCost);
    					break;
    			case 2: System.out.append("\nHow many square feet do you want? : ");
        				squareFeet = sc.nextDouble();
    					System.out.append("\nPer Square Feet cost: 1500INR");
						totalCost=squareFeet*1500;
						System.out.append("\nThe Total Cost is: "+totalCost);
						break;
    			case 3: System.out.append("\nHow many square feet do you want? : ");
        				squareFeet = sc.nextDouble();
    					System.out.append("\nPer Square Feet cost: 1800INR");
						totalCost=squareFeet*1800;
						System.out.append("\nThe Total Cost is: "+totalCost);
						break;
    			case 4: System.out.append("\nHow many square feet do you want? : ");
        				squareFeet = sc.nextDouble();
    					System.out.append("\nPer Square Feet cost: 2500INR");
						totalCost=squareFeet*2500;
						System.out.append("\nThe Total Cost is: "+totalCost);
						break;
    			case 5: System.exit(0);
    			default: System.out.append("\nWrong Choice!\n");
    		}
    	}
    }
}
