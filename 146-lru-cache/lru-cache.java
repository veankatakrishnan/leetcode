class LRUCache {
    class Node{
        int key;
        int value;
        Node next;
        Node prev;

        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);

    int capacity;
    HashMap<Integer, Node> map = new HashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node targetNode = map.get(key);
        removeNode(targetNode);
        addToFront(targetNode);
        return targetNode.value;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node targetNode = map.get(key);
            removeNode(targetNode);
            targetNode.value = value;
            addToFront(targetNode);
        }
        else{
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            addToFront(newNode);
            if(map.size() > capacity){
                Node lruNode = tail.prev;
                map.remove(lruNode.key);
                removeNode(lruNode);
            }
        }
    }

    public void addToFront(Node newNode){
        newNode.next = head.next;
        head.next.prev = newNode;
        head.next = newNode;
        newNode.prev = head;
    }

    public void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = null;
        node.prev = null;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */