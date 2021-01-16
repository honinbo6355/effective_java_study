package effectivejava.chapter2.item3.test;

/**
 * - Enum을 이용한 싱글톤 객체 생성 방식
 * - 직렬화/역직렬화, 리플렉션을 통한 여러 인스턴스 생성될 수 있는 문제를 해결할 수 있다.
 */
public enum Singleton3 {
    INSTANCE;

    public String getName() {
        return "seail";
    }
}
