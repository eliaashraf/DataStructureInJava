package com.javadatastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {

    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("African Diamond"));

        System.out.println(new Person("Jamila").hashCode());
        System.out.println(new Person("Jamila").hashCode());

        System.out.println(map.get(new Person("Jamila"))); //will give default and needs overriding
    }
    public static void maps(){
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Mariam"));
        map.put(3, new Person("Ali"));
        //map.put(3, new Person("Aliya"));//will override the above key-value pair
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(3);

        //map.entrySet().forEach(System.out::println);
        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });

        System.out.println(map.getOrDefault(3, new Person("Default")));
        System.out.println(map.values());

    }

    static class Person{
        String name;

        public Person(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        //Always override equals and hashCode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override //if not overriden then lines 13 and 14 would not return the same keys
        public int hashCode() {
            return Objects.hash(name);
        }

    }

    record Diamond(String name){} //record already provides overiding for Hashcodes which classes do not
}
