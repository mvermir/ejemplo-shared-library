//Funciones.groovy

//Classpath
package org.cl

def unirDosStrings(String param1, String param2){
	return param1 + param2
}

def mostrarNombre(){
	def request = libraryResource 'org/cl/nombres.json'
	def json    = readJSON file: request

	println json
}

return this;
