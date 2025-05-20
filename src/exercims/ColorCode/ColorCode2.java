class ColorCode2 {

    public int value(String[] colors) {
        int finalVal = 0;
        for (int i = 0; i < 2; i++) {
            finalVal = (finalVal * 10) + colorCode(colors[i]);
        }
        return finalVal;
    }

    public int colorCode(String color) {
        return switch (color.toLowerCase()) {
            case "black"  -> 0;
            case "brown"  -> 1;
            case "red"    -> 2;
            case "orange" -> 3;
            case "yellow" -> 4;
            case "green"  -> 5;
            case "blue"   -> 6;
            case "violet" -> 7;
            case "grey"   -> 8;
            case "white"  -> 9;
            default       -> -1;
        };
    }
}
