// Last updated: 27/04/2026, 04:05:31
class StockSpanner {
 Deque<int[]> stack;
        public StockSpanner() {
            stack = new LinkedList<>();
        }

        public int next(int price) {
             int count = 1;

            while (!stack.isEmpty()) { 
                int topPrice = stack.peek()[0];

                if (topPrice <= price) {
                    int topSpan = stack.pop()[1];
                    count += topSpan;
                } else {
                    break;
                }
            }

            stack.push(new int[]{price, count});

            return count;
        }

}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */