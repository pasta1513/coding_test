def solution(arr):
    rows = len(arr)
    cols = len(arr[0])
    
    if rows > cols:
        for row in arr:
            row.extend([0] * (rows-cols))
    elif rows < cols:
        arr.extend([0] * cols for _ in range (cols - rows))
    
    return arr