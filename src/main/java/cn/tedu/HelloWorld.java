package cn.tedu;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int sum=0;
        for (int i=0; i<10; i++){
           sum+=i;
        }
        System.out.println(sum);
        List<String> list=new ArrayList<String>();
        list.add("OK");
        System.out.println(list);
    }
}
