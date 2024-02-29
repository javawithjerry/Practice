package com.dxc.demo;
import java.lang.Thread;

	    public class p10 {
	    	public static void main(String[] args) {
	    	      Thread thread = new Thread(() -> {
	    	         System.out.println("Thread is running");
	    	      });

	    	      thread.start();
	    	   }
	}

