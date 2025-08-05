package colorcoder;

public enum MinorColor {
    BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);
    
    private int index;
    
    private MinorColor(int index) {
        this.index = index;
    }
    
    public int getIndex() {
        return index;
    }
    
    public static MinorColor fromIndex(int index) {
        for(MinorColor color: MinorColor.values()) {
            if(color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }
    
    public static int numberOfMinorColors() {
        return values().length;
    }
    
    public static String[] getColorNames() {
        return new String[] {"Blue", "Orange", "Green", "Brown", "Slate"};
    }
}
