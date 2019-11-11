package 算法;

import java.util.Arrays;

/**
 * @ 作者：许坤杰
 * @ 描述：
 * @ 创建时间：2019-06-06 8:31.
 * @ 修改人：
 * @ 修改时间：2019-06-06 8:31.
 *
 */
public class _归并排序 {
    public static void mergeSort(int[] arr){
        if(arr==null||arr.length<2)return;
        beginMergeSort(arr,0,arr.length-1);
    }

    public static void beginMergeSort(int[] arr,int left,int right){
        if(left==right)return;
        int mid=(right+left)/2;
        beginMergeSort(arr,left,mid);
        beginMergeSort(arr,mid+1,right);
        Merge(arr,left,mid,right);
    }

    public static void Merge(int[] arr,int l,int m,int r){
        int[] help=new int[r-l+1];
        int i=0;
        int p1=l;
        int p2=m+1;
        while (p1<=m&&p2<=r){
            help[i++]=arr[p1]>arr[p2]?arr[p2++]:arr[p1++];
        }
        while (p1<=m){
            help[i++]=arr[p1++];
        }
        while (p2<=r){
            help[i++]=arr[p2++];
        }
        for (int j = 0; j <help.length; j++) {
            arr[j+l]=help[j];
        }
    }

    /*// for test
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    // for test
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    // for test
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // for test
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // for test
    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 100;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            mergeSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        mergeSort(arr);
        printArray(arr);
    }*/

}
