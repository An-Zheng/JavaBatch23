package DatabaseDay1;
import java.util.HashMap;
import java.util.Map;
class LRU {
    class LinkNode {
        int key;
        int value;
        LinkNode prev;
        LinkNode next;
    }

    private void addNode(LinkNode node) {

        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(LinkNode node){

        LinkNode prev = node.prev;
        LinkNode next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    private void moveToHead(LinkNode node){
        removeNode(node);
        addNode(node);
    }

    private LinkNode popTail() {

        LinkNode res = tail.prev;
        removeNode(res);
        return res;
    }

    private Map<Integer, LinkNode> cache = new HashMap<>();
    private int size;
    private int capacity;
    private LinkNode head, tail;

    public LRU(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        head = new LinkNode();

        tail = new LinkNode();

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        LinkNode node = cache.get(key);
        if (node == null) return -1;

        moveToHead(node);

        return node.value;
    }

    public void put(int key, int value) {
        LinkNode node = cache.get(key);

        if(node == null) {
            LinkNode newNode = new LinkNode();
            newNode.key = key;
            newNode.value = value;

            cache.put(key, newNode);
            addNode(newNode);

            ++size;

            if(size > capacity) {
                LinkNode tail = popTail();
                cache.remove(tail.key);
                --size;
            }
        } else {
            node.value = value;
            moveToHead(node);
        }
    }
}
public class LRUMain {
    public static void main(String[] args) {
        LRU lRUCache = new LRU(2);
        lRUCache.put(1, 1);
        lRUCache.put(2, 2);
        System.out.println(lRUCache.get(1));
        lRUCache.put(3, 3);
        System.out.println(lRUCache.get(2));
        lRUCache.put(4, 4);
        System.out.println(lRUCache.get(1));
        System.out.println(lRUCache.get(3));
        System.out.println(lRUCache.get(4));
    }

}
