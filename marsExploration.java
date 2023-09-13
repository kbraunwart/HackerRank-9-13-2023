import java.io.*;

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        // Write your code here
        int lettersChanged = 0;

        for (int i = 0; i < s.length(); i += 3) {
            char character1 = s.charAt(i);
            char character2 = s.charAt(i + 1);
            char character3 = s.charAt(i + 2);


            if (character1 != 'S') {
                lettersChanged += 1;
            }
            if (character2 != 'O') {
                lettersChanged += 1;
            }
            if (character3 != 'S') {
                lettersChanged += 1;
            }
        }
        return lettersChanged;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

