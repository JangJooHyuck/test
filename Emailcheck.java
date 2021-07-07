import java.util.Scanner;
// java.util 에서 스캐너 호출

public class Emailcheck {
    public static void main(String[] args) {
        // 스캐너 객체생성
        Scanner scan = new Scanner(System.in);

        // 아이디 관련

        // ID 패턴 정의 (영어 대소문자,._+- 허용 최소 1글자 ~ 최대 20글자까지)
        String Idpattern = "[a-zA-Z0-9._+-]*";

        // 사용자로부터 아이디 입력받기
        System.out.println("아이디를 입력하세요.");

        // 입력받은 문자를 id에 저장
        String Id = scan.nextLine();

        // 이메일패턴이랑 이메일이 서로 일치하지 않으면
        while (Id.matches(Idpattern) == false) {

            System.out.println("입력하신 아이디의 형식이 정상적이지 않습니다.");
            System.out.println("아이디는 영어와 숫자로만 생성할 수 있습니다.(최대20글자), (. , _ , + , - 4개의 특수문자는 허용)");

            // 사용자에게 재입력 요구
            System.out.println("아이디를 다시 입력해주세요.");

            // 다시 입력받음
            Id = scan.nextLine();

        }

        // 패스워드관련

        // PW 패턴 정의 (영어 대소문자, 숫자만 가능 최소 1 ~ 20 글자)
        String Pwpattern = "[a-zA-Z0-9]{1,20}";

        // 사용자로부터 패스워드 입력받기
        System.out.println("패스워드를 입력하세요");

        // 입력받은 문자를 Pw에 저장
        String Pw = scan.nextLine();

        // pw패턴이랑 pw가 서로 일치하지 않으면
        while (Pw.matches(Pwpattern) == false) {
            System.out.println("입력하신 패스워드의 형식이 정상적이지 않습니다.");
            System.out.println("패스워드는 영어 또는 숫자로만 생성할 수 있습니다.(최소 1 ~ 20글자)");

            // 사용자에게 재입력 요구
            System.out.println("패스워드를 다시 입력해주세요.");

            // 다시 입력받음.
            Pw = scan.nextLine();
        }

        // 마스킹관련 //replaceAll(변환하고자하는대상, 변환할 문자)
        // https://coding-today.tistory.com/29?category=1007587
        String maskingpw = Pw.replaceAll("(?<=.{2}).", "*");

        // 이메일 관련

        // 이메일 패턴 정의
        String emailpattern = "[a-zA-Z0-9_.+-]+@[a-zA-Z]+\\.[a-zA-Z]+";

        // 사용자로부터 이메일 입력받기
        System.out.println("이메일을 입력하세요.");

        // 입력받은 문자를 email에 저장
        String email = scan.nextLine();

        // 이메일패턴이랑 이메일이 서로 일치하지 않으면
        while (email.matches(emailpattern) == false) {
            System.out.println("입력하신 이메일의 형식이 정상적이지 않습니다.");
            System.out.println("이메일은 ** @ ** . ** 형식으로만 생성할 수 있습니다");

            // 사용자에게 재입력 요구
            System.out.println("이메일을 다시 입력해주세요.");

            // 다시 입력받음
            email = scan.nextLine();
        }

        // while문을 빠져나올경우 = (사용자가 입력한 모든 문자가 각각의 패턴들과 일치하는 경우)

        // 스캐너 닫아주고
        scan.close();
        // 각각 패턴에 맞게 저장된 id, pw, email 들을 표출한다.

        System.out.println("당신의 아이디는 " + Id + " 입니다.");

        // pw 는 아까 masking 한 pw 인 maskingpw 로 출력함
        System.out.println("당신의 패스워드는 " + maskingpw + " 입니다.");

        System.out.println("당신의 이메일은 " + email + " 입니다.");

    }
}