package com.jetti.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/service")
public class CardService {

	private final static String SUCCESS = "<response>SUCCESS</response>";
	private final static String FAILURE = "<response>FAILURE</response>";
	
	@PUT
	@Path("/validatecard")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public String validateCard(@FormParam("cardNumber") String cardNumber,
			@FormParam("nameOnCard") String nameOnCard,
			@FormParam("expiryDate") int expiryDate,
			@FormParam("cvv") int cvv,
			@FormParam("price") int price)
	{
		ManageCard mcObj = new ManageCard();
		boolean result = mcObj.validateCard(cardNumber,nameOnCard,expiryDate,cvv,price);
		if(result == true)
		{
			mcObj.modifyCard(cardNumber,price);
			return SUCCESS;
		}
		else
		{
			return FAILURE;
		}
	}
}
