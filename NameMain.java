public class NameMain {
    public static void main(String[] args) {
        Name n = new Name("Wolf", "stephanski");
        System.out.println(n.fullName());

        Name n2 = new Name("Wolf", "");
        System.out.println(n2.fullName());
    }
}
