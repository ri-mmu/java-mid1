package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass inner = outer.new InnerClass(); //내부 클래스 호출
        inner.hello();
    }
}
