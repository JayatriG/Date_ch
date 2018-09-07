package trying;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dates")
public class DateChange extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String date=req.getParameter("d");
		
		PrintWriter pw=resp.getWriter();
		//pw.println("the date is "+ date);
		
		System.out.println("the date is "+ date);
		
		//String dd,mon,yy;
		//date.replace("/", "-");
		 String dd=date.substring(0, 2);
		 String yy=date.substring(6);
		 String mm=date.substring(3,5);
		 switch(mm)
		 {
		 case "01":	 mm="Jan";
		 			break;
		 case "02":  mm="Feb";
					break;
		 case "03":  mm="Mar";
					break;
		 case "04":  mm="Apr";
					break;
		 case "05":  mm="May";
					break;
		 case "06":  mm="Jun";
					break;
		 case "07":  mm="Jul";
					break;
		 case "08":  mm="Aug";
					break;
		 case "09":  mm="Sep";
					break;
		 case "10":  mm="Oct";
					break;
		 case "11":  mm="Nov";
		 			break;
		 case "12":  mm="Dec";
					break;
		 }
		 
		 String c_date=dd + "/" + mm + "/" +yy;
		 
		 System.out.print(c_date);
		 pw.println(c_date);
		 
		
		 
		
		/*req.setAttribute("date", date);
		 RequestDispatcher disp=req.getRequestDispatcher("/Changed_date.jsp");
		disp.forward(req, resp);*/
		
	}
}
