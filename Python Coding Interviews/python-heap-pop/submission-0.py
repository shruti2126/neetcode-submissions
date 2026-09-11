import heapq
from typing import List


def heap_pop(heap: List[int]) -> List[int]:
    min_heap_lst = []
    heapq.heapify(heap)
    while len(heap) > 0:
        popped = heapq.heappop(heap)
        heapq.heappush(min_heap_lst, popped)
    return min_heap_lst


# do not modify below this line
print(heap_pop([1, 2, 3]))
print(heap_pop([1, 3, 2]))
print(heap_pop([6, 7, 8, 12, 9, 10]))
