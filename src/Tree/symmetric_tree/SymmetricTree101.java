package Tree;
/*
给定一个二叉树，检查它是否是镜像对称的
思路1：看成两种遍历中左右和中右左，递归下去，不相同返回false
思路2：迭代？
 */
public class SymmetricTree101 {
    public boolean isSymmetric(TreeNode root) {
        return travel(root,root );
    }
    public static boolean travel(TreeNode p,TreeNode q){
        //首先判断空指针
        if((p==null && q!=null)||(p!=null && q==null)) return false;
        if(p==null&&q==null) return true;
        if(p.val!=q.val) return false;
        return travel(p.left,q.right )&&travel(p.right,q.left );
    }
}
