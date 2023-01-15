package com.struts2.mybatis.frontcontroller;

import javax.servlet.annotation.WebFilter;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;

@WebFilter("/*")
public class StrustFrontController extends StrutsPrepareAndExecuteFilter{

}
