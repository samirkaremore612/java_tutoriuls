/**
 *  
 */
class Dog{
   int no_of_sheput;
   int no_of_legs;
   void bhunkne(){
    System.out.println("Bhau Bhau");
   }
   int  show_legs(){
    return no_of_legs;
   }
   int no_of_sheput(){
    return no_of_sheput;
   }
   int no_of_legs(){
    return no_of_legs;
   }


}
public class Classes_hw {
    public static void main(String[] args) {
        Dog d1;
        Dog d2;
        d1=new Dog();
        d2=new Dog();
        System.out.println(d1.no_of_legs);
        d1.no_of_legs=4;
        d1.no_of_sheput=1;
        System.out.println(d1.no_of_legs);
        System.out.println(d1.no_of_sheput);
        d1.bhunkne();
    }
}
