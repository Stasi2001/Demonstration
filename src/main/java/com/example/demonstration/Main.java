package com.example.demonstration;

public class Main {
    public static void main(String[] args) {

        JavaClassDemo.ClassNameGenerator catGenerator = (JavaClassDemo.ClassNameGenerator) new CatGenerator();
        CodeDemonstrator javaClassDemo = new JavaClassDemo(catGenerator);
        javaClassDemo.makeCode();



        JavaClassDemo.ClassNameGenerator shapeGenerator = new RandomShapeGenerator();
        CodeDemonstrator javaClassDemo2 = new JavaClassDemo(shapeGenerator);
        javaClassDemo2.makeCode();
    }
}
