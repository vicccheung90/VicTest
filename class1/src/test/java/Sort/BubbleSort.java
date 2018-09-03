package Sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] Arr = {21, 1, 2, 4, 3, 6, 5, 7, 8, 9, 10, 11, 20, 19, 18, 17, 16, 15, 14, 13, 12};
        int n=0;
        for(int index=0;index<Arr.length;index++) {
            for (int before = 0; before < Arr.length - 1; before++) {
                int temp;

                if (Arr[before] > Arr[before + 1]) {
                    temp = Arr[before];
                    Arr[before] = Arr[before + 1];
                    Arr[before + 1] = temp;
                    n++;
                }

            }
        }
        for (int a : Arr) {
            System.out.print(a + ";");
        }
        System.out.println(n);
    }
}
