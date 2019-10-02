package com.week5.week5;

import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public void findById(long id) {
        personList.contains(id);
    }

    public void contains(Person person) {
        personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        personList.remove(id);
    }

    public void removeAll(){
        personList.clear();
    }

    public void count(){
        personList.size();
    }

    public void toArray(){
        personList.toArray();
    }

    public void iterator(){
        personList.iterator();
    }
}
