#include<limits.h>
class Solution
{
public:
    bool isPalindrome(int x)
    {
        if (x < 0)
        {
            return false;
        }

        int ans = 0, num = x, rem;
        while (num != 0)
        {
            rem = num % 10;
            num /= 10;
            if (ans > INT_MAX / 10)
            {
                return 0;
            }
            ans = ans * 10 + rem;
        }
        if (ans == x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
};