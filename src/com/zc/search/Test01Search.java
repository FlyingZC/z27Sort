package com.zc.search;

import java.util.Arrays;
/*二分搜索必须先排序*/
public class Test01Search {
	public static void main(String[] args) {
		int a[]={1,56,23,45,5765,324,213,34,21,32};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int num=binarySearch(a,9);
		System.out.println(num);
	}
	
	public static int binarySearch(int[] a,int index){
		int low=0,high=a.length-1;
		while(high>=low){
			int mid=(low+high)/2;
			if(a[index]>a[mid]){
				low=mid+1;
			}else if(a[index]<a[mid]){
				high=mid-1;
			}else{
				return a[mid];
			}
		}
		return -1;
	}
}
