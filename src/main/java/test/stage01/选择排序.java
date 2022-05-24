package test.stage01;

/**
 * @ClassName 选择排序
 * @Author 宁强-34436
 * @Date 2022/5/23 20:06
 * @Email qiang.ning@going-link.com
 * @Descirption
 **/
public class 选择排序 {
  public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int minIndex = i;
      for (int j = i + 1; j < arr.length; j++) {
            minIndex = arr[j] > arr[minIndex] ? minIndex : j;
      }
      swap(arr, minIndex, i);
    }
  }
  public static void swap(int[] arr,int minIndex, int i){
    int temp = arr[minIndex];
    arr[minIndex] = arr[i];
    arr[i] = temp;
  }

}
