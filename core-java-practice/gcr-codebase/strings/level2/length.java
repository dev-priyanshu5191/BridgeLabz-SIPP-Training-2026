public static int findLength(String str) {
    int count = 0;

    try {
        while (true) {
            str.charAt(count);
            count++;
        }
    } catch (Exception e) {
        return count;
    }
}