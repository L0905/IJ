package ljf.xx.java.jc;

//public class Vehicle {
  /*int size;
  int speed;
  public void move(){

  }
  public void setSpeed(int speed) {
      this.speed = speed;
  }
  public void speedUp(){
      System.out.println("速度上升为：160");
  }
  public void speedDown(){
      System.out.println("速度下降为：100");
  }
}
class Test{
    public static void main(String[] args){
        Vehicle v=new Vehicle();
        v.size=10;
        v.speed=120;
        System.out.println("大小:"+v.size);
        System.out.println("速度:"+v.speed);
        v.setSpeed(120);
        v.speedDown();
        v.speedUp();
    }*/

//  day16作业 第二题
   /* private int size;
    private int speed;
    public Vehicle(){

    }
    public Vehicle(int size,int speed){
     this.size=size;
     this.speed=speed;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void move(){

    }
    public void speedUp(int upSpeed){
        this.setSpeed(upSpeed+getSpeed());
        System.out.println("现在的速度:"+this.getSpeed());
    }
    public void speedDown(int downSpeed){
        this.setSpeed(this.getSpeed()-downSpeed);
        *//*int OldSpeed=this.getSpeed();
        this.setSpeed(OldSpeed-downSpeed);*//*
        System.out.println("现在的速度："+this.getSpeed());
    }*/


   /* private int age;
    private String name;
    public Vehicle(){

    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("年龄:"+getAge());
        System.out.println("姓名:"+getName());
    }
*/

import com.sun.org.apache.bcel.internal.classfile.InnerClass;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import org.w3c.dom.ls.LSOutput;
import sun.security.x509.InvalidityDateExtension;

import javax.naming.AuthenticationException;
import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.logging.SimpleFormatter;

//}
/*interface FoodMenu{
    void xhscjd();
    void yxrs();
}
class ChinaCooker implements FoodMenu{
    public void xhscjd(){
        System.out.println("中餐西红柿炒鸡蛋");
    }
    public void yxrs(){
        System.out.println("中餐鱼香肉丝");
    }
}
class AmericanCooker implements FoodMenu{
    public void xhscjd(){
        System.out.println("西餐西红柿炒鸡蛋");
    }
    public void yxrs(){
        System.out.println("西餐鱼香肉丝");
    }
}
class Customer{
    private FoodMenu foodMenu;
    public Customer(){

    }
    public Customer(FoodMenu foodMenu){
        this.foodMenu=foodMenu;
    }
    public FoodMenu getFoodMenu() {
        return foodMenu;
    }
    public void setFoodMenu(FoodMenu foodMenu) {
        this.foodMenu = foodMenu;
    }
    public void order(){
        foodMenu.xhscjd();
        foodMenu.yxrs();
      *//* FoodMenu fm=this.getFoodMenu();
       fm.yxrs();
       fm.xhscjd();*//*
    }
}
class T{
    public static void main(String[] args) {
        FoodMenu ck=new ChinaCooker();
        Customer c=new Customer(ck);
        c.order();
        FoodMenu ck2=new AmericanCooker();
        Customer c2=new Customer(ck2);
        c2.order();
        Customer c3=new Customer();
        FoodMenu fm=new FoodMenu() {
            @Override
            public void xhscjd() {
                System.out.println("中餐西红柿炒鸡蛋");
            }
            @Override
            public void yxrs() {
                System.out.println("中餐鱼香肉丝");
            }
        };
        c3.setFoodMenu(fm);
        c3.order();
    }
}*/
/*class Friend{
}
class MySelf{
    public MySelf(){

    }
    public MySelf(Friend f){
       this.f=f;
    }
    Friend f;

    public static void main(String[] args) {
        Friend f=new Friend();
        MySelf m=new MySelf(f);
        System.out.println(m.f);
    }
}*/
/*class AAa{
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.setSpeed(105);
        v.setSize(5);
        System.out.println("speed:"+v.getSpeed());
        System.out.println("size:"+v.getSize());
        v.speedUp(5);
        v.speedDown(10);
        //System.out.println(v.getSpeed());
    }
}*/
/*
class AAA{
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.setAge(10);
        v.setName("罗剑飞");
        v.display();
    }
}
*/
/*
abstract class AAAAAA{
    public AAAAAA(){
        System.out.println("1111");
    }
}
class Aaa1 extends AAAAAA{
    public Aaa1(){
        //super();
    }
    public static void main(String[] args) {
       AAAAAA aa=new Aaa1();

    }
}*/
/*
class Bjbdn {
    private String xn;
    public String getXn() {
        return xn;
    }
    public void setXn(String xn) {
        this.xn = xn;
    }
    public Bjbdn(InsetDrawable id) {
        this.id = id;
    }
    InsetDrawable id;
    public Bjbdn(){

    }
    public Bjbdn(String xn,InsetDrawable id){
        this.xn=xn;
        this.id=id;
    }
}
interface InsetDrawable{
     void A();
}
class sb implements  InsetDrawable{
    public void A(){
        System.out.println("A鼠标");
    }
}
class jp implements InsetDrawable{
    public void A(){
        System.out.println("A键盘");
    }
}
class xsq implements InsetDrawable{
    public void A(){
        System.out.println("A显示器");
    }
}
class dyj implements InsetDrawable{
    public void A(){
        System.out.println("A打印机");
    }
}
class Test{
    public static void main(String[] args) {
     InsetDrawable id=new sb();
     Bjbdn b=new Bjbdn("111",id);
     b.id.A();
     InsetDrawable id2=new jp();
     Bjbdn b2=new Bjbdn("111",id2);
     b2.id.A();
     InsetDrawable ID=new xsq();
     Bjbdn b3=new Bjbdn();
     b3.id=ID;
     b3.id.A();

    }
}
public class Vehicle{
    private int a;
    public int b;
    protected int c;
    String d;
}
class T2{
    public static void main(String[] args) {
       Vehicle t=new Vehicle();
        //System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
        System.out.println(t.d);
    }
}
*/
public class Vehicle {
    public static void main(String[] args) {
           MyStack ms=new MyStack();
                ms.pop();
                ms.push("111");
                ms.push(111);
                ms.push(new Object());
                ms.push(new Object());
                ms.push(new Object());
                ms.push(new Object());
                ms.push(new Object());
                ms.push(new Object());
                ms.push(new Object());
                ms.push(new Object());
                ms.push(new Object());
                ms.push(new Object());
                ms.pop();
                ms.pop();
                ms.pop();
                ms.pop();
                ms.pop();
                ms.pop();
                ms.pop();
                ms.pop();
                ms.pop();
                ms.pop();
                ms.pop();
                }
                }
//  作业2  570 模拟栈数据结构
class MyStack{
    private Object[] elements;
    private int index;
    public MyStack(){
        this.elements=new Object[10];
        this.index=-1;
    }
    public Object[] getElements() {
        return elements;
    }
    public void setElements(Object[] elements) {
        this.elements = elements;
    }
    public void push(Object o){
        if(this.index>=elements.length-1){
            System.out.println("压栈失败");
            return;
        }
       /* index++;
        elements[index]=o;*/
        elements[++index]=o;
        System.out.println("压栈"+o+"元素成功栈针指向"+index);
    }
    /* public void pop(Object o){
         if(index==-1){
             System.out.println("弹栈失败");
             return;
         }
         index--;
         if(index<0){
             System.out.println("结束!!!");
             return;
         }
         elements[index]=o;
         System.out.println("弹栈成功减少的元素"+o+"栈针指向"+index);
     }*/
    public void pop(){
        if(index<0){
            System.out.println("弹栈失败");
            return;
        }
        System.out.print("弹栈"+elements[index]+"元素成功");
        index--;
        System.out.println("栈针指向"+index);
    }
}
//作业2 572 酒店管理系统部分功能
class HotelMgtSystem{
}
class Room{
    private int no;
    private String type;
    private boolean status;
    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public String toString() {
        return "[" + no + "," + type + "," + (status ? "空闲":"占用") +"]";
    }
    public boolean equals(Object o) {
        if (o==null||!(o instanceof Room)) return false;
        if (this == o) return true;
        Room room = (Room) o;
        return  getNo()==room.getNo();
    }
}
class Hotel{
    private Room[][] room;
    public Hotel() {
        room=new Room[3][10];
        for(int i=0;i<room.length;i++){//i下标,i+1楼层
            for(int j=0;j<room[i].length;j++){
                if(i==0){
                    room[i][j]=new Room((i+1)*100+j+1,"单人间",true);
                }else if(i==1){
                    room[i][j]=new Room((i+1)*100+j+1,"标准间",true);
                }else if(i==2){
                    room[i][j]=new Room((i+1)*100+j+1,"总统套房",true);
                }
            }
        }
    }
    public void print(){
        for(int i=0;i<room.length;i++){
            for(int j=0;j<room[i].length;j++){
                System.out.print(room[i][j]);
            }
            System.out.println();
        }
    }
    public void order(int roomNo){
        Room r=room[roomNo/100-1][roomNo%100-1];
        r.setStatus(false);
        System.out.println(roomNo+"已订房");
    }
    public void exit(int roomNo){
        Room r=room[roomNo/100-1][roomNo%100-1];
        r.setStatus(true);
        System.out.println(roomNo+"已退房");
    }
}
class Test{
    public static void main(String[] args) {
      /*Room r=new Room(101,"单人间",true);
        System.out.println(r);
      Room r1=new Room(101,"单人间",false);
        System.out.println(r1.equals(r));*/
        Hotel h=new Hotel();
       /* h.print();
        System.out.println("============================================");
        h.order(102);
        System.out.println("============================================");
        h.exit(102);*/
        System.out.println("欢迎使用酒店管理系统，请认真阅读以下说明");
        System.out.println("功能编号对应的功能：[1]表示查看房间列表，[2]表示订房,[3]表示退房,[0]表示退出系统");
        while(true){
            System.out.print("请输入功能编号:");
            Scanner s=new Scanner(System.in);
            int i=s.nextInt();
            if(i==1){
                h.print();
            }else if(i==2){
                System.out.print( "请输入需要预定的房间的编号:");
                int roomNo=s.nextInt();
                h.order(roomNo);
            }else if(i==3){
                System.out.print("请输入需要退房的房间编号:");
                int roomNo=s.nextInt();
                h.exit(roomNo);
            }else if(i==0){
                System.out.println("再见，欢迎下次再来");
                return;
            }else{
                System.out.println("输入编号有误,请重新输入");
            }
        }

    }
}
/*class Solution{
    public int[] twoSum(int[] nums,int target){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("i:"+i);
                    System.out.println("j:"+j);
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
class T{
    public static void main(String[] args) {
        Solution s=new Solution();
        s.twoSum(new int[]{1,5,4,5},10);
    }
}*/

