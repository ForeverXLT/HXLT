import java.util.Scanner;

public class SwitchCaseTest2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入字母");

        char word = s.next().charAt(0);
        switch ( word ){
            case 'a': case 'b':
                //case的合并
                System.out.println("星期一");
                break;
            case 'c':
                System.out.println("星期二");
            case 'd':
                System.out.println("星期三");
                break;
            default:
                System.out.println("您输入的数字非法");
        }
    }
}

