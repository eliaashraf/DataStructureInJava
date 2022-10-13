package com.javadatastructures;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class WorkingwithSets {
    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue")); //This value will be not be read
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);
        balls.remove("red");

    }

    static class Ball{ //TO consider the second blue ball as element
        String color;
        public Ball(String color){
            this.color = color;
    }
        //overriding the equals and troString methods so that the Ball() function does not destroy the properties of Sets.
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(color, ball.color);
        }

        @Override
        public int hashCode() {
            return Objects.hash(color);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "color='" + color + '\'' +
                    '}';
        }

        //record Ball(String color){ }

    }
}
