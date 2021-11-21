package ljf.xm;

import java.util.*;

//二分查找  时间复杂度O(logN) 用于有序表
//思想:二分查找是一种基于比较目标值和数组中间元素的教科书式算法。
//重点：左指针小于等于右指针
//如果目标值等于中间元素，则找到目标值。
//如果目标值较小，继续在左侧搜索。
//如果目标值较大，则继续在右侧搜索。
public class Algorithm {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int middle=(left+right)/2;
            if(nums[middle]<target){
                left=middle+1;
            }
            if(nums[middle]>target){
                right=middle-1;
            }
            if(nums[middle]==target){
                return middle;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Algorithm a=new Algorithm();
        System.out.println(a.search(new int[]{2,3,4},3));
    }
}
//返回链表倒数第k个元素
//两个指针前指针先走k次，然后一起走，一直到----重点----前指针为空former==null
class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int x) {
        val = x;
        next=null;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class SF{
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former=head;
        ListNode latter=head;
        while(k>0 && former!=null){
            former=former.next;
            k--;
        }
        if(k>0) return null;
        while (former!=null){
            former=former.next;
            latter=latter.next;
        }
        return latter;
    }
}
//链表中间结点  保证fast走两次slow走一次当fast无法走两次返回slow就是中间结点
class Solution {
    public ListNode middleNode(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
//链表存在环 快慢指针,当他们相当时存在环，快指针走两步，慢指针走一步，并且慢指针初始位置在链表头节点，快指针在头节点的下一个节点
class Solution2 {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        if(head.next==null) return false;
        ListNode fast2=head.next;
        ListNode slow2=head;
        while(slow2!=fast2){
           if(fast2==null || fast2.next==null) return false;
           slow2=slow2.next;
           fast2=fast2.next.next;
        }
        return true;
    }
}
//计算环形链表的长度   从第一次相遇的地方开始计算第二次相遇为环的长度，快慢指针都从头节点开始，慢指针一步快指针两步,第一次相遇之后，快指针不动慢指针从头开始，一次一步直到相遇
class Solution3{
    public int CycleLong(ListNode head){
        ListNode slow3=head;
        ListNode fast3=head;
        while(fast3!=null && fast3.next!=null){
            slow3=slow3.next;
            fast3=fast3.next.next;
            if(slow3==fast3){
                break;
            }
        }
        if(fast3==null || fast3.next==null){
            return -1;
        }
        slow3=head;
        int count=1;
        slow3=slow3.next;
        while(slow3!=fast3){
            count++;
            slow3=slow3.next;
        }
        return count;
    }
}
//队列：先进先出 前端删除，后端插入
//栈：后进先出 仅在表尾进行删除插入操作  入栈出栈时间复杂度均为O(1)
//两个栈实现队列    定义两个栈,一个插入，一个删除,插入就是压栈push(value),
// 删除两个情况一是删除栈的长度是为零且插入栈长度为零，返回-1。
// 二是删除栈的长度是为零且插入栈长度不为零，先把插入栈的所有元素压入删除栈stack2.push(stack1.pop()),依次返回压入的元素
class CQueue {
    Deque<Integer> stack1;//支持插入
    Deque<Integer> stack2;//支持删除
    public CQueue() {
         stack1=new LinkedList<Integer>();
         stack2=new LinkedList<Integer>();
    }
    public void appendTail(int value) {
        stack1.push(value);
    }
    public int deleteHead() {
        if(stack2.size()==0){
            while(stack1.size()!=0){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.size()==0){
            return -1;
        }else{
            int res=stack2.pop();
            return res;
        }
    }
}
//前序遍历：根左右
//中序遍历：左根右
//后序遍历：左右根
//层序遍历：逐层遍历树结构
//广度优先搜索：运用在树或者图这类数据结构中，遍历或者搜索的算法
//递归：程序中的函数直接或间接调用自己的一种方法
//插入排序算法就是把给定数组中的元素依次插入到有序的数组中，最终得到一个完整的有序数组。
//插入排序  核心：分为两个数组，一个有序一个无序，外层循环无序从下标为1开始，内循环依次往前比较，如果前面比后面大则交换位置
class insert{
    public void insertArray(int[] a){
        for(int i=1;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[j]>a[i]){
                    int temp=a[i];
                    a[j]=temp;
                    a[i]=a[j];
                }
            }
        }
    }
}
//选择排序：先选定第一个元素也就是下标为零的元素为最小,然后往后依次比较，如果有比最小还小的那么就交换位置
class select{
    public void selectArray(int[] a){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=a[i];
                a[min]=temp;
                a[i]=a[min];
            }
        }
    }
}
//冒泡排序  核心：比较自己与自己后一个数如果自己比后一个大则交换位置
class bubble{
    public void bubbleArray(int[] a){
        for(int i=a.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j+1]=temp;
                    a[j]=a[j+1];
                }
            }
        }
    }
}
//归并：把数列拆分为子数列，子数列排序之后在合并
//快速排序 核心：先选取下标为零的元素作为标准值，定义两个数初始值分别是最左边和最右边，
// 在左边找比标准值大的，在右边找比标准值小的，两个交换位置。
//所有找到之后，这是i和j相等，把对应得i下标得值和标准值交换，然后从标准值左右两边分成两个数组，一个是左边一个是右边

