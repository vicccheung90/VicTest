package Sort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] Arr = {21, 1, 2, 4, 3, 6, 5, 7, 8, 9, 10, 11, 20, 19, 18, 17, 16, 15, 14, 13, 12};
//      int[] Arr = {7,3,1,2,5,4,10,6};
        int n=0;
//        外循环
        for(int outer=1;outer<Arr.length;outer++){
                int temp=Arr[outer];
                int index=0;
//                计算插入位置
                while(Arr[outer]>Arr[index]){
                    index++;
                }
//                数组往后移动
                for(int i=outer;i>index;i--){
                    Arr[i]=Arr[i-1];

                    n++;
                }
//                插入
                Arr[index]=temp;
            for (int a : Arr) {
                System.out.print(a + ";");

            }
//            System.out.println();
            System.out.println("temp"+temp);
        }
        for (int a : Arr) {
            System.out.print(a + ";");
        }
        System.out.println("\n"+n);
    }
}
