import java.util.Scanner;
// java.util 에서 스캐너 호출

public class Emailcheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 객체생성
        System.out.println("이메일을 입력하세요."); // 사용자로부터 이메일 입력받기
        String email = sc.next(); // 입력받은 문자를 email에 저장
        String emailRegex = "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+"; // 이메일 정규 표현식
        if (email.matches(emailRegex)) { // email 의 값이 emaliRegex 의 조건과 맞으면
            System.out.println("이메일이 형식이 정상적입니다.");
            System.out.println("당신의 이메일은 " + email + " 입니다.");
        } else { // 조건이 안맞으면
            System.out.println("이메일이 형식이 정상적이지 않습니다.");

            System.out.println("입력하신 이메일은 " + email + " 입니다.");

        }
    }
} // cmd - chcp 949 - java Emailcheck 하면됨
