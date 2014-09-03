class ProgrammMinSuche {
    public static void main (String[] args) {
        int[] a = {11,7,5,9,13,53,16};
        int merker = a[0];
        int i = 1;
        int n = a.length;
        while (i < n) {
            if (a[i] < merker)
                merker = a[i];
            i++;
        }
        System.out.println(merker);
    }
}
