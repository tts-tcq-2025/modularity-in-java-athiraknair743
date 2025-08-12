package colorcoder;

public class ColorPair {
    private final MajorColor majorColor;
    private final MinorColor minorColor;
    
    public ColorPair(MajorColor major, MinorColor minor) {
        majorColor = major;
        minorColor = minor;
    }
    
    public MajorColor getMajor() {
        return majorColor;
    }
    
    public MinorColor getMinor() {
        return minorColor;
    }
    
    @Override
    public String toString() {
        return majorColor.getColorNames()[majorColor.getIndex()] + " " + 
               minorColor.getColorNames()[minorColor.getIndex()];
    }
}
