package com.sample.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //�� ������̼�(Annotation)����, ������ �����ӿ�ũ�� ���� Ŭ������ ��Ʈ�ѷ� ��°��� ������ش�
public class SampleController {

    Logger log = Logger.getLogger(this.getClass());   

    @RequestMapping(value="/sample/openSampleList.do") //DisptacherServlet�� handler mapping�� ������̼��� �������� � ��Ʈ�ѷ��� �޼��尡 ȣ��Ǿ�� ������ �����Ѵ�.������Ʈ�� ����� �ּҸ� �ǹ��Ѵ� 
    public ModelAndView openSampleList(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("");//new ModelAndView("")�� �Ҷ� ������ �κп��� �� ��Ʈ�ѷ��� ����ǰ� ���� ������ view (����ڿ��� ������ ȭ��)�� ������ �� �ִ�
        log.debug("���ͼ��� �׽�Ʈ");

        return mv;

    }

}
