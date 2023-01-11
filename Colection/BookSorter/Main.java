package Colection.BookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> book=new TreeSet<>();
        Book book1=new Book("ademe gitsek",220,"vandam",2020);
        Book book2=new Book("bir sabah",155,"lavuk",1999);
        Book book3=new Book("aramızda kalsın",333,"berke",1777);
        Book book4=new Book("öyle mi acaba",123,"bambam",2222);

        book.add(book1);
        book.add(book2);
        book.add(book3);
        book.add(book4);
        System.out.println("*********************************");
        System.out.println("İSME GÖRE SIRALAMA");
        for(Book bookName:book){

            System.out.println("book name: "+bookName.getBookName()+"number of page: "+bookName.getPaper()+"writer name: "+bookName.getWriterName()+"publish date: "+ book1.getPublishDate());
        }


        TreeSet<Book> books=new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPaper()-o2.getPaper();
            }
        });

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        System.out.println("*********************************");

        System.out.println("SAYFAYA GÖRE SIRALAMA");
        for (Book bookPage:books) {
            System.out.println("book name: "+bookPage.getBookName()+"number of page: "+bookPage.getPaper()+"writer name: "+bookPage.getWriterName()+"publish date: "+ book1.getPublishDate());

        }
        System.out.println("*********************************");


    }
}
