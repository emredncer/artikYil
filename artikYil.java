import java.util.Scanner;
public class artikYil {
    public static void main(String[] args) {
        boolean isError = false;
        int year ;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl değerini giriniz: ");
        year = input.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println(year+" Bir artık yıldır.");
                }else {
                    isError = true;
                }
            }else {
                System.out.println(year+" Bir artık yıldır.");
            }
        }else {
            isError = true;
        }
        if (isError){
            System.out.println(year+" Bir artık yıl değildir.");
        }
    }
}
