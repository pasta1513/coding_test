import re

def solution(new_id):
    answer = new_id.lower()
    answer = re.sub(r'[^a-z0-9._-]', '', answer)
    answer = re.sub(r'\.+', '.', answer)
    answer = answer.strip(".")
    if answer == "":
        answer = "a"
    if len(answer) >= 16:
        answer = answer[:15]
        if answer[-1] == ".":
            answer = answer[:-1]
    while len(answer) < 3:
        answer = answer + answer[-1]
    return answer