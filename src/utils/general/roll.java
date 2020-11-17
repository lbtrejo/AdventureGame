package utils.general;

public class roll {

    public static int roll6() {
        return (int) ((Math.random() * ((6 - 1) + 1)) + 1);
    }

    public static int roll10() {
        return (int) ((Math.random() * ((10 - 1) + 1)) + 1);
    }

    public static int roll12() {
        return (int) ((Math.random() * ((12 - 1) + 1)) + 1);
    }

    public static int roll20() {
        return (int) ((Math.random() * ((20 - 1) + 1)) + 1);
    }
}
