def solution(n):
    answer = 0
    
    if n%2 == 1:
        for i in range (1, (n+1)//2+1):
            answer += 2*i - 1
    else:
        for i in range (1, n//2+1):
            answer += 4*i*i
    return answer