package heap;

public class MaxHeap {
    int currentSize = 0;
    int hSize;
    int maxHeap[];

    public MaxHeap(int hSize) {
        this.hSize = hSize;
        maxHeap = new int[hSize + 1];
        maxHeap[0] = 0;
    }

    // add() method

    public void add(int element) {
        currentSize++;
        if (currentSize > hSize) {
            System.out.println("Sorry , We can not add further element");
            return;
        }
        maxHeap[currentSize] = element;
        int index = currentSize;
        int parent = index / 2;

        while (maxHeap[parent] < maxHeap[index]) {
            swap(maxHeap, parent, index);
            index = parent;
            parent = index / 2;
        }
    }

    // pop method()

    public int pop() {
        if (currentSize < 1) {
            System.out.println("Sorry we can't delete further element");
            return Integer.MAX_VALUE;
        } else {
            int remElement = maxHeap[1];
            maxHeap[1] = maxHeap[currentSize];
            int index = 1;
            currentSize--;
            while (index <= currentSize / 2) {
                int left = index * 2;
                int right = index * 2 + 1;
                if (maxHeap[index] < maxHeap[left] || maxHeap[index] < maxHeap[right]) {
                    if (maxHeap[left] < maxHeap[right]) {
                        swap(maxHeap, left, right);
                        index = left;
                    } else {
                        swap(maxHeap, left, right);
                        index = right;
                    }
                }
            }
            return remElement;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 1; i < currentSize + 1; i++) {
            sb.append(maxHeap[i]);
            sb.append(',');
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(']');
        return sb.toString();
    }

    public void swap(int[] minHeap, int a, int b) {
        int temp = minHeap[a];
        minHeap[a] = minHeap[b];
        minHeap[b] = temp;
    }

    public static void main(String[] args) {
        MaxHeap mHeap = new MaxHeap(5);
        mHeap.add(3);
        mHeap.add(6);
        mHeap.add(1);
        mHeap.add(2);
        mHeap.add(9);
        System.out.println(mHeap.toString());
        mHeap.pop();
        System.out.println(mHeap.toString());
    }
}
