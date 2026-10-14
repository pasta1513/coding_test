def solution(num, total):
    # a부터 num 개수 만큼의 숫자 더하기
    # a + (a+1) + (a+2) +  ... + (a+(num-2)) + (a+(num-1))
    # = a*num + {1 + 2 + ... (num-2) + (num-1)}
    # = a*num + num*(num-1)/2
    # => a*num = total - num*(num-1)/2
    # => a = {total - num*(num-1)/2} / num
    
    start_num = (total - (num * (num-1) // 2)) // num
    
    return [start_num + i for i in range(num)]
