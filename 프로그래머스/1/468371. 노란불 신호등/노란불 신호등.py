import math

def solution(signals):
    limit = 1
    
    for G, Y, R in signals:
        interval = G + Y + R
        # least common multiple, greatest common divisor
        limit = math.lcm(limit, interval)
        
    answer = 1
    
    while answer <= limit:
        is_yellow = True
        
        for G, Y, R in signals:
            interval = G + Y + R
            time = (answer-1) % interval
            
            if not (G <= time < G+Y):
                is_yellow = False
                break
                
        if is_yellow:
            return answer
        
        answer += 1
            
    return -1