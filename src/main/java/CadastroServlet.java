import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastroServlet")
public class CadastroServlet extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String nome = req.getParameter("nome-completo");
		String telefone = req.getParameter("telefone");
		String dataNascimento = req.getParameter("dt-nascimento");
		String email = req.getParameter("email");
		String sexo = req.getParameter("sexo");
		String tecnologia = req.getParameter("tecnologia");
		String escolaridade = req.getParameter("escolaridade");
		
		PrintWriter saida = res.getWriter();
		saida.println("<html>");
		saida.println(nome);
		saida.println(telefone);
		saida.println(dataNascimento);
		saida.println(email);
		saida.println(sexo);
		saida.println(tecnologia);
		saida.println(escolaridade);
		saida.println("</html>");
		
}	}
