package com.example.demonstration;

class RandomShapeGenerator implements JavaClassDemo.ClassNameGenerator {
    private String[] shapes = {"Circle", "Square", "Triangle", "Rectangle"};
    @Override
    public String generateClassName() {
        int index = (int) (Math.random() * shapes.length);
        return shapes[index];
    }
}
