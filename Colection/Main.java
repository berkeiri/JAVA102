package Colection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hSet =new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        hSet.add(10);
        int i=0;
        for (Integer sayi:hSet){
            i++;
            System.out.println(i+"sayi: "+sayi);
        }

        TreeSet<Student> students=new TreeSet<>(new OrderNoteComparator());
        students.add(new Student("mustafa",60));
        students.add(new Student("amo",40));
        students.add(new Student("cafer",30));
        for (Student stu:students) {
            System.out.println(stu.getName());
        }

    }



}
