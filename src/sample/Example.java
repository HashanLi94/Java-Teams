package sample;

public class Example {
    public static void main(String[] args) {
        Team cricket = new Team();
        cricket.setDetails("Cricket", "Hashan", "Liyanage", 45, "wicket_keeper_n_batsman"  );
        cricket.speak();
        cricket.training();

        Team basketball= new Team();
        basketball.setDetails("Basketball", "Hashan", "Liyanage", 23, "Shooter"  );
        basketball.speak();
        basketball.training();
    }
}
