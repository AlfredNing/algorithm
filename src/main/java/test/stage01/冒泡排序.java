package test.stage01;

/**
 * @ClassName 冒泡排序
 * @Author 宁强-34436
 * @Date 2022/5/23 19:38
 * @Email qiang.ning@going-link.com
 * @Descirption
 **/
public class 冒泡排序 {
  public void bubbleSort(int[] arr) {
    if (arr == null || arr.length < 2) {
      return;
    }
    for (int i = arr.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j + 1]) {
          swap(arr, j, j + 1);
        }
      }
    }
  }

  private void swap(int[] arr, int j, int i) {
    arr[i] = arr[i] ^ arr[j];
    arr[j] = arr[i] ^ arr[j];
    arr[i] = arr[i] ^ arr[j];
  }
}
