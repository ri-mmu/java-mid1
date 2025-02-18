package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] grade = AuthGrade.values();
        for (AuthGrade authGrade : grade) {
            printAuthGrade(authGrade);
        }
    }

    public static void printAuthGrade(AuthGrade grade){
        System.out.println("grade=" + grade.name() + ", level=" + grade.getLevel() + ", 설명=" + grade.getDescription());
    }
}
