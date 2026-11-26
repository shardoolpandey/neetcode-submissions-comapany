class LRUCache {

    class Node
    {
        int key;
        int value;
        Node prev;
        Node next;
        Node ( int key,int value)
        {
            this.key=key;
            this.value=value;
            prev=null;
            next=null;
        }
    }
    Node head;
    Node tail;
    int capacity;
    void insertAtHead(Node node)
    {
        Node temp=head.next;
        head.next=node;
        node.next=temp;
        node.prev=head;
        temp.prev=node;
    
    }
    void deleteNode(Node node)
    {
        Node previous=node.prev;
        Node nextNode=node.next;
        previous.next=nextNode;
        nextNode.prev=previous;
    }
    HashMap<Integer,Node> map;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        map=new HashMap<>();
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
        {
            return -1;
        }
        Node node=map.get(key);
        deleteNode(node);
        insertAtHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(!map.isEmpty() && map.containsKey(key))
        {
            Node node=map.get(key);
            node.value=value;
            deleteNode(node);
            insertAtHead(node);
        }
        else
        {
            Node node=new Node(key,value);
            if(map.size()==capacity)
            {
                Node temp=tail.prev;
                map.remove(temp.key);
                deleteNode(temp);

            }
            map.put(key,node);
            insertAtHead(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */