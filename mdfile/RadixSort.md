# RadixSort [기수정렬]

## 1

```
radixSort(A[], n, k)
{
    for (i ← 1) to k {
        i번째 자릿수에 대해 A[1, ... , n]을 안정성을 유지하면서 정렬한다.
    }
}
```


1. 일의 자리 : A[i] % 10     (i=1)
2. 십의 자리 : A[i] % 10^2    (i=2)
3. 백의 자리 : A[i] % 10^3   (i=3)