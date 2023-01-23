package LibraryManagement;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public interface memberRegistration {

   default void register(){
       System.out.println("press Yes to continue registration");
       String c;
       ArrayList<Integer> rId = new ArrayList<>();
       ArrayList<String> rName = new ArrayList<>();
       rName.add("Pavi");
       rId.add(124);
       do {
           Scanner sc = new Scanner(System.in);
           //c=sc.next();
           String name;
           Integer id;
           System.out.println("Enter name");
           name = sc.next();
           System.out.println("Enter id (ex:123)");
           id = sc.nextInt();
           System.out.println("Registered id's and name's ");
           if (rId.contains(id)) {
               System.out.println("Id Already registered try again..");
           } else {
               rId.add(id);
               rName.add(name);
               System.out.print(rId);
               System.out.println(rName);
           }
           System.out.println("press any key to exit registration");
           c= sc.next();
       }while(Objects.equals(c, "yes"));
   }
    }


