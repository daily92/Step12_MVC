package test.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

/*
 *   /showtime 요청을 처리할 액션
 */
//추상 클래스는 추상메소드execute (ShowTimeAction 에 mouseon, add) 호출해야 함
public class ShowTimeAction extends Action{
	//여기서 현재 시간을 얻어오는 business logic 처리해야 해
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 현재 시간을 얻어오는 business logic 수행
		String time= new Date().toString();
		
		// 데이터(Model) 을 request 에 담는다
		request.setAttribute("time", time);
		
		// view 페이지로 forward 이동할 수 있도록 ActionForward 객체를 생성해서
		ActionForward af= new ActionForward("/views/showtime.jsp");
		
		// ActionForward 객체를 리턴해준다.
		return af;
	}
	
}
