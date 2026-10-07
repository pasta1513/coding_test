def solution(picture, k):
    answer = []

    # 1차 리팩토링: 각 문자를 인덱스로 접근하지 않아도 됨
    for row in picture:
        # 2차 리팩토링: += 대신 join 사용
        new_row = ''.join(char * k for char in row)

        for _ in range(k):
          answer.append(new_row)
            
    return answer
