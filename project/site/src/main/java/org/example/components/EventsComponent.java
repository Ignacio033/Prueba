package org.example.components;

import org.example.beans.Event;
import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.request.HstRequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EventsComponent extends BaseHstComponent {

	public static final Logger log = LoggerFactory.getLogger(EventsComponent.class);
	
	 @Override
		public void doBeforeRender(final HstRequest request, final HstResponse response) throws HstComponentException {
		 super.doBeforeRender(request, response);
		 		final HstRequestContext ctx = request.getRequestContext();
		 		
		 		//Retrive the document based on the URL
		 		Event document= (Event) ctx.getContentBean();
		 		
		 	if(document != null) {
		 		request.setAttribute("document", document);
		 	}
	 }
}