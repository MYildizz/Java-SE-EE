/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BucketSort;

import MergeSort.MergeSort;
import RecursiveFibonacci.RecursiveFibonacci;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author murat
 */
public class BucketSort {
      
    public static double[] sort(double[] nums, double max_value) 
    {    
        //Sleep 10
        try 
        {
            Thread.sleep(10);
        }
        catch (InterruptedException ex)
        {
            Logger.getLogger(RecursiveFibonacci.class.getName()).log(Level.SEVERE, null, ex);
        }
               
        // Bucket Sort
        
        // create linked list
        LinkedList<Double>[] Bucket = new LinkedList[10];
        
        //connect arrays with linked list
        for(int i=0;i<10;i++){
             Bucket[i] = new LinkedList<Double>();
        }
        //create last sorted array        
        double[] sorted_nums = new double[nums.length];
        
        //add numbers to buckets index
         for (int i = 0; i < nums.length; i++)
           Bucket[(int)(nums[i]*10)].add(nums[i]);
         
         //sort numbers which inserted buckets
         for (int i = 0; i < 10; i++)
            Collections.sort(Bucket[i]);
         
         //add numbers to last sorted array from bucket
         int outPos = 0;
         for (int i = 0; i < Bucket.length; i++)
              for (int j = 0; j < Bucket[i].size(); j++)
              {
                  double temp2=(sorted_nums[outPos++] =Bucket[i].get(j));
              }
                  
          return sorted_nums;
      }
    
    //calculate max value
    public static double max_value(double[] nums) 
    {  
        double max_value = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max_value)
                max_value = nums[i];
        return max_value;
    } 
        
    public static void main(String args[]) throws IOException, InterruptedException{
           
          String saveFile;   
            
         //Array sizes
        int indexes[] = {5,10,30,50,100,200,500,700,850,1000}; 
         //Opens the file to write the time information
        BufferedWriter writer = new BufferedWriter(new FileWriter("BucketSortTimes.txt"));
         //Random number class
        Random rand = new Random(); 
         
        //Create array witch different sizes
        for (int index : indexes )
        {
          //create array
          double doubleArray[] = new double[index]; 
            
            //create random double numbers between 0,1 and insert to array
            System.out.print("First :");
            for(int i=0;i<index;i++){
                double rand_double = rand.nextDouble();
                doubleArray[i]=rand_double;
               System.out.print(doubleArray[i]+" ");
            }
            System.out.println("");
            
             //start time
            long startTime = System.currentTimeMillis();
            //Do BucketSort
            double max_value = max_value(doubleArray);
            doubleArray = sort(doubleArray, max_value);
            
            long endTime = System.currentTimeMillis();
            //calculate time and save file
            saveFile="Array with index "+index+" => "+((endTime - startTime) + " milliseconds \n");
             writer.write(saveFile);
            System.out.println("Sorted Array:");
            System.out.println(Arrays.toString(doubleArray));
            System.out.println(saveFile);

        }  
        writer.close();
    }
}
