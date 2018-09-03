package Sort;

public class ShellSort {
    public static void main(String [] args)
    {
        int[]a={11,10,9,8,7,6,5,4,3,2,1};
        System.out.println("排序之前：");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        //希尔排序
        int d=a.length;
        while(true)
        {
            d=d/2;
            for(int x=0;x<d;x++)
            {
                for(int i=x+d;i<a.length;i=i+d)
                {
                    int temp=a[i];
                    int j;
                    for(j=i-d;j>=0&&a[j]>temp;j=j-d)
                    {
                        a[j+d]=a[j];
                    }
                    a[j+d]=temp;
                }
            }
            for(int b:a){
                System.out.print(b+";");
            }
            System.out.println();
            if(d==1)
            {
                break;
            }
        }
        System.out.println();
        System.out.println("排序之后：");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
