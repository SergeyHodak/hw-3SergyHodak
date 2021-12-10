public class ATM {
    public int countBanknotes(int sum) {
        int result = 0;
        int a = sum;
        while (true) {
            if (a > 0){
                if (a/500 > 0){result += a/500; a%=500;}
                if (a/200 > 0){result += a/200; a%=200;}
                if (a/100 > 0){result += a/100; a%=100;}
                if (a/50 > 0){result += a/50; a%=50;}
                if (a/20 > 0){result += a/20; a%=20;}
                if (a/10 > 0){result += a/10; a%=10;}
                if (a/5 > 0){result += a/5; a%=5;}
                if (a/2 > 0){result += a/2; a%=2;}
                if (a/1 > 0){result += a/1; a%=1;}
            }else {break;}
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new ATM().countBanknotes(578));
    }
}
