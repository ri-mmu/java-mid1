package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        //String -> Integer = valueOf()
        Integer i = Integer.valueOf(str);
        System.out.println("integer1 = " + i);

        //Integer -> int = intvalue()
        int i1 = i;
        System.out.println("intValue = " + i1);

        //int -> Integer = valueOf()
        Integer i2 = i1;
        System.out.println("integer2 = " + i2);
    }
}
