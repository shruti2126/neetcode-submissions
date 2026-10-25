class Node:
    def __init__(self, key: int = 0, val: int = 0):
        self.key = key
        self.val = val
        self.prev = None
        self.next = None

class LRUCache:
    
    def __init__(self, capacity: int):
        self.capacity = capacity
        self._lru_map = {}  # maps key to Node
        self.head = Node()
        self.tail = Node()
        self.head.next = self.tail
        self.tail.prev = self.head

    def _remove(self, node: Node) -> None:
        node.prev.next = node.next
        node.next.prev = node.prev

    def _insert(self, node: Node) -> None:
        # insert right before tail (most recently used)
        node.prev = self.tail.prev
        node.next = self.tail
        self.tail.prev.next = node
        self.tail.prev = node

    def get(self, key: int) -> int:
        if key in self._lru_map:
            node = self._lru_map[key]
            self._remove(node)
            self._insert(node)
            return node.val
        return -1

    def put(self, key: int, value: int) -> None:
        if key in self._lru_map:
            node = self._lru_map[key]
            node.val = value
            self._remove(node)
            self._insert(node)
        else:
            if len(self._lru_map) >= self.capacity:
                # evict least recently used (node right after head)
                lru_node = self.head.next
                self._remove(lru_node)
                del self._lru_map[lru_node.key]
            node = Node(key, value)
            self._lru_map[key] = node
            self._insert(node)