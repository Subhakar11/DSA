import java.util.*;

public class Decreasingnumberrecursion {

 public static void num(int n){
    if(n==1){ 
    System.out.println(n);
    return ;
    }
    System.out.println(n+" "); 
    num(n-1);
    

}
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
     int  n = sc.nextInt();
        num(n);
    }
    
}
