# Python `calendar` 모듈

## 1. 사용 방법

```python
import calendar
```

## 2. 자주 사용하는 함수

### ① `calendar.calendar(year)`

해당 연도의 전체 달력을 출력

```python
import calendar

print(calendar.calendar(2026)) # 2026년 1월부터 12월까지의 달력을 출력
```

### ② `calendar.month(year, month)`

특정 연도와 월의 달력을 출력

```python
print(calendar.month(2026, 10)) # 2026년 10월의 달력을 출력
```

### ③ `calendar.weekday(year, month, day)`

특정 날짜가 무슨 요일인지 숫자로 반환

```python
print(calendar.weekday(2026, 10, 14))
```

반환값: `2`
요일은 다음과 같이 숫자로 표현

| 반환값 | 요일 |
|:---:|:---:|
| 0 | 월요일 |
| 1 | 화요일 |
| 2 | 수요일 |
| 3 | 목요일 |
| 4 | 금요일 |
| 5 | 토요일 |
| 6 | 일요일 |

따라서 `calendar.weekday(2026, 10, 14)`는 수요일을 의미

### ④ `calendar.isleap(year)`

해당 연도가 윤년인지 확인

```python
print(calendar.isleap(2024))  # True
print(calendar.isleap(2025))  # False
```

- 윤년이면 `True`
- 윤년이 아니면 `False`

### ⑤ `calendar.monthrange(year, month)`

해당 월의 첫 번째 요일과 마지막 날짜를 반환

```python
print(calendar.monthrange(2026, 10))
```

결과:
```python
(3, 31)
```

- `3`: 첫날인 10월 1일의 요일이 목요일이라는 뜻 (월요일이 0)
- `31`: 10월의 마지막 날짜

### ⑥ `calendar.weekheader(n)`

요일 이름을 n개의 문자로 표시

```python
print(calendar.weekheader(2))
```

결과:
```text
Mo Tu We Th Fr Sa Su
```

`2`는 각 요일 이름을 두 글자로 표시하라는 의미

## 3. 코딩 테스트에서 특히 유용한 함수

| 함수 | 용도 |
|---|---|
| `calendar.weekday(y, m, d)` | 날짜의 요일 구하기 |
| `calendar.monthrange(y, m)` | 월의 첫 요일과 마지막 날짜 구하기 |
| `calendar.isleap(y)` | 윤년인지 확인하기 |
