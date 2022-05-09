package com.company;

public class Main {

    public static void main(String[] args) {

        //INCAPSULATION
//        Incapsulation incapsulation = new Incapsulation("make", "model", 2022);
//        incapsulation.setMake("nadeaHH");
//        System.out.println(incapsulation.getMake());

        //COPY OBJECTS
        Incapsulation incapsulationOne = new Incapsulation("nadea", "modelOne", 1998);
        Incapsulation incapsulationTwo = new Incapsulation("hope", "modelTwo", 2022);

        incapsulationTwo.copy(incapsulationOne);

        System.out.println(incapsulationOne);
        System.out.println(incapsulationTwo);
        System.out.println();
        System.out.println(incapsulationOne.getMake());
        System.out.println(incapsulationOne.getModel());
        System.out.println(incapsulationOne.getYear());
        System.out.println();
        System.out.println(incapsulationTwo.getMake());
        System.out.println(incapsulationTwo.getModel());
        System.out.println(incapsulationTwo.getYear());
        System.out.println();

        //SUPER KEYWORD
        Hero hero = new Hero("demo hero", 20, "$$$");
        System.out.println(hero.toString());

        //METHOD OVERRIDING
        Dog dog = new Dog();
//        dog.speak();



        //INHERITANCE
        Car car = new Car();
        car.go();

        Bicycle bicycle = new Bicycle();
//        bicycle.stop();
//        System.out.println(car.wheels);

        //STATIC KEYWORD
        Friend friendOne = new Friend("demo fried");
        Friend friendTwo = new Friend("demo fried two");
        System.out.println(Friend.numberOfFriends);

        Friend.displayFriendsNumber();
        //not recommended
//        System.out.println(friendOne.numberOfFriends);


        //OBJECT PASSING
        Garage garage = new Garage();
//        Car car = new Car("BMW");
//        garage.park(car);

        //Todo[] list = new Todo[3];
        Todo listOne = new Todo("cleaning");
        Todo listTwo = new Todo("walk the dog");

        Todo[] list = {listOne, listTwo};

        list[0] = listOne;
        list[1] = listTwo;
//        System.out.println(list[0].name);


        Pizza pizza = new Pizza("thin crust", "tomato", "mozzarella", "pepperoni");
        Pizza smallPizza = new Pizza("nr. 1", "nr. 2", "nr. 3");
//        System.out.println(pizza.bread);
//        System.out.println(smallPizza.cheese);

        DiceRoller diceRoller = new DiceRoller();

        //construct
//        Car car = new Car();
        //explicitly
//        System.out.println(car.toString());
        //explicitly
//        System.out.println(car);
//        car.drive();

        Human human = new Human("nadea", 24, 48.00);
//        human.eat();
//        System.out.println(human.name);
        //tutorial
        Tutorial tutorial = new Tutorial();
//        tutorial.acceptInput();

        //
        Test t = new Test();
//        System.out.println(t.absoluteValue(10));
//        System.out.println(t.calculateTip(125.54));
//        System.out.println(t.nameTagText("Nadea"));

//        System.out.println(t.fahrenheitToCelsius(130.2));
        t.printTemperature(120.5);
//        System.out.println(t.monopolyRoll());
//        System.out.println(t.countBlocks(3));

        String names[] = {"demo", "demo1", "demo34"};
//        System.out.println(t.findLongestName(names));

        Main m = new Main();

//        System.out.println(m.check());

//        System.out.println(t.factorial(5));

        String [] sentence = {"I", "am", "at", "work"};
//        System.out.println(t.indexOfFirstOccurrence(sentence, "here"));

//        System.out.println(t.yearsTilOneMillion(2000));
        String [] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
//        t.printInReverse(weekDays);
//        int[] intArray = {1, 0, 2, 3, -1, 2};
        int[] intArray = {};
//        System.out.println(t.findRange(intArray));
        System.out.println(t.monopolyRollExtended());

        // write your code here
//        System.out.println("Nadea");

        //3 Question Nr. 3
        int bankBalance = 500;
        bankBalance += 250;
        bankBalance -= 100;
        System.out.println(bankBalance);

        //Question Nr. 5
        int day = 14;
        String month = "May";
//        System.out.println("My birthday is on the " + day + " of " + month);

        //Question Nr. 6
        String firstNAme = "Nadea";
        String lastname = "Bocancea";
        String fullName = firstNAme + " " + lastname;
        int nameLength = fullName.length() - 1;

//        System.out.println("Hello, my name is " + fullName + ".");
//        System.out.println("There are " + nameLength + " letters in my name.");

        //Question Nr. 7
        double fahrenheit = 68.0;
        double celsius = (fahrenheit - 32) * 5 / 9;
//        System.out.println(celsius);

        Boolean canSeePlayer = true;
        Boolean playerPoweredUp = false;

        if (canSeePlayer) {
            if (!playerPoweredUp) {
//                System.out.println("Attack");
            } else {
//                System.out.println("Run away");
            }
        } else {
//            System.out.println("Wander");
        }

        Boolean isSnowing = false;
        Boolean isRaining = false;
        Double temperature = 60.0;

        if (isSnowing || isRaining || temperature < 50) {
//            System.out.println("Let's stay home");
        } else {
//            System.out.println("Let's go out");
        }

        Double time = 21.03;
        String timeOfDay;

        if (time >= 5 && time < 12) {
            timeOfDay = "morning";
        } else if (time >= 12 && time < 20) {
            timeOfDay = "daytime";
        } else {
            timeOfDay = "night";
        }

//        System.out.println(timeOfDay);

        int weekDay = 7;
        Boolean holiday = true;

        if (weekDay != 6 && weekDay != 7 && !holiday) {
//            System.out.println("Wake up at 7.00");
        } else {
//            System.out.println("Sleep in");
        }

        String schedule;
        int dayOfWeek = 7;

        switch (dayOfWeek) {
            case 1:
                schedule = "Gym in the morning";
                break;
            case 2:
                schedule = "Class after work";
                break;
            case 3:
                schedule = "Meetings all day";
                break;
            case 4:
                schedule = "Work from home";
                break;
            case 5:
                schedule = "Game night after work";
                break;
            case 6:
            case 7:
            default:
                schedule = "Free";
                break;
        }

//        System.out.println(schedule);

        double randomNumber = Math.random();
        randomNumber *= 10;

        int randomInt = (int) randomNumber;
//        System.out.println(randomInt);

    }

    public boolean isPrime(int param) {
        return true;
    }

    public int check() {
        int n = 10;
        while(n < 50) {
            n = n * 2;
        }
        return n;
    }


}
