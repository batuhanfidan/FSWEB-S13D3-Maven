package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double heigth){
        this.width = width;
        this.height = heigth;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double setWidth(double width) {
        if(width < 0) {
            return this.width = 0;
        } else {
            return this.width = width;
        }
    }

    public double setHeight(double heigth) {
        if(heigth < 0) {
            return this.height = 0;
        } else {
            return this.height = heigth;
        }
    }

    public double getArea() {
        return this.width * this.height;
    }
}
