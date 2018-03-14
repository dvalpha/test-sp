package dvalphatest.dvalphatest.controller;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Before;
import org.junit.Test;



public class TestProcess {

	File root;
	File filename;
	
	
	@Before
	public void setUp(){	
		root = new File("C:\\junit-test2");
		root.mkdir();
	}
	
	@Test 
	public void validarSiElDirectorioNoExiste(){
		assertTrue("El directorio aun no existe",Boolean.FALSE.equals(!root.exists()));
	}
	@Test 
	public void crearDirectorio(){
		root.mkdir();
		assertTrue("El directorio existe",Boolean.TRUE.equals(root.exists()));
	}
	@Test 
	public void validarSiElDirectorioExiste(){
		assertTrue("El directorio existe",Boolean.TRUE.equals(root.exists())); 
	}
	
	@Test 
	public void validarSiContieneArchivos(){
		File files []=root.listFiles();
		assertTrue("El directorio existe",Boolean.FALSE.equals(files.length>1));
	}
	
	
	
}
