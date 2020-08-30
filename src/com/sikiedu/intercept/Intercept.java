package com.sikiedu.intercept;

import com.opensymphony.xwork2.ActionInvocation;
import org.omg.CORBA.*;
import org.omg.CORBA.Object;
import org.omg.PortableInterceptor.Interceptor;

//第二种创建拦截器的方法
public class Intercept implements Interceptor {
    @Override
    public String name() {
        return null;
    }

    @Override
    public void destroy() {

    }



    public void init() {

    }


    public String intercept(ActionInvocation invocation) throws Exception{
        return invocation.invoke();




    }


    @Override
    public boolean _is_a(String repositoryIdentifier) {
        return false;
    }

    @Override
    public boolean _is_equivalent(Object other) {
        return false;
    }

    @Override
    public boolean _non_existent() {
        return false;
    }

    @Override
    public int _hash(int maximum) {
        return 0;
    }

    @Override
    public Object _duplicate() {
        return null;
    }

    @Override
    public void _release() {

    }

    @Override
    public Object _get_interface_def() {
        return null;
    }

    @Override
    public Request _request(String operation) {
        return null;
    }

    @Override
    public Request _create_request(Context ctx, String operation, NVList arg_list, NamedValue result) {
        return null;
    }

    @Override
    public Request _create_request(Context ctx, String operation, NVList arg_list, NamedValue result, ExceptionList exclist, ContextList ctxlist) {
        return null;
    }

    @Override
    public Policy _get_policy(int policy_type) {
        return null;
    }

    @Override
    public DomainManager[] _get_domain_managers() {
        return new DomainManager[0];
    }

    @Override
    public Object _set_policy_override(Policy[] policies, SetOverrideType set_add) {
        return null;
    }


}
