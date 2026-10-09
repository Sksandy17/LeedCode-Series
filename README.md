# LeedCode Series

### Day-1: 
Happy Number(202)
- My Approach: Repeatedly find the sum of squares of digits using % and /, if it reaches 1 return true, otherwise stop after repeated the cycles.
- Time Complexity: O(log n)
- Space Complexity: O(1)

### Day-2: 
Perfect Number(507)
- My Approach: Loop from 1 to num/2, find all divisors of num, add them to sum, and check whether sum==num, if the condition is true return true otherwise return false.
- Time Complexity: O(n)
- Space Complexity: O(1)

### Day-3: 
Ugly Number(263)
- My Approach: To check if a positive integer n is ugly, continuously divide it by 2, 3 and 5 as long as it is cleanly divisible. If the number successfully reduces to 1, return true (it has no other prime factors); otherwise, if n<=0 or any other prime factor remains, return false.
- Time Complexity: O(log n)
- Space Complexity: O(1)

Harshad Number(3099)
- My Approach: To check an integer is divisible by the sum of its digits using % for getting reminder is 0. if the reminder is 0, return the sum, otherwise it returns -1.
- Time Complexity: O(log x)
- Space Complexity: O(1)
