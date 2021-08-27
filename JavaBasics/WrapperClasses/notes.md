**Advantages using wrapper class**
1) primitives don't have methods, wrapper classes do ->

public static void main(String[] args) {

   Integer i = new Integer(432);

   String s = i.toString();
}

2) Class methods

display the maximum possible int value->

System.out.println(Integer.MAX_VALUE);
System.out.println(Integer.MIN_VALUE);

3) wrapper objects are immutable

**Disadvantage** --> performance!
