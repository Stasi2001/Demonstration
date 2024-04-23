package com.example.demonstration;

interface CodeDemonstrator {
    void makeCode();
}
class JavaClassDemo implements CodeDemonstrator {
    private final ClassNameGenerator classNameGenerator;

    public JavaClassDemo(ClassNameGenerator classNameGenerator) {
        this.classNameGenerator = classNameGenerator;
    }

    @Override
    public void makeCode() {
        String className = classNameGenerator.generateClassName();
        System.out.println("public class " + className + " {");
        System.out.println("}");
    }

    interface ClassNameGenerator {
        String generateClassName();
    }
}