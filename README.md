#LeedCode Series

###Day-1: Happy Number(202)
- Approach: Repeatedly find the sum of squares of digits using % and /, if it reaches 1 return true, otherwise stop after repeated the cycles.
- Time Complexity: O(log n)
- Space Complexity: O(1)

###Day-2: Perfect Number(507)
- Approach: Loop from 1 to num/2, find all divisors of num, add them to sum, and check whether sum==num, if the condition is true return true otherwise return false.
- Time Complexity: O(n)
- Space Complexity: O(1)
