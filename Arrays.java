import java.util.*;
class Car2{
    int chak=4;
    int darvaje=4;
}

public class Arrays {
    int arr[]={1,2,3,4};

    int incre(int x){
        return arr[0]++;
     }

    public static void main(String[] args) {
        // Arrays a;
    
        // a=new Arrays();
   
        
        // a.incre(a.arr[0]);
        // System.out.println(a.arr[0]);

    



    //     // char arr[]={'a','e','i','o','u'};
    //     // boolean arr2[]=new boolean[5];
    //     // System.out.println(arr2[0]);
    //     // arr2[0]=true;
    //     // System.out.println(arr2[0]);
    //     // Scanner ac=new Scanner(System.in);
       
    //     // String str[]=new String[n];
    //     // System.out.println(str[0]);
    //     // int n=ac.nextInt();
    //     // int array[]=new int[n];
    //     // for(int i=0;i<n;i++){
    //     //     array[i]=ac.nextInt();
    //     // }
    //     // System.out.println("xxxxx");
    //     // for(int i=0;i<n;i++){
    //     //     System.out.println(array[i]);
    //     // }

    int arr[]={6,45,78,43,2,47};
    //  //(6,45) (6,78) ,(6,43) (6,2),(6,47)
    //  // (45,78) ,(45,43) (45,2),(45,47)
    //   //  (78,43) (78,2),(78,47)
    //    //   (43,2),(43,47)
    //         // (2,47)

    // for(int i=0;i<arr.length;i++){
    //     for(int j=i+1;j<arr.length;j++){
    //         System.out.print("("+arr[i]+","+arr[j]+") ");
    //     }
    //     System.out.println();
    // }
    
    








     //6 ->  6   6,45   6,45,78,    6,45,78,43  6,45,78,43,2, 6,45,78,43,2,47
     //45 -> 45  45,78  45,78,43   45,78,43,2   45,78,43,2,47
    //78 -> 78    78,43   78,43,2   78,43,2,47
    //43 -> 43    43,2   43,2,47
    //2 ->  2   2,47
    //47->  47     i           j
     int arr2[]={6,45,78,43,2,47};

      for(int i=0;i<arr2.length;i++){
        for(int j=i+1;j<=arr2.length;j++){
            for(int k=i;k<j;k++){
                System.out.print(arr[k]+",");
            }
            System.out.print(" ");
     }
        System.out.println();
    }
    
     
     
    //  int min=Integer.MAX_VALUE;
    //  System.out.println(min);
    //  for(int i=0;i<arr.length;i++){
    //   if(arr[i]<min){
    //     min=arr[i];
    //   }
    //  }
    //  System.out.println(min);





    //  int key=8;
    //  int ans=-1;
    //  for(int i=0;i<arr.length;i++){
    //     if(arr[i]==key){
    //     ans=i;
    //     break;
    //     }

    //  }
    //  System.out.println(ans);
    
    // int n=a.nextInt();
    // int arr2[]=new int[n];
    // for(int i=0;i<n;i++){
    //     arr2[i]=a.nextInt();
    // }
    // for(int i=0;i<n;i++){
    //     if(arr2[i]%2==0){
    //       System.out.print(arr2[i]+"\t");
    //     }
       
    // }
    // System.out.println();
    // for(int i=0;i<n;i++){
    //     if(arr2[i]%2!=0){
    //       System.out.print(arr2[i]+"\t");
    //     }
    // }
    // int n=5;
   
    // int num1=a.nextInt();
    // int num2=a.nextInt();
    // int num3=a.nextInt();
    // int num4=a.nextInt();
    // int num5=a.nextInt();
    // int arr[]=new int[5];
    // arr[0]=num1;
    // arr[1]=num2;
//  Scanner a=new Scanner(System.in);
//  System.out.println("Please enter array size");
//  int n=a.nextInt();
 
//     int arr[]=new int[n];

//     for(int i=0;i<n;i++){
//         System.out.println("plese enter"+i+"th number");
//        arr[i]=a.nextInt();

//     }
    
//     for(int i=0;i<n;i++){
//         System.out.println(arr[i]);

//     }
//  arrr[]={3,4,5,6,5};
// for(int i=0;i<arr.length;i++){
//    if(arr[i]%2!=0){
//     System.out.print(arr[i]+" ");
//    }
// }
// System.out.println();
// for(int i=0;i<arr.length;i++){
//     if(arr[i]%2==0){
//      System.out.print(arr[i]+" ");
//     }
//  }


  



    
    // for(int i=0;i<arrr.length;i++){
    //     for(int j=0;j<arrr.length;j++){
    //         for(int k=i;k<=j;k++){
    //             System.out.print(arrr[k]+" ");
    //         }
    //         System.out.println();
           
    //     }
    //     System.out.println();
    //  }
    

//       int arr[][]={{1,2,3},{2,4,4},{2,4,5},{4,5,6}};


//   //1 2 3
//   //2 4 4
//   //2 4 5
//   //4 5 6
//   for(int i=0;i<4;i++){
//     for(int j=0;j<3;j++){
//         System.out.print(arr[i][j]+" ");
        
//     }
//     System.out.println();
//   }


  //
//  int arr2[]={2,3,4,5};
//  for(int i=0;i<arr2.length;i++){

//  }
    // for(int x:arr2){
    //     if(x%2==0){
    //         System.out.println(x);
    //     }
        
    // }




    //   System.out.print(arr[0][0]+" ");
    //   System.out.print(arr[0][1]+" ");
    //   System.out.print(arr[0][2]+" ");
    //   System.out.print(arr[1][0]+" ");
    //   System.out.print(arr[1][1]+" ");
    //   System.out.print(arr[1][2]+" ");
    //   System.out.print(arr[2][0]+" ");
    //   System.out.print(arr[2][1]+" ");
    //   System.out.print(arr[2][2]+" ");
    //   System.out.print(arr[3][0]+" ");
    //   System.out.print(arr[3][1]+" ");
    //   System.out.print(arr[3][2]+" ");
    //  int arr[]=new int [3];
      
    //   Car2 abs;
    //   Car2 c1;
    //   Car2 c2;
    //   Car2 c3;

    //   abs=new Car2();
    //   c1=new Car2();
    //   c2=new Car2();
    //   c3=new Car2();

    //  Car2 g1[]={c1,c2,c3};
    //  System.out.println(g1[0].chak);
 
     

        
        
    }
}
