class Solution {

   
    private class stack {
        private int top = 0;
        private ArrayList<String> data = new ArrayList<String>();


        private void push(String val) {
            data.add(val);
            top++;
        }

        private boolean isEmpty() {
            if (top == 0) return true;
            return false;
        }

        private String pop() {
            top--;
            String flag = data.remove(top);
            return flag;
        }
    }


    public boolean isValid(String s) {
        stack s1 = new stack();
        String[] list = s.split("");
        for (String value : list) {
            if (Objects.equals(value, "(")) {
                s1.push(")");
            } else if (Objects.equals(value, "{")) {
                s1.push("}");
            } else if (Objects.equals(value, "[")) {
                s1.push("]");
            } else if (s1.isEmpty() || !Objects.equals(s1.pop(), value)) {
                return false;
            }
        }
        return s1.isEmpty();
    }
}