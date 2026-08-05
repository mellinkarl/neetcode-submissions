class LRUCache {

    static class ListNode {
        int key;
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int key, int val) {
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    Map<Integer, ListNode> cache;
    ListNode head;
    ListNode tail;
    int capacity;

    public LRUCache(int capacity) {
        this.cache = new HashMap<>();
        this.head = new ListNode(-1, -1);
        this.tail = new ListNode(-1, -1);
        this.capacity = capacity;
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public void moveNode(int key) {
        ListNode node = cache.get(key);
        if (node.next == tail) {
            return;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = this.tail;
        node.prev = this.tail.prev;
        this.tail.prev.next = node;
        this.tail.prev = node;
    }
    
    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        moveNode(key);
        return cache.get(key).val;
    }
    
    public void put(int key, int value) {
        if (!cache.containsKey(key)) {
            ListNode node = new ListNode(key, value);
            node.prev = this.tail.prev;
            node.next = this.tail;
            this.tail.prev.next = node;
            this.tail.prev = node;
            cache.put(key, node);
        }
        else {
            moveNode(key);
            ListNode node = cache.get(key);
            node.val = value;
        }
        if (cache.size() > this.capacity) {
            cache.remove(this.head.next.key);
            this.head.next = this.head.next.next;
            this.head.next.prev = this.head;
        }
    }
}
