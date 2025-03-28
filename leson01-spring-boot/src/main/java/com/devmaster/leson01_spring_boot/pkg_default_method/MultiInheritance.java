package com.devmaster.leson01_spring_boot.pkg_default_method;
interface Interface1 {
    default void method1() {
        System.out.println("Interface1.method1");
    }
}
interface Interface2 {
    default void method2() {
        System.out.println("Interface2.method2");
    }
}
public class MultiInheritance implements Interface1, Interface2 {
    @Override
    public void method1() {
        Interface1.super.method1();
    }

    // trùng với phương thức default trong interface2
    public void method2() {
        System.out.println("MultiInheritance.method2");
    }

    public static void main(String[] args) {
        MultiInheritance mi = new MultiInheritance();
        mi.method1();
        mi.method2();
    }
}
