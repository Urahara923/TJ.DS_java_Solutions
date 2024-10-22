public class Q4 {
    public static int compress(char[] chars) {
        //write your code here
        int i = 0;
        for (int j = 1; j < chars.length; j++){
            if (chars [j] != chars[i]){
                i++;
                chars [i] = chars[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int newSize = compress(chars);
        System.out.println("New length: " + newSize);
        for (int i = 0; i < newSize; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
    }
}