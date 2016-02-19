package Servlet;
import dao.*;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Member;

@WebServlet("/Student_Login_Servlet")
public class Student_Login_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Student_Login_Servlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String password=request.getParameter("userpass");
		Member m=new Member();
		m.setUser_Id(username);
		m.setPassword(password);
		Student_dao sd=new Student_dao();
		
		System.out.println("Name="+m.getMember_Id()+"Password="+m.getPassword());
		String pass=sd.get_Student_Details(m);
		
		if(pass.equals(password))
		{
			// Redirect to student.jsp after setting session variable
		}
	
	}

}
