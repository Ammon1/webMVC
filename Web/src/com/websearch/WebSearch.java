package com.websearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebSearch
 */
@WebServlet("/page")
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
		/*TO JEST DO USUNIECIA*/
	//	String adress="";
	/*TO JEST DO USUNIECIA*/
		
		//web and system.out definitions
		PrintWriter out = response.getWriter();
		 String adress = request.getParameter("adress"); 
		 
		//print web adress
		// out.println(adress);
		 
		 //create class AlphabetCountter
		 AlphabetCountter ABC = new AlphabetCountter();
		
		 //call web from adress into this application
		 URL oracle = new URL(adress);
	        BufferedReader in = new BufferedReader(
	        new InputStreamReader(oracle.openStream()));
	        String inputLine;
	        String wholeLine = null;
	        //scan web page content
	        while ((inputLine = in.readLine()) != null){
	        
	        if(inputLine.contains("<p>")){
	        	
	        	wholeLine+=inputLine;
	
	        	
	        	
	        }
	        }
	        in.close();
	        System.out.println("koniec wypisu strony");
	        float[] AB;int j=0;
	        //countting letters statistic
	   	 AB=ABC.alphabet(wholeLine);
	   	 //countting word length statistics
	   	WordLength word = new WordLength();
	   	float wordLengthAVG = word.WordCountter(wholeLine);
	   	
	   	 //zbudowanie tabeli i umieszczenie listy liter
	   	 out.println("<!DOCTYPE html>");
	   	out.println("<head></head>");
	   	out.println("<body>");
		out.println("<h1>Letters statistics at web page: <h1>");
		out.println("<h1>"+adress+"</h1>");
		
		out.println("<table>");
	   	 out.println("<tr><th style='background-color:white;'>sign</th><th style='background-color:green;'>percent</th></tr>");
	   	// System.out.println("html i tabela");
	   	for(char ch='a';ch<='z';ch++){
	   		
	   		out.println("<tr>");
	   		out.print("<th style='background-color:orange;'>"+ch+"</th>"+"<th style='background-color:cyan;'>");
	   		out.printf("%.2f", 100*AB[j]);out.println("  "+j);
	   		out.println("</th>");
	   		out.println("<tr>");
	   		
	   		j++;
	   		
	   	}
	   	out.println("</table>");
	   	
	   	out.println("<p>Average word length in text is ");
	   	out.printf("%.2f",wordLengthAVG);
	   	out.println("</p>");
	   	
	   	out.println("<p>The language of text is probably: "+ABC.lettersStatiscits(AB));
	   	out.println("</body>");
	   	out.println("</html>");
	   	System.out.println("koniec");
	   	 
	}
		 
	}


