def solution(s):
    words = s.split(' ')
    answer = 0
    pre_num = 0
    
    for i in words:
        if i == 'Z':
            answer -= pre_num
            continue
            
        pre_num = int(i)
        answer += pre_num
        
    return answer