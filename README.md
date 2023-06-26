# Question: How do you find the Kth largest element in an unsorted array? C# Summary

The given C# code is designed to find the Kth largest element in an unsorted array. The program begins by defining an array of integers and a variable 'k' which represents the position of the largest element we want to find. The 'FindKthLargest' function is then called with the array and 'k' as arguments. Inside this function, the array is first sorted in ascending order using the 'Array.Sort' method. After sorting, the Kth largest element is found by returning the element at the index 'nums.Length - k' of the sorted array. This works because in a sorted array, the largest element is at the end (at index 'nums.Length - 1'), the second largest is one position before the end (at index 'nums.Length - 2'), and so on. Therefore, the Kth largest element is at index 'nums.Length - k'. The result is then printed to the console.

---

# Python Differences

Both the C# and Python versions solve the problem in a similar way. They both define a function that takes an array and an integer k as input, sort the array, and return the kth largest element. 

However, there are some differences in the language features and methods used:

1. Array Sorting: In C#, the Array.Sort() method is used to sort the array in ascending order. In Python, the list.sort() method is used with the reverse=True argument to sort the list in descending order.

2. Array Indexing: In C#, the kth largest element is found by subtracting k from the length of the array, because arrays in C# are 0-indexed and the array is sorted in ascending order. In Python, the kth largest element is found by simply indexing the k-1 element, because lists in Python are also 0-indexed but the list is sorted in descending order.

3. User Input: In the C# version, the array and k are hardcoded into the program. In the Python version, the program asks the user to input the array and k. The Python version uses the input() function to get user input, and the split() method to split the input string into a list of strings. It then uses a list comprehension to convert each string in the list to an integer.

4. Main Function: In C#, the Main() method is the entry point of the program. In Python, the main() function is defined and then called within the if __name__ == "__main__": block. This is a common idiom in Python for specifying the part of the script that should be executed when the script is run as a standalone program.

5. Print Statement: In C#, the Console.WriteLine() method is used to print the output. In Python, the print() function is used. The Python version uses a comma to concatenate the string and the output, while the C# version uses string interpolation (the $ symbol).

---

# Java Differences

Both the C# and Java versions solve the problem in a similar way. They both define a method that sorts the array in ascending order and then returns the Kth largest element. The main difference between the two versions is how they handle user input and output.

In the C# version, the array and the value of K are hardcoded into the program. The program then calls the `FindKthLargest` method with these values and prints the result to the console.

In contrast, the Java version asks the user to input the size of the array, the elements of the array, and the value of K. It then calls the `findKthLargest` method with these values and prints the result to the console.

In terms of language features or methods, the C# version uses the `Array.Sort` method to sort the array, while the Java version uses the `Arrays.sort` method. These methods are equivalent in functionality, but are named differently due to the conventions of the respective languages.

The C# version uses string interpolation (`$"{k}th largest element is {kthLargest}"`) to format the output string, while the Java version uses string concatenation (`"The Kth largest element is: " + findKthLargest(array, k)`).

Finally, the Java version uses the `Scanner` class to read user input, while the C# version does not require user input.

---
