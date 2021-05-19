package com.test;

import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list.size()); //выводит размер
        list.addFirst(-5);//добавляет первый элемент
//        offer, add, addLast - вставляют элемент в конец списка
        list.add(2);
        list.addLast(5);//добавляет последний элемент
        System.out.println(list.indexOf(5)); //если есть этот элемент, выводит его индекс, если такого элемента нет, выводит -1
        System.out.println(list.remove(2));//удалить элемент по индексу, а если без аргумента, то удаляет первый элемент
        System.out.println(list.peek());//выводит первый элемент
        System.out.println(list.poll());//выводит и удаляет первый элемент
//        list.clear();//очищает список
        System.out.println(list);
    }
}
