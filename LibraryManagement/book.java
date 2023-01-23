package LibraryManagement;

import java.util.ArrayList;

class book {
    ArrayList<String> books = new ArrayList<>();
    ArrayList<String> displayBooks(String b) {
        //ArrayList<String> books=new ArrayList<>();
        books.add("b1");
        books.add("b2");
        books.add("b3");
        books.add("b4");
       for (String book : books) {
            System.out.println(book);
        }
        return books;
    }
    void displayMenu(){
        System.out.println("press 0 to Exit");
        System.out.println("press 1 to checkAvailability");
        System.out.println("press 2 to get book");
        System.out.println("press 3 to return book");
        System.out.println("press 4 to check return date");
        System.out.println("Press 5 to Register");
    }

}


