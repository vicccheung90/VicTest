package FindGcd_Lcm;
//枚举法

public class FindGcd_Lcm {
    public void FindGcd(int Num1,int Num2){
        int min;
        int max;
        if(Num1>=Num2){
            min=Num2;
            max=Num1;
        }else {
            min=Num1;
            max=Num2;
        }
        for(int i=min;i>0;i--){
            if(min%i==0&&max%i==0){
                System.out.println(i);
                break;
            }
        }
    }
    public void FindLcm(int Num1,int Num2){
        int min;
        int max;
        if(Num1>=Num2){
            min=Num2;
            max=Num1;
        }else {
            min=Num1;
            max=Num2;
        }
        for(int i=1;i<min;i++){
            if(i*min%max==0){
                System.out.println(i*min);
                break;
            }
        }

    }
    public static void main(String[] args){
        FindGcd_Lcm find = new FindGcd_Lcm();
        find.FindGcd(12,8);
        find.FindLcm(12,8);
    }
}
