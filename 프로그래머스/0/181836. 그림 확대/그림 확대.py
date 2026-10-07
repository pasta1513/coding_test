def solution(picture, k):
    answer = []
    
    for i in range (len(picture)):
        answer.append("")
        
        for j in range (len(picture[i])):
            answer[-1] += picture[i][j] * k
        
        for _ in range (k-1):
            answer.append(answer[-1])
            
    return answer