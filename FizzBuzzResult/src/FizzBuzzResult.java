public class FizzBuzzResult {
    static int result(int integer) {
        final int FIZZBUZZ = 1;
        final int FIZZ = 2;
        final int BUZZ = 3;
        final int OUTOFRANGE = -1;

        boolean isFizz = (integer / 10 == 3 || integer % 10 == 3 || integer % 3 == 0);
        boolean isBuzz = (integer / 10 == 5 || integer % 5 == 0);

        if (integer < 100 && integer > 0) {
            if (isFizz && isBuzz) return FIZZBUZZ;
            else if (isBuzz) return BUZZ;
            else if (isFizz) return FIZZ;
            else return integer;
        }
        return OUTOFRANGE;
    }

    static String translate(int integer) {
        if (integer >= 0 && integer <= 9) {
            return countOneToNine(integer);
        } else if (integer >= 10 && integer <= 99) {
            return countTenToHundrer(integer);
        } else return "OUT OF RANGE";
    }

    public static String countOneToNine(int integer) {
        if (integer > 0) {
            switch (integer) {
                case 1:
                    return "mot";
                case 2:
                    return "hai";
                case 3:
                    return "ba";
                case 4:
                    return "bon";
                case 5:
                    return "nam";
                case 6:
                    return "sau";
                case 7:
                    return "bay";
                case 8:
                    return "tam";
                case 9:
                    return "chin";
            }
        }
        return "khong";
    }

    public static String countTenToHundrer(int integer) {
        int tens = integer / 10;
        int unit = integer % 10;
        String spell = "";

        if (tens > 1) {
            spell += countOneToNine(tens) + " muoi";
        } else spell += "muoi";

        if (unit > 0)
            return spell += " " + countOneToNine(unit);
        else return spell;

    }
}
