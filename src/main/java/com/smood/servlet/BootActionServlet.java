package com.smood.servlet;


import org.apache.struts.action.ActionServlet;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;


@WebServlet(
		urlPatterns = BootActionServlet.SERVLET_MAPPING,
		loadOnStartup = 1,
		asyncSupported = true,
		initParams = {
				@WebInitParam(name = "config", value = "/WEB-INF/struts-config.xml")
		}
)
public class BootActionServlet extends ActionServlet
{
	public static final String SERVLET_MAPPING = "*.do";

	@Autowired
	private ServletContext servletContext;


	@PostConstruct
	public void setServletMappingForStruts()
	{
		servletContext.setAttribute("org.apache.struts.action.SERVLET_MAPPING", SERVLET_MAPPING);
	}
}
