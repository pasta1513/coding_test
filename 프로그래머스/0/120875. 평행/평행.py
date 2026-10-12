def solution(dots):
    a = dots[0]
    b = dots[1]
    c = dots[2]
    d = dots[3]
    
    if (a[1]-b[1])/(a[0]-b[0]) == (c[1]-d[1])/(c[0]-d[0]):
        return 1
    if (a[1]-c[1])/(a[0]-c[0]) == (b[1]-d[1])/(b[0]-d[0]):
        return 1
    if (a[1]-d[1])/(a[0]-d[0]) == (b[1]-c[1])/(b[0]-c[0]):
        return 1
    
    return 0