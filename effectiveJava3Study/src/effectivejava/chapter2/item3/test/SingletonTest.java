package effectivejava.chapter2.item3.test;

/**
 * - private static final long serialVersionUID = 1L;
 *
 * 직렬화를 하고나서 다시 역직렬화할 경우 serialVersionUID가 없으면 에러가 발생한다.
 * serialVersionUID는 역직렬화 할때 저장된 클래스와 같은 버전인지 확인하는 값이다.
 * 그렇기 때문에 serialVersionUID를 설정하는걸 권장한다.
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.instance;
        Singleton2 singleton2 = Singleton2.getInstance();

        String name = Singleton3.INSTANCE.getName();
    }
}
