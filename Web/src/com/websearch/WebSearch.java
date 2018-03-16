package com.websearch;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebSearch
 */

public class WebSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WebSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 float[] AB;
		 int j=0;
		String wholeLine=null;
		float wordLengthAVG=0;
		String language;
		
		WebData data = new WebData();
		
		//web and system.out definitions
		PrintWriter out = response.getWriter();
		 String adress = request.getParameter("adress"); 
		 
		 //create class AlphabetCountter
		 AlphabetCountter ABC = new AlphabetCountter();
		
		 //call web from adress into this application
		GetUrl URL = new GetUrl();
		 wholeLine = URL.ReturnUrl(adress);
		 
		
	       
	      //countting letters statistic
	   	 AB=ABC.alphabet(wholeLine);
	   	language= ABC.lettersStatiscits(AB);
	   	
	   	 //countting word length statistics
	   	WordLength word = new WordLength();
	   	wordLengthAVG = word.WordCountter(wholeLine);
	   	
	   	data.setAdres(adress);
        data.setContent(wholeLine);
        data.setAB(AB);
        data.setWordNumber(wordLengthAVG);
        data.setLanguage(language);
        
        request.setAttribute("data",data);  
        
        RequestDispatcher rd=request.getRequestDispatcher("web-data.jsp");  
        rd.forward(request, response);  
        
	   	
	}
		 
	}


