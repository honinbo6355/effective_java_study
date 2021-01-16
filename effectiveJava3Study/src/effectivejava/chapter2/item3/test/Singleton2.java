package effectivejava.chapter2.item3.test;

/**
 * - static 팩토리 메소드를 이용한 싱글톤 객체 생성 방식
 * - 처음에 싱글톤으로 쓰다가 나중에 쓰레드당 새 인스턴스를 만든다고 할 경우, 클라이언트 코드를 고칠 필요가 없다.
 */
public class Singleton2 {
    private static final Singleton2 instance = new Singleton2();

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return instance;
    }
}
