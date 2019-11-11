package 算法;

/**
 * @ 作者：许坤杰
 * @ 描述：冒泡排序
 * @ 创建时间：2019-06-04 17:09.
 * @ 修改人：
 * @ 修改时间：2019-06-04 17:09.
 *
 */
public class _冒泡排序 {
    public static void main(String[] args) {
        int[] arr={1,6,2,9,5,3,7,5,8,10};
        bubbleSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }
    private static void bubbleSort(int[] arr){
        if (arr.length<2||arr==null)return;
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j <i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}

