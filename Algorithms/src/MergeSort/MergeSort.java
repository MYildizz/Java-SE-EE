/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MergeSort;

// Muratcan Yıldız 16050111036

import RecursiveFibonacci.RecursiveFibonacci;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MergeSort {
    
    void merge(int arr[], int l, int m, int r) 
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
  
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
 
        /* Merge the temp arrays */
        
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    // Main function that sorts arr[l..r] using 
    // merge() 
    void sort(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
       
        public static void main(String args[]) throws IOException, InterruptedException
        {
          String saveFile;  
            
         //Array sizes
        int indexes[] = {5,10,30,50,100,200,500,700,850,1000}; 
         //Opens the file to write the time information
        BufferedWriter writer = new BufferedWriter(new FileWriter("MergeSortTimes.txt"));
         //Random number class
        Random rand = new Random(); 
         
        //Create array witch different sizes
        for (int index : indexes )
        {
            
           
            
          //create array
          int intArray[] = new int[index]; 
            
            //create random numbers between 50000,1000000 and insert to array
            System.out.print("First :");
            for(int i=0;i<index;i++){
                int rand_int1 = rand.nextInt(1000000)+50000;
                intArray[i]=rand_int1;
               System.out.print(intArray[i]+" ");
            }
            
            MergeSort ob = new MergeSort(); 
            //start time
            long startTime = System.currentTimeMillis();
            //Start MergeSort
            ob.sort(intArray, 0, intArray.length-1); 
            long endTime = System.currentTimeMillis();
            
            saveFile="Array with index "+index+" => "+((endTime - startTime) + " milliseconds \n");
            //save to file results
             writer.write(saveFile);
             
            //print informations
            System.out.println("");
            System.out.print("Merged : ");
            printArray(intArray);
            System.out.println(saveFile);

        }
        writer.close();
    }
}

