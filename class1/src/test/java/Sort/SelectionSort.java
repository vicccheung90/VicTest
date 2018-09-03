package Sort;

public class SelectionSort {
    public  static  void main(String[] args){
        int[] Arr = {21,1,2,4,3,6,5,7,8,9,10,11,20,19,18,17,16,15,14,13,12};
        int n=0;
        for(int outer=0;outer<Arr.length-1;outer++){
            for(int inner=outer+1;inner<Arr.length;inner++){
                int temp;
                if(Arr[outer]>Arr[inner]){
                    temp=Arr[outer];
                    Arr[outer]=Arr[inner];
                    Arr[inner]=temp;
                    n++;
                }
            }
        }
        for(int a:Arr){
            System.out.print(a+";");
        }
        System.out.println(n);
    }
}
