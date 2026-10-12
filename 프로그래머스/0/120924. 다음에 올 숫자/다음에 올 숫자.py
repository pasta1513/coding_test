def solution(common):
    a = common[0]
    b = common[1]
    c = common[2]
    last = common[-1]
    
    if (b-a) == (c-b):
        return last + (b - a)
    else:
        return last * (b / a)
    