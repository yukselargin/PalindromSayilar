import java.util.Scanner;

public class Main {
    static boolean isPolindrom(int number){
        int tempNum=0, digitNum,reverseNum=0;
        tempNum=number;
        while(tempNum!=0){
            digitNum=tempNum%10;
            reverseNum= (reverseNum*10)+digitNum;
            tempNum/=10;
        }

        if(reverseNum==number){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args){
        String result="";
        Scanner input= new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number= input.nextInt();

        if (isPolindrom(number)==true){
            result = "Palindrom sayıdır";
        }else{
            result = "Palindrom sayı değildir";
        }
        System.out.print(number+" "+result);

    }
}