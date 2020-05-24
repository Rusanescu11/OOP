package Singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("test");
        list.add("test1");
        String filename="filename";
        FileScanner fileScanner=FileScanner.getInstance();
        fileScanner.write(list,filename);
        List<String> stringList0=fileScanner.read(filename);
        System.out.println(stringList0.get(0)+" "+stringList0.get(1));


        List<String>list1=new ArrayList<>();
        list1.add("test4");
        list1.add("test5");
        String filename2="filename";
        fileScanner.write(list1,filename2);
        List<String> stringList=fileScanner.read(filename2);
        System.out.println(stringList.get(0)+" "+stringList.get(1));
    }
}