//算法
class T1{
    public static void main(String[] args) {
        int[] a={1,112,3,6,90,8};
        Arrays.sort(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
/*
 * 9 8 10 7 6 0 11
 * 冒泡排序:
 * 第一次循环:8 9 10 7 6 0 11 6次
 *           8 9 10 7 6 0 11
 *           8 9 7 10 6 0 11
 *           8 9 7 6 10 0 11
 *           8 9 7 6 0 10 11
 *           8 9 7 6 0 10 11
 * .....
 * 第六次循环:6 0  2次
 * */
class T2{
    public static void main(String[] args) {
        int[] a={9,8,10,7,6,0,11};
        //7个数据循环6次
        //6个数据循环5次.....
        //2个数据循环1次
        int count=0;
        for(int i=a.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                count++;
                if(a[j]>a[j+1]){
                    int temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("比较的次数:"+count);
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }
}
/*class T3{
    public static void main(String[] args) {
        int[] b={1,2222,11,22,111};
        for(int i=b.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(b[j]>b[j+1]){
                    int temp;
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }
        for(int k=0;k<b.length;k++){
            System.out.println(b[k]);
        }
    }
}*/
/*
 * 选择排序
 * */
class T4{
    public static void main(String[] args) {
        int a[]={3,1,6,2,5};
        //原始数据:3 1 6 2 5  下标0开始比较
        //        1 3 6 2 5  下标1开始比较
        //        1 2 6 3 5  下标2开始比较
        //...找出最小的交换位置
        for(int i=0;i<a.length-1;i++){//i是参与"比较的数据"中最左边的那个元素的下标
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp;
                temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
        }
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }
}
/*
class T5{
    public static void main(String[] args) {
        int[] a={1,11,111,2,22};
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp;
                temp=a[min];
                a[min]=a[i];
                a[i]=temp;
            }
        }
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
    }
}*/
class T5 {
    public static void main(String[] args) {
        int[] a = {1, 88, 22, 55, 75};
        int[] aa = {11, 22, 33, 44, 55, 66, 88};
       /* for(int i=0;i<a.length;i++){
            if(a[i]==88){
                System.out.println("元素88的下标是:"+i);
                return;
            }
        }
        System.out.println("没有这个元素");*/
        int index = arraySearch(a, 88);
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标是" + index);
        int index1 = BinarySearch(aa, 44);
        System.out.println(index1 == -1 ?  "不存在该元素": "该元素下标是:" + index1);
    }

    public static int arraySearch(int[] a, int i) {
        for (int j = 0; j < a.length; j++) {
            if (i == a[j]) {
                //System.out.println("元素88的下标是:"+j);
                return j;
            }
        }
        //System.out.println("没有这个元素");
        return -1;
    }

    public static int BinarySearch(int[] aa, int i) {
        int begin = 0;
        int end = aa.length - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (aa[mid] == i) {
                return mid;
            } else if (aa[mid] < i) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
class T6 {
    public static void main(String[] args) throws Exception {
        /*int[] a={1,221,2,44,67,4444,55,88};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int aa=Arrays.binarySearch(a,4444);
        System.out.println(aa==-1?"不存在":"该元素下标:"+aa);
        String a1="abc";
        String a2="abc";
        System.out.println(a1==a2);
        String a3=new String("123");
        String a4=new String("123");
        System.out.println(a3==a4);
        System.out.println(a3.equals(a4));
        byte[] bytes={97,98,99};
        String a5=new String(bytes);
        System.out.println(a5);
        String a6=new String(bytes,0,2);//将byte数组的一部分转化为字符串
        System.out.println(a6);
        char[] chars={'罗','剑','飞'};
        String a7=new String(chars);
        System.out.println(a7);
        String a8=new String(chars,2,1);
        System.out.println(a8);
        String b1="b1";
        String b2=new String("b2");
        String b3=new String(new char[] {'1'});
        String b4=new String(chars,0,1);
        String b5=new String(new byte[] {111,98});
        String b6=new String(bytes,1,1);
        System.out.println(b5);
        char chars1="罗剑飞".charAt(2);
        System.out.println(chars1);
        System.out.println("abc".compareTo("abc"));
        System.out.println("abcd".compareTo("abce"));//前小后大
        System.out.println("abce".compareTo("abcd"));//前大后小
        System.out.println("xyz".compareTo("zyxz"));
        System.out.println("xyz".contains("q"));
        System.out.println("txt".endsWith("tx"));
        System.out.println("xxx".equals("xxx"));
        System.out.println("XYZ".equalsIgnoreCase("xyz"));
        byte[] b="abcd".getBytes();
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        System.out.println("javac++".indexOf("c"));
        String A="";
        System.out.println(A.isEmpty());
        System.out.println("abcdef".length());
        System.out.println("abccccc".lastIndexOf("c"));
        System.out.println("http://www.baidu.com".replace("http://","https://"));
        String p="name=luojianfei&&passwd=123456";
        String[] p1=p.split("&&");
        for(int i=0;i<p1.length;i++){
            System.out.println(p1[i]);
            String[] p2=p1[i].split("=");
            System.out.println(p2[0]);
            System.out.println(p2[1]);
        }
        System.out.println("axccc".startsWith("a"));
        System.out.println("abhbasjdkajslk".substring(8));
        System.out.println("abhbasjdkajslk".substring(8,11));//不包括结束下标
        char[] c1="yyds!".toCharArray();
        for(int i=0;i<c1.length;i++){
            System.out.println(c1[i]);
        }
        System.out.println("ABCD".toLowerCase());
        System.out.println("abc".toUpperCase());
        System.out.println("   WWW  QQQ    ".trim());
        String ss=String.valueOf(100);
        System.out.println(ss);
        String ss1=String.valueOf(new Custom());
        System.out.println(ss1);
        System.out.println(100);
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append(100);
        System.out.println(stringBuffer);
        int[] aaaaa={1,2,3};
        int[] a111=new int[5];
        System.arraycopy(aaaaa,0,a111,2,3);
        //System.out.println(a111);
        for(int i=0;i<a111.length;i++){
            System.out.println(a111[i]);
        }
        StringBuilder sb=new StringBuilder();
        sb.append(10);
        sb.append("111");
        sb.append(true);
        System.out.println(sb);
        TA ta=new TA(100);
        doSome(ta);
        Integer i=new Integer(80);//基本数据类型--（转化）->引用数据类型(装箱)
        System.out.println(i.floatValue());//引用数据类型--（转化）->基本数据类型(拆箱)
        System.out.println(i.intValue());
        Integer ai=new Integer("123");
        System.out.println(ai);
        Double d1=new Double(3.14);
        System.out.println(d1);
        Double d2=new Double("1.11");
        System.out.println(d2);
        System.out.println("int的最大值:"+Integer.MAX_VALUE);
        System.out.println("int的最小值:"+Integer.MIN_VALUE);
        System.out.println("byte的最大值:"+Byte.MAX_VALUE);
        System.out.println("byte的最小值:"+Byte.MIN_VALUE);
        Integer x=1000;
        int y1=x;
        System.out.println(y1);
        System.out.println(x+11);
        Integer x1=1100;
        Integer x2=1100;
        System.out.println(x1==x2);
        Integer x3=127;
        Integer x4=127;
        System.out.println(x3==x4);//-128到127之间会在整数型常量池中 ==比较内存地址
        System.out.println(Integer.parseInt("123")+100);
        System.out.println(Double.parseDouble("3.14")+1);
        System.out.println(Float.parseFloat("1.0")+1);
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toHexString(16));
        System.out.println(Integer.toOctalString(8));
        System.out.println(Integer.valueOf(100));
        String.valueOf(10);//int-->String
        Integer.parseInt("12");//String-->int
        Integer.valueOf(10);//int-->Integer
        Integer nn=100;
        nn.intValue();//Integer-->int
        Integer.valueOf("12");//String-->Integer
        String.valueOf(nn);//Integer-->String
        //Integer Int
        Integer nn1=100;
        int yy=nn1;
        //Integer String
        Integer.valueOf("1");
        String.valueOf(new Integer(1));
        //Int String
        String.valueOf(12);
        Integer.parseInt("12");

        Date d=new Date();
        System.out.println(d);
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(s.format(d));
        //String a1="2021-04-08 21:41:34 998";
       *//* SimpleDateFormat s2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(s2.parse(a1));*//*
        //long a2=System.currentTimeMillis();
        System.out.println(a2);
        long begin=System.currentTimeMillis();
        print();
        long end=System.currentTimeMillis();
        System.out.println("耗费的毫秒数:"+(end-begin));
       *//* Date d11=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(simpleDateFormat.format(d11));
        String a22="2021-04-08 22:19:57 750";
        System.out.println(simpleDateFormat.parse(a22));*//*
        Date dd=new Date(11);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(sdf.format(dd));
        //long a111=System.currentTimeMillis()-1000*60*60*24;
        //Date dd1=new Date(a111);
        //System.out.println(sdf.format(dd1));
        DecimalFormat df=new DecimalFormat("###,###.##");
        System.out.println(df.format(11123.456));
        DecimalFormat df2=new DecimalFormat("###,###.0000");
        System.out.println(df2.format(1345.11));
        BigDecimal bd=new BigDecimal(100);
        BigDecimal bd2=new BigDecimal(300);
        System.out.println(bd.add(bd2));
        System.out.println(bd2.divide(bd));
        System.out.println(bd2.multiply(bd));
        System.out.println(bd2.subtract(bd));
        Random r=new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(101));//产生【0，100】随机数，不包括101
    }
    public static void doSome(Object obj){
        System.out.println(obj);
    }
    public static void print(){
        for(int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}*/
    }
}
/*class Custom{
    @Override
    public String toString() {
        return "永远的神！";
    }
}
class TA{
    int value;
    public TA(int value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
class Taa {
    public static void main(String[] args) {
        int[] a = new int[5];
        Random r2 = new Random();
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = -1;
        }
        while (index < a.length) {
            int num = r2.nextInt(6);
            if (!contain(a, num)) {
                a[index++] = num;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static boolean contain(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return true;
            }
        }
        return false;
    }
}*/
class L01{
    public static void main(String[] args) {
        Random r=new Random();
        int[] a=new int[5];
        int index=0;
        while(index<a.length){
            int num=r.nextInt(6);
            if(!c(a,num)){
                a[index]=num;
                index++;
            }
        }
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
    }
    public static boolean c(int[] a, int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return true;
            }
        }
        return false;
    }
}
class L02{
    public static void main(String[] args) {
        System.out.println(A(10,2)==Result.SUCCESS? "计算成功1":"计算失败0");
        System.out.println(A(10,0)==Result.SUCCESS? "计算成功1":"计算失败0");
       /* NullPointerException npe=new NullPointerException("空指针异常！");
        System.out.println(npe.toString());
        NumberFormatException nfe=new NumberFormatException("数字格式化异常！");
        System.out.println(nfe);*/
        switch(Season.SUMMER){
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }
    }
    public static Result A(int a,int b){
        try{
            int c=a/b;
            return Result.SUCCESS;
        }catch (Exception e){
            return Result.FAIL;
        }
    }
    //枚举(相当于常量)
    enum Result{
        SUCCESS,FAIL;
    }
    enum Season{
        SPRING,SUMMER,AUTUMN,WINTER;
    }
}
class L03{
    //第一种方式throws 上一级(继续把异常传给调用者)
   /* public static void main(String[] args) throws ClassNotFoundException {
        doSome();
    }*/
    //第二种 try..catch进行捕捉(调用者不知道异常，异常解决)
   /*public static void main(String[] args) {
       try {
           doSome();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
   }
    public static void doSome ()throws ClassNotFoundException{
        System.out.println("doSome!!!!!");
    }*/
    public static void main(String[] args) {
        String ss="";
        System.out.println(ss.split(",").length);
        NullPointerException e1=new NullPointerException("空指针异常");
        System.out.println(e1.getMessage());//获取异常简单描述信息
        e1.printStackTrace();//打印异常堆栈追踪信息
        System.out.println("main begin");
        try{
            m1();
        }catch (Exception e){
            System.out.println("路径错误");
        }
        System.out.println("main over");
        try{
            FileInputStream f=new FileInputStream("IException");
            System.out.println(100/0);
        }catch (FileNotFoundException |  ArithmeticException e){
            System.out.println("文件不存在？数学异常？都有可能！");
        }
    }
    private static void m1() throws  Exception{
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }
    private static void m2() throws IOException {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }
    private static void m3() throws FileNotFoundException {
        new FileInputStream("C:\\Users\\23860\\Pictures\\Saved Pictures");
    }
}
class L04{
    public static void main(String[] args) {
        System.out.println(10/0);
        final int j=10;
        try{

        }finally {
            System.out.println("L");
        }
        Object o;
        System.out.println(m());
        FileInputStream f=null;
        try{
            f=new FileInputStream("ssss");
            String s=null;
            s.toString();
            System.out.println("hello");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally{
            try {
                if(f!=null){
                    f.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("==============");
        try{
            System.out.println("try...");
            return;
            //System.exit(0);
        }finally {
            System.out.println("finally..");
        }

    }
    public static int m(){
        int i=100;
        try{
            return i;
        }finally {
            i++;
        }
    }
}
class MyException extends Exception{
    public MyException(){

    }
    public MyException(String s){
        super(s);
    }
}
/*class L05{
    public static void main(String[] args){
        MyException e=new MyException("密码不能为空");
        e.printStackTrace();
        System.out.println(e.getMessage());
        MyStack2 m=new MyStack2();
        try {
            m.push(new Object());
            m.push(new Object());
            m.push(new Object());
            m.push(new Object());
        } catch (MyStackException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            m.pop();
            m.pop();
            m.pop();
            m.pop();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
class MyStackException extends Exception{
    public MyStackException(){

    }
    public MyStackException(String s){
        super(s);
    }
}
class MyStack2{
    private Object[] elements;
    private int index;
    public MyStack2(){
        this.elements=new Object[3];
        this.index=-1;
    }
    public Object[] getElements() {
        return elements;
    }
    public void setElements(Object[] elements) {
        this.elements = elements;
    }
    public void push(Object o) throws MyStackException{
        if(this.index>=elements.length-1){
            *//*System.out.println("压栈失败");
            return;*//*
            throw new MyStackException("压栈失败，栈以满");
        }
        elements[++index]=o;
        System.out.println("压栈"+o+"元素成功栈针指向"+index);
    }
    public void pop() throws Exception{
        if(index<0){
            *//*System.out.println("弹栈失败");
            return;*//*
            throw new MyStackException("弹栈失败，栈已空");
        }
        System.out.print("弹栈"+elements[index]+"元素成功");
        index--;
        System.out.println("栈针指向"+index);
    }
}*/
/*class L06{
    public void doSome() throws Exception{

    }
}
class L07 extends L06{
    public void doSome() throws NullPointerException{

    }
}*/
//作业 异常作业
class UserException extends Exception{
    public UserException(){

    }
    public UserException(String s){
        super(s);
    }
}
class UserService{
    public void register(String username,String password) throws UserException {
        System.out.println("请输入密码:"+password);
        if(username.length()>=6&&username.length()<=14){
            System.out.println("请输入用户名:"+username);
        }else{
            throw new UserException("用户名异常");
        }
    }
}
class L06{
    public static void main(String[] args) {
        UserService u=new UserService();
        try {
            u.register("","123");
        } catch (UserException e) {
            System.out.println(e.getMessage());
        }
    }
}
//作业题 武器数组
interface Moveable{
    void move();
}
interface Shootable{
    void shoot();
}
class Weapon{
}
class Tank extends Weapon implements Moveable,Shootable{
    public void move() {
        System.out.println("坦克移动");
    }
    public void shoot() {
        System.out.println("坦克射击");
    }
}
class GaoShePao extends Weapon implements Shootable{
    public void shoot() {
        System.out.println("高射炮射击");
    }
}
class Fighter extends Weapon implements Moveable,Shootable{
    public void move() {
        System.out.println("战斗机起飞");
    }
    public void shoot() {
        System.out.println("战斗机射击");
    }
}
class WuZhiFeiJi extends Weapon implements Moveable{
    public void move() {
        System.out.println("物资飞机起飞");
    }
}
class Army{
    private Weapon w[];
    public Army(int count){
        w=new Weapon[count];
    }
    public void addWeapon(Weapon weapon) throws AddWeaponException {
        for(int i=0;i<w.length;i++){
            if(null==w[i]){
                w[i]=weapon;
                return;
            }
        }
        throw new AddWeaponException("武器已满，无法成功添加");
    }
    public void attackAll(){
        for(int i=0;i<w.length;i++){
            if(w[i]instanceof Shootable){
                Shootable s=(Shootable)w[i];
                s.shoot();
            }
        }
    }
    public void moveAll(){
        for(int i=0;i<w.length;i++){
            if(w[i]instanceof Moveable){
                Moveable m=(Moveable)w[i];
                m.move();
            }
        }
    }
}
class AddWeaponException extends Exception{
    public AddWeaponException(){

    }
    public AddWeaponException(String s){
        super(s);
    }
}
class L07{
    public static void main(String[] args) {
        Army a=new Army(3);
        try {
            a.addWeapon(new WuZhiFeiJi());
            a.addWeapon(new GaoShePao());
            a.addWeapon(new Fighter());
            a.addWeapon(new Tank());
        } catch (AddWeaponException e) {
            System.out.println(e.getMessage());
        }
        a.attackAll();
        a.moveAll();
    }
}

//List 有序可以重复有下标
//Set 无序不能重复没有下标
/*
* Iterable(interface) --extend-> Collection(interface) (Collection extends Iterable)
* Collection(interface) --关联-> Iterator(interface)(两个都是interface)
* Collection(interface) --extends-> List(interface)和Set(interface)
* 最常用的几种实现接口方法
* List(interface) --implements-> ArrayList(class)(底层数据结构是数组,非线程安全)
* List(interface) --implements-> LinkedList(class)(底层数据结构是双向链表)
* List(interface) --implements-> Vector(class)(底层数据结构是数组，线程安全很少用)
* Set(interface) --implements-> HashSet(class)(往HashSet存储元素相当于储存在HashMap中,底层数据结构是哈希表)
* Set(interface) --extends-> SortedSet(interface)(无序的不可重复,可排序的) --implements-> TreeSet(class)(相当于TreeMap,底层数据结构是二叉树)
* */
/*
* Map集合和Collection集合没有关系
* Map集合是以key和value键值对的形式储存元素
* Map中的key和Set一样都是无序且不可重复
* Map(interface) --implements->HashMap(class)(数据结构是哈希表，非线程安全)
* Map(interface) --implements->Hashtable(class)(数据结构是哈希表，线程安全,效率较低不常用)--extends->properties(class)(属性类，线程安全，key和value只支持String类型)
* Map(interface) --extends->SortedMap(interface)(无序的不可重复,可排序的)--implements->TreeMap(class)(数据结构是二叉树)
* */
class L08{
    public static void main(String[] args) {
      /*  Collection c=new ArrayList();
        c.add(120);
        c.add(3.14);
        c.add(new Object());
        System.out.println("集合中的元素个数:"+c.size());
        c.clear();
        System.out.println("集合中的元素个数:"+c.size());
        c.add("罗剑飞");
        c.add(123);
        c.add("LJF");
        System.out.println(c.contains("罗剑飞"));
        System.out.println("集合中的元素个数:"+c.size());
        c.remove("罗剑飞");
        System.out.println("集合中的元素个数:"+c.size());
        System.out.println(c.isEmpty());
        c.clear();
        System.out.println(c.isEmpty());
        c.add("adc");
        c.add("def");
        c.add("123");
        Object[] j=c.toArray();
        for(int i=0;i<j.length;i++){
            System.out.println(j[i]);
        }
        System.out.println("==========");
        Iterator it=c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Collection c2=new HashSet();
        c2.add(1);
        c2.add(333);
        c2.add(2);
        c2.add(1);
        c2.add(33);
        Iterator it2=c2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }*/
    }
}
class L09{
    public static void main(String[] args) {
       /* Collection c=new ArrayList();
        String s1=new String("abc");
        String s2=new String("def");
        c.add(s1);
        c.add(s2);
        String s3=new String("abc");
        System.out.println(c.contains(s3));
        User u1=new User("123");
        User u2=new User("123");
        c.add(u1);
        System.out.println(c.contains(u2));
        System.out.println(c.size());
        c.remove(u2);
        System.out.println(c.size());
        System.out.println("=========");
        Integer x=new Integer(100);
        Integer y=new Integer(100);
        System.out.println(x.equals(y));
        x.equals(y);
        c.add(x);
        System.out.println(c.size());
        c.remove(y);
        System.out.println(c.size());
        System.out.println("========");
        c.clear();
        System.out.println(c.size());
        c.add("abc");
        c.add("def");
        c.add("xyz");
        Iterator it=c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }
        System.out.println(c.size());
        System.out.println("==============");
        List l=new ArrayList();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("C");
        l.add(1,"King");
        Iterator it2=l.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println(l.get(2));
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        System.out.println(l.indexOf("B"));
        System.out.println(l.lastIndexOf("C"));
        System.out.println("=======");
        System.out.println(l.size());
        l.remove(3);
        System.out.println(l.size());
        l.set(3,"LJF");
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        System.out.println("=========");
        List l2=new ArrayList();
        System.out.println(l2.size());
        List l3=new ArrayList(20);
        System.out.println(l3.size());
        l3.add(1);
        System.out.println(l3.size());
        System.out.println("==================");
        Collection c2=new HashSet();
        c2.add(1);
        c2.add(2);
        c2.add(3);
        c2.add(4);
        c2.add(5);
        List l4=new ArrayList(c2);
        for(int i=0;i<c2.size();i++){
            System.out.println(l4.get(i));
        }*/
    }
}
class User{
    private String s;
    public User() {
    }
    public User(String s) {
        this.s=s;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null||!(obj instanceof User)){
            return false;
        }
        if(obj==this){
            return true;
        }
        User u=(User)obj;
        return u.s==this.s;
    }
}
class Node{
    Object o;
    Node next;
    public Node(){

    }
    public Node(Object o,Node next){
        this.o=o;
        this.next=next;
    }
}
class Link{
    Node header=null;
    public void add(Object data){
        if(header==null){
            header=new Node(data,null);
        }else{
            Node currentLastNode=findLast(header);
            currentLastNode.next=new Node(data,null);
        }
    }
    private Node findLast(Node node) {
        if(node.next==null){
            return node;
        }
        return findLast(node.next);
    }
}
class Aa<E>{
    public void aaa(E aa){
        System.out.println(aa);
    }
}
class L10{
    public static void main(String[] args) {
        Aa<String> a1 = new Aa<>();
        a1.aaa("1");
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(10);
        v.add(11);
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        System.out.println("======");
        //foreach 增强for循环 for(元素类型 变量名:数组或者集合){
        //System.out.println(变量名);
        //}
        for (Object data : v) {
            System.out.println(data);
        }
        List l = new ArrayList();
        Collections.synchronizedList(l);
        l.add(1);
        System.out.println("================");
       /* List a=new ArrayList();
        Cat c=new Cat();
        Bird b=new Bird();
        Animal aa=new Animal();
        a.add(aa);
        a.add(c);
        a.add(b);
        Iterator d=a.iterator();
        while(d.hasNext()){
            Object o=d.next();
            if(o instanceof Cat){
                Cat cd=(Cat)o;
                cd.CatchMouse();
            }else if(o instanceof Bird){
                Bird bd=(Bird)o;
                bd.Fly();
            }else if(o instanceof Animal){
                Animal ad=(Animal)o;
                ad.move();
            }
        }*/
        List<Animal> aa = new ArrayList<>();
        Cat cc = new Cat();
        Bird bb = new Bird();
        aa.add(cc);
        aa.add(bb);
        Iterator<Animal> iterator = aa.iterator();
        while (iterator.hasNext()) {
            Animal a = iterator.next();
            a.move();
            if (a instanceof Cat) {
                Cat c = (Cat) a;
                c.CatchMouse();
            }
            if (a instanceof Bird) {
                Bird b = (Bird) a;
                b.Fly();
            }
        }
        Generic<String> gc = new Generic<>();
        gc.DoSome("123");
        System.out.println("==========");
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("world");
        Iterator<String> it = strList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        for (String data : strList) {
            System.out.println(data);
        }
    }
}
class Generic<A>{
      public void DoSome(A a){
          System.out.println(a);
      }
}
class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}
class Cat extends Animal{
   public void CatchMouse(){
       System.out.println("猫抓老鼠");
   }
}
class Bird extends Animal{
    public void Fly(){
        System.out.println("鸟在天上飞");
    }
}
//单链表
/*
class Node1{
    Object o;
    Node1 next;
    public Node1() {
    }
    public Node1(Object o, Node1 next) {
        this.o = o;
        this.next = next;
    }
}
class L{
    Node1 n=null;
    public void add(Object data){
        if(n==null){
            n=new Node1(data,null);
        }else{
            Node1 a=find(n);
            a.next=new Node1(data,null);
        }
    }
    private Node1 find(Node1 n) {
        if(n.next==null){
            return n;
        }
        return find(n.next);
    }
}
*/
class L11{
    public static void main(String[] args) {
       /* Set<String> s=new HashSet<>();
        s.add("1");
        s.add("3");
        s.add("2");
        s.add("5");
        s.add("1");
        for (String ss:s) {
            System.out.println(ss);
        }
        System.out.println("=======");
        Iterator s1=s.iterator();
        while(s1.hasNext()){
            System.out.println(s1.next());
        }
        System.out.println("=====");
        Set<String> s2=new TreeSet<>();
        s2.add("11");
        s2.add("22");
        s2.add("44");
        s2.add("33");
        s2.add("11");
        for(String s3:s2){
            System.out.println(s3);
        }
        L12.InnerClass.m1();
        L12.InnerClass lic=new L12.InnerClass();
        lic.m2();
        Set<MyMap.MyEntry<String,Integer>> s4=new HashSet<>();
        System.out.println("======");
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"罗");
        map.put(2,"剑");
        map.put(3,"飞");
        System.out.println(map.get(1));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.remove(1);
        System.out.println(map.size());
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("飞"));
        System.out.println("第一种遍历方法");
        Set<Integer> keys=map.keySet();
        Iterator<Integer> it=keys.iterator();
        while(it.hasNext()){
            Integer key=it.next();
            String value=map.get(key);
            System.out.println(key+"="+value);
        }
        for(Integer key:keys){
            System.out.println(key+"="+map.get(key));
        }
        System.out.println("第二种遍历方法");
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        Iterator<Map.Entry<Integer,String>> node=set.iterator();
        while(node.hasNext()){
            Map.Entry<Integer,String> m=node.next();
            System.out.println(m.getKey()+"--->"+m.getValue());
        }
        for(Map.Entry<Integer,String> me:set){
            System.out.println(me.getKey()+"--->"+me.getValue());
        }
        System.out.println("====");
        Collection<String> c=map.values();
        for(String s3:c){
            System.out.println(s3);
        }
        map.clear();
        System.out.println(map.isEmpty());*/
    }
}
/*class MyMap{
    public static class MyEntry<k,v>{

    }
}*/
class L12{
    public static class InnerClass{
        public static void m1(){
            System.out.println("静态内部类的m1方法执行");
        }
        public void m2(){
            System.out.println("静态内部类中的实例方法执行");
        }
    }
    public static void main(String[] args) {
        L12.InnerClass.m1();
        InnerClass ic=new InnerClass();
        ic.m2();
        //创建静态内部类对象
        L12.InnerClass lic=new L12.InnerClass();
        lic.m2();
    }
}
class L13{
    public static void main(String[] args) {
        /* Map<Integer,String> m=new HashMap();
         m.put(11,"章少");
         m.put(22,"锐少");
         m.put(33,"轩少");
         m.put(44,"汤少");
         m.put(33,"嘎嘎");
         Set<Map.Entry<Integer,String>> sme=m.entrySet();
         Iterator<Map.Entry<Integer,String>> i=sme.iterator();
         while(i.hasNext()){
             Map.Entry<Integer,String> mm=i.next();
             System.out.println(mm.getKey()+":"+mm.getValue());
         }
        System.out.println("=====");
         for(Map.Entry<Integer,String> me: sme){
             System.out.println(me.getKey()+":"+me.getValue());
         }
        System.out.println("===============");
         Student s1=new Student("罗剑飞");
         Student s2=new Student("罗剑飞");
         System.out.println(s1.equals(s2));
         System.out.println(s1.hashCode());
         System.out.println(s2.hashCode());
         Set<Student> set=new HashSet<>();
         set.add(s1);
         set.add(s2);
        System.out.println(set.size());
        System.out.println("=======");
        Map map=new HashMap();
        map.put(null,null);
        map.put(1,100);
        System.out.println(map.size());
        Set<Map.Entry> sss=map.entrySet();
        Iterator<Map.Entry>iss=sss.iterator();
        while(iss.hasNext()){
            Map.Entry a=iss.next();
            System.out.println(a.getKey()+"="+a.getValue());
        }
        System.out.println("====");
        for(Map.Entry aa:sss){
            System.out.println(aa.getKey()+"="+aa.getValue());
        }
        System.out.println("======");
        Set ss=map.keySet();
        Iterator ii=ss.iterator();
        while(ii.hasNext()){
            Object o=ii.next();
            System.out.println(o+"="+map.get(o));
        }
        System.out.println("====");
        for(Object o:ss){
            System.out.println(o+"="+map.get(o));
        }*/
    }
}
class Student{
    String name;
    public Student(){

    }
    public Student(String name){
        this.name=name;
    }
   /* public boolean equals(Object o){
        if(o==null||!(o instanceof Student))return false;
        if(this==o)return true;
        Student s=(Student)o;
        return this.name.equals(s.name);
    }*/
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    public int hashCode() {
        return Objects.hash(name);
    }
}
//HashMap 中key和value都可以为null
//Hashtable 中key和value都不能为null
class L14{
    public static void main(String[] args) {
        Properties p=new Properties();
        p.setProperty("usr","123");
        System.out.println(p.getProperty("usr"));
        TreeSet<Integer> s=new TreeSet<>();
        s.add(100);
        s.add(10);
        s.add(300);
        s.add(1111111);
        for(Integer i:s){
            System.out.println(i);
        }
        System.out.println("==================");
        S s1=new S(111);
        S s2=new S(12);
        S s3=new S(122);
       TreeSet<S> ss=new TreeSet();
       ss.add(s1);
       ss.add(s2);
       ss.add(s3);
       for(S sss:ss){
           System.out.println(sss);
       }
        System.out.println("=====");
       TreeSet<Vip> set=new TreeSet();
       Vip v1=new Vip("L",20);
       Vip v2=new Vip("J",24);
       Vip v3=new Vip("F",22);
       Vip v4=new Vip("A",22);
       set.add(v1);
       set.add(v2);
       set.add(v3);
       set.add(v4);
       for(Vip v:set){
           System.out.println(v);
       }
    }
}
class S implements Comparable<S>{
    int age;
    public S(){

    }
    public S(int age){
        this.age=age;
    }
    public String toString(){
        return "S[age="+age+"]";
    }

    @Override
    public int compareTo(S o) {
        return this.age-o.age;
    }
}
class Vip implements Comparable<Vip> {
    String name;
    int age;
    public Vip(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public int compareTo(Vip v) {
        if (this.age == v.age) {
            return this.name.compareTo(v.name);
        } else {
            return this.age - v.age;
        }
    }
}
//前序遍历 根左右
//中序遍历 左根右
//后序遍历 左右根
//Comparator 比较器 比较规则不止一种
//Comparable 实现implements Comparable 一种比较规则或者比较规则不发生改变
class L15{
    public static void main(String[] args) {
        //TreeSet<An> a=new TreeSet<>(new AnComparator());
        
        TreeSet<An> a=new TreeSet<>(new Comparator<An>() {
            public int compare(An o1, An o2) {
                return o1.age-o2.age;
            }
        });
        a.add(new An(10));
        a.add(new An(200));
        a.add(new An(1));
        for(An a1:a){
            System.out.println(a1);
        }
    }
}
class An implements Comparable<An>{
    int age;
    public An(int age) {
        this.age = age;
    }
    public String toString() {
        return "An{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(An o) {
        return this.age-o.age;
    }
}
//编写比较器
/*
class AnComparator implements Comparator<An>{
    public int compare(An o1, An o2) {
        return o1.age-o2.age;
    }
}*/
class L16{
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();//ArrayList不是线程安全的
        Collections.synchronizedList(list);//变成线程安全的
        list.add("L");
        list.add("J");
        list.add("F");
        list.add("A");
        Collections.sort(list);
        for(String s:list){
            System.out.println(s);
        }
        List<An> a=new ArrayList<>();
        a.add(new An(100));
        a.add(new An(1000));
        Collections.sort(a);
        for(An aa:a){
            System.out.println(aa);
        }
        Set<String> s=new HashSet<>();
        s.add("king1");
        s.add("abc");
        s.add("king2");
        List<String> list1=new ArrayList<>(s);
        Collections.sort(list1);
        for(String ss:list1){
            System.out.println(ss);
        }
    }
}
class review{
    public static void main(String[] args) {
        System.out.println("==========>List集合部分:");
        List<String> a=new ArrayList<>();
        a.add("1");
        System.out.println(a.get(0));
        System.out.println("====");
        //第一种遍历方式
        for(String s:a){
            System.out.println(s);
        }
        System.out.println("======");
        //第二种遍历方式
        Iterator<String> i=a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("====");
        //第三种遍历方式
        for(int j=0;j<a.size();j++){
            System.out.println(a.get(j));
        }
        System.out.println("========>Set集合部分:");
        Set<String> s=new HashSet<>();
        s.add("2");
        //取出集合里面的某个元素:
        List<String> strings=new ArrayList<>(s);
        strings.get(0);
        //遍历集合第一种方式:
        for(String s1:s){
            System.out.println(s1);
        }
        //遍历集合第二种方式：
        Iterator<String> i1=s.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        //遍历集合的第三种方式:
        for(int b=0;b<strings.size();b++){
            System.out.println(strings.get(b));
        }
        Set<Student> ss=new HashSet<>();
        ss.add(new Student(3));
        ss.add(new Student(3));
        System.out.println(ss.size());
        for(Student st:ss){
            System.out.println(st);
        }
        System.out.println("=======>TreeSet集合部分:");
        Set<LJF> si=new TreeSet<>(new Comparator<LJF>() {
            @Override
            public int compare(LJF o1, LJF o2) {
                return o2.number-o1.number;
            }
        });
        si.add(new LJF(10));
        si.add(new LJF(100));
        si.add(new LJF(20));
        for(LJF L:si){
            System.out.println(L);
        }
        //HashMap集合部分:
        Map<String,Integer> m=new HashMap<>();
        m.put("L",5);
        m.put("J",6);
        m.put("F",7);
        System.out.println(m.get("L"));
        //第一种遍历方式:
        Set<Map.Entry<String,Integer>> ssi=m.entrySet();
        Iterator<Map.Entry<String,Integer>> imsi=ssi.iterator();
        while(imsi.hasNext()){
            Map.Entry<String,Integer> mm=imsi.next();
            System.out.println(mm.getKey()+"--->"+mm.getValue());
        }
        //第二种遍历方式:
        Set<String> ssg=m.keySet();
        Iterator<String> isg=ssg.iterator();
        while(isg.hasNext()){
            String key=isg.next();
            System.out.println(key+"="+m.get(key));
        }
        for(String s1:ssg){
            System.out.println(s1+"="+m.get(s1));
        }
        //proper
        Properties p=new Properties();
        p.setProperty("10","11111");
        System.out.println(p.getProperty("10"));

    }
    static class Student{
        int no;
        public Student(int no) {
            this.no = no;
        }
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return no == student.no;
        }
        public int hashCode() {
            return Objects.hash(no);
        }
        public String toString() {
            return "Student{" +
                    "no=" + no +
                    '}';
        }
    }
}
class LJF implements Comparable<LJF>{
    int number;

    public LJF(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LJF)) return false;
        LJF ljf = (LJF) o;
        return number == ljf.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "LJF{" +
                "number=" + number +
                '}';
    }

    @Override
    public int compareTo(LJF o) {
        return this.number-o.number;
    }
}
//IO流
//硬盘中的文件放在内存上称为:Input(输入) InputStream(输入流) read(读)
//内存中的文件放到硬盘上称为:Output(输出) OutputStream(输出流) write(写)
//InputStream 字节输入流 OutputStream 字节输出流 Reader 字符输入流 Writer 字符输出流
//以Stream结尾 字节流     以Reader/Writer结尾 字符流
class L17{
    public static void main(String[] args) {
        //文件路径:C:\Users\23860\Desktop\temp.txt IDEA里面会自动把\编程\\,Java中\表示转义
        //工程Project的根就是IDEA的默认当前路径
        FileInputStream fis=null;
        try {
            //FileInputStream fis=new FileInputStream("C:\\Users\\23860\\Desktop\\temp.txt");
            //FileInputStream fis=new FileInputStream("C:/Users/23860/Desktop/temp.txt");
            //fis=new FileInputStream("C:/Users/23860/Desktop/temp.txt");
            /*fis=new FileInputStream("src/tampfile");
            byte[] b=new byte[4];
            int dataCount=fis.read(b);
            System.out.println(dataCount);
            System.out.println(new String(b,0,dataCount));
            dataCount=fis.read(b);
            System.out.println(dataCount);
            System.out.println(new String(b,0,dataCount));
            dataCount=fis.read(b);
            System.out.println(dataCount);*/
            //最终遍历:
            fis=new FileInputStream("src/tampfile");
            System.out.println("其他方法:");
            fis.skip(2);
            System.out.println(fis.read());

            System.out.println("总字节数:"+fis.available());
            byte[] b1=new byte[fis.available()];
            int count=fis.read(b1);
            System.out.println(new String(b1));
            System.out.println("=======");
            fis.read();
            System.out.println("还剩下几个字节没有读:"+fis.available());
            byte[] b=new byte[4];
           /* while(true){
                int dataCount=fis.read(b);
                if(dataCount==-1){
                    break;
                }
                System.out.print(new String(b,0,dataCount));
            }*/

            int dataCount=0;
            while((dataCount=fis.read(b))!=-1){
                System.out.print(new String(b,0,dataCount));
            }
           /* while(true){
                int data=fis.read();
                if(data==-1){
                    break;
                }
                System.out.println(data);
            }*/
            //改造While循环
           /* int data1=0;
            while((data1=fis.read())!=-1){
                System.out.println(data1);
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class L18{
    public static void main(String[] args) {
        FileInputStream f=null;
        try {
            f=new FileInputStream("src/tampfile");
            /*byte[] b=new byte[f.available()];
            f.read(b);
            System.out.println(new String(b));*/
            System.out.println("第二种方法------>");
            byte[] b1=new byte[4];
            int dataCount=0;
            while ((dataCount=f.read(b1))!=-1){
                System.out.print(new String(b1,0,dataCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
class L19{
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            //fos=new FileOutputStream("myfile");//没有文件时会新建，然后清空文件重新写入;
            fos=new FileOutputStream("src/tampfile",true);
            byte[] b=new byte[]{97,98,99,100};
            fos.write(b);
            fos.write(b,0,2);
            String s="罗剑飞永远的神";
            byte[] b2=s.getBytes();
            fos.write(b2);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
//文件复制
class L20{
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis=new FileInputStream("myfile");
            fos=new FileOutputStream("aipai");
            byte[] b=new byte[1024*1024];
            int dataCount=fis.read(b);
            if(dataCount!=-1){
                fos.write(b,0,dataCount);
            }
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class L21{
    public static void main(String[] args) {
        FileReader fr=null;
        try {
            fr=new FileReader("myfile");
            char[] c=new char[4];
            System.out.println("按字符方式读取：");
            fr.read(c);
            for(char c1:c){
                System.out.println(c1);
            }
            System.out.println("==========");
            int dataCount=0;
            while((dataCount=fr.read(c))!=-1){
                System.out.print(new String(c,0,dataCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class L22{
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            fw=new FileWriter("file");
            char[] c=new char[]{'L','J','F'};
            fw.write(c,1,2);
            fw.write("罗剑飞最帅!");
            fw.write("\n");
            fw.write("Hello World");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class L23 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("src/ljf/xx/java/jc/Vehicle.java");
            //fr=new FileReader("D:\\IJ\\src\\ljf\\xx\\java\\jc\\Vehicle.java");
            fw = new FileWriter("ljffile.java");
            char[] c = new char[1024 * 512];//1MB
            int dataCount = 0;
            while ((dataCount = fr.read(c)) != -1) {
                fw.write(c, 0, dataCount);
            }
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class L24{
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("ljffile.java");
        BufferedReader br=new BufferedReader(fr);
        String s=null;
        while((s=br.readLine())!=null){
            System.out.println(s);
        }
        br.close();
    }
}
class L25{
    public static void main(String[] args) throws Exception{
       /* FileInputStream fis=new FileInputStream("ljffile");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);*/
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("ljffile")));
        String s=null;
        while((s=br.readLine())!=null){
            System.out.println(s);
        }
        br.close();
    }
}
class L26{
    public static void main(String[] args) throws Exception{
        //BufferedWriter bw=new BufferedWriter(new FileWriter("a"));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("a",true)));
        bw.write("hello world!");
        bw.write("\n");
        bw.write("hello kitty");
        bw.flush();
        bw.close();
    }
}
class L27{
    public static void main(String[] args) throws Exception{
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("data"));
        byte b=100;
        short s=90;
        int i=80;
        long l=70;
        float f=60f;
        double d=50.0;
        boolean bo=false;
        char c='a';
        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(bo);
        dos.writeChar(c);
        dos.flush();
        dos.close();
        DataInputStream dis=new DataInputStream(new FileInputStream("data"));
        System.out.println(dis.readByte());
        System.out.println(dis.readShort());
        System.out.println(dis.readInt()+100);
        System.out.println(dis.readLong());
        System.out.println(dis.readFloat());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        dis.close();
    }
}
class L28{
    public static void main(String[] args) throws Exception{
        System.out.println("hi");
        PrintStream ps=System.out;
        ps.println("L");
        PrintStream ps2=new PrintStream(new FileOutputStream("log"));
        System.setOut(ps2);
        ps2.println("hello");
        log("测试成功");
    }
    public static void log(String s){
        try {
            PrintStream ps3=new PrintStream(new FileOutputStream("log.txt"));
            System.setOut(ps3);
            Date nowTime=new Date();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            System.out.println(sdf.format(nowTime)+":"+s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
//file 文件和目录路径名的抽象表现形式
class L29{
    public static void main(String[] args) throws Exception{
       /* File f=new File("D:\\File");
        System.out.println(f.exists());
        if(!f.exists()){
            //f.createNewFile();
            f.mkdir();
        }*/
        File f1=new File("D:/a/b/c");
        System.out.println(f1.exists());
        if (!f1.exists()){
            f1.mkdirs();
        }
        System.out.println("获取父路径："+f1.getParent());
        System.out.println("绝对路径:"+f1.getParentFile().getAbsolutePath());
        File f2=new File("log");
        System.out.println("绝对路径:"+f2.getAbsolutePath());
        System.out.println("文件名:"+f2.getName());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        long l=f2.lastModified();
        Date d=new Date(l);
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(s.format(d));
        System.out.println(f2.length());
        File f3=new File("D:/IJ");
        File[] ff=f3.listFiles();//当前目录下的子文件
        for(File f4:ff){
            System.out.println(f4.getAbsolutePath());
        }
        for(int i=0;i<ff.length;i++){
            System.out.println(ff[i]);
        }
    }
}

//拷贝目录
class L30{
    public static void main(String[] args) {
        File f1=new File("D:/a/b");//拷贝源
        File f2=new File("D:/ALJ");//拷贝目标
        copyDir(f1,f2);
    }
    private static void copyDir(File f1, File f2) {
        if(f1.isFile()){
            FileInputStream in=null;
            FileOutputStream on=null;
            try {
                in=new FileInputStream(f1);
                String s=(f2.getAbsolutePath().endsWith("\\")? f2.getAbsolutePath():f2.getAbsolutePath()+"\\")+f1.getAbsolutePath().substring(3);
                on=new FileOutputStream(s);
                byte[] b=new byte[1024*1024];
                int dataCount=0;
                while((dataCount=in.read(b))!=-1){
                    on.write(b,0,dataCount);
                }
                on.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (on != null) {
                    try {
                        on.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if(in!=null){
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        File[] f3=f1.listFiles();
        for(File f4:f3){
           // System.out.println(f4.getAbsolutePath());
            if(f4.isDirectory()){
                //System.out.println(f4.getAbsolutePath());
                String s1=f4.getAbsolutePath();
                String s2=(f2.getAbsolutePath().endsWith("\\")? f2.getAbsolutePath():f2.getAbsolutePath()+"\\")+s1.substring(3);
                //System.out.println(s2);
                File f5=new File(s2);
                if(!f5.exists()){
                    f5.mkdirs();
                }
            }
            copyDir(f4,f2);
        }
    }
}
//序列化:内存中的Java对象储存到硬盘文件中，将Java对象的状态保存下来的过程
//反序列化：将硬盘文件中的数据重新恢复到内存中，恢复成Java对象
class Students implements Serializable{
    //private static final long serialVersionUID = -1905757560918132038L;//自动生成,全球唯一
    private static final long serialVersionUID = 1L;//手动写

    int age;
    transient String name;//transient 游离的，不参与序列化
    int aa;
    public Students() {
    }
    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "年龄:"+age+"姓名:"+name;
    }
}
class L31{
    public static void main(String[] args) throws Exception {
        Students s=new Students(11,"张三");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Students"));
        oos.writeObject(s);
        oos.flush();
        oos.close();
    }
}
class L32{
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("Students"));
        System.out.println(ois.readObject());
        ois.close();
    }
}
class L33{
    public static void main(String[] args) throws Exception{
        List<Students> ls=new ArrayList<>();
        ls.add(new Students(11,"张三"));
        ls.add(new Students(12,"李四"));
        ls.add(new Students(13,"王五"));
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("S"));
        oos.writeObject(ls);
        oos.flush();
        oos.close();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("S"));
        //Object o=ois.readObject();
        List<Students> lss=(List<Students>) ois.readObject();
        for(Students s:lss){
            System.out.println(s);
        }
        ois.close();
    }
}
//Io流+Properties
//配置文件建议以.properties，不是必须的
//以.properties结尾在Java中被称为属性配置文件
//Properties专门存放属性配置文件内容的类
class L34{
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("useder.properties");
        Properties p=new Properties();
        p.load(fr);
        String s=p.getProperty("username");
        System.out.println(s);
        System.out.println(p.getProperty("password"));
        System.out.println(p.getProperty("data"));
    }
}
//进程:一个应用程序（一个软件）
//线程：一个进程中的执行场景/执行单元
//一个进程(公司)可以启动多个线程(员工)
//进程A和进程B的内存独立不共享
//线程A和线程B:方法区内存和堆内存共享,
//            栈内存独立，一个线程一个栈
//多线程并发:每个栈之间互不干扰，各自执行各自的
//多线程并发，提高效率
class L35{
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        //start()方法作用:启动一个分支线程，在JVM中开辟一个新的栈空间，这段代码完成任务以后，瞬间就结束了
        //这段代码的任务就是为了开启一个栈空间，只要新的栈空间开出来，start()方法就结束了，线程就启动成功
        //启动成功的线程会自动调用run方法，并且run方法在分支栈的栈底部(压栈)
        mt.start();
        //mt.run();//不会启动线程，不会分配新的分支栈（单线程）
        for(int i=0;i<1000;i++){
            System.out.println("主线程--->"+i);
        }
    }
}
class MyThread extends Thread{
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("分支线程--->"+i);
        }
    }
}
//实现线程的第二种方法
class L36{
    public static void main(String[] args) {
       /* MThread t=new MThread();
        Thread td=new Thread(t);*/
        //Thread td=new Thread(new MThread());
        Thread td=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    System.out.println("t线程--->"+i);
                }
            }
        });
        td.start();
        for(int i=0;i<100;i++){
            System.out.println("main线程--->"+i);
        }
    }
}
//并不是一个线程类，是一个可运行的类。它还不是一个线程
class MThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("分支线程---->"+i);
        }
    }
}
//                                          进入锁池可以理解为一种阻塞状态
//                    （去寻找锁池里面的共享对象的对象锁，释放占用的时间片，找到了进入就绪状态去抢夺CPU时间片，没找到就等待）
//                                                            锁池
//                                                        /          \（synchronized）
//                                                       /  JVM的调度  \
//新建状态（new 线程对象）---（调用start方法）--->就绪状态<---（run方法）--->运行状态--->死亡状态（run方法结束）
//                        (抢夺CPU时间片，抢到执行run方法)    (时间片用完回到就绪状态，下一次抢到时间片接着上一次run方法执行)
//                                          \                   /
//                                 （阻塞解除）\                /（遇到阻塞事件）
//    之前时间片没了需要再次回到就绪状态抢夺时间片      阻塞状态
//                                      （遇到阻塞事件进入阻塞状态，会放弃之前抢夺的CPU时间片）
class L37{
    public void doSome(){
        System.out.println("--->"+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        L37 l=new L37();
        l.doSome();
        M m=new M();
        //m.setName("罗剑飞的线程");
        System.out.println(m.getName());
        M m2=new M();
        System.out.println(m2.getName());
        m.start();
        m2.start();
    }
}
class M extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
class L38{
    public static void main(String[] args) {
       /* try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello");*/
       for(int i=0;i<10;i++){
           System.out.println(Thread.currentThread().getName()+"--->"+i);
           try {
               Thread.sleep(2*1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
class L39{
    public static void main(String[] args) {
       /* Thread t=new MyThread2();
        t.setName("t");
        t.start();
        try {
            t.sleep(5*1000);//sleep静态方法实际上调用的Thread.sleep() --->当前线程进入睡眠状态（main线程和t线程无关）
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello");*/
       Thread t=new Thread(new MyRunable2());
       t.setName("t");
       t.start();
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
    }
    }
}
class MyRunable2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--->begin");
        try {
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--->end");
    }
}
//终止线程
class L40{
    public static void main(String[] args) {
        MyRunable3 m3=new MyRunable3();
        Thread t=new Thread(m3);
        t.setName("t");
        t.start();
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        m3.run=false;
    }
}
class MyRunable3 implements Runnable{
    boolean run=true;
    public void run() {
            for(int i=0;i<10;i++){
                if(run){
                System.out.println(Thread.currentThread().getName()+"--->"+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                    return;
                }
        }

    }
}
class L41{
    public static void main(String[] args) {
        //System.out.println(Thread.currentThread().getName()+"优先级是"+Thread.currentThread().getPriority());
        /*t.setPriority(10);
        Thread.currentThread().setPriority(1);*/
        Thread t=new Thread(new MyRunable4());
        t.setName("t");
        t.start();
        System.out.println("main-begin");
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main-over");
    }
}
class MyRunable4 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }
    }
}
//leetcode第一题
/*class L42 {
    public static void main(String[] args) {
        L42 l=new L42();
        l.twoSum(new int[]{1, 2,3,4,5,6,7},13);
    }
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                   a[0]=i;
                   a[1]=j;
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
        return a;
    }
}*/
//线程同步：线程排队执行
//异步就是并发，同步就是排队
class Account{
    private String actno;
    private double balance;
    public Account() {
    }
    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }
    public String getActno() {
        return actno;
    }
    public void setActno(String actno) {
        this.actno = actno;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public synchronized void withdraw(double money){
        //共享对象一定是this,同步代码块是整个方法体
        //线程同步机制语法：synchronized(){}
        //synchronized()括号里写多线程共享的数据,共享的对象
        //{}大括号里面写同步代码块
        //synchronized (actno){
        //synchronized (this){
            double before=this.getBalance();
            double after=before-money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setBalance(after);
        //}
    }
}
class AccountThread extends Thread{
    private Account act;
    public AccountThread(Account act){
        this.act=act;
    }
    public void run() {
        double money=5000;
        //synchronized (act){
            act.withdraw(money);
        //}
        System.out.println(Thread.currentThread().getName()+"对"+act.getActno()+"取款成功，账户余额:"+act.getBalance());
    }
}
class L43{
    public static void main(String[] args) {
        Account a1=new Account("actno",10000);
        AccountThread a2=new AccountThread(a1);
        AccountThread a3=new AccountThread(a1);
        a2.setName("a2");
        a3.setName("a3");
        a2.start();
        a3.start();
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        int i=1;
        if(l1.next==null&&l2.next==null){
            int a=l1.val;
            int b=l2.val;
            l3.val=a+b;
        }
        if(l1.next!=null&&l2.next==null){
            while(l1.next!=null){
                i++;
                l3.val=l2.val+l1.val*10;
                addTwoNumbers(l1.next,l2);
            }
        }

        return l3;
        }
}
//实例变量 堆中
//静态变量 方法区中
//局部变量 栈中   不会有线程安全问题
//synchronized出现在静态方法中是找类锁,只有一把类锁
class L45{
    public static void main(String[] args) {
        //MyClass mc=new MyClass();
        MyClass mc1=new MyClass();
        MyClass mc2=new MyClass();
        LThread l1=new LThread(mc1);
        LThread l2=new LThread(mc2);
        l1.setName("l1");
        l2.setName("l2");
        l1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        l2.start();
    }
}
class LThread extends Thread{
    private MyClass mc;
    public LThread(MyClass mc){
        this.mc=mc;
    }
    public void run() {
        if(Thread.currentThread().getName().equals("l1")){
            mc.doSome();
        }
        if(Thread.currentThread().getName().equals("l2")){
            mc.doOther();
        }
    }
}
class MyClass{
    public synchronized  void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }
    /*public synchronized  static void doSome(){
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }*/
    public void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
     /*public synchronized void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }*/
     /*public synchronized static void doOther(){
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }*/
}
//死锁代码
class L46{
    public static void main(String[] args) {
        Object o1=new Object();
        Object o2=new Object();
        Thread t1=new MyThread3(o1,o2);
        Thread t2=new MyThread4(o1,o2);
        t1.start();
        t2.start();
    }
}
class MyThread3 extends Thread{
    Object o1;
    Object o2;
    public MyThread3(Object o1,Object o2){
        this.o1=o1;
        this.o2=o2;
    }
    public void run() {
        synchronized (o1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2){

            }
        }
    }
}
class MyThread4 extends Thread{
    Object o1;
    Object o2;
    public MyThread4(Object o1,Object o2){
        this.o1=o1;
        this.o2=o2;
    }
    public void run() {
        synchronized (o2){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1){

            }
        }
    }
}
//守护线程特点：第一个 死循环
//            第二个 所有的用户线程只要结束，守护线程自动结束
class L47{
    public static void main(String[] args) {
        Thread t=new BakDataThread();
        t.setName("备份线程的数据");
        //启动线程之前，将线程设置为守护线程
        t.setDaemon(true);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"---->"+i);
            try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
class BakDataThread extends Thread{
    int i=0;
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName()+"=====>"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class L48{
    public static void main(String[] args) throws Exception {
        Timer timer=new Timer();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date firstTime=sdf.parse("2021-05-31 23:32:00 000");
        timer.schedule(new LogTimeData(),firstTime,1000*10);
    }
}
class LogTimeData extends TimerTask{
    public void run() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String s=sdf.format(new Date());
        System.out.println(s+"完成一次数据备份");
    }
}
class L49{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask ft=new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("call method begin");
                Thread.sleep(1000*10);
                System.out.println("call method over");
                int a=10;
                int b=20;
                return a+b;
            }
        });
        Thread t=new Thread(ft);
        t.start();
        Object o=ft.get();
        System.out.println("线程执行结果"+o);
        System.out.println("hello world");
    }
}
//wait notify 建立在synchronized线程同步的基础之上
//o.wait() 会让"当前线程"（正在o对象上活动的线程）进入等待状态,并且释放之前占有的o对象的锁
//o.notify() 唤醒正在o对象上等待的线程，不会释放之前占有的o对象的锁
class L50{
    public static void main(String[] args) {
        List list=new ArrayList();
        Thread t1=new Thread(new Producer(list));
        Thread t2=new Thread(new Consumer(list));
        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();
    }
}
class Producer implements Runnable{
    private List list;
    public Producer(List list){
        this.list=list;
    }
    @Override
    public void run() {
        while (true){
            synchronized (list){
                if(list.size()>0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o=new Object();
                list.add(o);
                System.out.println(Thread.currentThread().getName()+"====>"+o);
                list.notify();
            }
        }
    }
}
class Consumer implements Runnable{
    private List list;
    public Consumer(List list){
        this.list=list;
    }
    @Override
    public void run() {
        while (true){
            synchronized (list){//给list加锁
                if(list.size()==0){
                    try {
                        list.wait();//当前线程进入等待，释放Producer之前占有的list集合的锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o=list.remove(0);
                System.out.println(Thread.currentThread().getName()+"===>"+o);
                list.notify();
            }
        }
    }
}
//反射机制:可以读和修改字节码,可以操作代码片段
//java.lang.Class 代表整个字节码
//java.lang.reflect.Method 代表字节码中的方法字节码
//java.lang.reflect.Constructor 代表字节码中的构造方法字节码
//java.lang.reflect.Filed 代表字节码中的属性字节码
//字节码文件装载到JVM中只装载一份在方法区中
class L51{
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1=Class.forName("java.lang.String");
        String s="abc";
        Class c2=s.getClass();//表示String.class字节码文件
        System.out.println(c1==c2);//内存地址一样
        Class c3=String.class;
        System.out.println(c1==c3);
        System.out.println("=======");
        Class c4=Class.forName("ljf.xx.java.jc.UI");
        try {
            Object o=c4.newInstance();//调用UI类的无参数构造，完成对象的创建
            System.out.println(o);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
class UI{
    public UI() {
        System.out.println("无参构造");
    }
}
class L52{
    public static void main(String[] args) throws Exception{
       /* FileReader fr=new FileReader("useder.properties");
        Properties p=new Properties();
        p.load(fr);
        fr.close();
        String className=p.getProperty("classname");
        Class c=Class.forName(className);
        System.out.println(c.newInstance());
        Class.forName("ljf.xx.java.jc.MyClass2");//导致类加载，类加载时静态代码块执行*/
      /*  String path=Thread.currentThread().getContextClassLoader().getResource("useder.properties").getPath();
        FileReader fr2=new FileReader(path);*/
        InputStream fr2=Thread.currentThread().getContextClassLoader().getResourceAsStream("useder.properties");
        Properties p2=new Properties();
        p2.load(fr2);
        fr2.close();
        String className2=p2.getProperty("classname");
        System.out.println(className2);
       Class c2=Class.forName(className2);
        System.out.println(c2.newInstance());
        Class.forName("ljf.xx.java.jc.MyClass2");
    }
}
class MyClass2{
    static {
        System.out.println("MyClass2的静态代码块执行了!");
    }
}
//凡是在src路径下的都是类路径下
//下面这种方式只能是类路径下
class L53{
    public static void main(String[] args) {
        String path=Thread.currentThread().getContextClassLoader().getResource("useder.properties").getPath();
        System.out.println(path);
        //获取绝对路径:从类的根路径下作为起点开始
        String path2=Thread.currentThread().getContextClassLoader().getResource("ljf/cs/java/a.properties").getPath();
        System.out.println(path2);

    }
}
//资源绑定器：只能绑定xxx.properties文件，并且这个文件必须在类路径下,并且扩展名不能写
class L54{
    public static void main(String[] args) {
        ResourceBundle rb=ResourceBundle.getBundle("useder");
        String s=rb.getString("classname");
        System.out.println(s);
    }
}
class F{
    public int no;
    protected String age;
    private int a;
    boolean sex;
    public static final double MATH_PA=3.1415926;
}
class L55{
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("ljf.xx.java.jc.F");
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        System.out.println("=====");
        Field[] fileds=c.getFields();
        System.out.println(fileds.length);
        System.out.println(fileds[0].getName());
        System.out.println("====");
        Field[] fs=c.getDeclaredFields();
        System.out.println(fs.length);
        System.out.println("====");
        for(Field f:fs){
            int i=f.getModifiers();
            System.out.print(Modifier.toString(i));
            System.out.print("===>");
            System.out.print(f.getType().getName());
            System.out.print("===>");
            System.out.println(f.getName());
        }
    }
}
class L56{
    public static void main(String[] args) throws Exception{
        StringBuffer s=new StringBuffer();
        Class c=Class.forName("java.lang.String");
        s.append(Modifier.toString(c.getModifiers())+" "+"class"+" "+c.getSimpleName()+"{");
        Field[] f=c.getDeclaredFields();
        for(Field f1:f){
            s.append("\n");
            s.append("\t");
            s.append(Modifier.toString(f1.getModifiers()));
            s.append(" ");
            s.append(f1.getType().getSimpleName());
            s.append(" ");
            s.append(f1.getName());
            //s.append("\n");
        }
        s.append("\n}");
        System.out.println(s);

    }
}
class L57{
    public static void main(String[] args) throws Exception{
        F f=new F();
        f.no=111;
        System.out.println(f.no);
        Class c=Class.forName("ljf.xx.java.jc.F");
        Object o=c.newInstance();
        Field nofield=c.getDeclaredField("no");//获取no属性
        nofield.set(o,222);
        System.out.println(nofield.get(o));
        Field afield=c.getDeclaredField("a");
        //反射机制缺点：打破封装
        afield.setAccessible(true);
        afield.set(o,333);
        System.out.println(afield.get(o));
    }
}
//可变长度参数 int...args
//语法:类型...(一定是三个点)
//可变参数要求的参数个数是:0~N个
//可变参数只能有一个且必须出现在参数列表最后一个位置上
//可以将可变参数当作一个数组
class L58{
    public static void main(String[] args) {
        m();
        m(1);
        m(111,2222);
        m2("1");
        m2("2",11);
        m2("2",22,33);
        m3("ab","cd","ef");
        String[] str={"a","b","c"};
        m3(str);
    }
    public static void m(int...args){
        System.out.println("m方法执行了!!!!");
    }
    public static void m2(String s,int...args){
        System.out.println("m2方法执行了!");
    }
    public static void m3(String...s){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
class DL{
    public boolean login(String name,String password){
        if("admin".equals(name) && "123".equals(password)){
            return true;
        }
        return false;
    }
    public void logout(){
        System.out.println("系统已经安全退出");
    }
}
class L59{
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("ljf.xx.java.jc.DL");
        Method[] m=c.getDeclaredMethods();
        for(Method method:m){
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getReturnType().getSimpleName());
            System.out.println(method.getName());
            Class[] c1=method.getParameterTypes();
            for(Class c2:c1){
                System.out.println(c2.getSimpleName());
            }
        }
    }
}
class L60{
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("ljf.xx.java.jc.DL");
        StringBuffer s=new StringBuffer();
        s.append(Modifier.toString(c.getModifiers())+"class"+" "+c.getSimpleName()+"{\n");
        Method[] m=c.getDeclaredMethods();
        for(Method method:m){
            s.append("\t");
            s.append(Modifier.toString(method.getModifiers()));
            s.append(" ");
            s.append(method.getReturnType().getSimpleName());
            s.append(" ");
            s.append(method.getName());
            s.append("(");
            Class[] c3=method.getParameterTypes();
            for(Class c4:c3){
                s.append(c4.getSimpleName());
                s.append(",");
            }
            s.deleteCharAt(s.length()-1);
            s.append("){ }\n");
        }
        System.out.println(s);
    }
}
class L61{
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("ljf.xx.java.jc.DL");
        Object o=c.newInstance();
        Method m=c.getDeclaredMethod("login", String.class, String.class);
        Object b=m.invoke(o,"admin","123");
        System.out.println(b);
    }
}
class VV{
    int no;
    String name;
    public VV() {
    }
    public VV(int no) {
        this.no = no;
    }
    public VV(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "VV{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
class L62{
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("ljf.xx.java.jc.VV");
        StringBuffer s=new StringBuffer();
        s.append(Modifier.toString(c.getModifiers()));
        s.append("class ");
        s.append(c.getSimpleName());
        s.append("{\n");
        Constructor[] cr=c.getDeclaredConstructors();
        for(Constructor constructor:cr){
            s.append("\t");
            s.append(Modifier.toString(constructor.getModifiers()));
            s.append(" ");
            s.append(c.getSimpleName());
            s.append(" ");
            s.append("(");
            Class[] cs=constructor.getParameterTypes();
            for(Class css:cs){
                s.append(css.getSimpleName());
                s.append(",");
            }
            if(cs.length>0){
                s.deleteCharAt(s.length()-1);
            }
            s.append(")");
            s.append("{}\n");
        }
        s.append("\n}");
        System.out.println(s);

        VV v=new VV();
        c.newInstance();
        Constructor ccc=c.getDeclaredConstructor(int.class,String.class);
        Object o=ccc.newInstance(11,"11");
        System.out.println(o);
    }
}
class L63{
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("java.lang.String");
        Class superclass=c.getSuperclass();//获取父类
        System.out.println(superclass.getName());
        Class[] interfaces=c.getInterfaces();//获取父接口
        for(Class cc:interfaces){
            System.out.println(cc.getName());
        }
    }
}
//自定义注解语法格式:[修饰符列表] @interface 注解类型名{}
//注解使用语法格式 @注解类型名
//默认情况下注解可以出现在任何位置
//用来标注注解类型的注解叫元注解
//如果注解中有属性，必须给属性赋值
//@MyAnnotation(属性名=属性值)
//注解中属性的类型:byte short int long float  double boolean char String Class 枚举类型以及他们的数组形式
@MyAnnotation(name="罗剑飞",color = "蓝色")
@Deprecated
class L64{
    @MyAnnotation(name="1",color="2")
    int i=0;
    public static void main(String[] args) {
        L64 l=new L64();
        System.out.println(l);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    @MyAnnotation(name="1",color="c")
    public void L(){}
    //属性是value并且只有一个属性时可以省略value不写
    @MyAnnotation2("1")
    public void doSome(){};
    //如果数组中只有一个元素大括号可以省略
    @MyAnnotation3(age=21,s="s",season = Season.AUTUMN)
    public void doOther(){};
    @MyAnnotation3(age=21,s={"s","ss"},season = {Season.SPRING,Season.SUMMER,Season.WINTER})
    public void doDo(){};
}
class L65{
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("ljf.xx.java.jc.L64");
        System.out.println(c.isAnnotationPresent(MyAnnotation.class));
        if(c.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation m=(MyAnnotation) c.getAnnotation(MyAnnotation.class);
            System.out.println("类上面的注解对象:"+m);
            System.out.println(m.name());
        }
        Class c2=Class.forName("java.lang.String");
        System.out.println(c2.isAnnotationPresent(MyAnnotation.class));
    }
}
class L66{
    @MyAnnotation4(username = "罗剑飞",password = "123")
    public void doSome(){}
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("ljf.xx.java.jc.L66");
        Method m=c.getDeclaredMethod("doSome");
        if(m.isAnnotationPresent(MyAnnotation4.class)){
           MyAnnotation4 m4=m.getAnnotation(MyAnnotation4.class);
            System.out.println(m4.password());
            System.out.println(m4.username());
        }
    }
}
@ID
class L67{
    int id;
    String s;
    public static void main(String[] args) throws Exception{
        Class c=Class.forName("ljf.xx.java.jc.L67");
        if(c.isAnnotationPresent(ID.class)) {
            Field[] f = c.getDeclaredFields();
            boolean isRight=false;
            for(Field fd:f){
                if("id".equals(fd.getName()) && "int".equals(fd.getType().getSimpleName())){
                    isRight=true;
                }
                break;
            }
            if(!isRight){
                throw new HasNotIDPropertyException("被ID注解标注的类中必须有一个int类型的属性");
            }
        }
    }
}
class HasNotIDPropertyException extends Exception{
    public HasNotIDPropertyException(){

    }
    public HasNotIDPropertyException(String s){
        super(s);
    }
}

