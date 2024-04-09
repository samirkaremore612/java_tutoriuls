import java.util.Scanner;

class Day6{
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<n/2;i++){
            char temp=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=temp;
        }
        System.out.println(s);
    }
    // int sum(int num1,int num2){
    //     return num1+num2;
    // }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int temp=sc.nextInt();
        // if(temp<30){
        //     System.out.println("He will feel cold");
        // }else{
        //     System.out.println("feels hot");
        // }
        //  Scanner sc=new Scanner(System.in);
        //  String gender=sc.next();
        // switch (gender) {
        //     case "M":
        //         System.out.println("The person is male");
        //         break;
        //    case "F":
        //         System.out.println("The person is female");
        //         break;
        
        //     default:
        //         System.out.println("Enter the valid gender");
        //         break;
        // }
        //ternary operator
        //  Scanner sc=new Scanner(System.in);
        //  int num=sc.nextInt();
        // String divisibility=num%2==0?"number is devisible":"number is not devisible";
        // System.out.println(divisibility);

        // int num;
        //  Scanner sc=new Scanner(System.in);
        //  num=sc.nextInt();
        //  String res= switch (num) {
        //     case 1->"its monday";
        //     case 2->"its Tuesday";
        //     case 3->"its wednesday";
        //     case 4->" its thursday";
        //     case 5->"its Tuesday";
        //     case 6->"its saturday";
        //     case 7->" its sunday";
        //     default->"Please enter valid number";
        //  };
        //  System.out.println(res);
    //  System.out.println("Sammer is good boy");
    // while loop
    // int num=0;
    // while(num>0) {
    //     System.out.println("Sameer is good  boy");
    //     num--;
    // }
    // System.out.println(num);
    // for(int num2=0;num2<5;num2++){
    //     System.out.println("Sameer is good  boy");
    // }
     
    // Day6 ad=new Day6();
    // // System.out.println(ad.sum(2,4));
    // char[] a={'s','a','m','i','r'};
    // ad.reverseString(a);
    // int num=3;
    // String val=switch (num) {
    //     case 1->"its monday";
    //     case 2->"its tuesday";
    //     case 3->"its wednesday";
    //     case 4->"its thursdday";
    //     default->"please enter valid day";
        
    // };
    // System.out.println(val);

    int i;
   for(i=5;i>0;i--){
    System.out.println("hello");
   }
   System.out.println(i);
  
   


}

    }
