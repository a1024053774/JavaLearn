package Chapter07.com.extend_.improved;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "银角大王~";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(66);
        pupil.showInfo();

        System.out.println();

        Graduate graduate = new Graduate();
        graduate.name = "金角大王~";
        graduate.age = 22;
        graduate.testing();
        graduate.setScore(88);
        graduate.showInfo();
    }
}
