public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user_name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}