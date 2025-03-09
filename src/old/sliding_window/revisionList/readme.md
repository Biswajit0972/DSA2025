# Permutation combination problem on string
### My Logic is 
1. create window equal to s1.
2. track frequency using array
3. if array contains 0, its  means that we have a permutation.
4. s1 string using we do --
5. s2 string using we will do ++
6. 4 and 5 stage for creating first window
7. second stage we need to validate our window by reducing.
8. each step check is all condition meet or not.

------
# 1456. Maximum Number of Vowels in a Substring of Given Length
1. create k length window first
2. when we add new character in our window just check it, whenever it is a vowel or not if vowel just update count.
3. after exceed window we just reduce the first character 