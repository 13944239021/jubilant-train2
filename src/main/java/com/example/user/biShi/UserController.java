package com.example.user.biShi;

import com.Result.Result;
import com.Result.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class UserController {
    @GetMapping("/{username}/{password}")
    public Result Login(@PathVariable String username,@PathVariable String password){
        User user=new User();
      user.setUsername(username);
        user.setPassword(password);
          String p="123456";
          String u = "username";
            if (user.getUsername() .equals(u)  && user.getPassword().equals(p)){
                return helloWorld();
            }
            return Result.error("用户名或者密码错误");
        }
      public Result helloWorld(){
        return Result.success("HelloWorld");
      }


}
