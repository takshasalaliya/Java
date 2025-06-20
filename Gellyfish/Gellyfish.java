import java.util.Scanner;



public class Gellyfish {

    public static void main(String[] args) {

        int[] arr1,arr2,ans,r;
        Scanner sc = new Scanner(System.in);
        int q,p;
        int num = sc.nextInt();
        p = q = num;
        arr1 = new int[q];
        arr2 = new int[p];
        for (int i = 0; i < q; i++) {
            while(true) {
                arr1[i] = sc.nextInt();
                if (arr1[i] > num) {
                    System.out.println("Enter Valid Number");
                    continue;
                }
                break;
            }
        }
        for (int i = 0; i < p; i++) {
            while(true) {
                arr2[i] = sc.nextInt();
                if (arr2[i] > num) {
                    System.out.println("Enter Valid Number");
                    continue;
                }
                break;
            }
        }

        ans = new int[num];
        r = new int[num];
        ans[0] =  OperationValue(arr1[arr1[0]],arr2[arr2[num-1]]);
        SortValue(ans,num);
        r[0]=ans[0];
        for (int i = 1; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                ans[j] =  OperationValue(arr1[j],arr2[i-j]);
            }
            SortValue(ans,num);
            r[i]=ans[0];
        }

        for(int a : r){
            System.out.print(a+" ");
        }

    }
    public static int OperationValue(int a, int b){
        return (int) (Math.pow(2,a)+Math.pow(2,b));
    }
    public static void SortValue(int[] a,int num){
        int temp=0;
        for (int i = 0; i < num; i++) {
            if(a[i]>temp){
                temp=a[i];
            }
        }
        a[0]=temp;
    }
}
