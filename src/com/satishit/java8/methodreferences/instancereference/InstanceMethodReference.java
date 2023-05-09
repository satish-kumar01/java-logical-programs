package com.satishit.java8.methodreferences.instancereference;

//Method reference to Instance method:
public class InstanceMethodReference {
    public void m2(int i){
        System.out.println("From method reference: "+i);
    }
    //In the above example functional interface method m1() referring to
    // InstanceMethodReference class instance method m2().
    //The main advantage of method reference is
    // we can use already existing code to implement functional interfaces (code reusability).
    public static void main(String[] args) {
        Interf f = i -> System.out.println("From Lambda Expression:"+i);
        f.m1(10);
        InstanceMethodReference imf = new InstanceMethodReference();
        Interf i1 = imf::m2;
        i1.m1(20);
    }

}
