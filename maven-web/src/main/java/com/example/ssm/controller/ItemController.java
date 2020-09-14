package com.example.ssm.controller;


import com.example.ssm.pojo.Item;
import com.example.ssm.service.ItemService;
import com.example.ssm.service.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    /* "类型"的解释：
    * Spring注解是通过动态代理实现的，java中有两种动态代理的方式：基于JDK的动态代理和基于Cglib的动态代理
    * 由于ItemServiceImpl实现了接口，因此这里java虚拟机自动使用了基于JDK的动态代理
    * 所以这里的类型必须是接口，而不能是类。如果ItemService直接写成一个类，这里的类型就可以是类。
    * */
    private ItemService itemService;

    @RequestMapping("/showItem/{id}")
    public String findById(@PathVariable("id") int id, Model model){
        Item item = itemService.findById(id);
        model.addAttribute("item", item);
        return "item";
    }
}
