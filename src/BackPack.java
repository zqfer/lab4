
public class BackPack {
    public static void main(String[] args) {
        //�?大容量为10
        int m = 10;
        int n = 3;
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int c[][] =  BackPack_Solution(m, n, w,p);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(c[i][j] + "\t");
                if (j == m) {
                    System.out.println();
                }
            }
        }
        //printPack(c, w, m, n);

    }

    /**
     * @param m 表示背包的最大容�?
     * @param n 表示商品个数
     * @param w 表示商品重量数组
     * @param p 表示商品价�?�数�?
     */
    public static int[][] BackPack_Solution(int m, int n, int[] w, int[] p) {
        //c[i][v]表示前i件物品恰放入�?个重量为m的背包可以获得的�?大价�?
        //递推式：c[i][m]=max{c[i-1][m-w[i]]+pi , c[i-1][m]}
        int c[][] = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            c[i][0] = 0;
        }
        for (int j = 0; j < m + 1; j++) {
            c[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                //当物品为i件重量为j时，如果第i件的重量(w[i-1])小于重量j时，c[i][j]为下列两种情况之�?�?
                //(1)物品i不放入背包中，所以c[i][j]为c[i-1][j]的�??
                //(2)物品i放入背包中，则背包剩余重量为j-w[i-1],�?以c[i][j]为c[i-1][j-w[i-1]]的�?�加上当前物品i的价�?
                if (w[i - 1] <= j) {
                    if (c[i - 1][j] < (c[i - 1][j - w[i - 1]] + p[i - 1])) {
                        c[i][j] = c[i - 1][j - w[i - 1]] + p[i - 1];
                    } else {
                        c[i][j] = c[i - 1][j];
                    }
                } else {
                    c[i][j] = c[i - 1][j];
                }
            }
        }
        return c;
    }
}