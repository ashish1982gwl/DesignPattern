package com.ashish.designPattern.structal.adaptor.impl;

public class Adaptor extends JsonDataParser{
 private XmlDataParser dataParser;
  
   public  Adaptor(XmlDataParser XmlDataParser) {
	   this.dataParser=XmlDataParser;
   }
  
   public void doOperationOnJsonData() {
	   dataParser.doOperationOnXmlData();
   }
    
   
}