class quick{
    public void quickArray(int[] a,int low,int high){
        int i,j,temp,t;
        if(low>high) return;
        i=low;
        j=high;
        temp=a[low];
        while(i<j){
            while (i<j&&temp<a[j]){
                j--;
            }
            while(i<j && temp>=a[i]){
                i++;
            }
            if(i<j){
                t=a[i];
                a[j]=t;
                a[i]=a[j];
            }
        }
        a[low]=a[i];
        a[i]=temp;
        quickArray(a,low,j-1);
        quickArray(a,j+1,high);
    }
}
//度：一个节点连接的孩子节点数量
//所有节点里最大的度称为树的度
//树的高度即为树中节点的最大层次.   每个节点的层次从根开始定义起,根节点是第1层
// 当父亲节点的编号为i时，左孩子节点的编号为2*i，右孩子节点的编号为2*i+1。
//分治：将问题分成若干个子问题，解决这些子问题在合并  步骤：分解，解决，合并
//二维数组的查找
class ReWeiArray{
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
//数组中第k大元素  核心：快速排序法，返回n-k下标的元素
//两个数和的问题
class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
//路径总和
class L{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1=s.next();
        switch (s1){
            case "男":
                System.out.println("男");
            break;
        }
    }
}
//
class LJF{
    public static void main(String[] args) {
        ArrayList a=new ArrayList<>();
        a.add(1);
        a.add(0);
        a.add(4);
        a.add(2);
        System.out.println(a);
    }
}
//剑指offer
class offer1{
    public boolean Find(int target, int [][] array) {
        if(array ==null || array.length==0 || array[0].length==0) return false;
        int row=array.length;
        int col=array[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
class offer2{
    public String replaceSpace(String s) {
        String ss="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==' '){
               ss +="%20";
            }else{
                ss +=c;
            }
        }
        return ss;
    }
}
class offer3method1{
    public int[] reversePrint(ListNode head){
        Stack<ListNode> stack=new Stack<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        int size=stack.size();
        int[] a=new int[size];
        for(int i=0;i<size;i++){
            a[i]=stack.pop().val;
        }
        return a;
    }
}
class offer3method2{
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Stack<Integer> stack=new Stack<>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        while(!stack.empty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
}
//8.29
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
class offer4{
    private Map<Integer,Integer> indexForInOrders=new HashMap<>();
    public TreeNode cgecs(int[] pre,int[] in){
        for(int i=0;i<in.length;i++) indexForInOrders.put(in[i],i);
        return cgecs(pre,0,pre.length-1,0);
    }

