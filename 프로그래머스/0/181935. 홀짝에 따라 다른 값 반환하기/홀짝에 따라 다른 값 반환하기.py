def solution(n):
    answer = 0
    
    # if n%2 == 1:
    #     for i in range (1, (n+1)//2+1):
    #         answer += 2*i - 1
    # else:
    #     for i in range (1, n//2+1):
    #         answer += 4*i*i
    
    # 범위에서부터 홀수/짝수만 셈하도록
    if n%2 == 1:
        for i in range (1, n+1, 2):
            answer += i
    else:
        for i in range(2, n+1, 2):
            answer += i * i
            
    return answer