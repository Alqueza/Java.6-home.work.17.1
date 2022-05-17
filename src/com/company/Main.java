package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow1 = new Cow(100,6,'M',"Cow-1");
        Cow cow2 = new Cow(110,7,'W',"Cow-2");
        Cow cow3 = new Cow(120,8,'M',"Cow-3");
        Cow cow4 = new Cow(130,9,'W',"Cow-4");
        Cow cow5 = new Cow(130,10,'M',"Cow-5");
        Cow cow6 = new Cow(150,12,'M',"Cow-6");

        Sheep sheep1 = new Sheep(100,7,'W',"Sheep-1");
        Sheep sheep2 = new Sheep(120,8,'M',"Sheep-2");
        Sheep sheep3 = new Sheep(130,9,'W',"Sheep-3");
        Sheep sheep4 = new Sheep(140,10,'W',"Sheep-4");

        Horse horse1 = new Horse(130,4,'W',"Horse-1","Brown");
        Horse horse2 = new Horse(110,4,'W',"Horse-2","Black");
        Horse horse3 = new Horse(130,6,'M',"Horse-3","White");

        Farm farm1 = new Farm("Farm1",new Cow[] {cow1,cow2,cow3,cow4,cow5},
                new Horse[]{horse1,horse2},
                new Sheep[]{sheep1,sheep2,sheep3},
                "Adilet");

        Farm farm2 = new Farm("Farm2",
                new Cow[] {cow6},
                new Horse[] {horse3},
                new Sheep[] {sheep4},
                "Bolot");
        System.out.println(farm1);
        System.out.println();
        System.out.println(farm2);
    }
}
