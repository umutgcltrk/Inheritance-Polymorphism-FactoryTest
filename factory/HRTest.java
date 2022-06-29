package com.company.part2.ch01.factory;

import java.io.Serializable;

public class HRTest implements Serializable {

    public static void main(String[] args) {
        HR hr = new HR();

        Employee e = hr.getAnEmployee();
        if (e instanceof Director) {
            Director d3 = (Director) e;
            System.out.println("Hoşgeldiniz sayın director");
        } else if (e instanceof Manager) {
            Manager m = (Manager) e;
            System.out.println("Hoşgeldiniz sayın manager");
        } else if (e instanceof Secretary) {
            Secretary s = (Secretary) e;
            System.out.println("Hoşgeldiniz sayın sekreter");
        } else if (e instanceof Engineer) {
            Engineer engineer = (Engineer) e;
            System.out.println("Hoşgeldiniz sayın mühendis");
        }else
            System.out.println("Hoşgeldiniz sayın çalışan ");
            e.work();
//        e.work();
//        System.out.println();

    }
}
