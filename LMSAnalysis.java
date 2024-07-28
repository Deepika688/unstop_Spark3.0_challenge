import java.time.LocalDate;

class Student {
    String studentId;
    String studentName;
    LocalDate dateOfBirth;
    String gender;
    String address;
    String universityId;
    LocalDate enrollmentDate;
    LocalDate graduationDate;
    int totalCreditsCompleted;
    double cumulativeGPA;

    // Constructor, getters, and setters

    public Student() {}

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public void setTotalCreditsCompleted(int totalCreditsCompleted) {
        this.totalCreditsCompleted = totalCreditsCompleted;
    }

    public void setCumulativeGPA(double cumulativeGPA) {
        this.cumulativeGPA = cumulativeGPA;
    }
}

class Course {
    String courseId;
    String courseName;
    String department;
    int credits;
    String instructorId;
    LocalDate startDate;
    LocalDate endDate;
    String universityId;
    int totalStudentsEnrolled;
    double averageGrade;

    // Constructor, getters, and setters

    public Course() {}

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setTotalStudentsEnrolled(int totalStudentsEnrolled) {
        this.totalStudentsEnrolled = totalStudentsEnrolled;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}

class Instructor {
    String instructorId;
    String instructorName;
    String department;
    String universityId;
    LocalDate hireDate;
    String email;
    int totalCoursesTaught;
    double averageStudentRating;

    // Constructor, getters, and setters

    public Instructor() {}

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTotalCoursesTaught(int totalCoursesTaught) {
        this.totalCoursesTaught = totalCoursesTaught;
    }

    public void setAverageStudentRating(double averageStudentRating) {
        this.averageStudentRating = averageStudentRating;
    }
}

class Enrollment {
    String enrollmentId;
    String studentId;
    String courseId;
    LocalDate enrollmentDate;
    String grade;
    String status;
    String universityId;
    double courseCompletionPercentage;
    double attendancePercentage;

    // Constructor, getters, and setters

    public Enrollment() {}

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setCourseCompletionPercentage(double courseCompletionPercentage) {
        this.courseCompletionPercentage = courseCompletionPercentage;
    }

    public void setAttendancePercentage(double attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }
}

class Grade {
    String gradeId;
    String studentId;
    String courseId;
    String examName;
    LocalDate examDate;
    double score;
    String universityId;
    boolean isPass;
    double percentileRank;

    // Constructor, getters, and setters

    public Grade() {}

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setPass(boolean pass) {
        isPass = pass;
    }

    public void setPercentileRank(double percentileRank) {
        this.percentileRank = percentileRank;
    }
}

class Department {
    String departmentId;
    String departmentName;
    String universityId;
    String deanName;
    String officeLocation;
    int totalFaculty;
    double averageDepartmentGPA;

    // Constructor, getters, and setters

    public Department() {}

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setDeanName(String deanName) {
        this.deanName = deanName;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public void setTotalFaculty(int totalFaculty) {
        this.totalFaculty = totalFaculty;
    }

    public void setAverageDepartmentGPA(double averageDepartmentGPA) {
        this.averageDepartmentGPA = averageDepartmentGPA;
    }
}

class Semester {
    String semesterId;
    String semesterName;
    LocalDate startDate;
    LocalDate endDate;
    String universityId;
    int totalCoursesOffered;
    double averageEnrollmentRate;

    // Constructor, getters, and setters

    public Semester() {}

    public void setSemesterId(String semesterId) {
        this.semesterId = semesterId;
    }

    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setTotalCoursesOffered(int totalCoursesOffered) {
        this.totalCoursesOffered = totalCoursesOffered;
    }

    public void setAverageEnrollmentRate(double averageEnrollmentRate) {
        this.averageEnrollmentRate = averageEnrollmentRate;
    }
}

class Exam {
    String examId;
    String examName;
    String courseId;
    LocalDate examDate;
    String universityId;
    double maxScore;
    double averageScore;
    double passRatePercentage;

    // Constructor, getters, and setters

    public Exam() {}

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setMaxScore(double maxScore) {
        this.maxScore = maxScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void setPassRatePercentage(double passRatePercentage) {
        this.passRatePercentage = passRatePercentage;
    }
}

class Attendance {
    String attendanceId;
    String studentId;
    String courseId;
    LocalDate sessionDate;
    String status;
    String universityId;
    int totalSessionsAttended;
    double attendanceRatePercentage;

    // Constructor, getters, and setters

    public Attendance() {}

    public void setAttendanceId(String attendanceId) {
        this.attendanceId = attendanceId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = sessionDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setTotalSessionsAttended(int totalSessionsAttended) {
        this.totalSessionsAttended = totalSessionsAttended;
    }

    public void setAttendanceRatePercentage(double attendanceRatePercentage) {
        this.attendanceRatePercentage = attendanceRatePercentage;
    }
}

class University {
    String universityId;
    String universityName;
    String address;
    String contactPerson;
    String phoneNumber;
    String website;
    int totalStudents;
    double averageStudentAge;

