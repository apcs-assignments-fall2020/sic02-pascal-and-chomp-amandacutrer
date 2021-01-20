/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        int[][] pascal = new int[n][n];
        pascal[0][0] = 1;
        for (int i = 1; i < n; i++){
            pascal[i][0]= 1;
            pascal[i][i]= 1;
        }
            for (int i = 2; i < n; i++){
                for (int j = 1; j < i; j++){
                    pascal[i][j] = pascal[i-1][j]+pascal[i-1][j-1];
                }

            }
        return pascal;
    }
}
