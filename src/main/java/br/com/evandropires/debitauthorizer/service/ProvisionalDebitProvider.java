package br.com.evandropires.debitauthorizer.service;

import br.com.evandropires.debitauthorizer.dao.ProvisionalDebitDAO;
import br.com.evandropires.debitauthorizer.dao.impl.ProvisionalDebitDAOImpl;

/**
 * Created by evandro on 14/11/2018.
 */
public class ProvisionalDebitProvider {

	private ProvisionalDebitDAO provisionalDebitDAO = new ProvisionalDebitDAOImpl();

	public ProvisionalDebitDAO getProvisionalDebitDAO() {
		return provisionalDebitDAO;
	}

	public void setProvisionalDebitDAO(ProvisionalDebitDAO provisionalDebitDAO) {
		this.provisionalDebitDAO = provisionalDebitDAO;
	}
}
