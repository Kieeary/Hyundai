package controller.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import dao.CartDAO;
import dto.CartItemVO;

public class CartDeleteAction implements ControllerLivart{

   @Override
   public MyView process(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      
   String productId = request.getParameter("productId");
   
   HttpSession session = request.getSession();
    String user_id = (String) session.getAttribute("loginUserid");
   
      System.out.println("삭제에 필요한 productId: " + productId);
      
      System.out.println("여길 들어와야함");
      CartDAO cartDAO =       CartDAO.getInstance();
      ArrayList<CartItemVO> cartItemList = cartDAO.deleteProduct(productId, user_id);
      
      request.setAttribute("cartItemList", cartItemList);
      
      Gson gson = new Gson();
      String result = gson.toJson(cartItemList);
      PrintWriter out = response.getWriter();
      out.print(result);
      //return new MyView("ajax");
      return new MyView("/WEB-INF/views/cart2.jsp");
   }

}