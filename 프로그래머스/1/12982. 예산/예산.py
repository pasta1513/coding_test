def solution(d, budget):
    d.sort()
    d_sum, answer = 0, 0
    
    for num in d:
        if d_sum + num > budget:
            break;
        
        d_sum += num
        answer +=1
            
    return answer