package com.struts.front.controllers;

import javax.servlet.annotation.WebFilter;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;

@WebFilter("/*")
public class StrustFilter extends StrutsPrepareAndExecuteFilter{

}
