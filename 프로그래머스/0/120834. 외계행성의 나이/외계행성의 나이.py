def solution(age):
    answer = str(age)
    
    if "0" in answer:
        answer = answer.replace("0", "a")
    if "1" in answer:
        answer = answer.replace("1", "b")
    if "2" in answer:
        answer = answer.replace("2", "c")
    if "3" in answer:
        answer = answer.replace("3", "d")
    if "4" in answer:
        answer = answer.replace("4", "e")
    if "5" in answer:
        answer = answer.replace("5", "f")
    if "6" in answer:
        answer = answer.replace("6", "g")
    if "7" in answer:
        answer = answer.replace("7", "h")
    if "8" in answer:
        answer = answer.replace("8", "i")
    if "9" in answer:
        answer = answer.replace("9", "j")
    
    return answer