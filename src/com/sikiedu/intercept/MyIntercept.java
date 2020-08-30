package com.sikiedu.intercept;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyIntercept extends MethodFilterInterceptor {

   //第一种创建拦截器的方式(推荐)
    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        System.out.println("MyInterceptor");
        //放行

        //获取session
        Map<String,Object> session= ActionContext.getContext().getSession();
        Object object=session.get("user");

        //判断session中是否有user数据
        if(object!=null){
            //有,放行
            return invocation.invoke();
        }
        else {
            //没有,重定向到login.jsp
             return "toLogin";
        }
    }
}
