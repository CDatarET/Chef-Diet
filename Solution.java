import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for(int cas = 0; cas < cases; cas++){
		    int l = scan.nextInt();
		    int prot = scan.nextInt();
		    int arr[] = new int[l];
		    
		    for(int i = 0; i < l; i++){
		        arr[i] = scan.nextInt();
		    }
		    
		    int carry = 0;
		    boolean broke = false;
		    for(int i = 0; i < l; i++){
		        carry = carry + arr[i] - prot;
		        if(carry < 0){
		            System.out.println("no " + (i+1));
		            broke = true;
		            break;
		        }
		    }
		    if(!broke){
		        System.out.println("yes");
		    }
		}
	}
}
