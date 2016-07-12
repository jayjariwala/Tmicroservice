package org.jayjariwala.timestampMicrservice.Tmicorservice;


import java.text.ParseException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jayjariwala.timestampMicrservice.Tmicorservice.model.timestampModel;
import org.jayjariwala.timestampMicrservice.Tmicorservice.service.timestampService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("{data}")
public class MyResource {
	
	
	
	timestampService service=new timestampService();
	timestampModel model=new timestampModel();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public timestampModel getIt(@PathParam("data") String data) {
        try
        {
        
    	timestampModel model=service.dateconvert(Long.parseLong(data));
    	return model;
        }
        catch(Exception e)
        {
        	try {
        		System.out.println("came here");
        		if(data.indexOf("20")!=-1)
        		{
        			String[] sa=data.split("%20");
            		System.out.println(sa[0]);
    				timestampModel model=service.unixconvert(sa[0]);
    				return model;
        		}
        		else
        		{
        			model.setNatural(""+null);
    				model.setUnix(""+null);
    				return model;
    				
        		}
        		
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				model.setNatural(""+null);
				model.setUnix(""+null);
				return model;
				
			}
        }
   }
}
