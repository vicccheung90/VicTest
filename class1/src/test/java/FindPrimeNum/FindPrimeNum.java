package FindPrimeNum;

public class FindPrimeNum {

    public void function(int Num,int Max){
       a: for(;Num<=Max;Num++){
            int j;
            for(j=2;j<Num;j++){
                if(Num%j==0){
                    break;
                    }
                }
                if(j==Num){
                    System.out.println(Num);
                }
            }
        }

    public static void main(String[] args){
        FindPrimeNum find = new FindPrimeNum();
        find.function(100,200);
    }
}
