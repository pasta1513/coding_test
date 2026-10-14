def solution(a, b):
    # 1, 3, 5, 7, 8, 10, 12 -> 31일
    # 2 -> 29일
    # 4, 6, 9, 11 -> 30일
    
    week = ['SUN', 'MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT']
    month_day = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    day = 0
    
    for month in range(0, a):
        day += month_day[month]
    
    day += b
    answer = week[(day + 4) % 7]
    
    return answer