public class Method_overloading {
    
    static int sum2(int x1,int x2){
        System.out.println("Integervala");
        return x1+x2;
    }
    static double sum2(int x1,double x2){
        System.out.println("ek double vala");
        return x1+x2;
    }
    static double sum2(double x1,float x2){
        System.out.println("donhi double vala");
        return x1+x2;
    }
    static double sum2(double x1,double x2){
        System.out.println("donhi double vala");
        return x1+x2;
    }
    static float sum2(float x1,float x2){
        System.out.println("donhi float vala");
        return x1+x2;
    }
    



    public static void main(String[] args) {
        
        
        System.out.println(sum2(4, 6.6));
        System.out.println(sum2((float)4.5,(float)5.6));
        System.out.println(sum2(3.4,6.7));
    }
}

