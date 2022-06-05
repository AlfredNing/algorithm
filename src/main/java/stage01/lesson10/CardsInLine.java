package stage01.lesson10;

/**
 * @ClassName CardsInLine
 * @Description 纸牌博弈论
 * @Author Alfred.Ning
 * @Date 2022/6/3 9:59
 * @Version 1.0
 **/
public class CardsInLine {
    public static int win1(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        // 获胜分数
        return Math.max(
                f(arr, 0, arr.length - 1), // 先手
                s(arr, 0, arr.length - 1) // 后手
        );
    }

    public static int f(int[] arr, int L, int R) {
        if (L == R) {
            // 先手拿只剩最后一张牌
            return arr[L];
        }
        return Math.max(
                arr[L] + s(arr, L + 1, R),
                arr[R] + s(arr, L, R - 1)
        );
    }

    public static int s(int[] arr, int L, int R) {
        if (L == R) {
            // 后手拿只剩最后一张表
            return 0;
        }
        return Math.min(
                f(arr, L + 1, R),
                f(arr, L, R - 1)
        );
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 4, 5, 8, 1, 6, 0, 3, 4, 6, 1, 7 };
        System.out.println(win1(arr));
//        System.out.println(win2(arr));
//        System.out.println(win3(arr));

    }
}
