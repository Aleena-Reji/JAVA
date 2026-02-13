import java.lang.Math;

interface ComparableShape {
    double volume();
    int compare(ComparableShape other);
}

class Cuboid implements ComparableShape {
    double length, width, height;

    Cuboid(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    public double volume() {
        return length * width * height;
    }

    public int compare(ComparableShape other) {
        if (this.volume() > other.volume())
            return 1;
        else if (this.volume() < other.volume())
            return -1;
        else
            return 0;
    }
}

class Cylinder implements ComparableShape {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public int compare(ComparableShape other) {
        if (this.volume() > other.volume())
            return 1;
        else if (this.volume() < other.volume())
            return -1;
        else
            return 0;
    }
}

class CompareVolumes {
    public static void main(String args[]) {

        Cuboid c1 = new Cuboid(4, 5, 6);
        Cylinder c2 = new Cylinder(3, 7);

        System.out.println("Cuboid Volume: " + c1.volume());
        System.out.println("Cylinder Volume: " + c2.volume());

        int result = c1.compare(c2);

        if (result == 1)
            System.out.println("Cuboid has greater volume");
        else if (result == -1)
            System.out.println("Cylinder has greater volume");
        else
            System.out.println("Both have equal volume");
    }
}
