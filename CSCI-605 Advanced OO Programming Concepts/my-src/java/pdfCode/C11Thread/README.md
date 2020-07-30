## 线程两种
继承Thread, new ， start
实现runnable, new Thread(new runnable1())

## sleep() interrupt
睡眠中interrupt， interrupt ，进入catch中后，标记变成false

## join
在线程A中调用线程B的join， 那么要等线程B执行完，才会执行线程A