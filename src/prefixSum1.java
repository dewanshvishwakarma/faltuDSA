import java.util.Scanner;

public class prefixSum1 {
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int[] prefix(int[] arr){
    int n=arr.length;
    int[] prefix=new int[n];
    prefix[0]=arr[0];
    for(int i=1;i<n;i++){
        prefix[i]=prefix[i-1]+arr[i];
    }
    return prefix;
    }

    static int[] withoutPrefix(int[] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n= sc.nextInt();
        int[] arr=new int[n];

        System.out.println("enter the " + n + " elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    int[] a= withoutPrefix(arr);
        print(a);

    }
}
