import java.util.Scanner;

public class SwitchCaseTest1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入数字");

        int num = s.nextInt();
        switch ( num ){
            case 1: case 0:
                //case的合并
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
            case 3:
                System.out.println("星期三");
            default:
                System.out.println("您输入的数字非法");
        }
    }
}
