package study;

import javax.sound.midi.Soundbank;
import java.util.*;

class ListClass{
void printArrayList(){
    //primitive data types int,float,long. not used instead of can use wrapper class -Integer,String..
    ArrayList<String> name=new ArrayList<>();//can define without any fixed size
    name.add("pavi");
    name.add("jack");
    name.set(0,"lia");
    System.out.println("Names:");
    for (String s : name) {
        System.out.println(s);
    }
    name.clear();//clears all data in arraylist
    System.out.println(name.clone());
    ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(112,23,25,25));//Arraylist with fixed values using asList
    numbers.add(456);
    System.out.println(numbers);
    ArrayList list=new ArrayList(); //without any datatype
    list.add(1);//add any values ,strings,integer ,float... in same variable
    list.add("abc");
    list.add(5);
    Iterator it=list.iterator();
    System.out.println("List of values:");
    while(it.hasNext()){
        System.out.println("List :"+it.next());
    }
    System.out.println("4 index"+list.get(2));
}
void printStack(){
    Stack<String> name=new Stack<>();
    name.add("111");
    System.out.println("Hashcode for name: "+name.hashCode());
    name.push("112");
    name.push("113");
    System.out.println("Names:"+name);
    Stack<String> name1=new Stack<>();
    name1.push("pavi");
    name1.push("ria");
    name.pop();
    System.out.println("After push and pop:"+name);
    System.out.println(name.peek());
    System.out.println("get"+name.get(0));
    System.out.println("retain all:"+name.retainAll(name1));
}
void printSet(){
    HashSet<String> bag=new HashSet<>();
    bag.add("paper");
    bag.add("pen");
    System.out.println(bag.iterator().next());
}
void printHashMap(){
    Map<Integer,String> book=new HashMap<>();
    book.put(1,"a");
    book.put(10,"k");
    System.out.println(book.get(1));
    System.out.println(book.entrySet());
    for(Map.Entry m:book.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
    }
}
}
public class Collections {
    public static void main(String[] args) {
        ListClass lcObj=new ListClass();
        System.out.println("Array List");
        lcObj.printArrayList();
        System.out.println("Hash Set");
        lcObj.printSet();
        System.out.println("Hash Map");
        lcObj.printHashMap();
    }
}
