package week3_tasks;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        double totalSumCubed=0;
        Integer num=1634;
        String numAsStr=num.toString();

        for(int i=0;i<numAsStr.length();i++){
            totalSumCubed+=Math.pow(Integer.parseInt(numAsStr.substring(i,i+1)),numAsStr.length());
        }
        if(totalSumCubed==num){
            System.out.println(num+" is Armstrong number!");
        }else{
            System.out.println(num+" is not an Armstrong number");
            System.out.println(totalSumCubed);
        }
    }
}
