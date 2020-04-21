public class task2 {
    public static String repeat(String word, int n){
        String newWord = " ";
        for (int i = 0; i< word.length() ; i++){
            for (int j = 0; j<n; j++){
                newWord+= word.charAt(i);
            }
        }
        return newWord;
    }



    public static int differenceMaxMin(int [] mass){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int value : mass) {
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        return max - min;
    }



    public static boolean isAvgWhole(int mass[]){
        double sum=0;

        for (int value : mass) {
            sum += value;
        }
        if ((sum%mass.length)%100<1)
            return true;
        else
            return false;

    }



    public static int[] cumulativeSum( int [] mass){

        for (int i = 1; i < mass.length; i++){
            mass[i] = mass[i] + mass[i-1];
        }
        return mass;
    }



    public static int getDecimalPlaces(String number){
        if (number.indexOf('.')!=0){
            return number.length()-number.indexOf('.')-1;
        }
        else
            return 0;
    }



    public static int Fibonacci (int n){
        switch (n) {
            case 0:
            case 1:
                return 1;
            default:
                return Fibonacci(n - 2) + Fibonacci(n - 1);
        }
    }



    public static boolean isValid(String index){
        int buf = 0;
        for (int i = 0; i < index.length(); i++) {
            if (!Character.isDigit(index.charAt(i)))
                buf++;
            else if (index.charAt(i) == ' ')
                buf++;
            else if (index.length() != 5)
                buf++;
        }
        return buf == 0;
    }



    public static boolean isStrangePair (String word1, String word2){
        return word1.charAt(0) == word2.charAt(word2.length() - 1) &&
                word2.charAt(0) == word2.charAt(word1.length() - 1);
    }



    public static boolean isPrefix(String word, String pref){
        pref =  pref.substring(0,  pref.length()-1);
        return word.startsWith(pref);
    }

    public static boolean isSuffix(String word, String suf){
        suf = suf.substring(1);
        return word.endsWith(suf);
    }


    public static int boxSeq(int shag){
        if (shag == 0) return 0;
        int count = 0;
        for (int i = 0; i < shag; i++) {
            if (i % 2 != 0) count--;
            else count += 3;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
