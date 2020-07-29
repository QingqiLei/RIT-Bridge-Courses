package pdfCode.C7Inheritance;

/**
 * inner classes are posssible, inner classes cannot be declared as native, synchronized, transient or volatile
 */
public class InnerClass {

    static class A{
        static void hi(){
            System.out.println("4.hi");
        }
    }

    class B{
        void hi(){
            System.out.println("3.hi");
        }
    }

    void hi(){
        class C{
            void hi(){
                System.out.println("2.hi");
            }
        }
        Object o = new C(){
            void hi(){
                System.out.println("1.hi");
            }
        };
        ((C)o).hi(); new C().hi(); new B().hi();
    }

    static public void main(String args[]){
        new InnerClass(){ void hi(){
            System.out.println("fuck");
        }}.hi();
        InnerClass tt = new InnerClass();
        InnerClass.B innerB = tt.new B();  // 实例化内部类
        InnerClass.A.hi();                 // 直接调用静态内部类
        A.hi();
        new A().hi();                      // 实例化静态内部类

        System.out.println(new A());  // 静态内部类可以多次实例化
        System.out.println(new A());

    }
}
