package com.bjpowernode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test01 {
    @Test
    public void test01(){
        List<String> list= new ArrayList<>();
        list.add("小红");
        list.add("校长");
        list.add("喜爱");
        list.add("钢铁侠");
     Iterator<String>D= list.iterator();
        while (D.hasNext()){
          String S=  D.next();
          if(S.equals("喜爱")){
              list.add("粘人的猪");
          }
            System.out.println(S);
        }
/*for(String E :list){

    System.out.println(E);
}*/

    }
}




