package refactoring.web;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;

class CustomerServletTest {

	@Test
	void test_doGet() throws Exception {
		HttpServletRequest req = mock(HttpServletRequest.class); 
	    HttpServletResponse resp = mock(HttpServletResponse.class); 
	    
	    StringWriter writer = new StringWriter();
	    
	    when(req.getParameter("name")).thenReturn("mkyong");
	    when(resp.getWriter()).thenReturn(new PrintWriter(writer));
	    
	    CustomerServlet servlet = new CustomerServlet();
	    servlet.doGet(req, resp);
	    
	    verify(req, times(1)).getParameter("name");
	    verify(resp, times(1)).getWriter();
	    
	    assertEquals("<h1>mkyong</h1>", writer.toString().trim());
	}

}
