package FindGcd_Lcm;
//辗转相除法

public class FindGcd1 {
    public void Find(int Num1,int Num2){
        int max=Math.max(Num1,Num2);
        int min=Math.min(Num1,Num2);
        if(min==0){
            System.out.println("wrong scan");
        }else if (max%min==0){
            System.out.println(min);
        }else{
            while(min!=0) {
                int temp = max%min;
                max=min;
                min=temp;
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args){
        FindGcd1 find=new FindGcd1();
        find.Find(108,54);

    }
}
