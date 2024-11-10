package br.juliok.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import br.juliok.crud.beans.Employee;
import br.juliok.crud.dao.EmployeeDAO;
import br.juliok.crud.dao.EmployeeDAOimpl;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDAO employeedao = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		employeedao = new EmployeeDAOimpl();		
		
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//add
		//update
		//Delete
		//Select
		String action = request.getServletPath();
		
		System.out.println("DoPost, Action=> " + action);
		
		
		switch (action) {
		case "/add":
			addnewEmployee(request, response);
			break;
		case "/update":
			updateEmployee(request, response);
			break;
		case "/delete":
			deleteEmployee(request, response);
			break;
		case "/list":
			getallEmployee(request, response);
			break;
		case "/get":
			getEmployee(request, response);
			break;
		default:{
			getallEmployee(request, response);
			break;
			}
		}
		
	}



	private void getEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Start getEmployee");
		
		int id = Integer.parseInt(request.getParameter("id"));
				
		
		System.out.println("Employee getEmployee: " + id);
		
		Employee employee = employeedao.getEmployee(id);
		System.out.println("Resultado getEmployee: " + employee);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/employeesView.jsp");
		dispatcher.forward(request, response);
		
	}



	private void getallEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Start getallEmployee");
		List<Employee> employees = employeedao.getAllEmployees();
		
		System.out.println("Employee getallEmployee size: " + employees.size());
		
		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/employeesView.jsp");
		request.setAttribute("employees", employees);
		dispatcher.forward(request, response);
		

		
	}



	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Start deleteEmployee");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		
		
		
		System.out.println("Employee deleteEmployeeID: " + id);
		
		boolean result = employeedao.deleteEmployee(id);
		System.out.println("Resultado deleteEmployee: " + result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/employeesView.jsp");
		dispatcher.forward(request, response);
		
	}



	private void updateEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Start updateEmployee");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		
		
		Employee emp = new Employee(id, name, email, phone, address);
		System.out.println("Employee detalhes: " + emp);
		
		boolean result = employeedao.updateEmployee(emp);
		System.out.println("Resultado updateEmployee: " + result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/employeesView.jsp");
		dispatcher.forward(request, response);
		
	}



	private void addnewEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Start addnewEmployee");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		
		
		Employee emp = new Employee(name, email, phone, address);
		System.out.println("Employee detalhes: " + emp);
		
		boolean result = employeedao.addEmployee(emp);
		System.out.println("Resultado addemployee: " + result);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/employeesView.jsp");
		dispatcher.forward(request, response);
		
		
		
		
		
		
		
	}

}
