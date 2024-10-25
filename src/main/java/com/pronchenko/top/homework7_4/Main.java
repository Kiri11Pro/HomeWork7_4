package com.pronchenko.top.homework7_4;


public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> arrayList = new MyArrayList<>(3);
        System.out.println(arrayList);
        arrayList.pushBack(2);
        System.out.println(arrayList);
        arrayList.pushBack(3);
        System.out.println(arrayList);
        arrayList.pushBack(2);
        System.out.println(arrayList);
        arrayList.pushBack(3);
        System.out.println(arrayList);
        arrayList.pushBack(2);
        System.out.println(arrayList);
        arrayList.pushBack(3);
        System.out.println(arrayList);
        arrayList.pushBack(2);
        System.out.println(arrayList);
        arrayList.popFront();
        System.out.println(arrayList);
        arrayList.pushFront(5);
        System.out.println(arrayList);
        arrayList.pushFront(6);
        System.out.println(arrayList);
        arrayList.pushFront(7);
        System.out.println(arrayList);
        arrayList.insert(2, 10);
        System.out.println(arrayList);
        arrayList.removeAt(2);
        System.out.println(arrayList);
        arrayList.removeAt(9);
        System.out.println(arrayList);
        arrayList.remove(9);
        System.out.println(arrayList);
        arrayList.remove(6);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.getSize());
        arrayList.removeAll(3);
        System.out.println(arrayList);
        arrayList.popBack();
        System.out.println(arrayList);
        arrayList.popFront();
        System.out.println(arrayList);
        System.out.println(arrayList.getSize());
        arrayList.clear();
        System.out.println(arrayList);
        MyArrayList<String> arrayListStr = new MyArrayList<>();
        System.out.println(arrayListStr);
        arrayListStr.pushBack("fads");
        System.out.println(arrayListStr);
    }
}