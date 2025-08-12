package colorcoder;

public enum MajorColor {
    WHITE(0), RED(1), BLACK(2), YELLOW(3), VIOLET(4);

    private int index;

    private MajorColor(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static MajorColor fromIndex(int index) {
        for (MajorColor color : MajorColor.values()) {
            if (color.getIndex() == index) {
                return color;
            }
        }
        return null;
    }

    public static int numberOfMajorColors() {
        return values().length;
    }

    public static String[] getColorNames() {
        return new String[]{"White", "Red", "Black", "Yellow", "Violet"};
    }
}
    
