/**
 * This program finds the prime number
 * Student ID: 2021719087
 * @author Ertan Kaya
 * @since 28.10.2021
 */

public class ertan_kaya {
	public static void main(String args[]){  
		  int i,t=0,counter=0;    
		  int n=12;//it is the number to be checked  
		  t=n/2;    
		  if(n==0||n==1){
		   System.out.println(n+" Number is not prime number");    
		  }else{
		   for(i=2;i<=t;i++){    
		    if(n%i==0){    
		     System.out.println(n+" Number is not prime number");    
		     counter=1;    
		     break;    
		    }    
		   }    
		   if(counter==0)  { System.out.println(n+" Number is prime number"); }
		  }//end of else
		}  
}
