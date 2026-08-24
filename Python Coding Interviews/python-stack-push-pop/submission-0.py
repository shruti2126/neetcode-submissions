from typing import List


def reverse_list(arr: List[int]) -> List[int]:
    new_list = []
    stack = []
    for a in arr:
        stack.append(a)
    while len(stack) > 0:
        new_list.append(stack.pop())
    return new_list

# do not modify below this line
print(reverse_list([1, 2, 3]))
print(reverse_list([3, 2, 1, 4, 6, 2]))
print(reverse_list([1, 9, 7, 3, 2, 1, 4, 6, 2]))
