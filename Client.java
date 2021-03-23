package com.ningxia.jdk动态代理;

/**
 * @Description :
 * @Author : Mr Huang
 * @CreateDate : 2021/3/13 21:14
 * @Version :
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 创建目标对象
         */
        ITeacherDao target = new TeacherDao();
        /**
         * 给目标对象，创建代理对象，可以转成ITeacherDao
         */
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        /**
         * ProxyInstance = class com.sun.proxy.$Proxy0
         * 内存中生成了代理对象
         */
        //System.out.println(proxyInstance);
        System.out.println(proxyInstance.getClass());

        /**
         * 通过代理对象，调用目标对象的方法
         */
        proxyInstance.teach();
    }
}