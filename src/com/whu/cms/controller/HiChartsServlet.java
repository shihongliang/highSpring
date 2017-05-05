package com.whu.cms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.whu.cms.model.Series;
import com.whu.cms.model.SeriesData;



/**
 * Servlet implementation class HiChartsTest
 */
public class HiChartsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HiChartsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");

		List<Series> resultList = getData(request);

		Gson gson = new Gson();

		String result = gson.toJson(resultList);

		PrintWriter out = response.getWriter();

		out.write(result);

		out.flush();
		out.close();
	}

	protected List<Series> getData(HttpServletRequest request) {
		List<Series> ret = new ArrayList<Series>();
		
		for (int i = 0 ; i<4 ; i++){
			Series s1 = new Series();
			s1.setName("电厂" + i);
			List<SeriesData> list1 = new ArrayList<SeriesData>();
			for (int j=2000;j<2050;j++){
				Random rand = new Random();
				int n = rand.nextInt(100);
		
				list1.add(new SeriesData(j+"", n * 1.0 ));
			}
			s1.setData(list1);
			ret.add(s1);
		}
		

		return ret;
	}

	

}
