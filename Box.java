public class Box {
 private double l;
    double h;
    double w;

    // Default Constructor (Uninitialized / Default State)
    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // Cube Constructor (Single side argument)
    Box(double side) {
        super();
        this.l = side;
        this.h = side;
        this.w = side;
    }

    // Parameterized Constructor (Length, Height, Width)
    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // Copy Constructor (Clones an existing Box object)
    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
