
class Car{
   public static int no_of_wheels;
    int no_of_doors;
   
     
   static void drive(int no_of_wheels){
        System.out.println("Car is running on  wheels");
    }

    boolean IsRunniing(int speed){
      if(speed>0){
        
        return true;
        
      }else{
        return false;
      }
    }
    
}



public class Classes {
//why class:to use real world entites as variables in programming world
//user defined datatype
//class ek dhacha aahe kuthi pan vastu create karacha
//blueprint of object created through it
// objects
//object is entity which holds the properties of class
//Method vs Function:method is function of class
  
public static void main(String[] args) {
   Car hyundai;

    hyundai=new Car();
    String a;
    a="affss";
    Car ferrari;
    ferrari=new Car();
    ferrari.drive(4);
    int x;
    x=5;
    System.out.println("value of x is "+x);
    boolean xy=ferrari.IsRunniing(40);
    System.out.println(xy);

    

}

}
