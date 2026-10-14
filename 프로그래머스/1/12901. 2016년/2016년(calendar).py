# 가상으로 설정한 날짜라면 사용 불가

import calendar

def solution(a, b):
    day = ['MON','TUE','WED','THU','FRI','SAT','SUN']
    y, m, d = 2016, a, b
    return day[calendar.weekday(y,m,d)]
