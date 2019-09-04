package com.avg.vij.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.avg.vij.dto.RechargeDTO;
@Component
@RequestMapping("/")
public class RechargeController1 {
	
	public RechargeController1() {
		System.out.println(this.getClass().getSimpleName()+"created");
		
	}
	

	//DispatcherServlet
	@RequestMapping(value="/recharge.do", method=RequestMethod.POST)
	public String processrecharging( @ModelAttribute RechargeDTO rechargedto,HttpServletRequest req)
	{
		System.out.println("processrecharging method is staretd");
		if(rechargedto.getAmount()!=0)
		{
			req.setAttribute("msg","recharge sucessfull");
			req.setAttribute("mobileNo",rechargedto.getMobileNo());
			req.setAttribute("amount",rechargedto.getAmount());
			req.setAttribute("networkProvider",rechargedto.getNetworkProvider());
			req.setAttribute("plan",rechargedto.getPlan());
		}
		System.out.println("processrecgarging method is ended");
		return "./Recharge.jsp";
	}
	
	
	

}
