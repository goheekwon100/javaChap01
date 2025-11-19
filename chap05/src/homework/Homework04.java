package homework;

import java.util.Arrays;

public class Homework04 {
	public static void main(String[] args) {
	      boolean inputCondition = true;
	      int[] arr = new int[6];
	      int randomNum, currentIndex = 0;
	      
	      while(currentIndex < 6) {
	         inputCondition = true;
	          randomNum = (int)(Math.random()*45+1);
	          for (int i = 0; i < arr.length; i++) {
	              if (arr[i] == randomNum){
	                  inputCondition = false;
	                  break;
	              }
	          }
	          if (inputCondition == true){
	              arr[currentIndex] = randomNum;
	              currentIndex++;
	          }
	      }
	      Arrays.sort(arr);
	      for (int i = 0; i < arr.length; i++){
	          System.out.print(arr[i] + " ");
	      }
	   }
}