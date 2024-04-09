public class Constructors {
    int x;
    int y;
    
 
  public Constructors(){
    x=5;
    y=7;
    System.out.println("constructor is called"+x+" "+y);
   }
  private Constructors(int x,int y){
    this.x=x;
    this.y=y;
    System.out.println(" integer vala constructor is called");
   }
  
   Constructors(Constructors obj){
   x=obj.x;
   y=obj.y;
   System.out.println("Copy constructor called");
   }

   Constructors(double x,int y){
    x=5;
    y=7;
    System.out.println("constructor is called");
   }





    public static void main(String[] args) {
        
     Constructors c1,c2;
     
     c1=new Constructors(4,5);
     c2=new Constructors(c1);
    
      
      

     System.out.println(c2.x);
     System.out.println(c2.y);
    }
}
