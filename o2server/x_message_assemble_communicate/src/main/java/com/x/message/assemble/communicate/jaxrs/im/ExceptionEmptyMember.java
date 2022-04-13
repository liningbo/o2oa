package com.x.message.assemble.communicate.jaxrs.im;

import com.x.base.core.project.exception.PromptException;

class ExceptionEmptyMember extends PromptException {

	private static final long serialVersionUID = 4132300948670472899L;

	ExceptionEmptyMember() {
		super("会话的成员列表不能为空.");
	}
}
