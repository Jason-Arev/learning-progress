def steps(number):
    if number < 1:
        raise ValueError("Only positive integers are allowed")

    cur = number
    steps = 0
    while cur != 1:
        if cur % 2 == 0:
            cur //= 2
        else:
            cur = cur * 3 + 1
        steps += 1
    return steps
