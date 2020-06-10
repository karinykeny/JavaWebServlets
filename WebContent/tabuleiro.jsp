<!DOCTYPE html>
<%@page import="modal.Jogador" %>
<%@page import="java.util.List"%>

<html>
<head>
<meta charset="UTF-8" />
<title>Jogo da Velha</title>
</head>

<body>
<H1 align="center">Jogo da Velha</H1>
<hr/>
<form method = "get" action = "jogo_servlet" >
Escolha sua opção: <input type="text" size="1" name="escolha">
<input type = "submit" value = "OK" />
</form>
<%
String um     = (String)request.getAttribute("um");
String dois   = (String)request.getAttribute("dois");
String tres   = (String)request.getAttribute("tres");
String quatro = (String)request.getAttribute("quatro");
String cinco  = (String)request.getAttribute("cinco");
String seis   = (String)request.getAttribute("seis");
String sete   = (String)request.getAttribute("sete");
String oito   = (String)request.getAttribute("oito");
String nove   = (String)request.getAttribute("nove");
String msg    = (String)request.getAttribute("msg");

String [][] lista = {{um,dois,tres},{quatro,cinco,seis},{sete,oito,nove}};

if(msg != null && msg != ""){
	out.print("<H2 style='color: red;'>"+ msg +"</H2>");	
}
String[][] cor={{"","",""},{"","",""},{"","",""}};

out.print("<TABLE  border=\"1\" align=\"center\"><TR>");
for(int li=0; li<3; li++){
	for(int cl=0; cl<3; cl++){
		if(lista[li][cl].equals("X")){
			cor[li][cl] = "red";
		}else if(lista[li][cl].equals("O")){
			cor[li][cl] = "blue";
		}else{
			cor[li][cl] = "black";
		}
	}
	out.print("<TR><TD><input style='width: 80px; height: 80px; font-size: 30px; color: "+ cor[li][0] +";' type = 'button' value='"+   lista[li][0]     +"' /></TD>"
	  	  	+ "<TD><input style='width: 80px; height: 80px; font-size: 30px; color: "+ cor[li][1] +";' type = 'button' value='"+   lista[li][1]   +"' /></TD>"
		  	+ "<TD><input style='width: 80px; height: 80px; font-size: 30px; color: "+ cor[li][2] +";' type = 'button' value='"+   lista[li][2]    +"' /></TD></TR>");
}
out.print("</TABLE>");

%>
</body>
</html>