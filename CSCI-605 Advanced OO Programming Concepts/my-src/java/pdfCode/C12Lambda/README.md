## lambda Expression vs Anonymous interface implementation
匿名内部类可以有参数， lambda 表达式不可以


## method reference
Lambda Method: (Apple a) -> a.getWeight() 
Method References: Apple::getWeight

Lambda Method: () -> Thread.currentThread().dumpStack() 
Method References: Thread.currentThread()::dumpStack

Lambda Method: (str, i) -> str.substring(i) 
Method References: String::substring

Lambda Method: (Apple a) -> a.getWeight 
Method References: Apple::getWeight

Lambda References: (String s) -> System.out.println(s) 
Method References: System.out::println
