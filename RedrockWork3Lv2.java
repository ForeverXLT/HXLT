
interface Computer {
    public abstract int computer(int n, int m) ;
}
    class jia implements Computer {
        public  int computer(int n, int m) {
            return n + m;
        }
    }

    class jian implements Computer {
        public  int computer(int n, int m) {
            return n - m;
        }
    }

    class chen implements Computer {
        public  int computer(int n, int m) {
            return n * m;
        }
    }

    class chu implements Computer {
        public  int computer(int n, int m) {
            if(m != 0) {
                return n / m;
            }
            else
                System.out.println("错误");
            return  0;
        }
    }



    public class RedrockWork3Lv2 {
        public static void main(String[] args) {
        }
    }



