package ArrayListTest;
import java.util.Arrays;

public class ReverseArray {
    public void Reverse(int[] a){
        int max=a.length-1;
        int min=0;
        for(int i=0;i<=a.length/2;i++){
            int temp;
            temp=a[max];
            a[max]=a[min];
            a[min]=temp;
            max--;
            min++;
        }

    }

    public static void main(String[] args){
        ReverseArray Arr = new ReverseArray();
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        Arr.Reverse(arr);
        for (int a:arr) {
            System.out.print(a);
        }
    }
}
