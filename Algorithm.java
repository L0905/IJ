package ljf.xm;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

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
        while(k>0){
            former=former.next;
            k--;
        }
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

class offer1review{
    public boolean Find(int target,int[][] array){
        if(array==null) return false;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]==target) return true;
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

class offer2review{
  public String th(String s){
      String s1="";
      for(int i=0;i<s.length();i++){
          char c=s.charAt(i);
          if(c==' '){
              s1+="%20";
          }else {
              s1+=c;
          }
      }
     return s1;
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
class offer3review{
    public int[] a(ListNode listNode){
        Stack<ListNode> stack=new Stack<>();
        while(listNode!=null){
            stack.push(listNode);
            listNode=listNode.next;
        }
        int s=stack.size();
        int[] b=new int[s];
        for(int j=0;j<b.length;j++){
            b[j]=stack.pop().val;
        }
        return b;
    }
}
class offer3review2{
    public ArrayList<Integer> a(ListNode listNode){
        Stack<Integer> stack=new Stack<>();
        while(listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> list=new ArrayList<>();
        while(!stack.empty()){
            list.add(stack.pop());
        }
        return list;
    }
}
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
class offer4review{
    Map<Integer,Integer> m=new HashMap<>();
    public TreeNode a(int[] p,int[] in){
        if(p==null || in==null) return null;
        for(int i=0;i<in.length;i++){
            m.put(in[i],i);
        }
        return a(p,0,p.length-1,0);
    }

    private TreeNode a(int[] p, int pL, int pR, int inL) {
        if(pL>pR) return null;
        TreeNode t=new TreeNode(p[pL]);
        int index=m.get(t.val);
        int leftCount=index-inL;
        t.left=a(p,pL+1,pL+leftCount,inL);
        t.right=a(p,pL+leftCount+1,pR,inL+leftCount+1);
        return t;
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
class offer6{
    public int minArray(int[] numbers) {
        int low=0;
        int high=numbers.length-1;
        while(low<high){
            int middle=(low+high+1)/2;
            if(numbers[low]==numbers[middle] && numbers[middle]==numbers[high]) return minNumber(numbers,low,high);
            if(numbers[middle]<=numbers[high]){
                high=middle;
            }else{
                low=middle+1;
            }
        }
        return numbers[low];
    }

    private int minNumber(int[] numbs,int l,int h){
        for(int i=l;i<h;i++){
            if(numbs[i]>numbs[i+1]){
                return numbs[i+1];
            }
        }
        return numbs[l];
    }

class offer6review{

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
class offer7review{
        int[] fib=new int[40];
        public offer7review(){
            fib[0]=0;
            fib[1]=1;
            for(int i=0;i<fib.length;i++){
                fib[i]=fib[i-1]+fib[i-2];
            }
        }
        public int Fib(int n){
            return fib[n];
        }
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
class offer8review{
    public int ttj(int k){
        if(k<0) return 0;
        if(k==0||k==1) return 1;
        if(k==2) return 2;
        int p=2,q=1,res=0;
        for(int i=3;i<=k;i++){
            res=p+q;
            q=p;
            p=res;
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
class offer9review{
    public int btttj(int j){
        if(j<=0) return 0;
        if(j==1) return 1;
        int res=1;
        for(int i=2;i<=j;i++){
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
class reviewoffer10{
    public int jxfg(int n){
        if(n<=2) return n;
        int a=1;
        int b=2;
        int c=0;
        for(int i=3;i<=n;i++){
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
class revieoffer11{
    public int ejzydgs(int n){
        int count=0;
        while(n!=0){
            n &=n-1;
            count++;
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
class reviewoffer12{
    public double szdzcf(double x,int n){
        boolean isFS=false;
        if(n<0){
            n=-n;
            isFS=true;
        }
        double res=Mypow(x,n);
        return isFS ? 1/res:res;
    }

    private double Mypow(double x, int n){
        if(n==0) return 1;
        if(n==1) return x;
        double res=Mypow(x,n/2);
        res=res*res;
        if(n%2!=0) res=res*x;
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
class reviewoffer13{

}
class offer14{
    public ListNode FindReturnKNode(ListNode listNode,int k){
        if(listNode==null) return null;
        ListNode fast=listNode;
        ListNode slow=listNode;
        while(k!=0){
            fast=fast.next;
            k--;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
class reviewoffer14{

}
class offer15{
    public ListNode ReverseListNOde(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode temp=head.next;
        ListNode newHead=ReverseListNOde(head.next);
        temp.next=head;
        head.next=null;
        return newHead;
    }
}
class reviewoffer15{

}