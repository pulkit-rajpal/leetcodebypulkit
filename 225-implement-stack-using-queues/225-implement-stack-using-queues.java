class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        /*See the basis of the our push function is that is it Should push in such a way that 
        the behaviour should be lifo while that of queue is fifo
        So to do this we need to pop and push
        Suppose we have  1 2 3 
        Now we need to insert 4 
        it should be  1 2 3 4 
        we should pop and push again until size-1 
        
        */
        q.offer(x);
        int s = q.size();
        for (int i  =0 ; i <s-1;i++)
        {
            int a = q.peek();
            q.remove(a);
            q.add(a);
        }
    }

    public int pop() {
        int a = q.peek();
        q.remove(a);
        return a;
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */