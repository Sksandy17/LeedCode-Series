# LeedCode Series

### Day-1: 
#### Happy Number(202)
- My Approach: Repeatedly find the sum of squares of digits using % and /, if it reaches 1 return true, otherwise stop after repeated the cycles.
- Time Complexity: O(log n)
- Space Complexity: O(1)

### Day-2: 
#### Perfect Number(507)
- My Approach: Loop from 1 to num/2, find all divisors of num, add them to sum, and check whether sum==num, if the condition is true return true otherwise return false.
- Time Complexity: O(n)
- Space Complexity: O(1)

### Day-3: 
#### Ugly Number(263)
- My Approach: To check if a positive integer n is ugly, continuously divide it by 2, 3 and 5 as long as it is cleanly divisible. If the number successfully reduces to 1, return true (it has no other prime factors); otherwise, if n<=0 or any other prime factor remains, return false.
- Time Complexity: O(log n)
- Space Complexity: O(1)

#### Harshad Number(3099)
- My Approach: To check an integer is divisible by the sum of its digits using % for getting reminder is 0. if the reminder is 0, return the sum, otherwise it returns -1.
- Time Complexity: O(log x)
- Space Complexity: O(1)

### Day-4:
#### Number of Common Factors(2427)
- My Approach: To check a given two integers are positive a and b, find the common factors of these two numbers, count the common factors and return count.
- Time Complexity: O(min(a, b))
- Space ComplexityL O(1)

### Day-5:
#### Transpose Matrix(867)
- My Approach: Create a new matrix by swapping the rows and columns of the original matrix, then copy each element to its transposed position.
- Time Complexity: O(m x n)
- Space Complexity: O(m x n)

### Day-6:
#### Find Missing Elements(3731)
- My Approach: Find the minimum and maximum values, then check each number in that range against the array. Add the numbers that are missing to the result list.
- Time Complexity: O(n × (max - min + 1))
- Space Complexity: O(1)

### Day-7:
#### Add Digits(258)
- My Approach: Repeatedly add all its digits until the result has only one digit, and return num.
- Time Complexity: O(log n)
- Space Complexity: O(1)

### Day-8:
#### Find the Difference(389)
- My Approach: Store the frequency of each character in s, then decrease the frequency for each character in t and return the character whose frequency becomes negative.
- Time Complexity: O(n)
- Space Complexity: O(1)

#### Find the Duplicate Number(287)
- My Approach: Count the frequency of each number and return the number whose frequency is greater than 1.
- Time Complexity: O(n)
- Space Complexity: O(n)

### Day-9:
#### Check Good Integer(3959)
- My Approach: Given a positive integer n, calculate sum of digits of n in digitSum and sum of the squares of the digits of n in squareSum, to check the difference squareSum-digitSum>=50, return true if n is good integer, otherwise return false.
- Time Complexity: O(log n)
- Space Complexity: O(1)

### Day-10:
#### Find Lucky Integer in an Array(1394)
- My Approach: Count the frequency of each number in the array and check whether its frequency equals its value. Return the largest number satisfying this condition; if none exists, return -1.
- Time Complexity: O(n)
- Space Complexity: O(1)

### Day-11:
#### Pow(x, n)(50)
- My Approach: Handle negative powers by taking the reciprocal, then use binary exponentiation by multiplying the result for odd powers, squaring x, and dividing the power by 2 in each iteration.
- Time Complexity: O(log|n|)
- Space Complexity: O(1)

#### Climbing Stairs(70)
- My Approach: Use a loop to add the previous two step counts and update the values until reaching step n.
- Time Complexity: O(n)
- Space Complexity: O(1)
