Here is a Python console application that solves the problem:

```python
def find_kth_largest(nums, k):
    nums.sort(reverse=True)
    return nums[k-1]

def main():
    nums = [int(x) for x in input("Enter numbers separated by a space: ").split()]
    k = int(input("Enter the value of K: "))
    print("The Kth largest element is: ", find_kth_largest(nums, k))

if __name__ == "__main__":
    main()
```

This application first asks the user to input a list of numbers separated by a space. It then asks for the value of K. It finds the Kth largest element by sorting the list in descending order and returning the Kth element.