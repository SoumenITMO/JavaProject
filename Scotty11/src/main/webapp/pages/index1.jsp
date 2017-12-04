<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <script src="../bootstrap/js/jquery-1.8.3.min.js"></script>
    <link rel="stylesheet" href="../bootstrap/css/style.css" media="all" />
    <title>Title</title>
</head>
<body>
          <h1> HELLO How are you ?? .... </h1>
          <input type="text" id="user_search" class="user_search" onkeyup="submit_fun(this.value)"/>
          <!-- <input type="button" onclick="submit_fun()" value="Hello .. " /> -->
</body>
</html>

<script>
var delayTimer = 0;
$(document).ready(function()
{
      console.log("Ready ... ");
})

function submit_fun(userID)
{
    clearTimeout(delayTimer);
    delayTimer = setTimeout(function()
    {
        $.ajax({
                type: "POST",
                url: "/search_user",
                data: {"user_id": userID},
                success: function (data) {
                    console.log("AJAX POST DATA .... " + data);
                }
                //dataType: dataType
        });
    },1000);
}
</script>


