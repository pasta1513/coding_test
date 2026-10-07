def solution(bin1, bin2):
    answer = ""
    carry = 0
    i = len(bin1) - 1
    j = len(bin2) - 1
    
    while i>=0 or j>=0 or carry!=0:
        a = int(bin1[i]) if i>=0 else 0
        b = int(bin2[j]) if j>=0 else 0
        
        total = a + b + carry
        
        answer = str(total%2) + answer
        carry = total // 2
        
        i -= 1
        j -= 1
        
    return answer