<html>
    <head>
        <title>Enter two numbers to add up</title>
    </head>
    
    <body>
    <% if(request.getParameter("n1")=="" || request.getParameter("n2")==""  ){ %>
   <h2>Please enter both the text boxes with numbers mandatorily!!</h2>
   <% } else{ %>
    <%= "<h1> The sum is "+(Integer.parseInt(request.getParameter("n1"))+Integer.parseInt(request.getParameter("n2")))+"</h1>"%>
  <%} %>
   </body>
</html>