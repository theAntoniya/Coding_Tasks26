package Week2;

public class T3_Consecutive {

    public static void test3(int N){
        if (N<=0){
            throw new RuntimeException("N cannot be 0 or less");
        }
        String num;
        String words = "CodilityTestCoders";

        for (int i = 1; i <= N; i++) {
            num=String.valueOf(i);
          if (i%2==0){
                num=words.substring(0,words.indexOf('T'));
              if (i%5==0){
                  num=words.replaceAll("Test","");
              }
                if(i%3==0){
                    num=words.substring(0,words.lastIndexOf('C'));
                    if (i%5==0){
                        num=words;
                    }
                }

            }else if (i%3==0) {
                num=words.substring(words.indexOf('T'),words.lastIndexOf('C'));
              if (i%5==0) {
                  num=words.substring(words.indexOf('T'),words.length());
              }

            } else if (i%5==0) {
                num=words.substring(words.lastIndexOf('C'),words.length());

            }


            System.out.println(num);
        }
    }

    public static void main(String[] args) {
       test3(15);
    }
}
