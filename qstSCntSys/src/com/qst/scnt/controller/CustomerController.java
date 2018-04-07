package com.qst.scnt.controller;

@Controller
@RequestMapping(value="/customer")
public class CustomerController extends BaseController {
	
	@Resource
	private CustomerService customerService;
	
	@RequestMapping(value="/select.do")
	@ResponseBody
	public Object select() {
		 //System.out.println(userInfo.getUserName());
		Gson gson = new Gson();
		System.out.println(123);
		//调用存储过程，获取列表
		//this.userService.get(1);
		System.out.println(this.customerService.selectPK(1)..getUserName());
		System.out.println(gson.toJson(this.customerService.selectPK(1)));
		
		System.out.println("currentUser"+this.getCurrentUser().getUserName());
		return gson.toJson("1234");
	}

}
