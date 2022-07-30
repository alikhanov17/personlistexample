package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static Scanner scanner = new Scanner(in);
    public static int id;
    public static int age;
    public static String name;
    public static int n;
    public static int n1;

    public static void main(String[] args) {

        ArrayList<Person> personArrayList = new ArrayList<>();


        while (true) {


            System.out.println("[1] Malumotni qo'shish ");
            System.out.println("[2] Malumotni ko'rish ");
            System.out.println("[3] Malumotni o'chirish ");
            System.out.println("[4] Malumotlarni bittalab o'chirish ");
            System.out.println(" = ");
            n = scanner.nextInt();

            if (n==1){

                System.out.println("ID ni kiriting ");
                id = scanner.nextInt();
                System.out.println("Isimni kiriting ");
                name = scanner.next();
                System.out.println("Yoshni Kiriting");
                age = scanner.nextInt();


                personArrayList.add(new Person(id, name, age));

            } else if (n == 2) {
                Collections.sort(personArrayList);
                personArrayList.forEach(person -> {
                    System.out.println("Ismi: " + person.name + ", IDsi: " + person.id + ", Yoshi: " + person.age);
                    if (person.getId()==0){
                        System.out.println("id kiritilmagan ");
                    }
                    else if (person.getName()==null){
                        System.out.println("isim kiritilmagan ");
                    }
                    else if (person.getAge()==0){
                        System.out.println("yosh kritilmagan ");
                    }

                });
                System.out.println();


            }else if (n==3) {
                personArrayList.clear();


            }

            else if(n==4){

                personArrayList.forEach(person -> {
                    System.out.println("Ismi: " + person.name + ", IDsi: " + person.id + ", Yoshi: " + person.age);
                });
                System.out.println("tanlang:");
String rname = scanner.next();
personArrayList.removeIf(person -> rname.equals(person.getName()));

            }
    }
}}




