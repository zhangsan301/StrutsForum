package com.sikiedu.web;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sikiedu.domain.User;
import com.sikiedu.service.UserService;
import org.apache.struts2.ServletActionContext;

public class UserAction extends ActionSupport implements  ModelDriven<User>{

    public User user =new User();
   // public String username;
   // public String password;

    public String login() throws Exception {

        System.out.println("login方法");
        System.out.println(user.getUsername()+":"+user.getPassword());

        System.out.println("session域::::::"+ActionContext.getContext().getSession().get("mysession"));
        System.out.println("application::::::"+ActionContext.getContext().getApplication().get("myapplication"));


       UserService userService=new UserService();
       boolean success=userService.findUser(user);
       if(success){
           ActionContext.getContext().getSession().put("user",user);
           return "success";
       }
       else{
           ServletActionContext.getRequest().setAttribute("error","用户名或密码错误");
           return "error";
       }

    }

    public String register() throws Exception{
        System.out.println("register方法");
        return null;
    }

    public String kill() throws Exception{
        System.out.println("kill方法");
        return null;
    }

    @Override
    public User getModel() {
        return user;
    }

}
