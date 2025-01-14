## This is for sliding window revision topic 💀

**1. Maximum Points You Can Obtain from Cards [🔗](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/)**
>**Logic:**
> 
> We can't move directly middle position as did that at previous fixed question.
> In this question mentioned. we can add point from left side or right side. 
> 
> i. firstly calculate fist k size window sum.
> ii. then reduce the last rightmost point and add array rightmost one. 
> iii. we are add value and remove it like circle queue❤️
> **iv. Don't touch the middle one directly**.

# Pattern observation
### Fixed Window.
1. String:
    * Generate substring
    * Sometimes they give us a size or another string. for creating a window.
    * Asking for Maximum or minimum length or a certain condition that we need to satisfied.
2. Array:
    *  Mostly generate subString.
    * K condition for maximum and minimum sum or mange the array with some conditions but there always k should be present.
### Dynamic Size
1. Mostly ask for length and count sub-array or sub-string.
2. same as fixed portion, but here m  axSum or some conditions are already given.
3. We need to calculate the window size.

## Tips

1. Length = (i-left+1)
2. subarray count simple add the length in the count