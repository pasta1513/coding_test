def solution(s):
    list = s.split(' ')
    answer = 0
    pre_num = 0
    
    for i in list:
        if i == 'Z':
            answer -= pre_num
            continue
        else:
            answer += int(i)
            
        pre_num = int(i)
        
    return answer