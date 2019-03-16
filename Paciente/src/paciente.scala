import scala.collection.mutable.ListBuffer


class paciente(
    var nombre:String = "JOSE",
    var apellidoPaterno:String = "DE LA TORRE",
    var apellidoMaterno:String = "ARELLANO",
    var fechaDeRegistro:ListBuffer[String] = ListBuffer("10/03/19","11/03/19","12/03/19"),
    var horaDeRegistro:ListBuffer[Int] = ListBuffer(10,11,12),
    var nivelDeBienestar:ListBuffer[Int] = ListBuffer(1,2,3),
    var temperatura:ListBuffer[Double] = ListBuffer(27,30,40),
    var humedad:ListBuffer[Double] = ListBuffer(25,39,50)){
  
  
  
  def obtenerPromedioDeBienestar():Double={
    var promedioDeBienestar=0.0
   for(e<- nivelDeBienestar){
     promedioDeBienestar+=e
   }
    promedioDeBienestar/nivelDeBienestar.length
  }
  
  
   def ObtenerLaTemperaturaMayor(){
    var temperaturaMayor=temperatura(0)
    var contador=0
    for(i<-0 until temperatura.length){
      if(temperatura(i)>temperaturaMayor){
        temperaturaMayor=temperatura(i)
        contador=i
      }
      
    }
     println("DATOS DE LA TEMPERATURA MAYOR REGISTRADA")
     println("TEMPERATURA MAYOR DEL PACIENTE: "+temperatura(contador))
     println("FECHA DE REGISTRO: "+fechaDeRegistro(contador))
     println("HORA DE REGISTRADO: "+horaDeRegistro(contador))
     println("NIVEL DE BIENESTAR: "+nivelDeBienestar(contador))
     println("HUMEDAD REGISTRADA: "+humedad(contador))
  }
 
  
  def obtenerLaTemperaturaMenor(){
    var temperaturaMenor=temperatura(0)
    var cont=0
    for(i<-0 until temperatura.length){
      if(temperatura(i)<temperaturaMenor){
        temperaturaMenor=temperatura(i)
        cont=i
      }
      
    }
    
     println("DATOS DE LA TEMPERATURA MENOR REGISTRADA")
     println("TEMPERATURA MENOR DEL PACIENTE: "+temperatura(cont))
     println("FECHA DE REGISTRO: "+fechaDeRegistro(cont))
     println("HORA REGISTRADO: "+horaDeRegistro(cont))
     println("NIVEL DE BIENESTAR: "+nivelDeBienestar(cont))
     println("HUMEDAD REGISTRADA: "+humedad(cont))
  }
   
  
  
   
/*println("DATOS DEL PACIENTE") 
println("NOMBRE DEL PACIENTE: "+nombre)
println("APELIDO PATERNO DEL PACIENTE: "+primerAp)
println("APELLIDO MATERNO DEL PACIENTE: "+segundoAp)
println("FECHA DE REGISTRO DEL PACIENTE: "+fecha)
println("HORA DE REGISTRO DEL PACIENTE: "+horaReg)
println("NIVEL DE BIENESTAR DEL PACIENTE: "+nivelBienstar)
println("TEMPERATURA DEL PACIENTE: "+temperatura)
println("HUMEDAD DEL PACIENTE: "+humedad)   
println("----------------------------------------")*/

}


object paciente {
  def main(args: Array[String]): Unit = {
      var objPaciente = new paciente

    println("Promedio Bienestar: "+objPaciente.obtenerPromedioDeBienestar()) 
    println("----------------------------------------")
    objPaciente.obtenerLaTemperaturaMenor()
    println("---------------------------------------------")
    objPaciente.ObtenerLaTemperaturaMayor

    
  }
  
}