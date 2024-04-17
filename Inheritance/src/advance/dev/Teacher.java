package advance.dev;

public class Teacher extends Person {
    private String teacherID;
    private double salaryCoefficient;

    // Constructor
    public Teacher(String name, int age, String phoneNumber, String teacherID, double salaryCoefficient) {
        super(name, age, phoneNumber);
        this.teacherID = teacherID;
        this.salaryCoefficient = salaryCoefficient;
    }

    // Getter và Setter cho teacherID
    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    // Getter và Setter cho salaryCoefficient
    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    // Phương thức tính lương
    public double tinhLuong() {
        // Giả sử mức lương cơ bản là 10 triệu VNĐ
        double basicSalary = 10000000;
        return basicSalary * salaryCoefficient;
    }
}

