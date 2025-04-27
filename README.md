# Chef-Diet
CodeChef Difficulty 1025 problem.

Chef's Protein Diet Problem
Chef has decided to follow a diet plan for the next N days (numbered 1 through N). As part of this plan, Chef aims to consume K grams of protein every day. Here's how it works:
- Each morning, Chef buys Ai grams of protein for the i-th day.
- During dinner, Chef consumes K grams of protein.
- Any leftover protein can be stored and used for future dinners.

Initially, Chef has 0 grams of stored protein.
Your task is to determine if Chef has enough protein during the entire diet. If not, find the first day on which Chef cannot consume K grams of protein.

Input Format
- The first line contains a single integer T, the number of test cases.
- For each test case:- The first line contains two space-separated integers N (number of days) and K (grams of protein needed per day).
- The second line contains N space-separated integers A1, A2, ..., AN, where Ai is the protein Chef buys on the i-th day.



Output Format
For each test case:
- If Chef will have enough protein for all N days, print:YES

- Otherwise, print:NO <day>
Here, <day> is the first day on which Chef cannot consume K grams of protein.


Example
Input
2
5 4
6 3 2 1 5
3 10
8 1 1


Output
YES
NO 2



Explanation
- Test Case 1:- Chef successfully consumes protein for all 5 days. The output is YES.

- Test Case 2:- On day 2, Chef has only 8 grams remaining and cannot consume 10 grams. The output is NO 2.




