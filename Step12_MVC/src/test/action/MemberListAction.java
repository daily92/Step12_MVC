package test.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;

public class MemberListAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		// 1. 회원 목록을 얻어오는 business logic을 수행
		List<String> list= new ArrayList<>();
			list.add("흰둥이");
			list.add("짱구");
			list.add("짱아");
			
		// 2. 데이터(Modal) 를 request 에 담고 ("list" 라는 key 값에 list type 담겨 있어)
		request.setAttribute("list", list);
		
		// 3. view 페이지로 forward 이동할 수 수 있고록 ActionForward 객체 생성해서
		ActionForward af= new ActionForward("/views/member/list.jsp");
		
		// 4. 리턴 해 준다.
		return af;
	}

}
