package stage01.lesson10;

/**
 * @ClassName ConvertToLetterString
 * @Description 数字字符串转换
 * @Author Alfred.Ning
 * @Date 2022/5/30 8:54
 * @Version 1.0
 **/
public class ConvertToLetterString {
    public static int number(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        return process(str.toCharArray(), 0);
    }

    // i..之后的数字进行转行，前面的转换已经结束
    private static int process(char[] chars, int i) {
        if (i == chars.length) {
            // '11' 进行转行，出现最终结果
            return 1;
        }
        // i没有到达结束位置，出现0
        if (chars[i] == 0) {
            return 0;
        }
        // i位置是1
        if (chars[i] == '1') {
            int res = process(chars, i + 1);// i自己作为单独一部分
            if (i + 1 < chars.length) {
                // i和i+1作为一部分
                res += process(chars, i + 1);
            }
            return res;
        }
        // i位置是1
        if (chars[i] == '2') {
            int res = process(chars, i + 1);// i自己作为单独一部分
            if (i + 1 < chars.length && (chars[i + 1] >= '0' && chars[i + 1] <= '6')) {
                // i和i+1作为一部分
                res += process(chars, i + 2);
            }
            return res;
        }

        // i位置是3-9
        return process(chars, i + 1);
    }
}