    private TreeNode cgecs(int[] pre, int preL, int preR, int inL) {
        if(preL>preR) return null;
        TreeNode root=new TreeNode(pre[preL]);
        int index=indexForInOrders.get(root.val);
        int leftSize=index-inL;
        root.left=cgecs(pre,preL+1,preL+leftSize,inL);
        root.right=cgecs(pre,preL+leftSize+1,preR,inL+leftSize+1);
        return root;
    }
}
class offer5{
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public void push(int in){
        stack1.push(in);
    }
    public int pop(){
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
class offer6 {
    public int minArray(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int middle = (low + high + 1) / 2;
            if (numbers[low] == numbers[middle] && numbers[middle] == numbers[high])
                return minNumber(numbers, low, high);
            if (numbers[middle] <= numbers[high]) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }
        return numbers[low];
    }

    private int minNumber(int[] numbs, int l, int h) {
        for (int i = l; i < h; i++) {
            if (numbs[i] > numbs[i + 1]) {
                return numbs[i + 1];
            }
        }
        return numbs[l];
    }
}
class offer7{
       private int[] fib=new int[40];
       public offer7(){
           fib[0]=0;
           fib[1]=1;
           for(int i=2;i<fib.length;i++){
               fib[i]=fib[i-1]+fib[i-2];
           }
       }
       public int Fib(int n){
           return fib[n];
       }
    }
class mst {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        if (nums == null || nums.length == 0) return list;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) return list;
            if (i>0 && nums[i] == nums[i-1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (right > left) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) right = right - 1;
                if (sum < 0) left = left + 1;
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(right>left && nums[left]==nums[left+1]) left++;
                    while(right>left && nums[right]==nums[right-1]) right--;
                    left++;
                    right--;
                }
            }
        }
        return list;
    }
}
class offer8{
    public int JumpFloor(int n){
        if(n<1) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        int first=1;
        int second=2;
        int res=0;
        for(int i=3;i<=n;i++){
            res=first+second;
            first=second;
            second=res;
        }
        return res;
    }
}
class offer9{
    public int JumpFloorII(int n){
        if(n<=0) return 0;
        if(n==1) return 1;
        int res=1;
        for(int i=2;i<=n;i++){
            res=2*res;
        }
        return res;
    }
}
class offer10{
    public int Recover(int target){
        if(target<=2) return target;
        int a=1;
        int b=2;
        int c=0;
        for(int i=3;i<=target;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
class offer11{
    public int NumberOf1(int n){
        int count=0;
        while(n!=0){
            count++;
            n &=n-1;
        }
        return count;
    }
}
class offer12{
   public double Power(double x,int n){
       boolean isfs=false;
       if(n<0){
           n=-n;
           isfs=true;
       }
       double res=pow(x,n);
       return isfs ? 1/res:res;
   }

    private double pow(double x, int n) {
       if(n==0) return 1;
       if(n==1) return x;
       double res=pow(x,n/2);
       res=res*res;
       if(n%2!=0)  res=res*x;
       return res;
    }
}
class offer13{
    public int[] reOrderArray(int[] nums){
        int oddCount=0;
        for(int x:nums){
            if(x%2!=0){
                oddCount++;
            }
        }
        int[] copy=nums.clone();
        int i=0,j=oddCount;
        for(int z:copy){
            if(z%2==0){
                nums[j++]=z;
            }else{
                nums[i++]=z;
            }
        }
        return nums;
    }
}
class offer14{
    public ListNode FindReturnKNode(ListNode listNode,int k){
        if(listNode==null) return null;
        ListNode fast=listNode;
        ListNode slow=listNode;
        while(k>0&&fast!=null){
            fast=fast.next;
            k--;
        }
        if(k>0) return null;
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
//反转链表
class offer15{
    public ListNode ReverseListNOde(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode temp=head.next;
        head.next=null;
        ListNode newHead=ReverseListNOde(temp);
        temp.next=head;
        return newHead;
    }
}
class offer16{
    public ListNode Merge(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode head=null;
        if(l1.val<=l2.val) {
            head=l1;
            head.next=Merge(l1.next,l2);
        }
        else {
            head=l2;
            head.next=Merge(l1,l2.next);
        }
        return head;
    }
}
class offer17{
    public boolean HasSubTree(TreeNode t1,TreeNode t2){
        if(t1==null) return false;
        if(t2==null) return  false;
        return isbaohanzzshu(t1,t2) || HasSubTree(t1.left,t2) || HasSubTree(t1.right,t2);
    }
    private boolean isbaohanzzshu(TreeNode t1, TreeNode t2) {
        if(t2==null) return true;
        if(t1==null) return false;
        if(t1.val!=t2.val) return false;
        return isbaohanzzshu(t1.left,t2.left) && isbaohanzzshu(t1.right,t2.right);
    }
}
class offer18{
    public TreeNode Mirror(TreeNode t){
        if(t==null) return null;
        TreeNode temp=t.left;
        t.left=t.right;
        t.right=temp;
        Mirror(t.left);
        Mirror(t.right);
        return t;
    }
}
class offer19{
    public int[] spiralOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0) return new int[0];
        int r1=0,r2=matrix.length-1,c1=0,c2=matrix[0].length-1;
        List<Integer> list=new ArrayList<>();
        while(r1<=r2 && c1<=c2){
            for(int i=c1;i<=c2;i++){
                list.add(matrix[r1][i]);
            }
            for(int j=r1+1;j<=r2;j++){
                list.add(matrix[j][c2]);
            }
            if(r1!=r2){
                for(int a=c2-1;a>=c1;a--){
                    list.add(matrix[r2][a]);
                }
            }
            if(c1!=c2){
                for(int b=r2-1;b>r1;b--){
                    list.add(matrix[b][c1]);
                }
            }
            r1++;r2--;c1++;c2--;
        }
        int[] array=new int[list.size()];
        for(int i=0;i<list.size();i++){
            array[i]=list.get(i);
        }
        return array;
    }
}
class offer20{
    Stack<Integer> dataStack=new Stack<>();
    Stack<Integer> pyStack=new Stack<>();
    public void push(int x) {
        dataStack.push(x);
        pyStack.push(pyStack.isEmpty()? x:Math.min(x,pyStack.peek()));
    }

    public void pop() {
        dataStack.pop();
        pyStack.pop();
    }

    public int top() {
       return dataStack.peek();
    }

    public int min() {
        return pyStack.peek();
    }
}
class offer21{
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int n=pushed.length;
        int popIndex=0;
        for(int i=0;i<n;i++){
            stack.push(pushed[i]);
            while(!stack.empty() && popped[popIndex]==stack.peek() && popIndex<n){
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }
}

class offer255{
    public int majorityElement(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int a=nums[0];
        for(int i=1,count=1;i<nums.length;i++){
            if (nums[i] == a) {
                count++;
            } else {
                count--;
            }
            if(count==0){
                count=1;
                a=nums[i];
            }
        }
        int count=0;
        for(int num:nums){
            if(num==a) count++;
            if(count>nums.length/2) return a;
        }
        return 0;
    }
}
class offer22{
    public int[] levelOrder(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode tree=queue.poll();
            if(tree==null) return new int[0];
            a.add(tree.val);
            if(tree.left!=null) queue.add(tree.left);
            if(tree.right!=null) queue.add(tree.right);
        }
        int[] nums=new int[a.size()];
        for(int i=0;i<a.size();i++){
            nums[i]=a.get(i);
        }
        return nums;
    }
}
class offer23{
    public boolean verifyPostorder(int[] postorder) {
        if(postorder==null || postorder.length==0) return false;
        return ecsss(postorder,0,postorder.length-1);
    }
    private boolean ecsss(int[] pos,int begin,int end){
        if(end<=begin+1) return true;
        int i=begin;
        for(;i<end;i++){
            if(pos[i]>pos[end]) {
                break;
            }
        }
        for(int j=i+1;j<end;j++){
            if(pos[j]<pos[end]) return false;
        }
        return ecsss(pos,i,end-1) && ecsss(pos,begin,i-1);
    }
}
class offer24{
    private  List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<Integer> path=new ArrayList<>();
        cssh(root,target,path);
        return res;
    }

    private void cssh(TreeNode root, int target, List<Integer> path) {
        if(root==null) return;
        List<Integer> list= new ArrayList<>(path);
        list.add(root.val);
        target-=root.val;
        if(root.left==null && root.right==null && target==0) res.add(list);
        cssh(root.left,target,list);
        cssh(root.right,target,list);
    }
}
//最长公共子序列
class mst2{
    public int longestCommonSubsequence(String text1, String text2) {
        int a=text1.length();
        int b=text2.length();
        int dp[][]=new int[a+1][b+1];
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)) dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[a][b];
    }
}
class offer75{
    public void sortColors(int[] nums) {
        int zero=-1,one=0,two=nums.length;
        while(one<two){
            if(nums[one]==0){
                swap(nums,++zero,one++);
            }
            if(nums[one]==2){
                swap(nums,one,--two);
            }else{
                one++;
            }
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
class offer34{
    public char firstUniqChar(String s) {
        HashMap<Character,Boolean> m=new HashMap();
        char[] sc=s.toCharArray();
        for(char c:sc){
            m.put(c,!m.containsKey(c));
        }
        for(char c:sc){
            if(m.get(c)) return c;
        }
            return ' ';
    }
}
class offer221 {
    public int maximalSquare(char[][] matrix) {
        int length = 0;
        int dp[][] = new int[matrix.length + 1][matrix[0].length + 1];
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '1') {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    }
                    length = Math.max(length, dp[i][j]);
                }
            }
        }
        return length * length;
    }
}
//class Node {
//    int val;
//    Node next;
//    Node random;
//
//    public Node(int val) {
//        this.val = val;
//        this.next = null;
//        this.random = null;
//    }
//}
//class offer25{
//    public Node copyRandomList(Node head) {
//        if(head==null) return head;
//        Map<Node,Node> map=new HashMap();
//        Node cur=head;
//        while(cur!=null){
//           map.put(cur,new Node(cur.val));
//           cur=cur.next;
//        }
//        cur=head;
//        while(cur!=null){
//            map.get(cur).next=map.get(cur.next);
//            map.get(cur).random=map.get(cur.random);
//            cur=cur.next;
//        }
//        return map.get(head);
//    }
//}
//反转链表
//从头到尾打印链表
class Node {
    public int val;
    public ljf.xm.Node left;
    public ljf.xm.Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, ljf.xm.Node _left, ljf.xm.Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
class offer26{
    Node pre,head;
    public Node treeToDoublyList(Node root) {
        if(root==null) return null;
        csx(root);
        head.left=pre;
        pre.right=head;
        return head;
    }
    private void csx(Node cur) {
        if(cur==null) return;
        csx(cur.left);
        if(pre==null) head=cur;
        else pre.right=cur;
        cur.left=pre;
        pre=cur;
        csx(cur.right);
    }
}
class offer27{
    List<String> res=new ArrayList<>();
    char[] c;
    public String[] permutation(String s) {
        c=s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    private void dfs(int n) {
        if(n==c.length-1) {
            res.add(String.valueOf(c));
            return;
        }
        HashSet set=new HashSet();
        for(int i=n;i<c.length;i++){
            if(set.contains(c[i])) continue;
            set.add(c[i]);
            swap(i,n);
            dfs(n+1);
            swap(i,n);
        }
    }

    private void swap(int i,int c1) {
        char temp=c[i];
        c[i]=c[c1];
        c[c1]=temp;
    }
}
class offer28{
    public int majorityElement(int[] nums) {
        int count=1;
        int a=nums[0];
        for(int i=1;i<nums.length;i++){
            if(a==nums[i]) count++;
            else count--;
            if(count==0) {
                count=1;
                a=nums[i];
            }
        }
        count=0;
        for(int array:nums){
            if(a==array) count++;
            if(count>nums.length/2) return a;
        }
        return 0;
    }
}
class offer29{
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<k;i++){
            list.add(arr[i]);
        }
        int[] a=new int[k];
        for(int j=0;j<k;j++){
            a[j]=list.get(j);
        }
        return a;
    }
}
class offer30{
    public int maxSubArray(int[] nums) {
       int pre=0;
       int maxAns=nums[0];
       for(int x:nums){
           pre=Math.max(pre+x,x);
           maxAns=Math.max(pre,maxAns);
       }
       return maxAns;
    }
}
//打印从一到最大的n位数
class offer31{
    public int[] printNumbers(int n) {
        int end=(int)Math.pow(10,n)-1;
        int res[]=new int[end];
        for(int i=0;i<end;i++){
            res[i]=i+1;
        }
        return res;
    }
}
class offer32{
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val==val) return head.next;
        ListNode pre=head,cru=head.next;
        while(cru!=null && cru.val!=val){
            pre=cru;
            cru=cru.next;
        }
        if(cru!=null) pre.next=cru.next;
        return head;
    }
}
class offer33 {
    public int[] twoSum(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<right){
            int s=nums[left]+nums[right];
            if(s>target) right--;
            if(s<target) left++;
            if(s==target) return new int[]{nums[left],nums[right]};
        }
        return new int[0];
    }
}
//数字序列中某一位的数字
class offer35{
    public int findNthDigit(int n) {
        long start=1;
        int d=1;
        long count=9;
        while(n>count){
            n-=count;
            d++;
            start=start*10;
            count=9*d*start;
        }
        long number=start+(n-1)/d;
        return String.valueOf(number).charAt((n-1)%d)-'0';
    }
}
class offer36{
    public String minNumber(int[] nums) {
        String[] res=new String[nums.length];
        for(int i=0;i<res.length;i++){
            res[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(res,(x,y)->(x+y).compareTo(y+x));
        StringBuffer s=new StringBuffer();
        for(String s1:res){
            s.append(s1);
        }
        return s.toString();
    }
}
class offer37{
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.right),maxDepth(root.left))+1;
    }
}
class offer53{
    public int missingNumber(int[] nums) {
        if(nums[0]==1) return 0;
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]) return i;
        }
        return nums.length;
    }
}
class offer1716{
    public int totalMoney(int n) {
       int week=n/7;
       int day=n%7;
       return 28*week+7*week*(week-1)/2+(week+1+week+day)*day/2;
    }
}
//DFS算法：
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//      TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//         this.left = left;
//         this.right = right;
//      }
//}
class offer94{
    List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root);
        return list;
    }

    private void dfs(TreeNode root) {
        if(root==null) return;
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }
}
class offer100{
    public boolean isSameTree(TreeNode p, TreeNode q) {
       if(p==null && q==null) {
           return true;
       }
       else if(p==null || q==null) {
           return false;
       }
       else if(p.val!=q.val) {
           return false;
       }
       else {
           return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
       }
    }
}
class offer101{
    public boolean isSymmetric(TreeNode root) {
        return dfs(root,root);
    }

