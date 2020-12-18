//global.groovy

import org.cl.*

def call(String param1, String param2){

    println 'Ejecución de Pipeline'

    pipeline{
        stages{
            stage('Pipeline'){
                steps{
                    script{
                        stage('Inicio'){
                            println 'Inicio'
                            println 'String 1: ' + param1
                            println 'String 2: ' + param2
                        }

                        stage('UnirDosStrings'){
                            try {
                                def funciones   = new Funciones()
                                def nuevoString = funciones.unirDosStrings(param1, param2)
                                println 'Union de 2 Strings: ' + nuevoString            
                            }
                            catch(Exception e) {
                                error ('Se ha capturado el siguiente error: ' + e)
                            }
                        }
                    }
                }
            }
        }
    }
}

return this;
