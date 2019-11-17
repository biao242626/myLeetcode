package Tree;

import java.util.ArrayList;
import java.util.List;

public class SameTree100 {
    public  boolean isSameTree(TreeNode p, TreeNode q) {
        return travel(p,q);
    }
    public static boolean travel(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if((p == null && q != null)||(p != null && q == null)) return false;
        if(p.val != q.val) return false;
        return  travel(p.left,q.left ) && travel(p.right,q.right );
    }
}