    private boolean dfs(TreeNode root, TreeNode root1) {
        if(root==null && root1==null) {
            return true;
        }
        else if(root==null || root1==null) {
            return false;
        }
        else if(root.val!=root1.val){
            return false;
        }
        else{
            return dfs(root.left,root1.right) && dfs(root.right,root1.left);
        }
    }
}
class offer104{
    int count=0;
    public int maxDepth(TreeNode root) {
        dfs(root,0);
        return count;
    }

    private void dfs(TreeNode root,int a) {
        if(root==null){
            count=Math.max(count,a);
        }else{
            dfs(root.left,a+1);
            dfs(root.right,a+1);
        }
    }
}
class offer110{
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }else{
            return Math.abs(height(root.left)-height(root.right)) <= 1 && isBalanced(root.right) && isBalanced(root.left);
        }
    }

    private int height(TreeNode right) {
        if(right==null){
            return 0;
        }else{
            return Math.max(height(right.left),height(right.right)) + 1;
        }
    }
}
class offer111{
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        int min=Integer.MAX_VALUE;
        if(root.left!=null)  min=Math.min(minDepth(root.left),min);
        if(root.right!=null)  min=Math.min(minDepth(root.right),min);
        return min+1;
    }
}
class offer112{
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        if(root.left==null && root.right==null) return targetSum==root.val;
        return hasPathSum(root.left,targetSum-root.val) || hasPathSum(root.right,targetSum-root.val);
    }
}
class offer147{
    public ListNode insertionSortList(ListNode head) {
        if(head==null) return head;
        ListNode dummtHead=new ListNode(0);
        dummtHead.next=head;
        ListNode lastSorted=head;
        ListNode curr=head.next;
        while(curr!=null){
            if(lastSorted.val<=curr.val){
                lastSorted=lastSorted.next;
            }else{
                ListNode pre=dummtHead;
                while(pre.next.val<=curr.val){
                    pre=pre.next;
                }
                lastSorted.next=curr.next;
                curr.next=pre.next;
                pre.next=curr;
            }
            curr=lastSorted.next;
        }
        return dummtHead.next;
    }
}
class offer113{
    List<List<Integer>> list=new ArrayList<>();
    List<Integer> addlist=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum);
        return list;
    }

    private void dfs(TreeNode root, int targetSum) {
        if(root==null) return;
        addlist.add(root.val);
        targetSum-=root.val;
        if(root.left==null && root.right==null && targetSum==0) list.add(new ArrayList<>(addlist));
        dfs(root.left,targetSum);
        dfs(root.right,targetSum);
        addlist.remove(addlist.size()-1);
    }
}
class offer44{
    public boolean isSymmetric(TreeNode root) {
       return root == null ? true : recur(root.left,root.right);
    }

