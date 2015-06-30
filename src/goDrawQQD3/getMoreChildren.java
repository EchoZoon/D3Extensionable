package goDrawQQD3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import dataStructsUtils.QQResult;
import dataStructsUtils.QunResult;

import getQQ_QunInfo.getQQ_QunInfo;

public class getMoreChildren extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		String qunid = request.getParameter("qunid");
		
		try {
			
			QunResult qunResult = new QunResult();
			qunResult = getQQ_QunInfo.getFakeQunResult();
			
			
			List<QQResult> qqResultsList = new ArrayList<QQResult>();
			qqResultsList = getQQ_QunInfo.getQunDetailResults();
			
			map.put("allqun", qqResultsList);
			map.put("qunInfo", qunResult);
			
			out.write(JSON.toJSONString(map));
			
			out.flush();
			out.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
