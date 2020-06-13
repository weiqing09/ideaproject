package com.sanwater.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        List<String> names = Stream.of("小明","哈哈").collect(Collectors.toList());
        List<Integer> age = Stream.of(1,3).collect(Collectors.toList());

        List<Person> users = new ArrayList<>();
        names.forEach(n->{
            Person pp = new Person();
            pp.setName(n);
            users.add(pp);
        });

        System.out.println("dsadas");

        for (int i = 0; i < users.size(); i++) {
            users.get(i).setAge(age.get(i));
        }

        for (Person a:users) {
            System.out.println(a);
        }
    }
}

class Person{
    String name ;
    int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    @Override
    public String toString(){
       return "姓名："+this.name+",年龄："+this.age;
    }
}
