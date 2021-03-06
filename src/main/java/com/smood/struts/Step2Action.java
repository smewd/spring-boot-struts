package com.smood.struts;


import com.smood.service.DummyService;
import lombok.Setter;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


@Component("/step2")
public class Step2Action extends ExtendedLookupDispatchAction
{
	@Autowired
	private DummyService dummyService;


	public Step2Action()
	{
		Logger logger = LoggerFactory.getLogger(Step2Action.class);
		logger.info("Step2Action created.");
	}


	@Override
	protected Map<String, String> getKeyMethodMap()
	{
		return new HashMap<>();
	}


	public ActionForward empty(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response)
	{
		Step2Form f = (Step2Form)form;
		f.setValue(dummyService.printMessage("This is step 2"));

		return mapping.findForward("step2");
	}
}
