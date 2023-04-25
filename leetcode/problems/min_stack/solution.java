class MinStack {
        List<Integer> list;
        PriorityQueue<Integer> pqueue;
        public MinStack() {
            list = new ArrayList<>();
            pqueue = new PriorityQueue<>();
        }
        public void push(int val) {
            list.add(val);
            pqueue.offer(val);
        }

        public void pop() {
            Integer n = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            pqueue.remove(n);
        }

        public int top() {
            return list.get(list.size() - 1);
        }

        public int getMin() {
            return pqueue.peek();
        }
}
