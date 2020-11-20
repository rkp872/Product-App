package com.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.product.model.Product;
import com.product.service.ProductService;

@Controller
public class MainController 
{
	@Autowired
	private ProductService service; 
	
	public ProductService getService() {
		return service;
	}
	public void setService(ProductService service) {
		this.service = service;
	}
	@RequestMapping("/home")
	public String home(Model m)
	{
		List<Product>  products=service.getAllProducts();
		m.addAttribute("products",products);
		return "index";
	}
	@RequestMapping("/addProduct")
	public String addProduct(Model m)
	{
		m.addAttribute("title","Product | Add");
		return "addProductForm";
	}
	
	@RequestMapping(path = "/handleProduct" ,method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request)
	{
		System.out.println(product);
		service.createProduct(product);
		RedirectView view=new RedirectView();
		view.setUrl(request.getContextPath()+"/");
		return view;
	}
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId,HttpServletRequest request)
	{
		this.service.deleteProduct(productId);
		RedirectView view=new RedirectView();
		view.setUrl(request.getContextPath()+"/");
		return view;
	}
	
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId") int productId,Model model)
	{
		Product product=this.service.getProduct(productId);
		model.addAttribute("product",product);
		return "updateForm";
	}
}
