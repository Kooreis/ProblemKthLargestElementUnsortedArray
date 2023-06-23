```C#
using System;
using System.Linq;

class Program
{
    static void Main(string[] args)
    {
        int[] array = { 7, 5, 15, 8, 3, 1, 9 };
        int k = 3;

        int kthLargest = FindKthLargest(array, k);

        Console.WriteLine($"The {k}th largest element is {kthLargest}");
    }

    static int FindKthLargest(int[] nums, int k)
    {
        Array.Sort(nums);
        return nums[nums.Length - k];
    }
}
```