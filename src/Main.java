class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Amber Garillos,", 20, "BSIT", 90, 90,90);
        Student student2 = new Student("Nikki Pacatang,", 19, "BSIT", 90,90, 90);
        Student student3 = new Student("Kissie Ann Apple Aput,", 19, "BSIT", 90, 90,90);

        System.out.println();
        System.out.println("Student Information: ");

        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
        System.out.println();
        student3.displayInfo();
        System.out.println();

    }
}


