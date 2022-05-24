package test.stage01;

/**
 * @ClassName 插入排序
 * @Author 宁强-34436
 * @Date 2022/5/23 19:58
 * @Email qiang.ning@going-link.com
 * @Descirption
 **/
public class 插入排序 {
  public void insertionSort(int[] arr) {
    if (arr == null || arr.length < 2) {
      return;
    }
    for (int i = 1; i < arr.length; i++) {
      for (int j = i - 1; j > 0 && arr[j] > arr[j + 1]; j--) {
        swap(arr, j, j + 1);
      }
    }

  }

  public static void swap(int[] arr, int i, int j) {
    arr[i] = arr[i] ^ arr[j];
    arr[j] = arr[i] ^ arr[j];
    arr[i] = arr[i] ^ arr[j];
  }
}
