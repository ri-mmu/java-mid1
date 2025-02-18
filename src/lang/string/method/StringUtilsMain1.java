package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valuOf 메서드
        String numString = String.valueOf(num);
        System.out.println(numString);
        String boolString = String.valueOf(bool);
        System.out.println(boolString);
        String objString = String.valueOf(obj);
        System.out.println(objString);
        String numString2 = "" + num; // String.valueOf(num)이랑 같은 표현
        System.out.println(numString2);

        // toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환 " + strCharArray); // println(char[] c)
        System.out.println(strCharArray); // println(String x)
        System.out.println(strCharArray.toString());
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}