    private boolean recur(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left == null || right == null || left.val != right.val) return false;
        return recur(left.left,right.right) && recur(left.right,right.left);
    }
}
class MAPMethod{
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap();
        map.put("1",11);
        map.put("2",22);
        map.put("3",33);
        //第一种遍历方式：
        Set<Map.Entry<String,Integer>> s=map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator=s.iterator();
        while(iterator.hasNext()){
            //System.out.println(iterator.next());
           Map.Entry<String,Integer> me=iterator.next();
           System.out.println(me.getKey()+"="+me.getValue());
        }
        System.out.println("===for循环===");
        for(Map.Entry<String,Integer> mme:s){
            System.out.println(mme);
        }
        //第二种遍历方式：
        Set<String> set=map.keySet();
        Iterator<String> iterator1=set.iterator();
        while(iterator1.hasNext()){
            String ss=iterator1.next();
            System.out.println(ss+"->"+map.get(ss));
        }
        //for循环：
        for(String sss:set){
            System.out.println(map.get(sss)+"=>"+sss);
        }
        //第三种遍历方式：
        Collection<Integer> c=map.values();
        for(Integer i:c){
            System.out.println(i);
        }
    }
}
class TT{
    static{
        int x=5;
    }
    static int x,y;
    public static void a(){
        System.out.println("a");
    }
    public static void main(String[] args) {
        x--;
        System.out.println(x);
        TT.a();
        Map<String,Integer> m=new HashMap();
        m.put("111",1111);
        m.put("222",2222);
        m.put("333",3333);
        //第一种方式
        Set<String> set=m.keySet();
        Iterator<String> iterator=set.iterator();
        while(iterator.hasNext()){
            String s=iterator.next();
            System.out.println(s+"->"+m.get(s));
        }
        //第二种方式
        Set<Map.Entry<String,Integer>> set1=m.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator1=set1.iterator();
        while(iterator1.hasNext()){
            Map.Entry<String, Integer> next = iterator1.next();
            iterator1.remove();
            System.out.println(next.getKey()+"===>"+next.getValue());
        }
        //第三种方式
        Collection<Integer> c=m.values();
        for(Integer i:c){
            System.out.println(i);
        }
    }
}