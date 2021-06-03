package com.company;

enum Season {
    WINTER(-20), SPRING(12), SUMMER(28) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(18);
    private double avgTmp;

    Season(double avgTmp) {
        this.avgTmp = avgTmp;
    }

    public double getAvgTmp() {
        return avgTmp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}

public class Main {
    public static void main(String[] args) {
        Season season = Season.SUMMER;
        System.out.println(season);
        print(Season.AUTUMN);
        printAllValues();
    }

    public static void print(Season season) {
        switch (season) {
            case WINTER:
                System.out.print("I like Winter");
                break;
            case SPRING:
                System.out.print("I like Spring");
                break;
            case SUMMER:
                System.out.print("I like Summer");
                break;
            case AUTUMN:
                System.out.print("I like Autumn");
                break;
        }
    }

    public static void printAllValues() {
        for (Season s : Season.values()) {
            System.out.println(s + " " + s.getAvgTmp() + " " + s.getDescription());
        }
    }
}