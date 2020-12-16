package com.bjpowernode;




import org.junit.Test;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class HashSetTest {
    public static void main(String[] args) {
        //HashSet特点：无序不可重复
        Set<String> set= new HashSet<String>();
        set.add("hello10");
        set.add("hello8");
        set.add("hello9");
        set.add("hello5");
        set.add("hello1");
        set.add("hello1");
        set.add("hello1");


        Iterator iterator =set.iterator();
        while(iterator.hasNext()){
            String string = (String) iterator.next();
            System.out.println(string);
            /*hello1
             hello10
               hello5
                  hello8
                 hello9*/
        }

    }
    @Test
public void  treeSetTest01(){
        /*TreeSet存储特点：
        无序不可重复，可以按照大小排列
        无序：存进去和取出来的顺序不同并且没有下标
        */
        Set<String> set=new TreeSet<>();
        set.add("G");
        set.add("D");
        set.add("A");
        set.add("D");
        set.add("B");
        set.add("H");
        set.add("A");
        for(String S:set){
            System.out.println(S);
            /*A
              B
              D
              G
              H*/
        }

    }

    public void  HashMapTest01(){
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"张强");
        map.put(44,"伟大");
        map.put(45,"张强");
        map.put(33,"安徽");
        map.put(27,"味道");
        //通过K拿到value
/* String D= map.get(010);
        System.out.println(D);*/
        System.out.println("键值对数量="+map.size());
        System.out.println("====================");
        System.out.println(map.keySet()+map.get(map.keySet()));
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        /*for (String v : map.values()) {
            System.out.println("value= " + v);}*/
        for (Integer key : map.keySet()) {
            System.out.println("key= "+ key + " and value= " + map.get(key));
        }

    }
}
