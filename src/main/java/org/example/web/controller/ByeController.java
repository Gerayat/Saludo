package org.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Page controller for reading enumeration values from HTTP requests.
 */
@Controller
public class ByeController
{


  static final String PATH_BYE  = "/bye";


  static final String VIEW_BYE  = "thymeleaf/bye";


  /**
   * Displays the form binding page.
   */
  @GetMapping(PATH_BYE)
  public String bye(@RequestParam(value="name",required=false, defaultValue="World")String name, Model model)
  {
	  model.addAttribute("name",name);
    return VIEW_BYE;
  }


}
