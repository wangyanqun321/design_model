package com.wyq.prototype;

public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        clone1();
    }

    public static void clone1() throws CloneNotSupportedException{
        Realizetype obj1 = new Realizetype("zs", 1);
        obj1.setCat(new Cat("red"));
        Realizetype obj2 = (Realizetype) obj1.clone();
        System.out.println(obj1 == obj2);
        obj2.setName("lisis");
        obj2.getCat().setColor("blue");
        System.out.println(obj2);
        System.out.println(obj1);
    }

    public static void clone2() throws CloneNotSupportedException{

    }
}
