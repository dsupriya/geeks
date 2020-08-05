
class Solution
{
    public static int findIndex(int arr[], int start, int target)
    {
        int i=0;
        while( arr[start+i] != target ) i++;
        return i;
    }

    public static Node buildUtil(int inorder[], int preorder[], int inStart, int preStart, int n)
    {
        if(n==0) 
            return null;
        
        Node ret = new Node( preorder[preStart] );
        
        int i = findIndex( inorder, inStart, preorder[preStart] );
        
        ret.left = buildUtil( inorder, preorder, inStart, preStart+1, i );
        ret.right = buildUtil( inorder, preorder, inStart+i+1, preStart+i+1, n-i-1 );
        
        return ret;
    }
    
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        return buildUtil(inorder, preorder, 0, 0, n);
    }
}
