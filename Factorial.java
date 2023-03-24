import java.util.*;
class Factorial{  
 public static void main(String args[]){
System.out.print("n = " );
Scanner o=new Scanner(System.in);
int n=o.nextInt(); 
  int i,fact=1;      
  for(i=1;i<=n;i++){    
      fact=fact*i;    
  }    
  System.out.println(n+ " factorial "+ " = " +fact);    
 }  
}  
