package 算法;

/**
 * @ 作者：许坤杰
 * @ 描述：
 * @ 创建时间：2019-06-04 17:25.
 * @ 修改人：
 * @ 修改时间：2019-06-04 17:25.
 *
 */
public class _选择排序 {
    public static void main(String[] args) {
        int[] arr={1,6,2,9,5,3,7,4,8,10};
        selectionSorrt(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }
    private static void selectionSorrt(int[] arr){
        if (arr.length<2||arr==null)return;
        for (int i = 0; i <arr.length-1; i++) {
            int minIndex=i;
            for (int j = i+1; j <arr.length; j++) {
                minIndex=arr[j]<arr[minIndex]?j:minIndex;
            }
            swap(arr,minIndex,i);
        }
    }

    private static void swap(int[] arr, int minIndex, int i) {
        int temp=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }
}
