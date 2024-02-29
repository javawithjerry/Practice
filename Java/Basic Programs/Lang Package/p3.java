package com.dxc.demo;
import java.lang.Exception;
public class p3 {
	public static void main(String[] args) {
	try {
	      int a = 10;
	      int b = 0;
	      int result = a / b;
	      System.out.println(result);
	    } catch (Exception e) {
	      System.out.println("Exception caught:" + e.getMessage());
	    }
	}
}
