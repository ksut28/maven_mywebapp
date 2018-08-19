<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DevOps Project Application</title>
 <script language="javascript">
                function addNumbers()
                {
                	
                        var val1 = document.getElementById("n1").value;                      
                        var val2 = document.getElementById("n2").value;
                        var ansD = document.getElementById("n3");
                       if(isNaN(val1) || isNaN(val2) || val1=="" || val2=="" )
                           ansD.value = "Enter Valid Number";
                       else
                        ansD.value = parseFloat(val1) + parseFloat(val2);
                }
        </script>

</head>
<body>
<input type="text" placeholder="Number 1" name="n1" id="n1"/>
+
<input type="text" placeholder="Number 2" name="n2" id="n2"/>
<input type="submit" value="Calculate Sum" onClick="javascript:addNumbers()"/>
=
<input type="text" placeholder="Result" name="n3" id="n3" value=""/>
</body>
</html>