package Week1;

public class Finra {
    public static void finra(int num1) {
        if (num1 == 0) {
            throw new RuntimeException("Incorrect number. Only positive numbers allowed");
        }
        String nums = "";

        for (int i = 1; i <= num1; i++) {
            nums = String.valueOf(i);
            if (i % 3 == 0) {
                nums = "FIN";
            } else if (i % 5 == 0) {
                nums = "RA";
            }
            if (i % 3 == 0 && i % 5 == 0) {
                nums = "FINRA";
            }
            System.out.print(nums + " | ");

        }
    }

    public static void easyFinra(int num1){
        if(num1<=0){
            System.out.println("invalid entry");
            return;
        }
        for (int i = 0; i <= 30; i++) {
            if (i % 15 == 0) {
                System.out.println("FINRA");
            }

            else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }

        }
    }



    public static void main(String[] args) {
        for (int i = 1; i <=30 ; i++) {

            if(i%3==0){
                if (i%5==0){
                    System.out.println("finra");
                    continue;
                }
                System.out.println("fin");
            }else if (i%5==0){
                System.out.println("ra");
            }
            else {
                System.out.println(i);
            }
        }
        easyFinra(5);
    }
}
