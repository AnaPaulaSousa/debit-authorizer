package br.com.evandropires.debitauthorizer.dao.impl;

import br.com.evandropires.debitauthorizer.dao.CreditCardDAO;
import com.google.gson.JsonObject;

/**
 * Created by evandro on 14/11/2018.
 */
public class CreditCardTestDAOImpl implements CreditCardDAO {

	@Override
	public JsonObject findCreditCard(Long cardNumber) {
		if (cardNumber == 888888L) {
			JsonObject response = new JsonObject();
			response.addProperty("agency", 888);
			response.addProperty("account", 888);
			response.addProperty("cardNumber", cardNumber);
			response.addProperty("status", "INACTIVE");
			return response;
		} else if (cardNumber != 123456L) {
			return null;
		}

		JsonObject response = new JsonObject();
		response.addProperty("agency", 123);
		response.addProperty("account", 456);
		response.addProperty("cardNumber", cardNumber);
		response.addProperty("status", "ACTIVE");
		return response;
	}
}
