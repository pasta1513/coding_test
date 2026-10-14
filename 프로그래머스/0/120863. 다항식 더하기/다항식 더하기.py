def solution(polynomial):
    terms = polynomial.replace(' ', '').split('+')
    variable, constant = 0, 0
    
    for term in terms:
        if 'x' in term:
            coefficient = term.strip('x')
            variable += int(coefficient) if coefficient else 1
        else:
            constant += int(term)
            
    answer = ''
    
    if variable == 1:
        answer = 'x'
    elif variable > 1:
        answer = str(variable) + 'x'
        
    if constant > 0:
        if answer:
            answer += ' + '
        answer += str(constant)
    
    return answer