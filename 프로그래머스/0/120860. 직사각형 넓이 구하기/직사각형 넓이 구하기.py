def solution(dots):
    a = dots[0][0]
    dx, dy = 0, 0
    
    for i in range(1, 4):
        if dots[i][0] == a:
            dy = abs(dots[0][1] - dots[i][1])
        else:
            dx = abs(a - dots[i][0])
    
    return dx * dy