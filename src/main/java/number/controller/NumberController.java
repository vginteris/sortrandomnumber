package number.controller;

import number.util.NumberAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class NumberController {

    @GetMapping(value = "/")
    public String openNumberPage(){
        return "insertnumber";
    }
    @GetMapping(value = "/number")
    public ModelAndView getNumberFromJsp(@RequestParam(name = "minnumber") Integer minnumber,
                                   @RequestParam(name = "maxnumber") Integer maxnumber,
                                   @RequestParam(name = "countnumber") Integer countnumber)
    {
        List<Integer> numberList = new NumberAction().getRandomNumberList(minnumber,maxnumber,countnumber);
        ModelAndView model = new ModelAndView("insertnumber");
        List<Integer> sortedList = new NumberAction().getSortedList(numberList);
        model.addObject("sortedList",sortedList);
        return model;
    }

}
