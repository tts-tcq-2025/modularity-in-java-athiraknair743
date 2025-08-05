package colorcoder;

public final class ColorCoder {

    private ColorCoder() {}

    public static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / MinorColor.BLUE.numberOfColors());
        MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % MinorColor.BLUE.numberOfColors());
        return new ColorPair(majorColor, minorColor);
    }

    public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * MinorColor.BLUE.numberOfColors() + minor.getIndex() + 1;
    }

    public static void printColorCodeManual() {
        System.out.println("Color Coding Reference Manual");
        System.out.println("----------------------------");
        System.out.printf("%-8s %-8s %s%n", "Pair No.", "Major", "Minor");
        
        for (int pairNumber = 1; pairNumber <= 25; pairNumber++) {
            ColorPair colorPair = getColorFromPairNumber(pairNumber);
            System.out.printf("%-8d %-8s %s%n",
                pairNumber,
                colorPair.getMajor(),
                colorPair.getMinor());
        }
    }
}
