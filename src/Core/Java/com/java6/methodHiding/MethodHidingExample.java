package Core.Java.com.java6.methodHiding;

public class MethodHidingExample {

    public static void main(String[] args) {
Parent parnet=new Child();
parnet.policyType();
//  As becoz Since static methods are resolved using reference type
/* out put -- Generic Insurance  Policy from Parent.
* 1.Even though object is from Child ,The reference type is Parent .
* Since the static method are consider at compile time by reference "Parent.policyType()"
* 2.So:
✔ Child method is not overriding
✔ It is hiding the parent method
* if we call Child .policyType() , Then we will get the child version out put
*
* Key Takeaways (Very Important for Interviews)
✔ Method hiding happens only with static methods
✔ Static methods belong to class
✔ Resolved at compile time
✔ Based on reference type
✔ Does NOT support runtime polymorphism
✔ Can create real-time bugs if misunderstood
*
*  */

    }


}
