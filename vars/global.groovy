//global.groovy

import org.cl.*

def call(String param1, String param2){

    println 'Ejecución de Pipeline'

    pipeline{
        agent any
        stages{
            stage('Pipeline'){
                steps{
                    script{

                        def funciones   = new Funciones()

                        stage('Inicio'){
                            println 'Inicio'
                            println 'String 1: ' + param1
                            println 'String 2: ' + param2
                        }

                        stage('Union'){
                            println 'Union de 2 Strings: ' + funciones.unirDosStrings(param1, param2)          
                        }

                        stage('MostrarNombre'){
                            println 'Nombre obtenido desde Json: ' + funciones.mostrarNombre()
                        }
                    }
                }
            }
        }
    }
}

return this;
