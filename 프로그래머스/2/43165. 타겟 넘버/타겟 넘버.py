def solution(numbers, target):
    total = sum(numbers)        
    goal = (total-target) // 2
    # 이렇게 해서 진행할 시 부분집합 문제가 됨
    # 이 문제는 DFS를 이용해서 더 잘 풀 수 있음
            
    dp = [0] * (goal + 1)
    dp[0] = 1

    for number in numbers:
        for s in range(goal, number - 1, -1):
            dp[s] += dp[s - number]

    return dp[goal]