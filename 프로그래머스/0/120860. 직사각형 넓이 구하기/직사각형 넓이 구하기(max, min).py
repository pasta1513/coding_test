def solution(dots):
    # 직사각형이 변이 축과 평행하기 때문에 이런 식으로 단순하게 max/min을 사용해도 충분
    # max/min(list): 리스트들의 열을 차례대로 비교, 각 행의 값을 계산 후 비교하는 것이 아닌 사전식 비교
    return (max(dots)[0] - min(dots)[0]) * (max(dots)[1] - min(dots)[1])
