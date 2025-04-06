public class PracticeProblem {

    public static void bubbleSortString(String[] strings) {
        int n = strings.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (strings[j].compareToIgnoreCase(strings[j + 1]) > 0) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void selectionSortName(String[] names, int[] ages) {
        for (int i = 0; i < names.length - 1; i++) {
            int smallestIndex = i;

            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareToIgnoreCase(names[smallestIndex]) < 0) {
                    smallestIndex = j;
                }
            }

            String tempName = names[i];
            names[i] = names[smallestIndex];
            names[smallestIndex] = tempName;

            int tempAge = ages[i];
            ages[i] = ages[smallestIndex];
            ages[smallestIndex] = tempAge;
        }
    }

    public static void selectionSortAge(String[] names, int[] ages) {
        for (int i = 0; i < ages.length - 1; i++) {
            int smallestIndex = i;

            for (int j = i + 1; j < ages.length; j++) {
                if (ages[j] < ages[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            int tempAge = ages[i];
            ages[i] = ages[smallestIndex];
            ages[smallestIndex] = tempAge;

            String tempName = names[i];
            names[i] = names[smallestIndex];
            names[smallestIndex] = tempName;
        }
    }
}
