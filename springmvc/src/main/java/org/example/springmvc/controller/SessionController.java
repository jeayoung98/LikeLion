package org.example.springmvc.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("visitCount2")
public class SessionController {

    @ModelAttribute("visitCount2")
    public Integer initVisitCount2(){
        return 0;
    }

    @GetMapping("/visits")
    public String trackVisit(@ModelAttribute("visitCount2") Integer visitCount2, Model model){
        visitCount2++;
        model.addAttribute("visitCount2",visitCount2);
        return "visits";
    }

//    @GetMapping("resetVisit")
//    public String resetVisit(SessionStatus status){
//    // 세션객체 전체 삭제
//        status.setComplete();
//        return "redirect:/visits";
//    }

    @GetMapping("resetVisit")
    public String resetVisit(HttpSession session){
        //세션객체에서 해당 속성만 삭제.
//        session.removeAttribute("visitCount2");
        session.setAttribute("visitCount2",0);
        return "redirect:/visits";
    }



    //HttpSession을 직접 이용한 예.
//    @GetMapping("/visit2")
//    public String trackVisit(HttpSession session){
//        //세션으로 부터 방문 횟수를 얻어온다.
//       Integer visitCount =(Integer) session.getAttribute("visitCount");
//       if(visitCount == null){
//           visitCount = 0;
//       }
//       visitCount++;
//       session.setAttribute("visitCount",visitCount);

//       return "visits";
//    }
}