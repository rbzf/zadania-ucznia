class School {
    public static void main(String[] args) {

        Address address1 = new Address("Opole", "07-077", "Strumykowa", "2A", "3");
        StudentGrade grade1 = new StudentGrade(5.0, 4.5, 4.0);
        Student student1 = new Student("Jan", "Kowalski", 'M', address1, grade1);

        Address address2 = new Address("Sopot", "11-147", "Portowa", "23", "13b");
        StudentGrade grade2 = new StudentGrade(4.0, 5.0, 5.0);
        Student student2 = new Student("Ania", "Zalewska", 'K', address2, grade2);

        double student1Avg = (student1.studentGrade.math + student1.studentGrade.it + student1.studentGrade.physics) / 3;
        double student2Avg = (student2.studentGrade.math + student2.studentGrade.it + student2.studentGrade.physics) / 3;

        double mathAvg = (student1.studentGrade.math + student2.studentGrade.math) / 2;
        double itAvg = (student1.studentGrade.it + student2.studentGrade.it) / 2;
        double physicsAvg = (student1.studentGrade.physics + student2.studentGrade.physics) / 2;

        System.out.println("Średnia ucznia 1: " + student1Avg);
        System.out.printf("Średnia ucznia 2: %.2f\n", student2Avg);
        System.out.println("Średnia z matematyki: " + mathAvg);
        System.out.println("Średnia z informatyki: " + itAvg);
        System.out.println("Średnia z fizyki: " + physicsAvg);
    }
}
