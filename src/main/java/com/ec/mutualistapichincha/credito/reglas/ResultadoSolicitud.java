package com.ec.mutualistapichincha.credito.reglas;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ResultadoSolicitud implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String existeRespuestasAprobadas;
   private java.lang.String existeRespuestasAprobadasModificadas;
   private java.lang.String existeRespuestasNegadas;
   private java.lang.String existeRespuestasRecomendadas;
   private java.lang.String resultadoFinal;
   private java.lang.String tomarValoresDelMonto;
   private java.lang.String tomarValoresDelPlazo;

   public ResultadoSolicitud()
   {
   }

   public java.lang.String getExisteRespuestasAprobadas()
   {
      return this.existeRespuestasAprobadas;
   }

   public void setExisteRespuestasAprobadas(
         java.lang.String existeRespuestasAprobadas)
   {
      this.existeRespuestasAprobadas = existeRespuestasAprobadas;
   }

   public java.lang.String getExisteRespuestasAprobadasModificadas()
   {
      return this.existeRespuestasAprobadasModificadas;
   }

   public void setExisteRespuestasAprobadasModificadas(
         java.lang.String existeRespuestasAprobadasModificadas)
   {
      this.existeRespuestasAprobadasModificadas = existeRespuestasAprobadasModificadas;
   }

   public java.lang.String getExisteRespuestasNegadas()
   {
      return this.existeRespuestasNegadas;
   }

   public void setExisteRespuestasNegadas(
         java.lang.String existeRespuestasNegadas)
   {
      this.existeRespuestasNegadas = existeRespuestasNegadas;
   }

   public java.lang.String getExisteRespuestasRecomendadas()
   {
      return this.existeRespuestasRecomendadas;
   }

   public void setExisteRespuestasRecomendadas(
         java.lang.String existeRespuestasRecomendadas)
   {
      this.existeRespuestasRecomendadas = existeRespuestasRecomendadas;
   }

   public java.lang.String getResultadoFinal()
   {
      return this.resultadoFinal;
   }

   public void setResultadoFinal(java.lang.String resultadoFinal)
   {
      this.resultadoFinal = resultadoFinal;
   }

   public java.lang.String getTomarValoresDelMonto()
   {
      return this.tomarValoresDelMonto;
   }

   public void setTomarValoresDelMonto(java.lang.String tomarValoresDelMonto)
   {
      this.tomarValoresDelMonto = tomarValoresDelMonto;
   }

   public java.lang.String getTomarValoresDelPlazo()
   {
      return this.tomarValoresDelPlazo;
   }

   public void setTomarValoresDelPlazo(java.lang.String tomarValoresDelPlazo)
   {
      this.tomarValoresDelPlazo = tomarValoresDelPlazo;
   }

   public ResultadoSolicitud(java.lang.String existeRespuestasAprobadas,
         java.lang.String existeRespuestasAprobadasModificadas,
         java.lang.String existeRespuestasNegadas,
         java.lang.String existeRespuestasRecomendadas,
         java.lang.String resultadoFinal,
         java.lang.String tomarValoresDelMonto,
         java.lang.String tomarValoresDelPlazo)
   {
      this.existeRespuestasAprobadas = existeRespuestasAprobadas;
      this.existeRespuestasAprobadasModificadas = existeRespuestasAprobadasModificadas;
      this.existeRespuestasNegadas = existeRespuestasNegadas;
      this.existeRespuestasRecomendadas = existeRespuestasRecomendadas;
      this.resultadoFinal = resultadoFinal;
      this.tomarValoresDelMonto = tomarValoresDelMonto;
      this.tomarValoresDelPlazo = tomarValoresDelPlazo;
   }

}