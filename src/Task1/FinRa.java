package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FinRa {
   /*  3.Numbers -- FINRA
    Write a method which prints out the numbers from 1 to 30 but for numbers which are a
     multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5
     , print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print
     "FINRA" instead of the number.
            */

    public ArrayList<Object> frinRa(int num){
        ArrayList<Object> list = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if(i % 3== 0 ){

                if (i % 5 ==0){
                    list.add("FinRa");
                    continue;
                }
                list.add("Fin");
            } else if (i %5==0) {
                list.add("Ra");
            }
            else {list.add(i);}
        }
        return list;
    }


}
