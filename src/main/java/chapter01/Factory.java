package chapter01;

// 静态工厂方法
public class Factory {
    public static void main(String[] args) {
        Boolean a1 = new Boolean(true);
        Boolean a2 = new Boolean(true);
        System.out.println(a1 == a2); // false

        // 静态工厂方法的第二个好处，不必每次创建一个新的对象。 这里用 Boolean 作为例子。
        // 如果程序经常创建相同的对象，并且对象创建成本高，这项规则会很有用。
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(true);
        System.out.println(b1 == b2); // true
    }
}
