import java.util.Scanner;

public class SwitchCaseTest3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("欢迎使用简单计算机系统");

        System.out.println("请输入第一个数字");
        int num1 = s.nextInt();

        System.out.println("请输入运算符");
        String operator = s.next();

        System.out.println("请输入第二个数字");
        int num2 = s.nextInt();

        int result = 0;

        switch (operator){
            case"+":
                result = num1 + num2;
                break;
            case"*":
                result = num1 * num2;
                break;
            default:
                System.out.println("您输入的运算符不存在");
        }
        System.out.println(num1 + operator + num2 + "=" + result);

    }
}
