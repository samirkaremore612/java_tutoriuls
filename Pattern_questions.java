import java.util.Scanner;

public class Pattern_questions {
  
  public static void main(String[] args) {
// Q1)
// ****
// ****
// ****
// ****

// for(int i=0;i<4;i++){
//   for(int j=0;j<4;j++){
//     System.out.print("*");
//   }
//   System.out.println();
// }





// for(int i=0;i<=3;i++){
//   for(int j=0;j<=3;j++){
//     System.out.print("*");
//   }
//   System.out.println();
// }




// Q2)
// *
// **
// ***
// ****
for(int i=0;i<=3;i++){
  
  for(int j=0;j<=i;j++){
    System.out.print("*");
  }
  System.out.println();
}







// for(int i=0;i<4;i++){
//  for(int j=0;j<=i;j++){
//   System.out.print("*");
//  }
//   System.out.println();
// }

// for(int i=0;i<=3;i++){
//   for(int j=0;j<=i;j++){
//     System.out.print("*");
//   }
//   System.out.println();
// }


// Q3)
// ****
// ***
// **
// *


// i=0 ****
// i=1 ****
// i=2 ****
// i=3 ****
for(int i=0;i<=3;i++){
  for(int j=3-i;j>=0;j--){
    System.out.print("*");
  }
  System.out.println();
}






for(int i=3;i>=0;i--){
  
  for(int j=i;j>=0;j--){
    System.out.print("*");
  }
  System.out.println();
}







// for(int i=0;i<4;i++){
//   for(int j=4-i;j>0;j--){
//     System.out.print("*");
//   }
//   System.out.println();
// }
// for(int i=3;i>=0;i--){
//   for(int j=2;j>=0;j--){
//     System.out.print("*");
//   }
//   System.out.println();
// }
// Q4)
// ****
// ***
// **
// *
// *
// **
// ***
// ****
for(int i=0;i<=3;i++){
  for(int j=3-i;j>=0;j--){
    System.out.print("*");
  }
  System.out.println();
}
for(int i=0;i<=3;i++){
  
  for(int j=0;j<=i;j++){
    System.out.print("*");
  }
  System.out.println();
}


// for(int i=0;i<4;i++){
//   for(int j=4-i;j>0;j--){
//     System.out.print("*");
//   }
//   System.out.println();
// }
// for(int i=0;i<=3;i++){
//   for(int j=0;j<=i;j++){
//     System.out.print("*");
//   }
  
//   System.out.println();
// }

// Q5)

// 111
// 11
// 1

for(int i=0;i<=2;i++){
  for(int j=2-i;j>=0;j--){
    System.out.print("1");
  }
  System.out.println();
}

//    *
//   **
//  ***
// ****
for(int i=0;i<=3;i++){
  for(int j=2-i;j>=0;j--){
    System.out.print(" ");
  }
  for(int j=0;j<=i;j++){
    System.out.print("*");
  }

System.out.println();
}






// for(int i=0;i<4;i++){
//   for(int j=3-i;j>0;j--){
//     System.out.print(" ");
//   }
//   for(int k=0;k<=i;k++){
//     System.out.print("*");
//   }
//   System.out.println();
// }

// for(int i=0;i<=3;i++){
//     for(int j=3-i;j>0;j--){
//       System.out.print("1");
//     }
//     for(int k=0;k<=i;k++){
//       System.out.print("*");
//     }

//     System.out.println();
// }

// for(int i=0;i<4;i++){
//   for(int j=0;j<4;j++){
//     System.out.print("*");
//   }
// System.out.println();
// }

// Q6)
// ****
// 1***
// 11**
// 111*
for(int i=0;i<=3;i++){
  for(int j=0;j<i;j++){
    System.out.print(" ");
  }
  for(int j=3-i;j>=0;j--){
    System.out.print("*");
  }
  System.out.println();
}



// for(int i=4;i>0;i--){
//   for(int j=0;j<3-i;j++){
//     System.out.print(" ");
//   }
//   for(int k=i;k>0;k--){
//     System.out.print("*");
//   }
//   System.out.println();
// }
// for(int i=0;i<4;i++){
//    for(int j=0;j<i;j++){
//     System.out.print("1");
//    }
//    for(int k=3-i;k>=0;k--){
//     System.out.print("*");
//    }
   
   
//   System.out.println();
//   }




// Q7)
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
// 16 17 18 19 20 21
int count=1;
 for(int i=0;i<=5;i++){
  for(int j=0;j<=i;j++){
    System.out.print(count+" ");
    count++;
  }
  System.out.println();
 }

// int counter=0;
// for(int i=0;i<6;i++){
//   for(int j=0;j<=i;j++){
    
//     System.out.print(i+" ");
//     counter++;
    
//   }
//   System.out.println();
// }


// Q8)
// * * * * * *
// 1* * * * *1
// 11* * * *11
// 111* * *111 
// 1111* *1111
// 11111*11111
for(int i=0;i<=5;i++){
  for(int j=0;j<i;j++){
    System.out.print(" ");
  }
  for(int j=5-i;j>=0;j--){
    System.out.print("*"+" ");
  }
  for(int j=0;j<i;j++){
    System.out.print(" ");
  }
  System.out.println();
}



  
// }
// 1 2 3 4 5 6 
//  2 3 4 5 6 
//   3 4 5 6 
//    4 5 6 
//     5 6 
//      6 



// Q9)
//      6 
//     5 6 
//    4 5 6 
//   3 4 5 6 
//  2 3 4 5 6 
// 1 2 3 4 5 6

// 11111*11111    
// 1111* *1111
// 111* * *111
// 11* * * *11
// 1* * * * *1 
// * * * * * * 
// for(int i=0;i<6;i++){
//   for(int j=5-i;j>0;j--){
//     System.out.print(" ");
//   }
//   for(int k=0;k<=i;k++){
//     System.out.print(6-i+k+" ");
//   }
//   for(int j=5-i;j>0;j--){
//     System.out.print(" ");
//   }
//   System.out.println();
// }


// Q10)
// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5 
// 6 6 6 6 6 6 
 //* 
// * * 
// * * *
// * * * * 
// * * * * * 
// * * * * * *
//  for(int i=1;i<=6;i++){
//   for(int j=0;j<i;j++){
//     System.out.print(i+" ");
//   }
//   System.out.println();
//  }


  Scanner obj=new Scanner(System.in);
  int x=obj.nextInt();
  System.out.println(x);
   String str= obj.next();
   System.out.println(str);
  }  
}



