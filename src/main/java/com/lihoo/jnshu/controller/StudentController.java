package com.lihoo.jnshu.controller;

import com.lihoo.jnshu.model.StudentInfoDO;
import com.lihoo.jnshu.model.StudentInfoDOExample;
import com.lihoo.jnshu.service.StudentInfoDOService;
import com.lihoo.jnshu.service.StudentListDOService;
import com.lihoo.jnshu.util.Log2Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import static com.lihoo.jnshu.util.AddSalt.getSalt;
import static com.lihoo.jnshu.util.MD5Utils.getPwdHash;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.lihoo.jnshu.util.JwtUtils2;
import com.lihoo.jnshu.util.LoginStatus;
import com.lihoo.jnshu.util.Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;



/**
 * #Title: StudentController
 * #ProjectName task6_index2
 * #Description: TODO
 * #author lihoo
 * #date 2018/9/15-9:35
 */

@SuppressWarnings("unused")
@Controller
public class StudentController {

    @Autowired
    StudentListDOService studentListDOService;

    @Autowired
    StudentInfoDOService studentInfoDOService;

    /**
     请求注册数据
     */
    @RequestMapping(value ="/join", method = RequestMethod.GET)
    public String joinForm() {
        Log2Util.logger.info("join GET 方法被调用……");
        return "join.page";
    }

    /**
     注册
     */
    @RequestMapping(value ="/join", method = RequestMethod.POST)
    public String join(@RequestParam("username") String username,
                       @RequestParam("pwd") String pwd) {
        Log2Util.logger.info("开始...");
        Log2Util.logger.info("join POST 方法被调用……");
        String salt = getSalt();
        String pwdHash = getPwdHash(pwd, salt);
//       创建StudentInfo对象
        StudentInfoDO joinUser = new StudentInfoDO();
        joinUser.setUsername(username);
        joinUser.setSalt(salt);
        joinUser.setPwd(pwdHash);
        joinUser.setLogAt(System.currentTimeMillis());
        joinUser.setExpireAt(System.currentTimeMillis());
        studentInfoDOService.insert(joinUser);
        Log2Util.logger.info("打印注册的用户信息: " + "用户名:"+username+"密码:"+pwd);
        Log2Util.logger.info("打印注册的用户信息: " + joinUser);
        return "main.home";
    }

    /**
     请求登陆页面(输入账号密码)
     */
    @RequestMapping(value ="/login", method = RequestMethod.GET)
    public String loginForm() {
        Log2Util.logger.info("login GET 方法被调用……");
        return "login.page";
    }

    /**
     *
     *登录验证，token加密，cookie生成发送
     */
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(@RequestParam(value = "username",required = false) String username,
//                        @RequestParam(value = "pwd",required = false) String pwd,
//                        HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
//                        Model model) throws Exception {
//        //        查询用户列表
//        StudentInfoDOExample doExample = new StudentInfoDOExample();
//        List<StudentInfoDO> stuList = studentInfoDOService.selectByExample(doExample);
//        for (StudentInfoDO list : stuList) {
//            list.getId();
////            logger.debug("用户名：" + list.getUsername() + "密码：" + list.getPwd() + "盐：" + list.getSalt());
//        }
//        //通过用户名取出本条数据
//        StudentInfoDO stu = studentInfoDOService.selectByUsername(username);
//        Long id = stu.getId();
//        //设置当前登录时间，一会儿添加到token用
//        Long currentTime = System.currentTimeMillis();
//        Log2Util.logger.info(id);
//        //把当前登录时间更新到数据库
//        StudentInfoDO updateStu = new StudentInfoDO();
//        updateStu.setId(id);
//        updateStu.setLogAt(currentTime);
//        int addTime = StudentInfoDOService.updateLoginTimeById(updateStu);
//        Log2Util.logger.info(addTime);
//        Log2Util.logger.info(updateStu);
//        Log2Util.logger.info("当前登录时间是：" + currentTime);
//        //**********************************************************************************************
////        定义需要加密的token( id + 登录时间 + 用户名 )
//        String idAndTimeAndUsername = id + "," + currentTime + "," + username;
//        Log2Util.logger.info("看一手这个（ id + 时间 + 用户名 ）的字符串：" + idAndTimeAndUsername );
////        加密，生成Token
//        String jwtid = "123456";
//        String jwtToken = JwtUtils2.createJWT(jwtid,idAndTimeAndUsername,currentTime);
//        System.out.println("****这就是JWT_Token：" + jwtToken);
//        //        保存到Cookies
//        Cookie cookie = new Cookie("token", jwtToken);
////        设置一下Cookie
////        切记cookie时间设置，当你刷新，超时cookie失效
//        cookie.setMaxAge(12*30*24*60*60);
////        cookie.setMaxAge(60);
//        cookie.setPath("/");
////        添加到请求中
//        httpServletResponse.addCookie(cookie);
//        //**********************************************************************************************
////        打印输入的用户名和密码
//        Log2Util.logger.info("输入的账户名是：" + username );
//        Log2Util.logger.info("输入的账户密码是：" + pwd );
////        扔到service层去看一手**账号**密码**是不是和数据库的对应
//        StudentInfoDO loginUser = new StudentInfoDO();
//        loginUser.setUsername(username);
//        loginUser.setPwd(pwd);
////        验证用户名是否在数据库中
//        Boolean isNameSame = stu.getUsername().equals(username);
//        Log2Util.logger.info(isNameSame);
////        验证密码是否在数据库中MD5加盐加密之后一致
//        Boolean isPwdSame = StudentInfoDOService.verifyPwd(loginUser);
//        Log2Util.logger.info("是否一致：" + isPwdSame);
//////      查找用户是否存在
//        if (isNameSame && isPwdSame) {
//            Log2Util.logger.info("登录成功");
//            Log2Util.logger.info("打印一下cookie：" + cookie);
//            Log2Util.logger.info("打印一下cookie的名：" + cookie.getName());
//            Log2Util.logger.info("打印一下cookie的值：" + cookie.getValue());
//            return "redirect:/index";
//        }
//        return "error.page";
//    }

    /**
     * 退出登录
     * @param request
     * @param response
     * @return
     */
//     用户退出时清除用户session里绑定到指定名称的对象
    @RequestMapping("/logout")
    public String logOut(HttpServletRequest request, HttpServletResponse response){
        Cookie cookieKiller = new Cookie("token", null);
        cookieKiller.setMaxAge(0);
        cookieKiller.setPath("/");
        response.addCookie(cookieKiller);
        Log2Util.logger.info("退出登录，清除Cookie");
        return "redirect:/index";
    }

    //  主页
//    @RequestMapping("/index")
//    public String home(Model model, HttpServletRequest request) throws Exception {
//        //header信息展示
//        String[] status = LoginStatus.status(request);
//        logger.info("我王境泽就是饿死：" + status);
//        model.addAttribute("status", status);
//        //页面信息
//        List<StudentHome> selectGreatStudent = studentHomeService.selectGreatStudent();
//        int countAll = studentHomeService.countAll();
//        int workingCount = studentHomeService.workingCount();
//        model.addAttribute("selectGreatStudent", selectGreatStudent);
//        model.addAttribute("countAll", countAll);
//        model.addAttribute("workingCount", workingCount);
//        return "main.home";
//    }
    //给一个Json

//    @RequestMapping(value = "/index", method = RequestMethod.GET)
//    public List<StudentHome> findStuIndex() throws Exception {
//        logger.info("获取list的Json");
//        return studentHomeService.selectAll();
//    }




}
