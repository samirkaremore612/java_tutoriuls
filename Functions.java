import java.util.*;
public class Functions {
    static int x=3;
 

   static void sum(int a1,int a2){
        
        int x1=a1;
        int x2=a2;
        System.out.println(x1+x2);
        
     }
     static int increment(){
        x++;
        System.out.println(x);
        return x;
     }
    public static void main(String[] args) {
        // (1*3*5)+(1*6)
      int x1=(1*3*5);
      int x2=(1*6);

      sum(x1,x2);
     
      increment();
     System.out.println(x);

    
    }
    
}
