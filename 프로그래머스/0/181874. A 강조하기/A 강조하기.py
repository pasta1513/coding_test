def solution(myString):
    # answer = myString.lower().replace("a", "A")
    
    answer = ""
    
    for s in myString:
        if s == "a":
            answer += s.upper()
        elif s != "A":
            answer += s.lower()
        else:
            answer += s
            
    return answer