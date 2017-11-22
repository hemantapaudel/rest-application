package com.mycompany.core.rest.endpoints;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.core.rest.model.AccountDetailVO;

@RestController
//@RequestMapping("accountservice")
public class AccountController {
	
	@RequestMapping(
	value = {"/account"},
	method = {RequestMethod.GET},
    consumes = {"application/json"},
    produces ={"application/json"})
	public  AccountDetailVO getAccount(){
		return new AccountDetailVO("sharma","525685968547","10125478445","1254856");
	}
	
	
	
	
}
