package Tree;

public class maxNode {
    /**
     * Definition of TreeNode:
     * public class TreeNode {
     *     public int val;
     *     public TreeNode left, right;
     *     public TreeNode(int val) {
     *         this.val = val;
     *         this.left = this.right = null;
     *     }
     * }
     */
        /*
         * @param root: the root of tree
         * @return: the max node
         */
        public TreeNode maxNode(TreeNode root) {
            // write your code here
            TreeNode left,right;
            if(root==null) return null;
            left=maxNode(root.left);
            right=maxNode(root.right);
            if(left!=null&&left.val>root.val){
                int temp = left.val;
                left.val=root.val;
                root.val=temp;
            }
            if(right!=null&&right.val>root.val){
                int temp = right.val;
                right.val=root.val;
                root.val=temp;
            }
            return root;
        }
}
