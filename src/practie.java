import java.util.Scanner;

public class practie {
    static int[] prefix(int[] a){
        int n= a.length;
        int[] pre=new int[n];
        pre[0]=a[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+a[i];
        }
        return pre;
    }

    static void print(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of on element");
        int n= sc.nextInt();
        int[] arr=new int[n];
//        n=arr.length;
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[] a =prefix(arr);
        print(a);




    }
}


