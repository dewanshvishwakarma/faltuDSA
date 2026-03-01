import java.util.Scanner;
//DAY 1
public class prefixSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//int[] arr={2,1,3,4,5};
//int n= arr.length;
//int[] prefix=new int[n];
//prefix[0]=arr[0];
//for(int i=1;i<n;i++){
//    prefix[i]=prefix[i-1]+arr[i];
//}
//for(int i=0;i<n;i++){
//    System.out.println(prefix[i]);
//}

//but in this we want a extra array that is prefix
// solve by exiting array
//        int[] arr = {2, 1, 3, 4, 5};
//        int n = arr.length;
//        for (int i = 1; i < n; i++) {
//            arr[i] = arr[i - 1] + arr[i];
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i]);
//        }


int[] arr={2,4,1,3,6,5};
int n= arr.length;
int[] prefix=new int[n];
prefix[0]=arr[0];
for(int i=1;i<n;i++){
    prefix[i]=prefix[i-1]+arr[i];
}
        System.out.println("enter the l");
        int l= input.nextInt();
        System.out.println("enter the r");
        int r= input.nextInt();

        int sum=prefix[r]-prefix[l-1];
        System.out.println(sum);



    }
}
