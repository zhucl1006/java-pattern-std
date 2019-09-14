package lazy;

//这种形式兼顾饿汉式的内存浪费，也兼顾synchronized性能问题
//完美地屏蔽了这两个缺点
//史上最牛B的单例模式的实现方式
public class LazyInnerSingleton {
    //默认使用LazyInnerClassGeneral的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的
    private  LazyInnerSingleton(){
        if(LazyHolder.LAZY != null){//可以避免被序列化强制反转
            throw  new RuntimeException("不允许创建多个实例");
        }
    }
    //每一个关键字都不是多余的
    //static 是为了使单例的空间共享
    //保证这个方法不会被重写，重载
    public  static  LazyInnerSingleton getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY;
    }
    //默认不加载
    public  static  class  LazyHolder{
        public  static  final  LazyInnerSingleton LAZY =  new LazyInnerSingleton();
    }
}
