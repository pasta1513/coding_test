def solution(n):
    answer = [[0]*n for _ in range(n)]
    x, y = 0, 0
    dx = [0, 1, 0, -1]
    dy = [1, 0, -1, 0]
    direction = 0
    
    for num in range(1, n*n + 1):
        answer[x][y] = num
        nx = x + dx[direction]
        ny = y + dy[direction]
        
        if nx>=n or ny>=n or nx<0 or ny<0 or answer[nx][ny]!=0:
            direction = (direction + 1) % 4
        
        x = x + dx[direction]
        y = y + dy[direction]
        
    return answer