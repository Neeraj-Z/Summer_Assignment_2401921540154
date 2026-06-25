class Solution {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        find(root);
        return maxSum;
    }

    public int find(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = Math.max(0, find(root.left));
        int right = Math.max(0, find(root.right));

        int currentPath = left + right + root.val;

        maxSum = Math.max(maxSum, currentPath);

        return root.val + Math.max(left, right);
    }
}