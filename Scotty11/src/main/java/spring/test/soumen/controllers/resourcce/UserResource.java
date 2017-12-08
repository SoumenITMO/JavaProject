package spring.test.soumen.controllers.resourcce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import spring.test.soumen.controllers.repository.LoginInterface;
import spring.test.soumen.controllers.repository.UsersRepository;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class UserResource
{
    @Autowired
    UsersRepository userRepo;
    @Autowired
    LoginInterface loginint;

    @RequestMapping("/")
    public ModelAndView index(HttpServletRequest res_index) throws Exception
    {
        ModelAndView mv = new ModelAndView();
        mv.addObject("cart_item", "5 items In your CART .. ");
        Cookie[] cookies = res_index.getCookies();
        if(cookies.length > 0) {
            for (Cookie ck : cookies) {
                if (ck.getName().toString().equals("user_login_cookie") && !ck.getValue().toString().equals("")) {
                    mv.addObject("userName", ck.getValue());
                    mv.addObject("loginbtntxt", "Logout");
                    mv.addObject("loginbtnclass", "btn-logout");
                    mv.addObject("modalbtn", "#");
                } else {
                    mv.addObject("loginbtntxt", "Login");
                    mv.addObject("userName", "User!");
                    mv.addObject("loginbtnclass", "");
                    mv.addObject("modalbtn", "#login");
                }
            }
        }
        mv.setViewName("pages/index.jsp");
        return mv;
     }
    @RequestMapping("product_summary.html")
    public ModelAndView cart_page()
    {
        ModelAndView cartview = new ModelAndView();
        cartview.setViewName("pages/product_summary.jsp");
        return cartview;
    }
    @RequestMapping(value = "search_user", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Object post_req()
    {
           //List<Users> dat_ = userRepo.findByname__(Integer.parseInt(s));
           //dat_.forEach(item->System.out.println(item));
           //ModelAndView mv = new ModelAndView();
           //mv.addObject(userRepo.findByname__(Integer.parseInt(s)));
           return userRepo.findAll();
    }
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public Object login_user(@RequestParam("user_login")String mail_, @RequestParam("user_pwd")String passwod_)
        throws NoSuchAlgorithmException
    {
        System.out.println(loginint.checkLogin(getMD5Hex(passwod_), mail_).toArray().length);
        return loginint.checkLogin(getMD5Hex(passwod_), mail_).toArray();
    }
    @RequestMapping("register.html")
    public ModelAndView register(HttpServletRequest httreq, HttpServletResponse httres) throws IOException
    {
        ModelAndView reg_mv = new ModelAndView();
        Cookie[] cookies = httreq.getCookies();
        for(Cookie ck : cookies)
        {
            if (ck.getName().toString().equals("user_login_cookie") && ck.getValue().length() > 3)
            {
                httres.sendRedirect("/");
            }
            else
            {
                reg_mv.addObject("loginbtntxt", "Login");
                reg_mv.addObject("userName", "User!");
                reg_mv.addObject("loginbtnclass", "");
                reg_mv.addObject("modalbtn","#login");
            }
        }
        reg_mv.setViewName("pages/register.jsp");
        return reg_mv;
    }
    @RequestMapping(value = "setcookie", method = RequestMethod.POST)
    public String getcookieset(@RequestParam("user")String userName, HttpServletResponse res)
    {
        res.addCookie(new Cookie("user_login_cookie", userName));
        return userName;
    }
    @RequestMapping("logout")
    @ResponseBody
    public String logout(HttpServletResponse hsr)
    {
        Cookie delcookie = new Cookie("user_login_cookie","Scott Jeason");
        delcookie.setValue(null);
        hsr.addCookie(delcookie);
        return "1";
    }
    public static String getMD5Hex(final String inputString) throws NoSuchAlgorithmException
    {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(inputString.getBytes());
        byte[] digest = md.digest();
        return convertByteToHex(digest);
    }
    private static String convertByteToHex(byte[] byteData)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < byteData.length; i++)
        {
            sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }
}
