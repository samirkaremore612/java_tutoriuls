class Car{
   static int no_of_wheels=4;
    int no_of_doors=4;

void drive(){
        System.out.println("car is running" +no_of_doors);
    }
}
public class Example{
    
    public static void main(String[] args) {
        int x=5;
        int y=7;
        Car c2;
        c2=new Car();
        c2.drive();
        Car.no_of_wheels=5;
        System.out.println(Car.no_of_wheels);
    }
}
//nadem