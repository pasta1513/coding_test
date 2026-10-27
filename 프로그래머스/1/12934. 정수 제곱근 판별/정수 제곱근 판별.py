import math

def solution(n):
    if math.isqrt(n) ** 2 == n:
        return (math.isqrt(n) + 1) ** 2

    return -1