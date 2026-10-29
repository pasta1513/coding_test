def solution(n):
    middle_num = n // 2
    answer = 0
    
    for i in range(1, middle_num+1):
        if n % i == 0:
            answer += i
            
    return answer+n