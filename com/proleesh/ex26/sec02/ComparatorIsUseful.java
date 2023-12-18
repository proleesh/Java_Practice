package com.proleesh.ex26.sec02;

import java.util.Set;
import java.util.TreeSet;

class Worker implements Comparable<Worker>{
    private int id;

    public Worker(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        return this.id = o.getId();
    }
}
class Boss implements Comparable<Boss>{

    private int id;

    public Boss(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Boss o) {
        return this.id - o.getId();
    }

    @Override
    public String toString() {
        return "Boss{" +
                "id=" + id +
                '}';
    }
}
public class ComparatorIsUseful {
    public static void main(String[] args) {
        Set<Boss> bosses = new TreeSet<>();
        bosses.add(new Boss(20));
        bosses.add(new Boss(10));
        bosses.add(new Boss(15));
        System.out.println(bosses);

        Set<Worker> workers = new TreeSet<>();
        workers.add(new Worker(30));
        workers.add(new Worker(20));
        workers.add(new Worker(10));
        workers.add(new Worker(21));
        System.out.println(workers);

    }
}
