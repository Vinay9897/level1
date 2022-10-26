package heap;

public class MinHeap {
    int minHeap[];
    int realSize = 0;
    int heapSize;

    // constructor method

    public MinHeap(int heapSize) {
        this.heapSize = heapSize;
        minHeap = new int[heapSize + 1];
        minHeap[0] = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 1; i <= realSize; i++) {
            sb.append(minHeap[i]);
            sb.append(',');
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(']');
        return sb.toString();
    }

    // add method

    public void add(int element) {
        realSize++;
        if (realSize > heapSize) {
            System.out.println("we can cannot further element");
            realSize--;
            return;
        }
        minHeap[realSize] = element;
        int index = realSize;
        int parent = index / 2;

        while (minHeap[index] < minHeap[parent] && index > 1) {
            swap(minHeap, index, parent);
            index = parent;
            parent = index / 2;
        }
    }

    // delete method

    public int pop() {
        if (realSize < 1) {
            System.out.println("Can't delete further element");
            return Integer.MAX_VALUE;
        } else {
            int remElement = minHeap[1];
            minHeap[1] = minHeap[realSize];
            realSize--;
            int index = 1;
            while (index <= realSize / 2) {

                int left = index * 2;
                int right = index * 2 + 1;
                if (minHeap[index] > minHeap[left] || minHeap[index] > minHeap[right]) {
                    if (minHeap[left] < minHeap[right]) {
                        swap(minHeap, left, index);
                        index = left;
                    } else {
                        swap(minHeap, right, index);
                        index = right;
                    }
                } else {
                    break;
                }
            }
            return remElement;
        }
    }

    public int peek() {
        return minHeap[1];
    }

    public void swap(int[] minHeap, int a, int b) {
        int temp = minHeap[a];
        minHeap[a] = minHeap[b];
        minHeap[b] = temp;
    }

    public static void main(String[] args) {
        MinHeap mHeap = new MinHeap(9);
        mHeap.add(3);
        mHeap.add(1);
        mHeap.add(2);
        mHeap.add(5);
        mHeap.add(4);
        mHeap.add(8);
        mHeap.add(9);
        mHeap.add(7);
        mHeap.add(6);
        System.out.println(mHeap.toString());
        mHeap.pop();

        System.out.println(mHeap.toString());

    }
}
