def solution(n):
    num_list = list(str(n))
    num_list.sort(reverse=True)
        
    return int(''.join(num_list))