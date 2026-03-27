class OOPDemo {

    int id;                 
    static int count = 0;   

    // Default Constructor
    OOPDemo() {
        System.out.println("Default Constructor Called");
        count++;
    }

    // Parameterized Constructor
    OOPDemo(int id) {
        this.id = id;
        System.out.println("Parameterized Constructor Called: " + id);
        count++;
    }

    // Method
    int getNumber() {
        return 10;
    }

    public static void main(String[] args) {

        OOPDemo obj1 = new OOPDemo();
        OOPDemo obj2 = new OOPDemo(101);

        System.out.println("Obj2 ID: " + obj2.id);

        System.out.println("Static Count: " + count);

        System.out.println("Return Value: " + obj1.getNumber());

        //inheritance
        Animal a = new Dog();
        a.sound();

        //interface
        Shape s = new Circle();
        s.draw();

        // Has-A Relactionshp
        Car c = new Car();
        c.start();

        Test.show();

        // /Method Overloading
        MathOps m = new MathOps();
        System.out.println("Add 2: " + m.add(2, 3));
        System.out.println("Add 3: " + m.add(2, 3, 4));
    }
}


class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Engine {}

class Car {
    Engine engine = new Engine();

    void start() {
        System.out.println("Car Started");
    }
}

class Test {
    static void show() {
        System.out.println("Static Method Called");
    }
}


class MathOps {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}