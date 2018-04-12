package com.qaagility.controller;

import com.qaagility.controller.Calculator;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.MockitoAnnotations;
 
public class CalcMockTest {

//	@Mock
//    	Calculator calcMock;	
	
	@Mock
    	private Calculator calcMock;
	
	@Spy
    	private Calculator calcSpy;
	
