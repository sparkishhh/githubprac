package github;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class Insert
 */
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		Pojo po = new Pojo();
		po.setId(id);
		po.setName(name);
		try {
			PreparedStatement preparedStatement = Getcon.getConnection().prepareStatement("insert into emp1 values(?,?)");
			preparedStatement.setInt(1, Integer.valueOf(po.getId()));
			preparedStatement.setString(2, po.getName());
			System.out.println("inserted successfully!");
			System.out.println("githubdone");
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
