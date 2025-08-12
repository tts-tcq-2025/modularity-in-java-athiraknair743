package colorcoder;

public final class ColorCoder {

    private ColorCoder() {}

    public static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = MajorColor.fromIndex(zeroBasedPairNumber / MinorColor.values().length);
        MinorColor minorColor = MinorColor.fromIndex(zeroBasedPairNumber % MinorColor.values().length);
        return new ColorPair(majorColor, minorColor);
    }

    public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * MinorColor.values().length + minor.getIndex() + 1;
    }

}
