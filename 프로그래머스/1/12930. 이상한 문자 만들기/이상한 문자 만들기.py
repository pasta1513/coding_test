def solution(s):
    words = s.split(' ')
    new_words = []
    
    for word in words:
        new_word = ''
        
        for i, ch in enumerate(word):
            if i%2 == 0:
                new_word += ch.upper()
            else:
                new_word += ch.lower()
        
        new_words.append(new_word)
        
    return ' '.join(new_words)