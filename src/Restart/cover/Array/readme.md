```java
public List<Integer> findDuplicates(int[] arr) {
    List<Integer> res = new ArrayList<>();
    
    for (int i = 0; i < arr.length; i++) {
        int index = Math.abs(arr[i]) - 1; // Calculate index based on the value
        
        // If the value at this index is negative, it means the number has appeared before
        if (arr[index] < 0) {
            res.add(index + 1);
        } else {
            // Mark the value as seen by making it negative
            arr[index] = -arr[index];
        }
    }
    
    return res;
}

```