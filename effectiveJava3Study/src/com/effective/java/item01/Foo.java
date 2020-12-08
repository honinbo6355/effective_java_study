package com.effective.java.item01;

import java.util.EnumSet;

import static com.effective.java.item01.Foo.Color.BLUE;
import static com.effective.java.item01.Foo.Color.WHITE;
import static com.effective.java.item01.Foo.Color.RED;

public class Foo {
    String name;

    String address;

    public Foo() {

    }

    private static final Foo GOOD_NIGHT = new Foo();

    public Foo(String name) {
        this.name = name;
    }

    public static Foo withName(String name) {
        return new Foo(name);
    }

    public static Foo withAddress(String address) {
        Foo foo = new Foo();
        foo.address = address;
        return foo;
    }

    public static Foo getFoo() {
        return GOOD_NIGHT;
    }

    public static Foo getFoo(boolean flag) {
        return flag ? new Foo() : new BarFoo();
    }

    public static void main(String[] args) {
        Foo foo = new Foo("keesun");

        Foo foo1 = Foo.withName("keesun");

        Foo foo2 = Foo.getFoo();

        Foo foo3 = Foo.getFoo(false);

        EnumSet<Color> colors = EnumSet.allOf(Color.class);

        EnumSet<Color> blueAndWhite = EnumSet.of(BLUE, WHITE);
    }

    static class BarFoo extends Foo {

    }

    enum Color {
        RED, BLUE, WHITE
    }
}
