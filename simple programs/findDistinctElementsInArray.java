package com.java.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class findDistinctElementsInArray {
	static int[] arrCopy;
	public static void main(String[] args) {
		/*	int [] arr= {1,2,2,1,3,5,7,1}; 
			// 1,1,1,2,2,3,5,7 - > 2,0,1,3,0,3,5,7 
			//0,0,1,2,3,3,5,7 -> 0,0,1,2,4,0,5,7
			//0,0,0,1,2,4,5,7*/
		int [] arr= {1,1,2,3,4,2,4,5}; 	
		//1,1,2,2,3,4,4,5 -> 2,0,3,0,3,5,0,5
		//0,0,0,2,3,3,5,5 -> 0,0,0,2,4,0,6,0 // 2 4 6
		methodToFind(arr);
			Arrays.sort(arrCopy);
			for(int i:arrCopy) {
				if(i>0)
			System.out.println(i);}
	}

	private static void methodToFind(int [] arr) {
		arrCopy=arr;
		int i=0;
		while(i==0) {
			boolean temp=checkForDuplicates(arrCopy);
			if(!temp) {
				i++;
				}
			else {
				removeDuplicates(arrCopy);
				}
		}
		
	}
	
	private static boolean checkForDuplicates(int[] arr) {
		Arrays.sort(arr);
		boolean temp=false;
		for(int i=0;i+1<arr.length;i++) {
			if(!(arr[i]==0 && arr[i+1]==0)) {
			if(arr[i]==arr[i+1]) {
				temp=true;
				break;
			}}
		}
		return temp;
	}
	
	private static boolean removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i+1<arr.length;i++) {
			if(!(arr[i]==0 && arr[i+1]==0)) {
			if(arr[i]==arr[i+1]) {
				arr[i]=arr[i]+1;
				arr[i+1]=0;
			}}
		}
		arrCopy=arr;
		return false;
	}
	
	
	

}
