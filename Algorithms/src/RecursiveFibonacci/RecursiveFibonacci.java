
package RecursiveFibonacci;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Muratcan Yıldız 16050111036

public class RecursiveFibonacci {

        //fibonacci Function
    public static int fibonacciRecursion(int n) 
    {
            
	if(n == 0)
        {
	    return 0;
	}
	if(n == 1 || n == 2)
        {
            return 1;
	}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
        
    }
        
    public static void main(String args[]) throws IOException, InterruptedException {
        
       
        String saveInfo;          
        int FibonacciIndex;        //how many indext fibonaccide we are
	int FibonacciNumber = 40;  // number of fibonacci to be calculated
        String time;
               
       //opens the file to write the time information
        BufferedWriter writer = new BufferedWriter(new FileWriter("RecursiveFibonacciTimes.txt"));
        
	System.out.print("Fibonacci Series of "+FibonacciNumber+" numbers: \n");
        
        //send index of Fibonacci Numbers
	for(int i = 0; i < FibonacciNumber; i++){
            
            //start time                    
            long startTime = System.currentTimeMillis();
            
            
            Thread.sleep(10);
            
            //Calculate Fibonacci with specified index
	    FibonacciIndex=fibonacciRecursion(i);
            //calculate time
            long endTime = System.currentTimeMillis();
            time=(endTime - startTime) + " milliseconds";
            
            //Save to txt and output
            saveInfo=(i+1)+".Number is :"+FibonacciIndex +" ==> Completion Time :"+time+" \n ";
            System.out.println(saveInfo);
            writer.write(saveInfo);
		
        }
            writer.close();
	}
}
