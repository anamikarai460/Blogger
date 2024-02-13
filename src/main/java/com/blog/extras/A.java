package com.blog.extras;

import java.util.function.Consumer;

public class A {
    public static void main(String[] args){
//        Function<Integer, String> myFunction = i -> "Result:"+i;
//        String val = myFunction.apply(100);
//        System.out.println(val);
//
//        Function<Integer , Double> myFunction = i -> i*1.3;
//        double val = myFunction.apply(100);
//        System.out.println(val);


//        Supplier<String> mySupplier = () -> "Supplied value";
//        String s = mySupplier.get();
//        System.out.println(s);
//
//        Supplier<A> mySupplier = () -> new A();
//        A s = mySupplier.get();
//        System.out.println(s);


        Consumer<String> myConsumer = s ->System.out.println("Consumed:"+s);
        myConsumer.accept("Hello");
    }
}

