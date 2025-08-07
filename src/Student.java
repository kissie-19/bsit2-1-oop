class Student {
    String name;
    int age;
    String course;
    double grade1;
    double grade2;
    double grade3;

    Student(String name, int age, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    void displayInfo() {
        System.out.println("Name: " + name + " Age: " + age + " Course: " + course);
        System.out.println("Grades: " + grade1 + " " + grade2 + " " + " " + grade3);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Letter Grade: " + getLetterGrade());
        System.out.println("Status: " + isPassing());

    }

    double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3;
    }

    public String getLetterGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return "A";
        } else if (average <= 89) {
            return "B";
        } else if (average <= 79) {
            return "C";
        } else if (average <= 69) {
            return "D";
        } else {
            return "F";
        }
    }

    public String isPassing() {
        if (calculateAverage() >= 70) {
            return "PASSING";
        } else {
            return "FAILING";


        }
    }
}