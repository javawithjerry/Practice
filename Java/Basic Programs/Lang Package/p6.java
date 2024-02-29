package com.dxc.demo;
import java.lang.Boolean;
public class p6 {
	public static void main(String[] args) {  
		  
        int num=7;  
        boolean flag=false;  
  
          for(int i=2;i<num;i++)  
          {  
              if(num%i==0)  //to check prime
              {  
                  flag=true;  
                          break;  
              }  
          }  
        if(flag)  
        {  
            System.out.println("Not prime");  
        }  
        else  
        {  
            System.out.println("prime");  
        } 
	}

}
