def solution(num, total):
    round_num = 0
    
    if num%2 == 1:
        round_num = total / num
        start_num = round_num - (num // 2)
    else:
        round_num = (total / (num/2)) // 2
        start_num = round_num - (num // 2) + 1
    
    last_num = start_num + num
    
    answer = []
    
    for i in range(int(start_num), int(last_num)):
        answer.append(i)
        
    return answer