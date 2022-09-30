package Chapter04.D_mergesort;

import java.util.Scanner;

public class test {
    public static int[] A;
    public static int[] tmp;

    public static void makeArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            arr[i] = (int)(Math.random() * 99 + 1);
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) i--;
            }
        }
    }

    public static void printarray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int p, int r) {
        int q = (int) (p+r)/2;
        mergeSort(arr, p, q);
        mergeSort(arr, q+1, r);
        merge(arr, p, q, r);
    }

    public static void merge(int[] arr, int p, int q, int r) {
        int i = q; int j = r; int t = 0;
        while((i >= 0) && (j >= q+1)) {
            if(arr[i] > arr[j]) {
                tmp[t++] = arr[i--];
            } else {
                tmp[t++] = arr[j--];
            }
        }
        while (i >= 0) {
            tmp[t++] = arr[i--];
        }
        while (j >= q+1) {
            tmp[t++] = arr[j--];
        }
        i=0; t=0;
        while(i<=r) {
            arr[i++] = tmp[t++];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("배열의 크기 n값을 입력하세요: ");
        n = sc.nextInt();
        A = new int[n];
        tmp = new int[n];

        makeArray(A, n);

        System.out.println();
        System.out.printf("초기 배열 상태: ");
        printarray(A, n);
        mergeSort(A, 0, n - 1);
        System.out.print("Sort된 배열 상태: ");
        printarray(A, n);
        System.out.println();
    }
}