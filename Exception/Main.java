package Exception;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input= new Scanner(System.in);
        System.out.println("yaş giriniz:");
        int age=input.nextInt();
        checkAge(age);

    }
    public static void checkAge(int age) throws Exception {
        if (age<18){
            throw new Exception("yaşınız tutmuyor");

        }
        System.out.println("yaşı uygundur");
    }



}
