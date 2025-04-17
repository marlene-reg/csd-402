public class SearchingArray {

    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double max = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = Double.POSITIVE_INFINITY;

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        double[][] arrayParam = {
            {9.3, 7.2, 1.5},
            {8.2, 6.2, 0.4},
            {3.6, 7.4, 9.9}
        };

        int[] largestLocation = locateLargest(arrayParam);
        int[] smallestLocation = locateSmallest(arrayParam);

        System.out.println("Largest: (" + largestLocation[0] + ", " + largestLocation[1] + ")");
        System.out.println("Smallest: (" + smallestLocation[0] + ", " + smallestLocation[1] + ")");
    }
}