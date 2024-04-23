package com.example.demonstration;

class CatGenerator implements JavaClassDemo.ClassNameGenerator {

    @Override
    public String generateClassName() {
        return "Cat";
    }

}