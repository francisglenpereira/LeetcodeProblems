package com.Francis.DSA.BinarySearch;

public class SearchInRotataedArrayWithDuplicates {
    public static void main(String[] args) {
        int[]arr = {2,2,2,3,4,2,2};
        int target = 4;
        int pivot = findPivotWithDuplicateelements(arr);
        if(pivot == -1)
        {
            //no rotaion happened , Normal binary Search
            int res  = binarySearch(arr,target,0, arr.length-1);
            System.out.println(res);
        }
        if(arr[pivot] == target)
        {
            System.out.println(pivot);
        } else if (arr[0]<target) {
            int res  = binarySearch(arr,target,0, pivot -1);
            System.out.println(res);
        }
        else{
            int res  = binarySearch(arr,target,pivot+1, arr.length-1);
            System.out.println(res);
        }
    }
    static int binarySearch(int[]arr, int target, int start, int end)
    {

        int mid;
        while(start<=end)
        {
            mid = start +(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            } else if (target > arr[mid]) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;

    }
    static int findPivotWithDuplicateelements(int[]arr)
    {
        //case 1 arr(mid) > arr(mid+1)
        int start =0;
        int end = arr.length-1;
        int mid;
        while(start<=end)
        {
            mid = start +(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            {
                return mid;
            } else if (start<mid &&arr[mid] < arr[mid - 1]) {
                return mid-1;
            } else if (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                //if start is pivot
                if(arr[start]>arr[start+1])
                {
                    return start;
                }
                //else end is pivot
                if (arr[end]>arr[end-1])
                {
                    return (end-1);
                }
                start++;
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
