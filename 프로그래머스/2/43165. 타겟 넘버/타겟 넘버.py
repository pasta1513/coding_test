def solution(numbers, target):
    # 이렇게 해서 진행할 시 부분집합 문제가 됨
    # 이 문제는 DFS를 이용해서 더 잘 풀 수 있음
    total = sum(numbers)        
    goal = (total-target) // 2
    # de[index]: 합계 index를 만드는 경우의 수
    dp = [0] * (goal + 1)
    dp[0] = 1

    for number in numbers:
        # number~goal로 +1하며 세지 않고 goal~number로 -1하며 세는 이유는
        # 작은 수부터 셈할 경우, 작은 숫자를 더 많이 사용하게 될 수도 있기 때문
        # e.g. number = 1인 경우, dp[1]에 대해 셈한 후에 dp[2]를 정하면,
        #      numbers에 1이 하나뿐이더라도 2개인 것처럼 처리됨
        for s in range(goal, number-1, -1):
            # 합계 s를 만드는 경우의 수 = 기존의 경우의 수 + 합계 (s-number)를 만드는 경우의 수
            # 현재 더할 수가 number기 때문에!
            dp[s] += dp[s - number]

    return dp[goal]