package NivelIntermediario.EstruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
    public static void main(String[] args) {

        // Stack

        Stack<String> ninjaStack = new Stack<>();

        ninjaStack.push("Naruto");
        ninjaStack.push("Sasuke");
        ninjaStack.push("Sakura");
        ninjaStack.push("Hinata");
        ninjaStack.push("Kakashi");

        System.out.println("Minha Stack: " + ninjaStack);

        ninjaStack.pop();
        System.out.println("Minha Stack com pop: " + ninjaStack);

        System.out.println("Minha Stack com peek: " + ninjaStack.peek());

        System.out.println("Tamanho da Stack: " + ninjaStack.size());

        System.out.println("----------------------------------");

        // Queue

        Queue<String> ninjaQueue = new LinkedList<>();
        ninjaQueue.add("Naruto");
        ninjaQueue.add("Sasuke");
        ninjaQueue.add("Sakura");
        ninjaQueue.add("Kakashu");
        ninjaQueue.add("Shikamura");

        System.out.println("Minha Queue: " + ninjaQueue);

        ninjaQueue.poll();

        System.out.println("Queue com poll: " + ninjaQueue);

        System.out.println("Queue com peek: " + ninjaQueue.peek());


        System.out.println("----------------------------------");

    }
}
