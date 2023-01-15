package com.struts2.front.controllers;

import javax.servlet.annotation.WebFilter;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;

@WebFilter("/*")
public class Struts2Filter extends StrutsPrepareAndExecuteFilter {
}