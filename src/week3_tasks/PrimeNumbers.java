package week3_tasks;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n=12;
        int checker=0;

        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println(n+" is not prime");
                checker=1;
                break;
            }
        }
        if(checker==0){System.out.println(n+" is prime");}


    }
}
