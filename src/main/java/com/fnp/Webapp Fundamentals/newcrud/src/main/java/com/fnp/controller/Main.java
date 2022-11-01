package com.fnp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fnp.dao.DBOperation;
import com.fnp.dto.Employee;

@WebServlet("/Main")
public class Main extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String obj = req.getParameter("obj");
		System.out.println(obj);
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode jsonNode = objectMapper.readTree(obj);

		int idData = jsonNode.get("id").asInt();
		String nameData = jsonNode.get("name").asText();
		long phoneData = jsonNode.get("phone").asLong();
		String deptData = jsonNode.get("dept").asText();
		DBOperation c = new DBOperation();

		Employee emp = new Employee();

		emp.setId(idData);
		emp.setName(nameData);
		emp.setPhone(phoneData);
		emp.setDept(deptData);

		
		c.insertEmp(emp);
		

		System.out.println(emp);
		resp.getStatus();
		c.showAllEmp();
		DBOperation.list.removeAll(DBOperation.list);
		resp.setContentType("application/json");
		resp.setCharacterEncoding("utf-8");
	}
}
		
		//System.out.println(idData + nameData + phoneData + deptData);
		// Map<String, Employee> map = new HashMap<String, Employee>();
		// super.doPost(req, resp);
//	StringBuilder sb = new StringBuilder();
//    BufferedReader reader = req.getReader();
//    try {
//        String line;
//        while ((line = reader.readLine()) != null) {
//            sb.append(line).append('\n');
//        }}
//        catch(Exception ex) {}
//    
//    System.out.println(sb.toString());

		// JsonObject jsonObj = new JsonObject();
		

		// Gson gson = new Gson();
		// JsonObject object = gson.fromJson(obj, JsonObject.class);
		// System.out.println(object);
		// int i = object.getAsInt();
		// System.out.println(i);
		
		//int flag = jsonNode.get("edit").asInt();
		// int searchit = jsonNode.get("search").asInt();
		// System.out.println(searchit);
		
//		JsonArray j = obje
		// JsonObject asJsonObject = JsonParser.parseString(obj).getAsJsonObject();
//		JsonElement el = new JsonPrimitive(obj);
//		JsonObject r = el.getAsJsonObject();
//		System.out.println(r);
//	    Employee ne = gson.fromJson(obj, getClass());
//		String[] he = null;
//		he = obj.split("[{,}]");
//		for(int i=0;i<he.length;i++) {
//			System.out.println(he[i]);
//			String[] hello = he[i].split("[:]");
//			//System.out.println(hello[1]);
		// }

		// String[] hy = req.getParameterValues(obj);
		// Enumeration<String> hy = req.getHeaders(obj);

		// System.out.println(hy[0]);
		// req.get
//		int id = Integer.parseInt(req.getParameter("id"));
//		String name = req.getParameter("name");
//		Long phone = Long.parseLong(req.getParameter("phone"));
//		String dept = req.getParameter("dept");
		// JSONParser h = new JSONParser(obj);
		// System.out.println(h);

		
		// c.showEmp(idData);

		// ServerSocket h = new ServerSocket(55555);
//		try{  
//			URL url=new URL("http://www.javatpoint.com/java-tutorial");  
//			  
//			System.out.println("Protocol: "+url.getProtocol());  
//			System.out.println("Host Name: "+url.getHost());  
//			System.out.println("Port Number: "+url.getPort());  
//			System.out.println("File Name: "+url.getFile());
//			System.out.println("File Name: "+url.toURI());
//			System.out.println("Default Port Number: "+url.getDefaultPort());    
//			  
//			}catch(Exception e){System.out.println(e);}  
//			//}  

		// form validation
		// list of validation

		// System.out.println(k);
		
		// PrintWriter out = resp.getWriter();
//		JsonObject json = new JsonObject();
//		for (Employee e : DBOperation.list) {
//			json.addProperty("id", e.getId());
//			json.addProperty("name", e.getName());
//			json.addProperty("phone", e.getPhone());
//			json.addProperty("dept", e.getDept());
//			// json.add(, json)
//
//			System.out.println(json.toString());
//
//			resp.getWriter().write(json.toString() + "-");
//
//		}
//		DBOperation.list.removeAll(DBOperation.list);
//	}
//}
//		
//		 	out.print("<form action='index.html'");  
//	        out.print("<input type='hidden' name='uname' value='"+"k"+"'>");  
//	        out.print("<input type='submit' value='go'>");  
//	        out.print("</form>");  
//		
//		out.println("<h2>Sum is :"+"k"+"</h2>");
//		out.print("<h1>Hi</h1>");
//		
// out.close();

// super.service(req, resp);

// }
