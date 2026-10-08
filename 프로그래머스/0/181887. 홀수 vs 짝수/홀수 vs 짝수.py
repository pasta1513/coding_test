def solution(num_list):
    odds = 0
    evens = 0
    
    for i in range(len(num_list)):
        if i%2 == 0:
            odds += num_list[i]
        else:
            evens += num_list[i]
            
    answer = odds if odds>evens else evens
    return answer