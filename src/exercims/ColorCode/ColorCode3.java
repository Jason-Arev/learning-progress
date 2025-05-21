public class ColorCode3 {

    @SuppressWarnings("unused")
    String label(String[] colors) {
        int val = 0;
        for (int i = 0; i < 2; i++) {
            val = (val * 10) + colorCode(colors[i]);
        }
        int ohms = colorCode(colors[2]);
        long finalVal = (long) (val * (Math.pow(10, ohms)));
        if (finalVal >= 1000000000) {
            finalVal /= 1000000000;
            return finalVal + " gigaohms";
        }
        if (finalVal >= 1000000) {
            finalVal /= 1000000;
            return finalVal + " megaohms";
        }
        if (finalVal >= 1000) {
            finalVal /= 1000;
            return finalVal + " kiloohms";
        }    
        return finalVal + " ohms";
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
