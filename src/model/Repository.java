package model;

import java.util.*;

public class Repository {
    private static Queue<Person> persons = new LinkedList<>();
    private static int index = 0;
    private static boolean firstTime = true;

    public static Queue<Person> generatePersons() {
        persons.add(new Person().
                setAge(10).
                setName("Вася").
                setFreeTime(100).
                setMoney(5000).
                setPreferences(new Preferences(false, true,true, 10)));
        persons.add(new Person().
                setAge(19).
                setName("Вика").
                setFreeTime(25).
                setMoney(750).
                setPreferences(new Preferences(true, false,true, 19)));
        persons.add(new Person().
                setAge(35).
                setName("Маша").
                setFreeTime(45).
                setMoney(1500).
                setPreferences(new Preferences(false, true,true, 35)));
        persons.add(new Person().
                setAge(22).
                setName("Катя").
                setFreeTime(10).
                setMoney(10000).
                setPreferences(new Preferences(false, true,false, 22)));
        persons.add(new Person().
                setAge(11).
                setName("Тимофей").
                setFreeTime(70).
                setMoney(2500).
                setPreferences(new Preferences(false, false,true, 40)));
        persons.add(new Person().
                setAge(19).
                setName("Семён").
                setFreeTime(50).
                setMoney(4500).
                setPreferences(new Preferences(true, true,false, 19)));
        persons.add(new Person().
                setAge(18).
                setName("Валерия").
                setFreeTime(15).
                setMoney(200).
                setPreferences(new Preferences(false, false,true, 18)));

        return persons;
    }

//    public static Person getPerson() throws Exception {
//        if(firstTime) {generatePersons(); firstTime = false; }
//
//        if(index==persons.size()-1) {
//            throw new Exception("Люди закончились.");
//        } else{
//            return persons.get(index++);
//        }
//    }
}
