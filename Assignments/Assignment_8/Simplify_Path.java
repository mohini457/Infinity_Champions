package Assignments.Assignment_8;

import java.util.Stack;

public class Simplify_Path {
    public static void main(String[] args) {
        String path="/home//foo/";
        System.out.print(simplifyPath(path));
    }
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        
        
        for (String part : path.split("/")) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }

       
        return "/" + String.join("/", stack);
    }
}
