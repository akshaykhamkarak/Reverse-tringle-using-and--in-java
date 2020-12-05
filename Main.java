import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
	System.out.println("Enter N : ");
	int n=sc.nextInt();	 
              System.out.print("Enter Symbol : ");
	
        char c = sc.next().charAt(0);
 int count=0;
	for(int i=0;i<n;i++)
               {
	
                       for(int j=0;j<5;j++)
                        if(i==0)
                       {
                               System.out.print(c);
                       }
                       else
                       {
                           if(i==1){
                               if(count<1||count>3){
                                   count++;
                                   System.out.print("-");
                               }
                               else{
                                    count++;
                                      System.out.print(c);
                               }
                              if(count==4)count=0;
                           }
                        // 
                           if(i==2){
                                
                               if(count<3||count>3){
                                   count++;
                                   System.out.print("-");
                               }
                               else{
                                   count++;
                               
                                  System.out.print(c);}
                           }
                       }
                     System.out.println();
               }    
		
	}
}
