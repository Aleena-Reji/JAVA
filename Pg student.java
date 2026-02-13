import java.util.*;

interface Showable {
    void show();
}

class Person {
    String name;
    String gender;
    String phoneNo;

    Person(String n, String g, String p) {
        name = n;
        gender = g;
        phoneNo = p;
    }
}

class Student extends Person {
    String course;
    double score;

    Student(String n, String g, String p, String c, double s) {
        super(n, g, p);
        course = c;
        score = s;
    }
}

class PGStudent extends Student implements Showable {
    String researchArea;
    String guide;

    PGStudent(String n, String g, String p, String c, double s,
              String r, String gd) {

        super(n, g, p, c, s);
        researchArea = r;
        guide = gd;
    }

    public void show() {
        System.out.println("\nName: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phoneNo);
        System.out.println("Course: " + course);
        System.out.println("Score: " + score);
        System.out.println("Research Area: " + researchArea);
        System.out.println("Guide: " + guide);
    }
}

class PGStudentDemo {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of PG Students: ");
        int n = sc.nextInt();

        PGStudent arr[] = new PGStudent[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Gender: ");
            String gender = sc.next();

            System.out.print("Phone No: ");
            String phone = sc.next();

            System.out.print("Course: ");
            String course = sc.next();

            System.out.print("Score: ");
            double score = sc.nextDouble();

            System.out.print("Research Area: ");
            String research = sc.next();

            System.out.print("Guide: ");
            String guide = sc.next();

            arr[i] = new PGStudent(name, gender, phone, course, score, research, guide);
        }

        // (i) Rank based on Score (Descending)
        Arrays.sort(arr, (a, b) -> Double.compare(b.score, a.score));

        System.out.println("\n--- Ranking Based on Score ---");
        for (int i = 0; i < n; i++) {
            System.out.println("\nRank " + (i + 1));
            arr[i].show();
        }

        // (ii) Sort based on Research Area (Ascending)
        Arrays.sort(arr, (a, b) -> a.researchArea.compareTo(b.researchArea));

        System.out.println("\n--- Sorted Based on Research Area ---");
        for (int i = 0; i < n; i++) {
            arr[i].show();
        }
    }
}
