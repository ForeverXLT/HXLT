import java.util.Scanner;

public class IfTeset1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("1表示下雨；0表示晴天");
        System.out.println("1表示男；2表示女");
        System.out.println("温度用数字表示");

        System.out.println("请输入天气状况");
        int weather = s.nextInt();

        System.out.println("请输入性别");
        int sex = s.nextInt();
        /*
        java中char类型的从和键盘输入
        char s = s.next().charAt(0)
         */


        if (weather == 1){
            if (sex == 1 ){
                System.out.println("带一把黑伞");
            }else if (sex ==2 ){
                System.out.println("带一把粉红色的伞");
            }

       }else if (weather == 0){
            System.out.println("请输入温度");
            int tem = s.nextInt();
            if (tem >= 30){
                if (sex == 1 ){
                    System.out.println("带一副墨镜");
                }else if (sex == 2){
                    System.out.println("带一把粉红色的伞并涂上防晒霜");
                }
            }else if (tem >= 25){
                if (sex == 1 ){
                    System.out.println("带一瓶水");
                }else if (sex == 2){
                    System.out.println("带一把粉红色的伞");
                }
            }else{
                System.out.println("今天的气温不可能这么低！");
            }
        }else{
            System.out.println("对不起，当前天气状况不存在");
        }
   }
}
