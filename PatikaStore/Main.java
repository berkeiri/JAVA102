package PatikaStore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String markayaGore=input.nextLine();
        CellPhone.getPhonesByMarka(CellPhone.getPhones(),markayaGore);


    }



}
