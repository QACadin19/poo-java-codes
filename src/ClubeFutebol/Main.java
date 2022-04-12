package ClubeFutebol;

public class Main {
    public static void main(String[] args) {
        TimesFutebol c = new TimesFutebol("Ceará", 11, 5, 6);
        System.out.println( c.status() );

        TimesFutebol b = new TimesFutebol("Fortaleza", 3, 15, 6);
        System.out.println( b.status() );
    }
}
