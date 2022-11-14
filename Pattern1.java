package Loop;
import java.util.*;
public class Pattern1 

{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int i, j,k;       
s
    for (i=0; i<row; i++)   
    {  
     
        for (j=row-i; j>1; j--)   
            {  
                //prints space between two stars  
                System.out.print(" ");   
                }   
                //inner loop for columns  
        for (k=0; k<=i; k++ )   
            {   
                //prints star      
                System.out.print("*");   
                }  
        for (j=1; j<=i; j++ )   
            {   
                //prints star      
                System.out.print("*");   
                }  
                
        //throws the cursor in a new line after printing each line  
        System.out.println();  
        
        
	}
	
	for (i=0; i<row; i++)   
    {  
     
        for (j=0; j<i; j++)   
            {  
                //prints space between two stars  
                System.out.print(" ");   
                }   
                //inner loop for columns  
        for (k=0; k<=row-1-i; k++ )   
            {   
                //prints star      
                System.out.print("*");   
                }  
        for (j=row-1; j>i; j-- )   
            {   
                //prints star      
                System.out.print("*");   
                }  
                
        //throws the cursor in a new line after printing each line  
        System.out.println();  
        
        
	}
	
	
	
		
}
}

