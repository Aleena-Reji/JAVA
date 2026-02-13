import java.lang.Math;

@FunctionalInterface
interface Dim {
    double area(double x);
}

class LambdaArea {
    public static void main(String args[]) {

        // Square Area
        Dim square = (s) -> s * s;

        // Cube Surface Area = 6s²
        Dim cube = (s) -> 6 * s * s;

        // Circle Area = πr²
        Dim circle = (r) -> Math.PI * r * r;

        // Sphere Surface Area = 4πr²
        Dim sphere = (r) -> 4 * Math.PI * r * r;

        System.out.println("Square Area (side=5): " + square.area(5));
        System.out.println("Cube Surface Area (side=5): " + cube.area(5));
        System.out.println("Circle Area (radius=5): " + circle.area(5));
        System.out.println("Sphere Surface Area (radius=5): " + sphere.area(5));
    }
}
