/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author User
 */
public class Test {

    public static void main(String[] args) {
        A a1 = A.createInstance(10);
        A a2 = A.createInstance(10);

        System.out.println(a1 == a2);
    }
}

class A {

    private A() {

    }

    private static final HashMap<Integer, A> POOL = new HashMap<>();

    public static A createInstance(int i) {

        A a = POOL.get(i);
        if (a == null) {
            a = new A();
            a.i = i;
            POOL.put(i, a);
        }

        return a;
    }

    private int i = 10;

    public int getI() {
        return i;
    }

    public A setI(int i) {
        return A.createInstance(i);
    }
}
