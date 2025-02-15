using FaculdadeVincit.DesignPatterns.AdapterPattern;

var xmlMessage = new XmlMessage();
IJsonMessage adaptedMessage = new XmlToJsonAdapter(xmlMessage);

var xml = xmlMessage.Xml;
var Json = adaptedMessage.Json;

System.Console.WriteLine("[XML]");
System.Console.WriteLine(xml);

System.Console.WriteLine("[JSON]");
System.Console.WriteLine(Json);