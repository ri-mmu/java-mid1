package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String authGrade = scanner.nextLine();
        System.out.println("당신의 등급은 " + AuthGrade.valueOf(authGrade).getDescription() + "입니다.");
        System.out.println("==메뉴 목록==");
        switch (AuthGrade.valueOf(authGrade).getLevel()) {
            case 1:
                menu1();
                break;
            case 2:
                menu1();
                menu2();
                break;
            case 3:
                menu1();
                menu2();
                menu3();
        }
    }
    public static void menu1(){
        System.out.println("- 메인 화면");
    }
    public static void menu2(){
        System.out.println("- 이메일 관리 화면");
    }
    public static void menu3(){
        System.out.println("- 관리자 화면");
    }
}
