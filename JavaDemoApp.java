class JavaDemoApp {

    int a = 10;
    static int b = 20;

    JavaDemoApp() {
        System.out.println("Constructor Called");
    }

    void show() {
        int c = 30;
        System.out.println("Variables: " + a + " " + b + " " + c);
    }

    public static void main(String[] args) {

        JavaDemoApp obj = new JavaDemoApp();
        obj.show();

        Employee e = new Employee();
        e.setId(101);
        e.setName("Kashyap");
        System.out.println("Employee: " + e.getId() + " " + e.getName());

        AccessDemo ad = new AccessDemo();
        ad.show();

        new Counter();
        new Counter();

        System.out.println("Enum: " + Day.MONDAY);

        Animal d = new Dog();
        d.sound();

        Shape s = new Circle();
        s.draw();
    }
}

// JavaBean
class Employee {
    private int id;
    private String name;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

// Access Modifier
class AccessDemo {
    private int x = 10;
    public int y = 20;

    void show() {
        System.out.println("Access: " + x + " " + y);
    }
}

// Static keyword
class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Count: " + count);
    }
}

// Enum
enum Day {
    MONDAY, TUESDAY
}

// Abstract class
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

// Interface
interface Shape {
    void draw(); 
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}