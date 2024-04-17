package advance.dev;

import java.util.Scanner;

public class MainApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Person[] persons = new Person[10];

        // Nhập thông tin vào mảng persons
        input(persons);

        // Xuất thông tin ra màn hình
        System.out.println("Danh sách thông tin:");
        print(persons);

        // Tìm giáo viên có lương cao nhất
        Teacher highestPaidTeacher = findTeacher(persons);
        if (highestPaidTeacher != null) {
            System.out.println("Giáo viên có mức lương cao nhất:");
            System.out.println("Tên: " + highestPaidTeacher.getName());
            System.out.println("Tuổi: " + highestPaidTeacher.getAge());
            System.out.println("Số điện thoại: " + highestPaidTeacher.getPhoneNumber());
            System.out.println("Mã giáo viên: " + highestPaidTeacher.getTeacherID());
            System.out.println("Hệ số lương: " + highestPaidTeacher.getSalaryCoefficient());
            System.out.println("Mức lương: " + highestPaidTeacher.tinhLuong());
        } else {
            System.out.println("Không tìm thấy giáo viên.");
        }

        // Tìm sinh viên có điểm trung bình cao nhất
        Student highestAverageStudent = findHighestAverageStudent(persons);
        if (highestAverageStudent != null) {
            System.out.println("Sinh viên có điểm trung bình cao nhất:");
            System.out.println("Tên: " + highestAverageStudent.getName());
            System.out.println("Tuổi: " + highestAverageStudent.getAge());
            System.out.println("Số điện thoại: " + highestAverageStudent.getPhoneNumber());
            System.out.println("Mã sinh viên: " + highestAverageStudent.getStudentID());
            System.out.println("Lớp: " + highestAverageStudent.getClassName());
            System.out.println("Điểm trung bình: " + highestAverageStudent.diemTrungBinh());
        } else {
            System.out.println("Không tìm thấy sinh viên.");
        }
    }

    // Phương thức nhập thông tin cho mảng persons
    static void input(Person[] persons) {
        int teacherCount = 0;
        int studentCount = 0;

        for (int i = 0; i < persons.length; i++) {
            if (teacherCount < 4) {
                Teacher teacher = inputTeacher();
                persons[i] = teacher;
                teacherCount++;
            } else {
                Student student = inputStudent();
                persons[i] = student;
                studentCount++;
            }
        }
    }

    // Phương thức nhập thông tin cho một giáo viên
    static Teacher inputTeacher() {
        System.out.println("Nhập thông tin giáo viên:");
        System.out.print("Tên: ");
        String name = scanner.nextLine();
        System.out.print("Tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng newline
        System.out.print("Số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Mã giáo viên: ");
        String teacherID = scanner.nextLine();
        System.out.print("Hệ số lương: ");
        double salaryCoefficient = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng newline

        return new Teacher(name, age, phoneNumber, teacherID, salaryCoefficient);
    }

    // Phương thức nhập thông tin cho một sinh viên
    static Student inputStudent() {
        System.out.println("Nhập thông tin sinh viên:");
        System.out.print("Tên: ");
        String name = scanner.nextLine();
        System.out.print("Tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng newline
        System.out.print("Số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Mã sinh viên: ");
        String studentID = scanner.nextLine();
        System.out.print("Lớp: ");
        String className = scanner.nextLine();
        System.out.print("Điểm Toán: ");
        double mathScore = scanner.nextDouble();
        System.out.print("Điểm Lý: ");
        double physicsScore = scanner.nextDouble();
        System.out.print("Điểm Hóa: ");
        double chemistryScore = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng newline

        return new Student(name, age, phoneNumber, mathScore, physicsScore, chemistryScore, studentID, className);
    }

    // Phương thức xuất thông tin mảng persons
    static void print(Person[] persons) {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    // Phương thức tìm giáo viên có mức lương cao nhất
    static Teacher findTeacher(Person[] persons) {
        Teacher highestPaidTeacher = null;
        double maxSalary = Double.MIN_VALUE;

        for (Person person : persons) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                double salary = teacher.tinhLuong();
                if (salary > maxSalary) {
                    maxSalary = salary;
                    highestPaidTeacher = teacher;
                }
            }
        }

        return highestPaidTeacher;
    }

    // Phương thức tìm sinh viên có điểm trung bình cao nhất
    static Student findHighestAverageStudent(Person[] persons) {
        Student highestAverageStudent = null;
        double maxAverageScore = Double.MIN_VALUE;

        for (Person person : persons) {
            if (person instanceof Student) {
                Student student = (Student) person;
                double averageScore = student.diemTrungBinh();
                if (averageScore > maxAverageScore) {
                    maxAverageScore = averageScore;
                    highestAverageStudent = student;
                }
            }
        }

        return highestAverageStudent;
    }
}