    // Constructor, getters, and setters

    public University() {}

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setTotalStudents(int totalStudents) {
        this.totalStudents = totalStudents;
    }

    public void setAverageStudentAge(double averageStudentAge) {
        this.averageStudentAge = averageStudentAge;
    }
}

public class LMSAnalysis {

    public static void main(String[] args) {
        // Initialize the objects
        Student student1 = new Student();
        Course course1 = new Course();
        Instructor instructor1 = new Instructor();
        Enrollment enrollment1 = new Enrollment();
        Grade grade1 = new Grade();
        Department department1 = new Department();
        Semester semester1 = new Semester();
        Exam exam1 = new Exam();
        Attendance attendance1 = new Attendance();
        University university1 = new University();

        // Set the attributes
        student1.setStudentId("1");
        student1.setStudentName("John Doe");
        student1.setDateOfBirth(LocalDate.of(1990, 1, 1));
        student1.setGender("Male");
        student1.setAddress("123 Main St");
        student1.setUniversityId("1");
        student1.setEnrollmentDate(LocalDate.of(2010, 1, 1));
        student1.setGraduationDate(LocalDate.of(2014, 1, 1));
        student1.setTotalCreditsCompleted(120);
        student1.setCumulativeGPA(3.5);

        course1.setCourseId("1");
        course1.setCourseName("Math 101");
        course1.setDepartment("Math");
        course1.setCredits(3);
        course1.setInstructorId("1");
        course1.setStartDate(LocalDate.of(2010, 1, 1));
        course1.setEndDate(LocalDate.of(2010, 5, 1));
        course1.setUniversityId("1");
        course1.setTotalStudentsEnrolled(20);
        course1.setAverageGrade(85);

        instructor1.setInstructorId("1");
        instructor1.setInstructorName("Jane Smith");
        instructor1.setDepartment("Math");
        instructor1.setUniversityId("1");
        instructor1.setHireDate(LocalDate.of(2000, 1, 1));
        instructor1.setEmail("jane.smith@university.edu");
        instructor1.setTotalCoursesTaught(10);
        instructor1.setAverageStudentRating(4.5);

        enrollment1.setEnrollmentId("1");
        enrollment1.setStudentId("1");
        enrollment1.setCourseId("1");
        enrollment1.setEnrollmentDate(LocalDate.of(2010, 1, 1));
        enrollment1.setGrade("A");
        enrollment1.setStatus("Completed");
        enrollment1.setUniversityId("1");
        enrollment1.setCourseCompletionPercentage(100);
        enrollment1.setAttendancePercentage(95);

        grade1.setGradeId("1");
        grade1.setStudentId("1");
        grade1.setCourseId("1");
        grade1.setExamName("Midterm");
        grade1.setExamDate(LocalDate.of(2010, 3, 1));
        grade1.setScore(90);
        grade1.setUniversityId("1");
        grade1.setPass(true);
        grade1.setPercentileRank(95);

        department1.setDepartmentId("1");
        department1.setDepartmentName("Math");
        department1.setUniversityId("1");
        department1.setDeanName("Dr. Alice");
        department1.setOfficeLocation("Building A");
        department1.setTotalFaculty(10);
        department1.setAverageDepartmentGPA(3.2);

        semester1.setSemesterId("1");
        semester1.setSemesterName("Spring 2010");
        semester1.setStartDate(LocalDate.of(2010, 1, 1));
        semester1.setEndDate(LocalDate.of(2010, 5, 1));
        semester1.setUniversityId("1");
        semester1.setTotalCoursesOffered(5);
        semester1.setAverageEnrollmentRate(80);

        exam1.setExamId("1");
        exam1.setExamName("Midterm");
        exam1.setCourseId("1");
        exam1.setExamDate(LocalDate.of(2010, 3, 1));
        exam1.setUniversityId("1");
        exam1.setMaxScore(100);
        exam1.setAverageScore(75);
        exam1.setPassRatePercentage(85);

        attendance1.setAttendanceId("1");
        attendance1.setStudentId("1");
        attendance1.setCourseId("1");
        attendance1.setSessionDate(LocalDate.of(2010, 1, 1));
        attendance1.setStatus("Present");
        attendance1.setUniversityId("1");
        attendance1.setTotalSessionsAttended(30);
        attendance1.setAttendanceRatePercentage(95);

        university1.setUniversityId("1");
        university1.setUniversityName("XYZ University");
        university1.setAddress("456 University Rd");
        university1.setContactPerson("Dr. John");
        university1.setPhoneNumber("123-456-7890");
        university1.setWebsite("www.xyzuniversity.edu");
        university1.setTotalStudents(5000);
        university1.setAverageStudentAge(21.5);

        // Displaying one of the objects as an example
        System.out.println("Student Name: " + student1.studentName);
        System.out.println("Course Name: " + course1.courseName);
        System.out.println("Instructor Name: " + instructor1.instructorName);
    }
}