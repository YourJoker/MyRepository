package 算法;

import java.util.Arrays;

/**
 * @ 作者：许坤杰
 * @ 描述：
 * @ 创建时间：2019-06-05 10:02.
 * @ 修改人：
 * @ 修改时间：2019-06-05 10:02.
 *
 */
class Person{
    static int arr[]=new int[5];

    public static void main(String[] args) {
        System.out.println(arr[0]);
    }
}
public class _Test {
    public static void bubbleSort(int[] arr) {

    }
    public static void MergeSort(int[] arr,int l,int r){
        if (l==r)return;
        int mid=(l+r)/2;
        MergeSort(arr,l,mid);
        MergeSort(arr,mid+1,r);
        Merge(arr,l,mid,r);

    }
    public static void Merge(int[] arr,int l,int mid,int r){
        int[] temp=new int[r-l+1];
        int i=0;
        int left1=l;
        int left2=mid+1;
        while (left1<=mid&&left2<=r){
            temp[i++]=arr[left1]<arr[left2]?arr[left1++]:arr[left2++];
        }
        while(left1<=mid){
            temp[i++]=arr[left1++];
        }
        while(left2<=r){
            temp[i++]=arr[left2++];
        }
        for (int j = 0; j <temp.length ; j++) {
            arr[j+l]=temp[j];
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    // for test
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
            bubbleSort(arr1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;

                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }

}
