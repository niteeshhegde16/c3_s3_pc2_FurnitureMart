package com.furniture;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem fur = new FurnitureItem();
        System.out.print("Furniture code = ");
        fur.setFurnitureCode(5);
        System.out.println(fur.getFurnitureCode());
        System.out.print("Furniture type = ");
        fur.setFurnitureType("table");
        System.out.println(fur.getFurnitureType());
        System.out.print("Furniture grade = ");
        fur.setGradeOFFurniture(1);
        System.out.println(fur.getGradeOFFurniture());
        System.out.print("Furniture usage = ");
        fur.setFurnitureUsage("outdoor");
        System.out.println(fur.getFurnitureUsage());
        System.out.print("Furniture price = ");
        fur.setPrice(10);
        System.out.println(fur.getPrice());
        if (fur.getGradeOFFurniture() == 1 && fur.getFurnitureUsage() == ("outdoor")) {
            double discount = fur.getPrice() * 0.05;
            discount = fur.getPrice() - discount;
            System.out.println("Price after discount " + discount);
        } else {
            System.out.println("discount is not available");


        }


    }


}



