package com.example.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class FormController {

    @RequestMapping("/form")
    public String showForm()
    {
        return "basic-form";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model)
    {
        String name = request.getParameter("studentName");
        name = name.toUpperCase(Locale.ROOT);
        String result = "Hello " + name;
        model.addAttribute("message", result);
        model.addAttribute("name", name);
        return "form-data";
    }
}
