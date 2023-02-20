abstract class Sides {
    abstract void num_of_sides();
}

class Triangle extends Sides {
    void num_of_sides() {
        System.out.println("3");
    }
}

class Rectangle extends Sides {
    void num_of_sides() {
        System.out.println("4");
    }
}

class Pendagon extends Sides {
    void num_of_sides() {
        System.out.println("5");
    }
}

public class shape {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        Rectangle r1 = new Rectangle();
        Pendagon p1 = new Pendagon();

        t1.num_of_sides();
        r1.num_of_sides();
        p1.num_of_sides();
    }
}
