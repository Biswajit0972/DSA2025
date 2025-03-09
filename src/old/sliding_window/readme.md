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

{
"statusCode": 200,
"message": "Notes",
"data": [
{
"_id": "66f64a69af1287c476a2a858",
"userId": "66f64a22af1287c476a2a84a",
"content": "Good morning my server. Today is a great day. I will read computer networks, Node js and react for interview today. I will go Market  now. After compeleting the market i will go to the school for pick up my sister datugter.",
"createdAt": "2024-09-27T06:02:17.113Z",
"updatedAt": "2024-09-27T06:02:17.113Z",
"__v": 0
},
{
"_id": "66f95aafd4c4db1075eaa593",
"userId": "66f64a22af1287c476a2a84a",
"content": "Nothing to say now, But i am still working on this project. I think, I will complete this project in two days.",
"createdAt": "2024-09-29T13:48:31.757Z",
"updatedAt": "2024-09-29T13:48:31.757Z",
"__v": 0
},
{
"_id": "66f95ab3d4c4db1075eaa598",
"userId": "66f64a22af1287c476a2a84a",
"content": "Nothing to say now, But i am still working on this project. I think, I will complete this project in two days.",
"createdAt": "2024-09-29T13:48:35.261Z",
"updatedAt": "2024-09-29T13:48:35.261Z",
"__v": 0
}
],
"flag": true
}