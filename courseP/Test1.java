public class Test1 {
    public static void main(String[] args) {
        int n = 1000;
        Test1 obj = new Test1();
        sumAndMultiply(n);
    }
    public static void sumAndMultiply(int n) {

        String s = String.valueOf(n);
        long res =0;
        int sum =0;
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i) != '0'){
                //   res += charAt(i) ;
                res = res * 10 + (s.charAt(i) - '0');
                sum += s.charAt(i) - '0';
            }

        }
        System.out.println(sum);
        System.out.println(res);

        System.out.println(res*sum);

    }
}