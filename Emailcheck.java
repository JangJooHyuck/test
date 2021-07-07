import java.util.Scanner;
// java.util 에서 스캐너 호출

public class Emailcheck {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 스캐너 객체생성
        System.out.println("아이디를 입력하세요."); // 사용자로부터 아이디 입력받기
        String Id = scan.nextLine(); // 입력받은 문자를 email에 저장
        String Idpattern = "[a-zA-Z0-9가-힇]"; // ID 패턴 정의
        System.out.println("패스워드를 입력하세요"); // 사용자로부터 패스워드 입력받기
        String Pw = scan.nextLine(); // 입력받은 문자를 email에 저장
        String Pwpattern = "[a-zA-Z0-9]"; // PW 패턴 정의
        System.out.println("이메일을 입력하세요."); // 사용자로부터 이메일 입력받기
        String email = scan.nextLine(); // 입력받은 문자를 email에 저장
        String emailpattern = "[a-zA-Z0-9_.+-]+@[a-zA-Z]+\\.[a-zA-Z]+"; // 이메일 패턴 정의

        while (Id.matches(Idpattern) == false) { // 이메일패턴이랑 이메일이 서로 일치하지 않으면
            System.out.println("입력하신 아이디의 형식이 정상적이지 않습니다.");
            System.out.println("아이디는 영어 또는 한글과 숫자로만 생성할 수 있습니다.");
            System.out.println("아이디를 다시 입력해주세요."); // 사용자에게 재입력 요구
            Id = scan.nextLine(); // 다시 입력받음
        }
        while (Pw.matches(PWpattern) == false) { // 이메일패턴이랑 이메일이 서로 일치하지 않으면
            System.out.println("입력하신 패스워드의 형식이 정상적이지 않습니다.");
            System.out.println("패스워드는 영어 또는 한글과 숫자로만 생성할 수 있습니다.");
            System.out.println("패스워드를 다시 입력해주세요."); // 사용자에게 재입력 요구
            PW = scan.nextLine(); // 다시 입력받음
        }
        while (email.matches(emailpattern) == false) { // 이메일패턴이랑 이메일이 서로 일치하지 않으면
            System.out.println("입력하신 이메일의 형식이 정상적이지 않습니다.");
            System.out.println("이메일은 ** @ ** . ** 형식으로만 생성할 수 있습니다");
            System.out.println("이메일을 다시 입력해주세요."); // 사용자에게 재입력 요구
            email = scan.nextLine(); // 다시 입력받음
        }
        // while문을 빠져나올경우 = (이메일패턴과 일치하는 이메일을 입력했을 경우)
        scan.close(); // 스캐너 닫아주고
        System.out.println("당신의 아이디는 " + Id + "입니다.");
        System.out.println("당신의 패스워드는 " + Pw + "입니다.");
        System.out.println("당신의 이메일은 " + email + "입니다.");

    }
}
