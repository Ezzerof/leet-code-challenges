package Easy.Listnode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

    List<Integer> list = new ArrayList();

    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList();

        if (root == null)
            return list;

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            if  (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                list.add(current.val);
                current = current.right;
            }
        }

        return list;
    }

}
