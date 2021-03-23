package com.ningxia.jdk动态代理;

/**
 * @Description :
 * @Author : Mr Huang
 * @CreateDate : 2021/3/13 19:29
 * @Version :
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在上课******* ");
    }
}