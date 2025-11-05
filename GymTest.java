package com.codegnan.oopexamples;
public class GymTest {
    public static void main(String[] args) {
        try {
            new Membership("Tom Wilson", "Premium", 50.0).displayMembership();
            new Membership("Wilson", "Basic", 30.0).displayMembership();
            new Membership("Mark Lee", "Standard", 0.0).displayMembership();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            new Membership("Emma Davis", "Basic", 25.0).displayMembership();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
