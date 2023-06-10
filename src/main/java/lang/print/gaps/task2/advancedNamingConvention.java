package lang.print.gaps.task2;

public class advancedNamingConvention {

    private static final int adult_age = 18;

    private int AGE;
    private int phoneNumber;

    void CAllToFriend() {
        System.out.println("my friend is :" + adult_age + "old ");
    }

    void callByNumber(int Number) {
        advancedNamingConvention num = new advancedNamingConvention();
        num.phoneNumber = 555555555;
        System.out.println("my friend phoneNumber is :" + num );
    }
}
