package advance.dev;

public class Student extends Person {
    private double mathScore;
    private double physicsScore;
    private double chemistryScore;
    private String studentID;
    private String className;

    // Constructor
    public Student(String name, int age, String phoneNumber, double mathScore, double physicsScore,
                   double chemistryScore, String studentID, String className) {
        super(name, age, phoneNumber);
        this.mathScore = mathScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
        this.studentID = studentID;
        this.className = className;
    }

    // Getter và Setter cho mathScore
    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    // Getter và Setter cho physicsScore
    public double getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(double physicsScore) {
        this.physicsScore = physicsScore;
    }

    // Getter và Setter cho chemistryScore
    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    // Getter và Setter cho studentID
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    // Getter và Setter cho className
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // Phương thức tính điểm trung bình
    public double diemTrungBinh() {
        return (mathScore + physicsScore + chemistryScore) / 3;
    }
}

