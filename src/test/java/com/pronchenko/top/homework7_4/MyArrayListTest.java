package com.pronchenko.top.homework7_4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyArrayListTest {
    @Test
    void getSizeTest(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.pushBack(2);
        arrayList.pushBack(7);
        arrayList.pushBack(0);
        arrayList.pushBack(7);
        Assertions.assertEquals(4,arrayList.getSize());
    }

    @Test
    void toStringTest(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.pushBack(2);
        arrayList.pushBack(7);
        arrayList.pushBack(0);
        arrayList.pushBack(7);
        String str = "2 7 0 7 ";
        Assertions.assertEquals(str,arrayList.toString());
    }

    @Test
    void pushBackTest(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.pushBack(2);
        arrayList.pushBack(7);
        arrayList.pushBack(0);
        arrayList.pushBack(7);
        String str = "2 7 0 7 ";
        Assertions.assertEquals(str,arrayList.toString());
    }

    @Test
    void pushBackMemoryTest(){
        MyArrayList<Integer> arrayList = new MyArrayList<>(4);
        arrayList.pushBack(2);
        arrayList.pushBack(7);
        arrayList.pushBack(0);
        arrayList.pushBack(7);
        arrayList.pushBack(7);
        Assertions.assertEquals(5,arrayList.getSize());
    }

    @Test
    void popFrontTest(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.pushBack(2);
        arrayList.pushBack(7);
        arrayList.pushBack(0);
        arrayList.pushBack(7);
        arrayList.popFront();
        String str = "7 0 7 ";
        Assertions.assertEquals(str,arrayList.toString());
    }

    @Test
    void pushFrontTest(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.pushBack(2);
        arrayList.pushBack(7);
        arrayList.pushBack(0);
        arrayList.pushBack(7);
        arrayList.pushFront(8);
        String str = "8 2 7 0 7 ";
        Assertions.assertEquals(str,arrayList.toString());
    }

    @Test
    void insertTest(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.pushBack(2);
        arrayList.pushBack(7);
        arrayList.pushBack(0);
        arrayList.pushBack(7);
        arrayList.insert(2,8);
        String str = "2 7 8 0 7 ";
        Assertions.assertEquals(str,arrayList.toString());
    }

    @Test
    void insertMemoryTest(){
        MyArrayList<Integer> arrayList = new MyArrayList<>(4);
        arrayList.pushBack(2);
        arrayList.pushBack(7);
        arrayList.pushBack(0);
        arrayList.pushBack(7);
        arrayList.insert(2,8);
        Assertions.assertEquals(5,arrayList.getSize());
    }

    @Test
    void removeAtTest(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.pushBack(2);
        arrayList.pushBack(7);
        arrayList.pushBack(0);
        arrayList.pushBack(7);
        arrayList.removeAt(2);
        String str = "2 7 7 ";
        Assertions.assertEquals(str,arrayList.toString());
    }

    @Test
    void removeTest(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.pushBack(2);
        arrayList.pushBack(7);
        arrayList.pushBack(0);
        arrayList.pushBack(7);
        arrayList.remove(7);
        String str = "2 7 0 ";
        Assertions.assertEquals(str,arrayList.toString());
    }

    @Test
    void removeAllTest(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.pushBack(2);
        arrayList.pushBack(7);
        arrayList.pushBack(0);
        arrayList.pushBack(7);
        arrayList.removeAll(7);
        String str = "2 0 ";
        Assertions.assertEquals(str,arrayList.toString());
    }

    @Test
    void popBack(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.pushBack(2);
        arrayList.pushBack(7);
        arrayList.pushBack(0);
        arrayList.pushBack(7);
        arrayList.popBack();
        String str = "2 7 0 ";
        Assertions.assertEquals(str,arrayList.toString());
    }

    @Test
    void clearTest(){
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        arrayList.pushBack(2);
        arrayList.pushBack(7);
        arrayList.pushBack(0);
        arrayList.pushBack(7);
        arrayList.clear();
        String str = "";
        Assertions.assertEquals(str,arrayList.toString());
        Assertions.assertEquals(0,arrayList.getSize());
    }



}
