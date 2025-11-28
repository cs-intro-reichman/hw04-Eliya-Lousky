/** A library of operations on arrays of characters (char values).
 *  The library also features a string comparison method. */
/** A library of operations on arrays of characters (char values).
 *  The library also features a string comparison method. */
public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c','l','e','a','r','l','y'};
        char[] arr2 = {'U','n','d','e','r','s','t', 'o', 'o', 'd'};
        System.out.println(str);  // Prints the string
        println(arr1);            // Prints an array of characters
        System.out.println(charAt(arr1,2));      
        System.out.println(indexOf(arr1,'l'));  
        System.out.println(indexOf(arr1,'l',3)); 
        System.out.println(lastIndexOf(arr1, 'l'));
        System.out.println(concat(arr1, arr2));
        System.out.println(subArray(arr2, 2, 9));
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }

    /** Prints the given array of characters, and moves the cursor to the next line. */
    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    /** Returns the char value at the specified index. Assume that the array is non-empty. */
    public static char charAt(char[] arr, int index) {
        char a = arr[index];
        return a;
    }

    /** If the two arrays have the same value in every index, 
     *  returns true; Otherwise returns false.
     */
    public static boolean equals(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    /** Returns the index within the given array of the first occurrence of the given character.
     *  If no such character is found, returns -1.
     */
    public static int indexOf(char[] arr, char ch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    /** Same as indexOf(char[], char), but starts the search in the given index. */
    public static int indexOf(char[] arr, char ch, int fromIndex) {
        for (int i = fromIndex; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    /** Returns the index within the given arr of the last occurrence of the given character.
     *  If no such character is found, returns -1.
     */
    public static int lastIndexOf(char[] arr, char ch) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ch) {
                return i;
            }
        }
        return -1;
    }

    /* Returns an array which is the concatanation of the two given arrays. */
    public static char[] concat(char[] arr1, char[] arr2) {
        int newLength = arr1.length + arr2.length;
        char[] arrays = new char[newLength];

        for (int i = 0; i < arr1.length; i++) {
            arrays[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arrays[arr1.length + j] = arr2[j];
        }

        return arrays;
    }

    /** Returns a new array that can be described as a sub-array of this array. */
    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        char[] result = new char[endIndex - beginIndex];
        int z = 0;
        for (int i = beginIndex; i < endIndex; i++) {
            result[z] = arr[i];
            z++;
        }
        return result;
    }

    /** Returns a single integer that represents the given array (hash code). */
    public static long hashCode(char[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int hash = 0;
        final int BASE = 7;

        for (char ch : arr) {
            hash = hash * BASE + ch;
        }

        return hash;
    }

    /**
     * Compares the two strings lexicographically.
     * Returns:
     *   negative if str1 < str2,
     *   zero    if str1 == str2,
     *   positive if str1 > str2.
     */
  public static int compareTo(String str1, String str2) {
    int minLength = Math.min(str1.length(), str2.length());


    for (int i = 0; i < minLength; i++) {
        char ch1 = str1.charAt(i);
        char ch2 = str2.charAt(i);

        if (ch1 < ch2) {
            return -1; 
        } else if (ch1 > ch2) {
            return 1;  
        }
    }

    if (str1.length() < str2.length()) {
        return -1;
    } else if (str1.length() > str2.length()) {
        return 1;
    } else {
        return 0;
    }
}
}
