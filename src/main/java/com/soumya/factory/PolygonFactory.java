package com.soumya.factory;

public class PolygonFactory {
    public Polygon getPolygon(int numberOfSides) {
        if(numberOfSides == 3) {
            return new Triangle();
        }
        else if (numberOfSides == 4) {
            return new Square();
        }
        else
            return null;
    }

    public static void main(String[] args) {
        PolygonFactory p = new PolygonFactory();
        System.out.println(p.getPolygon(3).description());
        System.out.println(p.getPolygon(4).description());
    }
    }
