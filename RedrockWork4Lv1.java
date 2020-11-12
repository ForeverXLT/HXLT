import java.util.Scanner;
public class RedrockWork4Lv1 {
        public static void main(String[] args) {
            System.out.println("请输入任意一个正整数");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            int m = 1;
            for ( int i = 1;i <= n;i++){
                m *= i;
            }
            System.out.println("该数的阶乘为：" + m);
        }
}


