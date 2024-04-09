import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
//         1) write a program to print numbers from 1 to n take n input from user
// 2) write a program to calculate sum of first n natural numbers take n as input from user. 
// 3) write a program to reverse a string. Take string input from user.
    
//   Scanner sc=new Scanner(System.in);
//   double n=sc.nextInt();
// for(int i=1;i<=n;i++){
// System.out.println(i);
// }
// double sum=n*((n+1)/2);
// System.out.println(sum);
// int sum2=0;
// for(int i=1;i<=n;i++){
//     // sum=sum+i;
//     sum2+=i;
// }
// System.out.println(sum2);
//que3
String str1="sameer";
//reemas
//   sameer
int m=str1.length();
char arr[]=str1.toCharArray();
for(int i=0;i<m/2;i++){
    char temp=arr[i];
    arr[i]=arr[m-i-1];
    arr[m-i-1]=temp;
}

System.out.println(arr);
    }
}
