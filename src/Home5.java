import java.util.Arrays;

public class Home5 {

    public static void main(String[] args) {

        String[][] twoDimArray = new String[8][8];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if((i + j) % 2 == 0) {
                    twoDimArray[i][j] = "W";
                } else {
                    twoDimArray[i][j] = "B";
                }

            }
        }
        System.out.println(Arrays.deepToString(twoDimArray));
    }

}
