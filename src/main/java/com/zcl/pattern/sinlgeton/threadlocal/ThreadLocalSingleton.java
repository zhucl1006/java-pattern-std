package com.zcl.pattern.sinlgeton.threadlocal;
//使用ThreadLocal 来实现多数据源动态切换
public class ThreadLocalSingleton {
    private  static  final  ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };
    private ThreadLocalSingleton(){

    }

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
