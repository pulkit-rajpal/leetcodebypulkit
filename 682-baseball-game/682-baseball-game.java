class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String num : ops) {
            char[] a2 = num.toCharArray();
            switch (num) {
                case "+":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push((Integer) b);
                    stack.push((Integer) a);
                    stack.push((Integer) a + b);
                    break;
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push((Integer) stack.peek() * 2);
                    break;
                default:
                    stack.push(Integer.parseInt(num));
                    break;
            }
        }
        int sum = 0;
        while (stack.size() > 0) {
            sum += stack.peek();
            stack.pop();
        }
        return sum;
    }
}