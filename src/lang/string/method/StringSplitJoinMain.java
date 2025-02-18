package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        System.out.println(str);

        // split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        // join()
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println(joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println(result);

        // 원상태로 돌리기
        String return1 = String.join(",", splitStr);
        System.out.println(return1);



    }
}
