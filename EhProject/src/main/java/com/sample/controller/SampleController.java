package com.sample.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //는 어노테이션(Annotation)으로, 스프링 프레임워크에 현재 클래스가 컨트롤러 라는것을 명시해준다
public class SampleController {

    Logger log = Logger.getLogger(this.getClass());   

    @RequestMapping(value="/sample/openSampleList.do") //DisptacherServlet은 handler mapping이 어노테이션을 기준으로 어떤 컨트롤러의 메서드가 호출되어야 할지를 결정한다.프로젝트가 실행될 주소를 의미한다 
    public ModelAndView openSampleList(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("");//new ModelAndView("")를 할때 생성자 부분에는 이 컨트롤러가 실행되고 나서 보여줄 view (사용자에게 보여줄 화면)를 설정할 수 있다
        log.debug("인터셉터 테스트");

        return mv;

    }

}
