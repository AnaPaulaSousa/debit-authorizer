package br.com.evandropires.debitauthorizer.function;

import br.com.evandropires.debitauthorizer.service.ProvisionalDebitProvider;
import br.com.evandropires.debitauthorizer.service.ProvisionalDebitService;
import com.google.gson.JsonObject;

import java.math.BigDecimal;

/**
 * Created by evandro on 11/11/2018.
 */
public class ProvisionalDebitFunction {
	public static JsonObject main(JsonObject params) {
		Integer agency = params.get("agency").getAsInt();
		Integer account = params.get("account").getAsInt();
		BigDecimal debitValue = params.get("debitValue").getAsBigDecimal();
		ProvisionalDebitProvider provisionalDebitProvider = new ProvisionalDebitProvider();
		new ProvisionalDebitService(provisionalDebitProvider).addProvisionalDebit(agency, account, debitValue);
		return params;
	}
}
