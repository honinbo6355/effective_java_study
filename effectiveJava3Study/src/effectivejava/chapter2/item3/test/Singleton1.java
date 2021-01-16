package effectivejava.chapter2.item3.test;

/**
 * - final 필드를 이용한 싱글톤 객체 생성 방식
 * - 단, 리플렉션을 사용해서 private 생성자를 호출하면 여러 객체가 생성될 가능성은 존재한다.
 */
public class Singleton1 {

    public static final Singleton1 instance = new Singleton1();

    private Singleton1() {

    }
}
