public class Main {
    public static void main(String[] args) {

        MyStack<String> stack = new MyStack<String>();
        System.out.println("======stack=======");
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack);
        System.out.println("삭제된 거 "+stack.pop());
        System.out.println("사이즈 "+ stack.getSize());
        System.out.println(stack);
        System.out.println(stack.isEmpty());


        MyQueue<Integer> list = new MyQueue<>();
        System.out.println("======queue=======");
        list.offer(1);
        list.offer(2);
        list.offer(3);

        System.out.println(list);
        System.out.println("삭제된 거 " +  list.poll());
        System.out.println("사이즈 " + list.getSize());
        System.out.println(list);
        System.out.println(list.isEmpty());

    }
}